package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import vues.InterfaceEditeur;
import model.Contenu;
import model.Editeur;
import model.impl.CaractereImpl;

public class Controlleur {

	private Editeur editeur;
	private InterfaceEditeur vue;
	private ActionListener listener;
	private KeyListener keyListener;
	private MouseListener mouseListener;

	public Controlleur(Editeur editeur, InterfaceEditeur vue) {
		this.editeur = editeur;
		this.vue = vue;
		this.listen();
	}
	
	protected void displayInfo(KeyEvent e, String s){
		String charString, keyCodeString, modString, tmpString;

		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		int modifiers = e.getModifiers();

		if (Character.isISOControl(c)) {
		    charString = "key character = (an unprintable control character)";
		} else {
		    charString = "key character = '" + c + "'";
		}

		keyCodeString = "key code = " + keyCode
				+ " ("
				+ KeyEvent.getKeyText(keyCode)
				+ ")";

		modString = "modifiers = " + modifiers;
		tmpString = KeyEvent.getKeyModifiersText(modifiers);
		if (tmpString.length() > 0) {
		    modString += " (" + tmpString + ")";
		} else {
		    modString += " (no modifiers)";
		}

		System.out.println(s + "\n    " + charString + "\n    " + keyCodeString + "\n    " + modString + "\n");
	}
	public void listen() {
		listener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				
				if (actionEvent.getSource() == vue.getCopier()){
					copier();
				}
				else if (actionEvent.getSource() == vue.getColler()){
					coller();
				}
				else if (actionEvent.getSource() == vue.getDeplacer()){
					deplacer();
				}
				else if (actionEvent.getSource() == vue.getNouveau()){
					creerNouveauDocument();
				}
				else if (actionEvent.getSource() == vue.getEnregistrer()){
					sauvergarder();	
				}
				else if (actionEvent.getSource() == vue.getOuvrir()){
					ouvrir();	
				}
				else if (actionEvent.getSource() == vue.getFermer()){
					fermer();
				}

			}
		};
		keyListener = new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				//displayInfo(e,"Key Pressed");
				if(e.getKeyCode() == 8){
					supprimer();
				}
				else if(e.getKeyCode() == 67 && e.getModifiers() == 2 && vue.getCopier().isEnabled())
					copier();
				else if(e.getKeyCode() == 86 && e.getModifiers() == 2 && vue.getColler().isEnabled())
					coller();
				else if(e.getKeyCode() == 88 && e.getModifiers() == 2 && vue.getDeplacer().isEnabled())
					deplacer();
				
				else if((e.getKeyCode()>=10 && e.getKeyCode()<=90) || e.getKeyCode() == 192){
					if ((e.getKeyCode() < 16 || e.getKeyCode() > 20) && (e.getKeyCode()< 37 || e.getKeyCode() > 40)){
						inserer(e.getKeyChar());
					}		
				}
				vue.getSurface().getCaret().setVisible(true);
				
			}
		};
		mouseListener = new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				vue.getSurface().getCaret().setVisible(true);
				if(vue.getSurface().getSelectedText() != null)
					vue.getCopier().setEnabled(true);
				else
					vue.getCopier().setEnabled(false);
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		};
		vue.getAjouterSection().addActionListener(listener);
		vue.getAnnuler().addActionListener(listener);
		vue.getFermer().addActionListener(listener);
		vue.getaPropos().addActionListener(listener);
		vue.getColler().addActionListener(listener);
		vue.getCopier().addActionListener(listener);
		vue.getDeplacer().addActionListener(listener);
		vue.getEnregistrer().addActionListener(listener);
		vue.getOuvrir().addActionListener(listener);
		vue.getNouveau().addActionListener(listener);
		vue.getRetablir().addActionListener(listener);
		vue.getSelectionnerTout().addActionListener(listener);
		vue.getSurface().addKeyListener(keyListener);
		vue.getSurface().addMouseListener(mouseListener);
		vue.addWindowListener(new WindowAdapter() {
      		public void windowClosing(WindowEvent we) {
      			fermer();
      		}
      	}); 
		
	}
	
	protected void fermer() {
		if(editeur.getDocumentCourant().isModifie()){
			int response = JOptionPane.showConfirmDialog(vue, "Voulez vous sauvegarder les modifications? Autrement, les changements seront perdus.", "Confirmation",
			        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		    
			if (response == JOptionPane.YES_OPTION) {
		    	sauvergarder();
		    	System.exit(0);
		    }
			else if (response == JOptionPane.NO_OPTION){
				System.exit(0);
			}
		}
		else{
			System.exit(0);
		}
		
	}

	protected void inserer(char keyChar) {
		if (vue.getSurface().getSelectedText() != null)
			supprimer();
		int pos = vue.getSurface().getCaretPosition();
		editeur.getDocumentCourant().getSectionCourante().getContenu().getStrategie().inserer(new CaractereImpl(keyChar), pos);
		updateView();
		setCaretPosition(pos+1);
		editeur.getDocumentCourant().setModifie(true);
		Contenu contenuPP = editeur.getPressePapier().getContenu();
		if (contenuPP != null){
			if (editeur.getDocumentCourant().getSectionCourante() == contenuPP.getSectionSrc()){
				if (pos <= contenuPP.getPosition()){
					contenuPP.setPosition(contenuPP.getPosition() + 1);
				}
				if (pos > contenuPP.getPosition() && pos < contenuPP.getPosition()+contenuPP.getElements().size()){
					vue.getDeplacer().setEnabled(false);
				}		
			}
			
		}
		
	}

	public void creerNouveauDocument() {
		if(editeur.getDocumentCourant().isModifie()){
			int response = JOptionPane.showConfirmDialog(vue, "Voulez vous sauvegarder les modifications? Autrement, les changements seront perdus.", "Confirmation",
			        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		    
			if (response == JOptionPane.YES_OPTION) {
		    	sauvergarder();
		    	this.editeur.creerNouvDocument();
		    }
			else if (response == JOptionPane.NO_OPTION){
				this.editeur.creerNouvDocument();
			}
		}
		else{
			this.editeur.creerNouvDocument();
		}
	    updateView();

	}

	protected void ouvrir() {
		
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Documents", "document");
		chooser.setFileFilter(filter);
	    chooser.setCurrentDirectory(new File("/Desktop"));
	    
		if(editeur.getDocumentCourant().isModifie()){
			int response = JOptionPane.showConfirmDialog(vue, "Voulez vous sauvegarder les modifications? Autrement, les changements seront perdus.", "Confirmation",
			        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		    
			if (response == JOptionPane.YES_OPTION) {
		    	sauvergarder();
			    int retrival = chooser.showOpenDialog(null);
			    if (retrival == JFileChooser.APPROVE_OPTION) {
			    	editeur.ouvrir(chooser.getSelectedFile().toString());
			    }
		    }
			else if (response == JOptionPane.NO_OPTION){
				
			    int retrival = chooser.showOpenDialog(null);
			    if (retrival == JFileChooser.APPROVE_OPTION) {
			    	editeur.ouvrir(chooser.getSelectedFile().toString());
			    }
			}
		}
		else{

		    int retrival = chooser.showOpenDialog(null);
		    if (retrival == JFileChooser.APPROVE_OPTION) {
		    	editeur.ouvrir(chooser.getSelectedFile().toString());
		    }
		}
	    updateView();
		
	}

	protected void sauvergarder() {
		
		JFileChooser chooser = new JFileChooser();
	    chooser.setCurrentDirectory(new File("/Desktop"));
	    int retrival = chooser.showSaveDialog(null);
	    if (retrival == JFileChooser.APPROVE_OPTION) {
	        try {
	        	editeur.getDocumentCourant().setModifie(false);
	            editeur.sauvegarder(chooser.getSelectedFile()+".document");         
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	    updateView();	
	}

	protected void setCaretPosition(int i) {
		vue.getSurface().setCaretPosition(i);
		
	}

	protected void supprimer() {
		int pos = vue.getSurface().getCaretPosition();
		int taille = 0;
		Contenu contenuPP = editeur.getPressePapier().getContenu();
		
		if(vue.getSurface().getSelectedText() == null){
			if(pos != 0){
			 	editeur.getDocumentCourant().getSectionCourante().getContenu().supprimer(pos-1, pos);
			 	updateView();
				setCaretPosition(pos-1);
				taille = 1;
				if (contenuPP != null){
					int debutPP = contenuPP.getPosition();
					int finPP = contenuPP.getPosition() + contenuPP.getElements().size();
					if (editeur.getDocumentCourant().getSectionCourante() == contenuPP.getSectionSrc()){
						if (pos <= debutPP){
							contenuPP.setPosition(debutPP - taille);
						}
						if (pos > debutPP && pos <= finPP){
							vue.getDeplacer().setEnabled(false);
						}	
					}
				}
				
			}
		}	
		else{
			taille = vue.getSurface().getSelectedText().length();
			int debut = vue.getSurface().getSelectionStart();
			int fin = vue.getSurface().getSelectionEnd();
			if (contenuPP != null){
				int debutPP = contenuPP.getPosition();
				int finPP = contenuPP.getPosition() + contenuPP.getElements().size();
				if (editeur.getDocumentCourant().getSectionCourante() == contenuPP.getSectionSrc()){
					if (debut <= debutPP && fin <= debutPP){
						contenuPP.setPosition(contenuPP.getPosition() - taille);
					}
					else if ((debut > debutPP && debut <= finPP) || (fin > debutPP && fin <= finPP) ){
						vue.getDeplacer().setEnabled(false);
					}	
				}
			}
			editeur.getDocumentCourant().getSectionCourante().getContenu().supprimer(debut, fin);
			updateView();
			setCaretPosition(debut);
		}
		
		
		
	}

	protected void deplacer() {
		Contenu contenu = editeur.getPressePapier().getContenu();
		int position = vue.getSurface().getCaretPosition();
		int finSuppression = contenu.getPosition() + contenu.getElements().size();
		if (position <= contenu.getPosition() || position >= finSuppression){
			contenu.getSectionSrc().getContenu().supprimer(contenu.getPosition(), finSuppression);
			if (contenu.getSectionSrc() == editeur.getDocumentCourant().getSectionCourante() && position > contenu.getPosition())
				position -= contenu.getElements().size();
			editeur.getDocumentCourant().getSectionCourante().getContenu().coller(contenu, position);
			updateView();
			setCaretPosition(position+contenu.getElements().size());
			vue.getSurface().getCaret().setVisible(true);
			vue.getColler().setEnabled(false);
			vue.getDeplacer().setEnabled(false);
			editeur.getPressePapier().vider();
			editeur.getDocumentCourant().setModifie(true);
		}
		else{
			JOptionPane.showMessageDialog(vue, "Il est impossible de deplacer le contenu au milieu de lui-meme."); 
		}
	}

	protected void coller() {
		Contenu contenu = editeur.getPressePapier().getContenu();
		int position = vue.getSurface().getCaretPosition();
		editeur.getDocumentCourant().getSectionCourante().getContenu().coller(contenu, position);
		updateView();
		setCaretPosition(position+contenu.getElements().size());
		editeur.getDocumentCourant().setModifie(true);
		if (editeur.getDocumentCourant().getSectionCourante() == contenu.getSectionSrc()){
			if (position <= contenu.getPosition()){
				contenu.setPosition(contenu.getPosition() + contenu.getElements().size());
			}
			if (position > contenu.getPosition() && position < contenu.getPosition()+contenu.getElements().size()){
				vue.getDeplacer().setEnabled(false);
			}	
		}
	}

	protected void copier() {
		int positionDebut = vue.getSurface().getSelectionStart();
		int positionFin = vue.getSurface().getSelectionEnd();
		Contenu contenu = editeur.getDocumentCourant().getSectionCourante().getContenu().copier(positionDebut, positionFin);
		contenu.setSectionSrc(editeur.getDocumentCourant().getSectionCourante());
		editeur.getPressePapier().setContenu(contenu);
		vue.getColler().setEnabled(true);
		vue.getDeplacer().setEnabled(true);
	}

	public void setTitreDocument(String titre) {
		editeur.getDocumentCourant().setTitre(titre);
	}

	public void setTitreSection(String titre) {
		editeur.getDocumentCourant().getSectionCourante().setTitre(titre);
	}

	public void updateView() {
		vue.update(editeur.getDocumentCourant().getSectionCourante().getContenu().toString());
	}

	public void afficherVue() {
		vue.afficherVue();
	}

	/**
	 * @return the listener
	 */
	public ActionListener getListener() {
		return listener;
	}

	/**
	 * @param listener
	 *            the listener to set
	 */
	public void setListener(ActionListener listener) {
		this.listener = listener;
	}

}

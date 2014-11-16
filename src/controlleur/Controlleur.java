package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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

		System.out.println(s
	                           + "\n    "
		                   + charString 
		                   + "\n    "
			           + keyCodeString
	                           + "\n    "
			           + modString
			           + "\n");
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
				displayInfo(e,"Key Pressed");
				if(e.getKeyCode() == 8){
					supprimer();
				}
				else if(e.getKeyCode() == 67 && e.getModifiers() == 2 && vue.getCopier().isEnabled())
					copier();
				else if(e.getKeyCode() == 86 && e.getModifiers() == 2 && vue.getColler().isEnabled())
					coller();
				
				else if((e.getKeyCode()>=10 && e.getKeyCode()<=90) || e.getKeyCode() == 192){
					if ((e.getKeyCode() < 16 || e.getKeyCode() > 20) && (e.getKeyCode()< 37 || e.getKeyCode() > 40)){
						if (vue.getSurface().getSelectedText() != null)
							supprimer();
						int pos = vue.getSurface().getCaretPosition();
						editeur.getDocumentCourant().getSectionCourante().getContenu().getStrategie().inserer(new CaractereImpl(e.getKeyChar()), pos);
						updateView();
						setCaretPosition(pos+1);
						editeur.getDocumentCourant().setModifie(true);
						Contenu contenuPP = editeur.getPressePapier().getContenu();
						if (contenuPP != null){
							if (editeur.getDocumentCourant().getSectionCourante() == contenuPP.getSectionSrc()){
								if (pos <= contenuPP.getPosition()){
									contenuPP.setPosition(contenuPP.getPosition() + 1);
								}
							}
						}
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
		
		if(editeur.getDocumentCourant().isModifie()){
			int response = JOptionPane.showConfirmDialog(vue, "Voulez vous sauvegarder les modifications? Autrement, les changements seront perdus.", "Confirmation",
			        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		    
			if (response == JOptionPane.YES_OPTION) {
		    	sauvergarder();
		    	JFileChooser chooser = new JFileChooser();
			    chooser.setCurrentDirectory(new File("/Desktop"));
			    int retrival = chooser.showOpenDialog(null);
			    if (retrival == JFileChooser.APPROVE_OPTION) {
			    	editeur.ouvrir(chooser.getSelectedFile().toString());
			    }
		    }
			else if (response == JOptionPane.NO_OPTION){
				JFileChooser chooser = new JFileChooser();
			    chooser.setCurrentDirectory(new File("/Desktop"));
			    int retrival = chooser.showOpenDialog(null);
			    if (retrival == JFileChooser.APPROVE_OPTION) {
			    	editeur.ouvrir(chooser.getSelectedFile().toString());
			    }
			}
		}
		else{
			JFileChooser chooser = new JFileChooser();
		    chooser.setCurrentDirectory(new File("/Desktop"));
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
	            editeur.sauvegarder(chooser.getSelectedFile()+".document");
	            editeur.getDocumentCourant().setModifie(false);
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
		if(vue.getSurface().getSelectedText() == null){
			if(pos != 0){
			 	editeur.getDocumentCourant().getSectionCourante().getContenu().supprimer(pos-1, pos);
			 	updateView();
				setCaretPosition(pos-1);
				taille = 1;
			}
		}	
		else{
			taille = vue.getSurface().getSelectedText().length();
			int debut = vue.getSurface().getSelectionStart();
			int fin = vue.getSurface().getSelectionEnd();
			editeur.getDocumentCourant().getSectionCourante().getContenu().supprimer(debut, fin);
			updateView();
			setCaretPosition(debut);
		}
		Contenu contenuPP = editeur.getPressePapier().getContenu();
		if (contenuPP != null){
			if (editeur.getDocumentCourant().getSectionCourante() == contenuPP.getSectionSrc()){
				if (pos <= contenuPP.getPosition()){
					contenuPP.setPosition(contenuPP.getPosition() - taille);
				}
			}
		}
		
	}

	protected void deplacer() {
		Contenu contenu = editeur.getPressePapier().getContenu();
		int position = vue.getSurface().getCaretPosition();
		int finSuppression = contenu.getPosition() + contenu.getElements().size();
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

	protected void coller() {
		Contenu contenu = editeur.getPressePapier().getContenu();
		int position = vue.getSurface().getCaretPosition();
		editeur.getDocumentCourant().getSectionCourante().getContenu().coller(contenu, position);
		vue.update(editeur.getDocumentCourant().getSectionCourante().getContenu().toString());
		updateView();
		setCaretPosition(position+contenu.getElements().size());
		editeur.getDocumentCourant().setModifie(true);
		if (editeur.getDocumentCourant().getSectionCourante() == contenu.getSectionSrc()){
			if (position <= contenu.getPosition()){
				contenu.setPosition(contenu.getPosition() + contenu.getElements().size());
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

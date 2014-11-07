package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
					editeur.creerNouvDocument();
					vue.update("");
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
				else if(e.getKeyCode() == 67 && e.getModifiers() == 2)
					copier();
				else if(e.getKeyCode() == 86 && e.getModifiers() == 2)
					coller();
				
				else if((e.getKeyCode()>=10 && e.getKeyCode()<=90) || e.getKeyCode() == 192){
					if ((e.getKeyCode() < 16 || e.getKeyCode() > 20) && (e.getKeyCode()< 37 || e.getKeyCode() > 40)){
						int pos = vue.getSurface().getCaretPosition();
						editeur.getDocumentCourant().getSectionCourante().getContenu().getStrategie().inserer(new CaractereImpl(e.getKeyChar()), pos);
						updateView();
						setCaretPosition(pos+1);
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
				// TODO Auto-generated method stub
				
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
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
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

	protected void setCaretPosition(int i) {
		vue.getSurface().setCaretPosition(i);
		
	}

	protected void supprimer() {
		int pos = vue.getSurface().getCaretPosition();
		if(vue.getSurface().getSelectedText() == null){
			if(pos != 0){
			 	editeur.getDocumentCourant().getSectionCourante().getContenu().supprimer(pos-1, pos);
			 	updateView();
				setCaretPosition(pos-1);
			}
		}	
		else{
			int debut = vue.getSurface().getSelectionStart();
			int fin = vue.getSurface().getSelectionEnd();
			editeur.getDocumentCourant().getSectionCourante().getContenu().supprimer(debut, fin);
			updateView();
			setCaretPosition(debut);
		}
		
	}

	protected void deplacer() {
		Contenu contenu = editeur.getDocumentCourant().getPressePapier().getContenu();
		int position = vue.getSurface().getCaretPosition();
		editeur.getDocumentCourant().getSectionCourante().getContenu().coller(contenu, position);
		vue.update(editeur.getDocumentCourant().getSectionCourante().getContenu().toString());
		updateView();
		setCaretPosition(position);
		vue.getColler().setEnabled(false);
		vue.getDeplacer().setEnabled(false);
		editeur.getDocumentCourant().getPressePapier().vider();
		
	}

	protected void coller() {
		Contenu contenu = editeur.getDocumentCourant().getPressePapier().getContenu();
		int position = vue.getSurface().getCaretPosition();
		editeur.getDocumentCourant().getSectionCourante().getContenu().coller(contenu, position);
		vue.update(editeur.getDocumentCourant().getSectionCourante().getContenu().toString());
		updateView();
		setCaretPosition(position+contenu.getElements().size());
	}

	protected void copier() {
		int positionDebut = vue.getSurface().getSelectionStart();
		int positionFin = vue.getSurface().getSelectionEnd();
		Contenu contenu = editeur.getDocumentCourant().getSectionCourante().getContenu().copier(positionDebut, positionFin);
		editeur.getDocumentCourant().getPressePapier().setContenu(contenu);
		vue.getColler().setEnabled(true);
		vue.getDeplacer().setEnabled(true);
	}

	public void creerNouveauDocument() {
		// TODO
		// Ajouter demande sauvegarde
		this.editeur.creerNouvDocument();

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

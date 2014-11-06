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

	public void listen() {
		listener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				
				if (actionEvent.getSource() == vue.getCopier()){
					int positionDebut = vue.getSurface().getSelectionStart();
					int positionFin = vue.getSurface().getSelectionEnd();
					Contenu contenu = editeur.getDocumentCourant().getSectionCourante().getContenu().copier(positionDebut, positionFin);
					editeur.getDocumentCourant().getPressePapier().setContenu(contenu);
				}
				else if (actionEvent.getSource() == vue.getColler()){
					Contenu contenu = editeur.getDocumentCourant().getPressePapier().getContenu();
					System.out.println(contenu.toString());
					int position = vue.getSurface().getCaretPosition();
					System.out.println(position);
					editeur.getDocumentCourant().getSectionCourante().getContenu().coller(contenu, position);
					vue.update(editeur.getDocumentCourant().getSectionCourante().getContenu().toString());
				}

			}
		};
		keyListener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				editeur.getDocumentCourant().getSectionCourante().getContenu().getStrategie().inserer(new CaractereImpl(e.getKeyChar()), vue.getSurface().getCaretPosition());
				vue.update(editeur.getDocumentCourant().getSectionCourante().getContenu().toString());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		};
		//Peut etre pas necessaire
		mouseListener = new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				editeur.getDocumentCourant().setDebutSel(vue.getSurface().getSelectionStart());
				editeur.getDocumentCourant().setFinSel(vue.getSurface().getSelectionEnd());
				editeur.getDocumentCourant().setPositionCurseur(vue.getSurface().getCaretPosition());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				editeur.getDocumentCourant().setDebutSel(vue.getSurface().getSelectionStart());
				editeur.getDocumentCourant().setFinSel(vue.getSurface().getSelectionEnd());
				editeur.getDocumentCourant().setPositionCurseur(vue.getSurface().getCaretPosition());
				
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
		vue.getRetablir().addActionListener(listener);
		vue.getSelectionnerTout().addActionListener(listener);
		vue.addKeyListener(keyListener);
		vue.getSurface().addMouseListener(mouseListener);
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
		vue.update(editeur.getDocumentCourant().getSectionCourante().toString());
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

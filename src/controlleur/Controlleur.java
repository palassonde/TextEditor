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
import java.util.ListIterator;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.emf.common.util.BasicEList;

import vues.InterfaceEditeur;
import model.Action;
import model.ActionColler;
import model.ActionDeplacer;
import model.ActionInserer;
import model.ActionSupprimer;
import model.Contenu;
import model.Document;
import model.Editeur;
import model.Element;
import model.Memento;
import model.Section;
import model.SectionBranche;
import model.impl.ActionCollerImpl;
import model.impl.ActionDeplacerImpl;
import model.impl.ActionInsererImpl;
import model.impl.ActionSupprimerImpl;
import model.impl.CaractereImpl;
import model.impl.ContenuImpl;

public class Controlleur {

	private Editeur editeur;
	private InterfaceEditeur vue;
	private ActionListener listener;
	private MenuListener menuListener;
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
		
		menuListener = new MenuListener(){

			@Override
			public void menuSelected(MenuEvent e) {
				vue.getSections().removeAll();//remove previous opened window jmenuitems
                for (Section section : editeur.getDocumentCourant().getSectionRacine().getSections(new BasicEList<Section>())) {
                    JMenuItem menuItem = new JMenuItem(new SelectSection(section));
                    String str = "|";
                    for (int i = 1; i < section.getNiveau(); i++){
                    	str += "--";
                    }
                    str += "> ";
                    menuItem.setText(str + section.getTitre());
                    vue.getSections().add(menuItem);
                }

                vue.getSections().revalidate();
                vue.getSections().repaint();
                vue.getSections().doClick();
				
			}

			@Override
			public void menuDeselected(MenuEvent e) {
				
			}

			@Override
			public void menuCanceled(MenuEvent e) {
				
			}
		};
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
				else if (actionEvent.getSource() == vue.getAjouterSection()){
					ajouterSection();
				}
				else if (actionEvent.getSource() == vue.getRenommerSection()){
					renommerSection();
				} 
				else if (actionEvent.getSource() == vue.getSupprimerSection()){
					supprimerSection();
				}
				else if (actionEvent.getSource() == vue.getSelectionnerTout()){
					selectionnerTout();
				}
				else if (actionEvent.getSource() == vue.getDefaire()){
					defaire();
				}
				else if (actionEvent.getSource() == vue.getRefaire()){
					refaire();
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
				else if(e.getKeyCode() == 39){
					setCaretPosition(vue.getSurface().getCaretPosition());
				}
				else if((e.getKeyCode()>=10 && e.getKeyCode()<=90) || e.getKeyCode() == 192){
					if ((e.getKeyCode() < 16 || e.getKeyCode() > 20) && (e.getKeyCode()< 37 || e.getKeyCode() > 40) && (e.getModifiers() != 2 && e.getModifiers() != 4 && e.getModifiers() != 8 && e.getModifiers() != 10)){
						inserer(e.getKeyChar());
					}		
				}
				
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
		vue.getDefaire().addActionListener(listener);
		vue.getFermer().addActionListener(listener);
		vue.getaPropos().addActionListener(listener);
		vue.getColler().addActionListener(listener);
		vue.getCopier().addActionListener(listener);
		vue.getDeplacer().addActionListener(listener);
		vue.getEnregistrer().addActionListener(listener);
		vue.getOuvrir().addActionListener(listener);
		vue.getNouveau().addActionListener(listener);
		vue.getRefaire().addActionListener(listener);
		vue.getSelectionnerTout().addActionListener(listener);
		vue.getRenommerSection().addActionListener(listener);
		vue.getSupprimerSection().addActionListener(listener);
		vue.getSurface().addKeyListener(keyListener);
		vue.getSurface().addMouseListener(mouseListener);
		vue.getSections().addMenuListener(menuListener);
		vue.addWindowListener(new WindowAdapter() {
      		public void windowClosing(WindowEvent we) {
      			fermer();
      		}
      	}); 
		
	}
	


	protected void supprimerSection() {
		Section parent = editeur.getSectionCourante().getParent();
		editeur.getSectionCourante().supprimer();
		changerSection(parent);
		vue.setTitle(editeur.getSectionCourante().getTitre());
		if(editeur.getSectionCourante() == editeur.getDocumentCourant().getSectionRacine())
			vue.getSupprimerSection().setEnabled(false);
		else
			vue.getSupprimerSection().setEnabled(true);		
		
	}

	protected void selectionnerTout() {
		vue.getSurface().setSelectionStart(0);
		vue.getSurface().setSelectionEnd(editeur.getSectionCourante().getContenu().getElements().size());
		vue.getCopier().setEnabled(true);
	}

	protected void renommerSection() {
		String titre = JOptionPane.showInputDialog("Veuillez entrer le nouveau titre de la section.");
		if (titre != null){
			if (titre.isEmpty())
				JOptionPane.showMessageDialog(vue, "Le titre ne peut pas être vide. Le titre n'a pas été modifié."); 
			else{
				editeur.getSectionCourante().setTitre(titre);
				vue.setTitle(editeur.getSectionCourante().getTitre());
			}
		}	
	}

	protected void ajouterSection() {
		String titre = JOptionPane.showInputDialog("Veuillez entrer le titre de la section.");
		if (titre != null){
			if (titre.isEmpty())
				JOptionPane.showMessageDialog(vue, "Le titre ne peut pas être null. La section n'a pas été ajoutée."); 
			else{	
				changerSection(((SectionBranche) editeur.getSectionCourante()).ajouterSousSection(titre));
				vue.setTitle(editeur.getSectionCourante().getTitre());
				if(editeur.getSectionCourante().getNiveau() == 4)
					vue.getAjouterSection().setEnabled(false);
				else
					vue.getAjouterSection().setEnabled(true);
				vue.getSupprimerSection().setEnabled(true);
			}
		}
		
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

	private void reinitialiserHistorique() {
		
		editeur.getHistorique().getActions().clear();
		editeur.getHistorique().getActionsDefaites().clear();
		editeur.getCaretaker().getMemento().clear();
		editeur.getCaretaker().getMementoDefaits().clear();
		vue.getDefaire().setEnabled(false);
		vue.getRefaire().setEnabled(false);
		
	}
	
	public void creerNouveauDocument() {
		Document nouvDoc = null;
		if(editeur.getDocumentCourant() != null && editeur.getDocumentCourant().isModifie()){
			int response = JOptionPane.showConfirmDialog(vue, "Voulez vous sauvegarder les modifications? Autrement, les changements seront perdus.", "Confirmation",
			        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		    
			if (response == JOptionPane.YES_OPTION) {
		    	sauvergarder();
		    	nouvDoc = this.editeur.creerNouvDocument();
		    }
			else if (response == JOptionPane.NO_OPTION){
				nouvDoc = this.editeur.creerNouvDocument();
			}
		}
		else{
			nouvDoc = this.editeur.creerNouvDocument();
		}
		editeur.setDocumentCourant(nouvDoc);
		changerSection(editeur.getDocumentCourant().getSectionRacine());
		vue.setTitle(editeur.getSectionCourante().getTitre());
		reinitialiserHistorique();
	}

	protected void ouvrir() {
		
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Documents", "document");
		chooser.setFileFilter(filter);
	    chooser.setCurrentDirectory(new File("/Desktop"));
	    Document nouvDoc = null;
		if(editeur.getDocumentCourant().isModifie()){
			int response = JOptionPane.showConfirmDialog(vue, "Voulez vous sauvegarder les modifications? Autrement, les changements seront perdus.", "Confirmation",
			        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		    
			if (response == JOptionPane.YES_OPTION) {
		    	sauvergarder();
			    int retrival = chooser.showOpenDialog(null);
			    if (retrival == JFileChooser.APPROVE_OPTION) {
			    	nouvDoc = editeur.ouvrir(chooser.getSelectedFile().toString());
			    }
		    }
			else if (response == JOptionPane.NO_OPTION){				
			    int retrival = chooser.showOpenDialog(null);
			    if (retrival == JFileChooser.APPROVE_OPTION) {
			    	nouvDoc = editeur.ouvrir(chooser.getSelectedFile().toString());
			    }
			}
		}
		else{

		    int retrival = chooser.showOpenDialog(null);
		    if (retrival == JFileChooser.APPROVE_OPTION) {
		    	nouvDoc = editeur.ouvrir(chooser.getSelectedFile().toString());
		    }
		}
		editeur.setDocumentCourant(nouvDoc);
		changerSection(editeur.getDocumentCourant().getSectionRacine());
		vue.setTitle(editeur.getSectionCourante().getTitre());
		reinitialiserHistorique();
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
	}

	protected void setCaretPosition(int i) {
		vue.getSurface().setCaretPosition(i);
		vue.getSurface().getCaret().setVisible(true);
		
	}
	
	protected void refaire() {
		Action action = editeur.getHistorique().getActionsDefaites().get(0);
		editeur.getHistorique().getActionsDefaites().remove(action);
		action.faire();
		editeur.getHistorique().getActions().add(0, action);
		Memento memento = editeur.getCaretaker().getMementoDefaits().get(0);
		int position = memento.getPositionCurseur();
		editeur.getCaretaker().getMementoDefaits().remove(memento);
		if(action instanceof ActionInserer)
			memento.setPositionCurseur(position + 1);
		else if(action instanceof ActionSupprimer){
			if (position != 0)
				memento.setPositionCurseur(position - 1);
		}
		else if(action instanceof ActionColler){
			ActionColler actionColler = (ActionColler)action;
			memento.setPositionCurseur(position + actionColler.getContenu().getElements().size());
		}
		vue.setMemento(memento);
		memento.setPositionCurseur(position);
		vue.getRefaire().setEnabled(true);
		editeur.getCaretaker().getMemento().add(0, memento);
		if(editeur.getHistorique().getActionsDefaites().isEmpty())
			vue.getRefaire().setEnabled(false);
		
	}

	protected void defaire() {
		
		Action action = editeur.getHistorique().getActions().get(0);
		editeur.getHistorique().getActions().remove(action);
		if(editeur.getHistorique().getActions().isEmpty())
			vue.getDefaire().setEnabled(false);
		action.defaire();
		editeur.getHistorique().getActionsDefaites().add(0,action);
		Memento memento = editeur.getCaretaker().getMemento().get(0);
		int position = memento.getPositionCurseur();
		
		if(action instanceof ActionSupprimer){
			ActionSupprimer actionSupp = (ActionSupprimer) action;
			if(actionSupp.getContenu().getElements().size() == 1)
				memento.setPositionCurseur(position + actionSupp.getContenu().getElements().size()-1);
			else
				memento.setPositionCurseur(position + actionSupp.getContenu().getElements().size());
		}
		editeur.getCaretaker().getMemento().remove(memento);
		vue.setMemento(memento);
		memento.setPositionCurseur(position);
		editeur.getCaretaker().getMementoDefaits().add(0,memento);
		vue.getRefaire().setEnabled(true);	
	}

	protected void inserer(char keyChar) {		
		
		Memento memento = vue.createMemento();
		if (vue.getSurface().getSelectedText() != null)
			supprimer();
		ActionInserer action = new ActionInsererImpl();
		action.setReceveur(editeur.getSectionCourante().getContenu());
		int position = vue.getSurface().getCaretPosition();
		action.setPosition(position);
		action.setCaractere(keyChar);
		action.faire();
		Contenu contenuPP = editeur.getPressePapier().getContenu();
		if (contenuPP != null){
			if (editeur.getSectionCourante() == contenuPP.getSectionSrc()){
				if (position <= contenuPP.getPosition()){
					contenuPP.setPosition(contenuPP.getPosition() + 1);
				}
				if (position > contenuPP.getPosition() && position < contenuPP.getPosition()+contenuPP.getElements().size()){
						vue.getDeplacer().setEnabled(false);
				}		
			}
			
		}
		editeur.getHistorique().getActions().add(0, action);
		editeur.getCaretaker().getMemento().add(0, memento);
		vue.getSurface().setCaretPosition(position+1);
		vue.getDefaire().setEnabled(true);
		vue.getRefaire().setEnabled(false);
		editeur.getHistorique().getActionsDefaites().clear();
		editeur.getCaretaker().getMementoDefaits().clear();
		editeur.getDocumentCourant().setModifie(true);
	}
	
	protected void supprimer() {
		int positionDebut = 0;
		int positionFin = 0;
		Memento memento = vue.createMemento();
		if(vue.getSurface().getSelectedText() == null){
			positionDebut = vue.getSurface().getCaretPosition() - 1;
			positionFin = positionDebut + 1;
		}
		else{
			positionDebut = vue.getSurface().getSelectionStart();
			positionFin = vue.getSurface().getSelectionEnd();
		}
		if(positionDebut >=0){
			ActionSupprimer action = new ActionSupprimerImpl();
			action.setReceveur(editeur.getSectionCourante().getContenu());
			Contenu contenu = new ContenuImpl();
			contenu.setPosition(positionDebut);
			contenu.setSectionSrc(editeur.getSectionCourante());
			ListIterator<Element> iter = editeur.getSectionCourante().getContenu().getElements().listIterator(positionDebut);
			int j = 0;
			int i = positionDebut;
			
			while(iter.hasNext() && i != positionFin){
				Element c = new CaractereImpl(iter.next());
				contenu.getStrategie().inserer(c, j);
				j++;
				i++;
			}
			action.setContenu(contenu);
			action.faire();
			if (editeur.getPressePapier().getContenu() != null){
				int debutPP = editeur.getPressePapier().getContenu().getPosition();
				int finPP = editeur.getPressePapier().getContenu().getPosition() + editeur.getPressePapier().getContenu().getElements().size();
				if (editeur.getSectionCourante() == editeur.getPressePapier().getContenu().getSectionSrc()){
					if (positionDebut <= debutPP && positionFin <= debutPP){		
						editeur.getPressePapier().getContenu().setPosition(editeur.getPressePapier().getContenu().getPosition() - contenu.getElements().size());
					}
					if ((positionDebut > debutPP && positionDebut <= finPP) || (positionFin > debutPP && positionFin <= finPP) ){
						vue.getDeplacer().setEnabled(false);
					}
				}
			}
			editeur.getHistorique().getActions().add(0, action);
			editeur.getCaretaker().getMemento().add(0, memento);
			vue.getSurface().setCaretPosition(positionDebut);
			vue.getDefaire().setEnabled(true);
			vue.getRefaire().setEnabled(false);
			editeur.getHistorique().getActionsDefaites().clear();
			editeur.getCaretaker().getMementoDefaits().clear();
			editeur.getDocumentCourant().setModifie(true);
		}

	}

	protected void deplacer() {
		Memento memento = vue.createMemento();
		ActionDeplacer action = new ActionDeplacerImpl();
		ActionSupprimer actionSup = new ActionSupprimerImpl();
		actionSup.setContenu(editeur.getPressePapier().getContenu());
		actionSup.setReceveur(editeur.getPressePapier().getContenu().getSectionSrc().getContenu());
		ActionColler actionColler = new ActionCollerImpl();
		actionColler.setContenu(editeur.getPressePapier().getContenu());
		actionColler.setPosition(this.vue.getSurface().getCaretPosition());
		actionColler.setReceveur(editeur.getSectionCourante().getContenu());
		action.getActions().add(actionSup);
		action.getActions().add(actionColler);
		//actionSup.
		Contenu contenu = editeur.getPressePapier().getContenu();
		int position = vue.getSurface().getCaretPosition();
		int finSuppression = contenu.getPosition() + contenu.getElements().size();
		if (contenu.getSectionSrc() != editeur.getSectionCourante() || position <= contenu.getPosition() || position >= finSuppression){
			if (contenu.getSectionSrc() == editeur.getSectionCourante() && position > contenu.getPosition()){
				 actionColler.setPosition(actionColler.getPosition() - contenu.getElements().size());
				 position -= contenu.getElements().size();
			}
			action.faire();
			memento.setEtatDeplacer(false);
			memento.setEtatColler(false);
			editeur.getHistorique().getActions().add(0, action);
			editeur.getCaretaker().getMemento().add(0, memento);
			setCaretPosition(position+contenu.getElements().size());
			vue.getDeplacer().setEnabled(false);
			vue.getColler().setEnabled(false);
			vue.getDefaire().setEnabled(true);
			vue.getRefaire().setEnabled(false);
			editeur.getHistorique().getActionsDefaites().clear();
			editeur.getCaretaker().getMementoDefaits().clear();
			editeur.getPressePapier().vider();
			editeur.getDocumentCourant().setModifie(true);
			
		}
		else{
			JOptionPane.showMessageDialog(vue, "Il est impossible de deplacer le contenu au milieu de lui-meme."); 
		}
	}

	protected void coller() {
		Memento memento = vue.createMemento();
		ActionColler action = new ActionCollerImpl();
		action.setPosition(vue.getSurface().getCaretPosition());
		action.setContenu(editeur.getPressePapier().getContenu());
		action.setReceveur(this.editeur.getSectionCourante().getContenu());
		action.faire();
		Contenu contenu = editeur.getPressePapier().getContenu();
		int position = vue.getSurface().getCaretPosition();
		if (editeur.getSectionCourante() == contenu.getSectionSrc()){
			if (position <= contenu.getPosition()){
				contenu.setPosition(contenu.getPosition() + contenu.getElements().size());
			}
			if (position > contenu.getPosition() && position < contenu.getPosition()+contenu.getElements().size()){
				vue.getDeplacer().setEnabled(false);
			}	
		}
		editeur.getHistorique().getActions().add(0, action);
		editeur.getCaretaker().getMemento().add(0, memento);
		vue.getDefaire().setEnabled(true);
		vue.getRefaire().setEnabled(false);
		editeur.getHistorique().getActionsDefaites().clear();
		editeur.getCaretaker().getMementoDefaits().clear();
		editeur.getDocumentCourant().setModifie(true);
		
	}

	protected void copier() {
		int positionDebut = vue.getSurface().getSelectionStart();
		int positionFin = vue.getSurface().getSelectionEnd();
		Contenu contenu = editeur.getSectionCourante().getContenu().copier(positionDebut, positionFin);
		contenu.setSectionSrc(editeur.getSectionCourante());
		editeur.getPressePapier().setContenu(contenu);
		vue.getColler().setEnabled(true);
		vue.getDeplacer().setEnabled(true);
	}

	public void setTitreDocument(String titre) {
		editeur.getDocumentCourant().setTitre(titre);
	}

	public void setTitreSection(String titre) {
		editeur.getSectionCourante().setTitre(titre);
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
	
	@SuppressWarnings("serial")
	class SelectSection extends AbstractAction  
	{  
		private Section section;
	    public SelectSection( Section section )  
	    {  
	        super(); 
	        this.section = section;
	    }  
	      
	    public void actionPerformed( ActionEvent e )  
	    {  
	        changerSection(section);
	        if (section.getNiveau() == 4)
	        	vue.getAjouterSection().setEnabled(false);
	        else
	        	vue.getAjouterSection().setEnabled(true);
	        vue.setTitle(editeur.getSectionCourante().getTitre());
	        if (section == editeur.getDocumentCourant().getSectionRacine())
	        	vue.getSupprimerSection().setEnabled(false);
	        else
	        	vue.getSupprimerSection().setEnabled(true);
	    }  
	}

	public void changerSection(Section section) {
		editeur.getSectionCourante().getContenu().detacher(vue);
		editeur.setSectionCourante(section);
		editeur.getSectionCourante().getContenu().attacher(vue);
		vue.setContenu(editeur.getSectionCourante().getContenu());
		vue.update();
	}

	public void afficherVue() {
		vue.setVisible(true);
		vue.setSize(640,480);
		
	} 

}

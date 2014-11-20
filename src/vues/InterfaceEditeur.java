package vues;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import model.Contenu;
import model.Memento;
import model.Observateur;
import model.impl.MementoImpl;


@SuppressWarnings("serial")
public class InterfaceEditeur extends JFrame implements Observateur {
   
	JMenuBar menu;

	JMenu fichier;
	JMenu editer;
	JMenu outils;
	JMenu sections;
	JMenu aide;

	JMenuItem ouvrir;
	JMenuItem enregistrer;
	JMenuItem fermer;
	JMenuItem defaire;
	JMenuItem refaire;
	JMenuItem deplacer;
	JMenuItem copier;
	JMenuItem coller;
	JMenuItem selectionnerTout;
	JMenuItem ajouterSection;
	JMenuItem renommerSection;
	JMenuItem supprimerSection;
	JMenuItem aPropos;
	JMenuItem nouveau;

	JTextPane surface;

	JPanel panneau;

	JScrollPane panneauDefilement;
	
	Contenu contenu;
	
	public InterfaceEditeur()
	{
		
		menu = new JMenuBar();
		setJMenuBar(menu);
		setTitle("Éditeur");
		
		fichier = new JMenu("Fichier");
		menu.add(fichier);
		editer = new JMenu("\u00c9diter");
		menu.add(editer);
		outils = new JMenu("Outils");
		menu.add(outils);
		sections = new JMenu("Sections");
		menu.add(sections);
		aide = new JMenu("Aide");
		menu.add(aide);

		fichier.setMnemonic('f');
		editer.setMnemonic('e');
		sections.setMnemonic('s');
		outils.setMnemonic('o');
		aide.setMnemonic('a');

      	/* Fichier->Nouveau */
      	nouveau = new JMenuItem("Nouveau");
      	nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK)); // Ctrl+O
      	fichier.add(nouveau);
		/* Fichier->Ouvrir */
		ouvrir = new JMenuItem("Ouvrir");
		ouvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK)); // Ctrl+O
      	fichier.add(ouvrir);
      	/* Fichier->Enregistrer */
		enregistrer = new JMenuItem("Enregistrer");
		enregistrer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK)); // Ctrl+S
      	fichier.add(enregistrer);
		/* Fichier->Fermer */
		fermer = new JMenuItem("Fermer");
      	fermer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK)); // Alt+F4
      	fichier.add(fermer);
      	/* Editer->Defaire */
      	defaire = new JMenuItem("Défaire");
      	defaire.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK)); // Ctrl+Z
      	defaire.setEnabled(false);
      	editer.add(defaire);
      	/* Editer->Refaire */
      	refaire = new JMenuItem("Refaire");
      	refaire.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.ALT_MASK)); // Maj+Z
      	refaire.setEnabled(false);
      	editer.add(refaire);
      	/* Editer->Couper */
      	deplacer = new JMenuItem("Déplacer");
      	editer.add(deplacer);
      	deplacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK)); // Ctrl+X
      	deplacer.setEnabled(false);
      	/* Editer->Copier */
      	copier = new JMenuItem("Copier");
      	editer.add(copier);
      	copier.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK)); // Ctrl+C
      	copier.setEnabled(false);
      	/* Editer->Coller */
      	coller = new JMenuItem("Coller");
      	editer.add(coller);
      	coller.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK)); // Ctrl+V
      	coller.setEnabled(false);
      	/* Editer->Selectionner tout */
      	selectionnerTout = new JMenuItem("S\u00e9lectionner tout");
      	editer.add(selectionnerTout);
      	selectionnerTout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK)); // Ctrl+A
      	/* Outils->Ajouter section */
      	ajouterSection = new JMenuItem("Ajouter une sous-section");
      	outils.add(ajouterSection);
      	ajouterSection.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
      	/* Outils->Renommer Section */
      	renommerSection = new JMenuItem("Renommer la section");
      	outils.add(renommerSection);
      	renommerSection.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
      	/* Outils->Supprimer Section */
      	supprimerSection = new JMenuItem("Supprimer la section");
      	outils.add(supprimerSection);
      	supprimerSection.setEnabled(false);
      	supprimerSection.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
      	/* Aide->A propos */
      	aPropos = new JMenuItem("\u00c0 propos");
      	aide.add(aPropos);

      	fichier.insertSeparator(1);
      	fichier.insertSeparator(3);
      	
      	editer.insertSeparator(2);
      	editer.insertSeparator(6);

      	panneau = new JPanel();

      	panneau.setLayout(new BorderLayout());

      	getContentPane().add(panneau, BorderLayout.CENTER);

      	surface = new JTextPane();
      	surface.setEditable(false);
      	surface.getCaret().setVisible(true);

      	//surface.setLineWrap(false);

      	//surface.setWrapStyleWord(false);
      	
      	panneauDefilement = new JScrollPane(surface);

      	panneau.add(panneauDefilement);

      	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
      
      	 	
	}
	
	public void afficherVue(){
		this.setSize(725, 460);
		this.setVisible(true);	
		this.surface.getCaret().setVisible(true);
	}
	
	public void fermer(){
		System.exit(0);
	}

	public Memento createMemento(){	
		Memento memento = new MementoImpl();
		memento.setEtatColler(this.getColler().isEnabled());
		memento.setEtatCopier(this.getCopier().isEnabled());
		memento.setEtatDefaire(this.getDefaire().isEnabled());
		memento.setEtatDeplacer(this.getDeplacer().isEnabled());
		memento.setEtatRefaire(this.getRefaire().isEnabled());
		memento.setPositionCurseur(this.getSurface().getCaretPosition());
		return memento;
	}
	
	public void setMemento(Memento memento){
		this.coller.setEnabled(memento.isEtatColler());
		this.copier.setEnabled(memento.isEtatCopier());
		this.defaire.setEnabled(memento.isEtatDefaire());
		this.deplacer.setEnabled(memento.isEtatDeplacer());
		this.refaire.setEnabled(memento.isEtatRefaire());
		this.surface.setCaretPosition(memento.getPositionCurseur());
	}
	
	/**
	 * @return the ouvrir
	 */
	public JMenuItem getOuvrir() {
		return ouvrir;
	}

	/**
	 * @return the enregistrer
	 */
	public JMenuItem getEnregistrer() {
		return enregistrer;
	}

	/**
	 * @return the nouveau
	 */
	public JMenuItem getNouveau() {
		return nouveau;
	}
	
	/**
	 * @return the defaire
	 */
	public JMenuItem getDefaire() {
		return defaire;
	}

	/**
	 * @return the refaire
	 */
	public JMenuItem getRefaire() {
		return refaire;
	}

	/**
	 * @return the deplacer
	 */
	public JMenuItem getDeplacer() {
		return deplacer;
	}

	/**
	 * @return the copier
	 */
	public JMenuItem getCopier() {
		return copier;
	}

	/**
	 * @return the coller
	 */
	public JMenuItem getColler() {
		return coller;
	}
	
	/**
	 * @return the fermer
	 */
	public JMenuItem getFermer() {
		return fermer;
	}
	
	/**
	 * @return the sections
	 */
	public JMenu getSections() {
		return sections;
	}

	/**
	 * @return the selectionnerTout
	 */
	public JMenuItem getSelectionnerTout() {
		return selectionnerTout;
	}

	/**
	 * @return the ajouterSection
	 */
	public JMenuItem getAjouterSection() {
		return ajouterSection;
	}
	
	/**
	 * @return the renommerSection
	 */
	public JMenuItem getRenommerSection() {
		return renommerSection;
	}
	
	/**
	 * @return the supprimerSection
	 */
	public JMenuItem getSupprimerSection() {
		return supprimerSection;
	}

	/**
	 * @return the aPropos
	 */
	public JMenuItem getaPropos() {
		return aPropos;
	}

	/**
	 * @return the surface
	 */
	public JTextPane getSurface() {
		return surface;
	}
	
	public void setContenu(Contenu contenu){
		this.contenu = contenu;
	}
	

	@Override
	public void update() {
		this.surface.setText(this.contenu.toString());
		this.surface.getCaret().setVisible(true);
		
	}

	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDeplacer(boolean etat) {
		this.deplacer.setEnabled(etat);
		
	}

	@Override
	public void setColler(boolean etat) {
		this.coller.setEnabled(etat);
		
	}

   
}

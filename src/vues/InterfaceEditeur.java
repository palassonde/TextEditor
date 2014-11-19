package vues;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;


@SuppressWarnings("serial")
public class InterfaceEditeur extends JFrame {
   
	JMenuBar menu;

	JMenu fichier;
	JMenu editer;
	JMenu outils;
	JMenu sections;
	JMenu aide;

	JMenuItem ouvrir;
	JMenuItem enregistrer;
	JMenuItem fermer;
	JMenuItem annuler;
	JMenuItem retablir;
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
      	/* Editer->Annuler */
      	annuler = new JMenuItem("Annuler");
      	annuler.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK)); // Ctrl+Z
      	editer.add(annuler);
      	/* Editer->Retablir */
      	retablir = new JMenuItem("R\u00e9tablir");
      	retablir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.SHIFT_MASK)); // Maj+Z
      	editer.add(retablir);
      	/* Editer->Couper */
      	deplacer = new JMenuItem("D\u00e9placer");
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
      	/* Outils->Renommer Section */
      	renommerSection = new JMenuItem("Renommer la section");
      	outils.add(renommerSection);
      	/* Outils->Supprimer Section */
      	supprimerSection = new JMenuItem("Supprimer la section");
      	outils.add(supprimerSection);
      	supprimerSection.setEnabled(false);
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
	}
	
	public void fermer(){
		System.exit(0);
	}

	public void update(String contenu) {

		this.surface.setText(contenu);
		
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
	 * @return the annuler
	 */
	public JMenuItem getAnnuler() {
		return annuler;
	}

	/**
	 * @return the retablir
	 */
	public JMenuItem getRetablir() {
		return retablir;
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
   
}

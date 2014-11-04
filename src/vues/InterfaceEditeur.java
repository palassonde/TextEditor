package vues;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;


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
	JMenuItem aPropos;

	JTextArea surface;

	JPanel panneau;

	JScrollPane panneauDefilement;
	
	public InterfaceEditeur()
	{
		
		menu = new JMenuBar();
		setJMenuBar(menu);
		setTitle("\u00c9diteur");
		
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
		outils.setMnemonic('o');
		aide.setMnemonic('a');

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
      	/* Editer->Copier */
      	copier = new JMenuItem("Copier");
      	editer.add(copier);
      	copier.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK)); // Ctrl+C
      	/* Editer->Coller */
      	coller = new JMenuItem("Coller");
      	editer.add(coller);
      	coller.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK)); // Ctrl+V
      	/* Editer->Selectionner tout */
      	selectionnerTout = new JMenuItem("S\u00e9lectionner tout");
      	editer.add(selectionnerTout);
      	selectionnerTout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK)); // Ctrl+A
      	/* Outils->Ajouter section */
      	ajouterSection = new JMenuItem("Ajouter une section");
      	outils.add(ajouterSection);
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

      	surface = new JTextArea(25, 65);

      	surface.setLineWrap(false);

      	surface.setWrapStyleWord(false);
      	
      	panneauDefilement = new JScrollPane(surface);

      	panneau.add(panneauDefilement);

      	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
      
      	addWindowListener(new WindowAdapter() {
      		public void windowClosing(WindowEvent we) {
      			System.exit(0);
      		}
      	}); 
     	}
      	
	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e) {
			System.out.println(e); 
		}

		InterfaceEditeur ie = new InterfaceEditeur();

		ie.setSize(725, 460);

		ie.setVisible(true);

	}
   
}

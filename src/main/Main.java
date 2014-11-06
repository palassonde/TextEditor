package main;

import javax.swing.UIManager;

import controlleur.Controlleur;
import model.Editeur;
import model.ModelPackage;
import model.impl.EditeurImpl;
import vues.InterfaceEditeur;

public class Main {
	
	public static void main(String args[]) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e) {
			System.out.println(e); 
		}
		//Initialisations du modele
		ModelPackage.eINSTANCE.eClass();
		//Chargement du fichier depuis la racine du projet
		Editeur editeur = new EditeurImpl();
		editeur.creerNouvDocument();
		InterfaceEditeur ie = new InterfaceEditeur();
		Controlleur controlleur = new Controlleur(editeur, ie);
		controlleur.afficherVue();
	}	
}
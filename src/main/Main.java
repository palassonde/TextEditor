package main;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.swing.UIManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import controlleur.Controlleur;
import model.Document;
import model.ModelPackage;
import model.impl.DocumentImpl;
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
		Document document = createDocument("untitled");
		InterfaceEditeur ie = new InterfaceEditeur();
		Controlleur controlleur = new Controlleur(document, ie);
		controlleur.afficherVue();

	}
	
	private static Document createDocument(String titre) {
		Document document= new DocumentImpl(titre);
		return document;
	}
	
	public static void saveDocument(String instanceFileName,Document rootObj) throws IOException{
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("document", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		//ligne ajoute
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		URI fileURI = URI.createFileURI(new File(instanceFileName).getAbsolutePath());
		Resource restaurantResource = resSet.createResource(fileURI);
		restaurantResource.getContents().add(rootObj);
		restaurantResource.save(null);
		
	}

	public static Document loadDocument(String instanceFileName){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("document", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		//ligne ajoute
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		URI fileURI = URI.createFileURI(new File(instanceFileName).getAbsolutePath());
		Resource documentResource = resSet.getResource(fileURI,true);
		Document document = (Document)documentResource.getContents().get(0);
		return document;
	}
	
	

}

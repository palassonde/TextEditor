/**
 */
package model.impl;

import model.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.DOCUMENT: return createDocument();
			case ModelPackage.SECTION_FEUILLE: return createSectionFeuille();
			case ModelPackage.SECTION_BRANCHE: return createSectionBranche();
			case ModelPackage.CONTENU: return createContenu();
			case ModelPackage.STRATEGIE_INSERTION_TEXTE: return createStrategieInsertionTexte();
			case ModelPackage.CARACTERE: return createCaractere();
			case ModelPackage.HISTORIQUE: return createHistorique();
			case ModelPackage.ACTION_DEPLACER: return createActionDeplacer();
			case ModelPackage.ACTION_COLLER: return createActionColler();
			case ModelPackage.ACTION_SUPPRIMER: return createActionSupprimer();
			case ModelPackage.ACTION_INSERER: return createActionInserer();
			case ModelPackage.PRESSE_PAPIER: return createPressePapier();
			case ModelPackage.EDITEUR: return createEditeur();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionFeuille createSectionFeuille() {
		SectionFeuilleImpl sectionFeuille = new SectionFeuilleImpl();
		return sectionFeuille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionBranche createSectionBranche() {
		SectionBrancheImpl sectionBranche = new SectionBrancheImpl();
		return sectionBranche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenu createContenu() {
		ContenuImpl contenu = new ContenuImpl();
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategieInsertionTexte createStrategieInsertionTexte() {
		StrategieInsertionTexteImpl strategieInsertionTexte = new StrategieInsertionTexteImpl();
		return strategieInsertionTexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caractere createCaractere() {
		CaractereImpl caractere = new CaractereImpl();
		return caractere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historique createHistorique() {
		HistoriqueImpl historique = new HistoriqueImpl();
		return historique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDeplacer createActionDeplacer() {
		ActionDeplacerImpl actionDeplacer = new ActionDeplacerImpl();
		return actionDeplacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionColler createActionColler() {
		ActionCollerImpl actionColler = new ActionCollerImpl();
		return actionColler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSupprimer createActionSupprimer() {
		ActionSupprimerImpl actionSupprimer = new ActionSupprimerImpl();
		return actionSupprimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInserer createActionInserer() {
		ActionInsererImpl actionInserer = new ActionInsererImpl();
		return actionInserer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressePapier createPressePapier() {
		PressePapierImpl pressePapier = new PressePapierImpl();
		return pressePapier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Editeur createEditeur() {
		EditeurImpl editeur = new EditeurImpl();
		return editeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl

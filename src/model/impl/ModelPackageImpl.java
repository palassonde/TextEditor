/**
 */
package model.impl;

import model.Action;
import model.ActionColler;
import model.ActionDeplacer;
import model.ActionInserer;
import model.ActionSupprimer;
import model.Caractere;
import model.Caretaker;
import model.Contenu;
import model.Document;
import model.Editeur;
import model.Element;
import model.Historique;
import model.Memento;
import model.ModelFactory;
import model.ModelPackage;
import model.Observateur;
import model.PressePapier;
import model.Section;
import model.SectionBranche;
import model.SectionFeuille;
import model.StrategieInsertion;
import model.StrategieInsertionTexte;
import model.Sujet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionFeuilleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionBrancheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategieInsertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategieInsertionTexteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caractereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDeplacerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionCollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSupprimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionInsererEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressePapierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sujetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observateurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caretakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mementoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Titre() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_SectionRacine() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Modifie() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocument__Refaire__Action() {
		return documentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocument__Defaire__Action() {
		return documentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Titre() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Parent() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSection_Contenu() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Niveau() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSection__Supprimer() {
		return sectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSection__GetSections__EList() {
		return sectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionFeuille() {
		return sectionFeuilleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSectionFeuille__Supprimer() {
		return sectionFeuilleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSectionFeuille__GetSections__EList() {
		return sectionFeuilleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionBranche() {
		return sectionBrancheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionBranche_Enfant() {
		return (EReference)sectionBrancheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionBranche_Document() {
		return (EReference)sectionBrancheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSectionBranche__AjouterSousSection__String() {
		return sectionBrancheEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSectionBranche__Supprimer() {
		return sectionBrancheEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSectionBranche__GetSections__EList() {
		return sectionBrancheEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenu() {
		return contenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenu_Strategie() {
		return (EReference)contenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenu_Elements() {
		return (EReference)contenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContenu_Position() {
		return (EAttribute)contenuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenu_Section() {
		return (EReference)contenuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenu_SectionSrc() {
		return (EReference)contenuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenu__Supprimer__int_int() {
		return contenuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenu__Coller__Contenu_int() {
		return contenuEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContenu__Copier__int_int() {
		return contenuEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategieInsertion() {
		return strategieInsertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategieInsertion_Contenu() {
		return (EReference)strategieInsertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategieInsertion__Inserer__Element_int() {
		return strategieInsertionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategieInsertionTexte() {
		return strategieInsertionTexteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStrategieInsertionTexte__Inserer__Element_int() {
		return strategieInsertionTexteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaractere() {
		return caractereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaractere_Caractere() {
		return (EAttribute)caractereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistorique() {
		return historiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistorique_Actions() {
		return (EReference)historiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistorique_ActionsDefaites() {
		return (EReference)historiqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistorique__Vider() {
		return historiqueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Receveur() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Faire() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Defaire() {
		return actionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionDeplacer() {
		return actionDeplacerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionDeplacer_Position() {
		return (EAttribute)actionDeplacerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDeplacer_Contenu() {
		return (EReference)actionDeplacerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDeplacer_Actions() {
		return (EReference)actionDeplacerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionDeplacer__Faire() {
		return actionDeplacerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionDeplacer__Defaire() {
		return actionDeplacerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionColler() {
		return actionCollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionColler_Position() {
		return (EAttribute)actionCollerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionColler_Contenu() {
		return (EReference)actionCollerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionColler__Faire() {
		return actionCollerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionColler__Defaire() {
		return actionCollerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSupprimer() {
		return actionSupprimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSupprimer_Contenu() {
		return (EReference)actionSupprimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionSupprimer__Faire() {
		return actionSupprimerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionSupprimer__Defaire() {
		return actionSupprimerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionInserer() {
		return actionInsererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionInserer_Position() {
		return (EAttribute)actionInsererEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionInserer_Caractere() {
		return (EAttribute)actionInsererEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionInserer__Faire() {
		return actionInsererEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionInserer__Defaire() {
		return actionInsererEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressePapier() {
		return pressePapierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPressePapier_Contenu() {
		return (EReference)pressePapierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPressePapier__Vider() {
		return pressePapierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditeur() {
		return editeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditeur_DocumentCourant() {
		return (EReference)editeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditeur_PressePapier() {
		return (EReference)editeurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditeur_Historique() {
		return (EReference)editeurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditeur_SectionCourante() {
		return (EReference)editeurEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditeur_Caretaker() {
		return (EReference)editeurEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEditeur__Sauvegarder__String() {
		return editeurEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEditeur__Ouvrir__String() {
		return editeurEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEditeur__CreerNouvDocument() {
		return editeurEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSujet() {
		return sujetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSujet_Observateur() {
		return (EReference)sujetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSujet__Attacher__Observateur() {
		return sujetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSujet__Detacher__Observateur() {
		return sujetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSujet__Informer() {
		return sujetEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservateur() {
		return observateurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObservateur__Update() {
		return observateurEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObservateur__SetDeplacer__boolean() {
		return observateurEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObservateur__SetColler__boolean() {
		return observateurEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaretaker() {
		return caretakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaretaker_Memento() {
		return (EReference)caretakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaretaker_MementoDefaits() {
		return (EReference)caretakerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemento() {
		return mementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemento_EtatDeplacer() {
		return (EAttribute)mementoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemento_PositionCurseur() {
		return (EAttribute)mementoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemento_EtatCopier() {
		return (EAttribute)mementoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemento_EtatColler() {
		return (EAttribute)mementoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemento_EtatDefaire() {
		return (EAttribute)mementoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemento_EtatRefaire() {
		return (EAttribute)mementoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemento_DebutSelection() {
		return (EAttribute)mementoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemento_FinSelection() {
		return (EAttribute)mementoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemento_SectionCourante() {
		return (EReference)mementoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__TITRE);
		createEReference(documentEClass, DOCUMENT__SECTION_RACINE);
		createEAttribute(documentEClass, DOCUMENT__MODIFIE);
		createEOperation(documentEClass, DOCUMENT___REFAIRE__ACTION);
		createEOperation(documentEClass, DOCUMENT___DEFAIRE__ACTION);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__TITRE);
		createEReference(sectionEClass, SECTION__PARENT);
		createEReference(sectionEClass, SECTION__CONTENU);
		createEAttribute(sectionEClass, SECTION__NIVEAU);
		createEOperation(sectionEClass, SECTION___SUPPRIMER);
		createEOperation(sectionEClass, SECTION___GET_SECTIONS__ELIST);

		sectionFeuilleEClass = createEClass(SECTION_FEUILLE);
		createEOperation(sectionFeuilleEClass, SECTION_FEUILLE___SUPPRIMER);
		createEOperation(sectionFeuilleEClass, SECTION_FEUILLE___GET_SECTIONS__ELIST);

		sectionBrancheEClass = createEClass(SECTION_BRANCHE);
		createEReference(sectionBrancheEClass, SECTION_BRANCHE__ENFANT);
		createEReference(sectionBrancheEClass, SECTION_BRANCHE__DOCUMENT);
		createEOperation(sectionBrancheEClass, SECTION_BRANCHE___AJOUTER_SOUS_SECTION__STRING);
		createEOperation(sectionBrancheEClass, SECTION_BRANCHE___SUPPRIMER);
		createEOperation(sectionBrancheEClass, SECTION_BRANCHE___GET_SECTIONS__ELIST);

		contenuEClass = createEClass(CONTENU);
		createEReference(contenuEClass, CONTENU__STRATEGIE);
		createEReference(contenuEClass, CONTENU__ELEMENTS);
		createEAttribute(contenuEClass, CONTENU__POSITION);
		createEReference(contenuEClass, CONTENU__SECTION);
		createEReference(contenuEClass, CONTENU__SECTION_SRC);
		createEOperation(contenuEClass, CONTENU___SUPPRIMER__INT_INT);
		createEOperation(contenuEClass, CONTENU___COLLER__CONTENU_INT);
		createEOperation(contenuEClass, CONTENU___COPIER__INT_INT);

		strategieInsertionEClass = createEClass(STRATEGIE_INSERTION);
		createEReference(strategieInsertionEClass, STRATEGIE_INSERTION__CONTENU);
		createEOperation(strategieInsertionEClass, STRATEGIE_INSERTION___INSERER__ELEMENT_INT);

		strategieInsertionTexteEClass = createEClass(STRATEGIE_INSERTION_TEXTE);
		createEOperation(strategieInsertionTexteEClass, STRATEGIE_INSERTION_TEXTE___INSERER__ELEMENT_INT);

		elementEClass = createEClass(ELEMENT);

		caractereEClass = createEClass(CARACTERE);
		createEAttribute(caractereEClass, CARACTERE__CARACTERE);

		historiqueEClass = createEClass(HISTORIQUE);
		createEReference(historiqueEClass, HISTORIQUE__ACTIONS);
		createEReference(historiqueEClass, HISTORIQUE__ACTIONS_DEFAITES);
		createEOperation(historiqueEClass, HISTORIQUE___VIDER);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__RECEVEUR);
		createEOperation(actionEClass, ACTION___FAIRE);
		createEOperation(actionEClass, ACTION___DEFAIRE);

		actionDeplacerEClass = createEClass(ACTION_DEPLACER);
		createEAttribute(actionDeplacerEClass, ACTION_DEPLACER__POSITION);
		createEReference(actionDeplacerEClass, ACTION_DEPLACER__CONTENU);
		createEReference(actionDeplacerEClass, ACTION_DEPLACER__ACTIONS);
		createEOperation(actionDeplacerEClass, ACTION_DEPLACER___FAIRE);
		createEOperation(actionDeplacerEClass, ACTION_DEPLACER___DEFAIRE);

		actionCollerEClass = createEClass(ACTION_COLLER);
		createEAttribute(actionCollerEClass, ACTION_COLLER__POSITION);
		createEReference(actionCollerEClass, ACTION_COLLER__CONTENU);
		createEOperation(actionCollerEClass, ACTION_COLLER___FAIRE);
		createEOperation(actionCollerEClass, ACTION_COLLER___DEFAIRE);

		actionSupprimerEClass = createEClass(ACTION_SUPPRIMER);
		createEReference(actionSupprimerEClass, ACTION_SUPPRIMER__CONTENU);
		createEOperation(actionSupprimerEClass, ACTION_SUPPRIMER___FAIRE);
		createEOperation(actionSupprimerEClass, ACTION_SUPPRIMER___DEFAIRE);

		actionInsererEClass = createEClass(ACTION_INSERER);
		createEAttribute(actionInsererEClass, ACTION_INSERER__POSITION);
		createEAttribute(actionInsererEClass, ACTION_INSERER__CARACTERE);
		createEOperation(actionInsererEClass, ACTION_INSERER___FAIRE);
		createEOperation(actionInsererEClass, ACTION_INSERER___DEFAIRE);

		pressePapierEClass = createEClass(PRESSE_PAPIER);
		createEReference(pressePapierEClass, PRESSE_PAPIER__CONTENU);
		createEOperation(pressePapierEClass, PRESSE_PAPIER___VIDER);

		editeurEClass = createEClass(EDITEUR);
		createEReference(editeurEClass, EDITEUR__DOCUMENT_COURANT);
		createEReference(editeurEClass, EDITEUR__PRESSE_PAPIER);
		createEReference(editeurEClass, EDITEUR__HISTORIQUE);
		createEReference(editeurEClass, EDITEUR__SECTION_COURANTE);
		createEReference(editeurEClass, EDITEUR__CARETAKER);
		createEOperation(editeurEClass, EDITEUR___SAUVEGARDER__STRING);
		createEOperation(editeurEClass, EDITEUR___OUVRIR__STRING);
		createEOperation(editeurEClass, EDITEUR___CREER_NOUV_DOCUMENT);

		sujetEClass = createEClass(SUJET);
		createEReference(sujetEClass, SUJET__OBSERVATEUR);
		createEOperation(sujetEClass, SUJET___ATTACHER__OBSERVATEUR);
		createEOperation(sujetEClass, SUJET___DETACHER__OBSERVATEUR);
		createEOperation(sujetEClass, SUJET___INFORMER);

		observateurEClass = createEClass(OBSERVATEUR);
		createEOperation(observateurEClass, OBSERVATEUR___UPDATE);
		createEOperation(observateurEClass, OBSERVATEUR___SET_DEPLACER__BOOLEAN);
		createEOperation(observateurEClass, OBSERVATEUR___SET_COLLER__BOOLEAN);

		caretakerEClass = createEClass(CARETAKER);
		createEReference(caretakerEClass, CARETAKER__MEMENTO);
		createEReference(caretakerEClass, CARETAKER__MEMENTO_DEFAITS);

		mementoEClass = createEClass(MEMENTO);
		createEAttribute(mementoEClass, MEMENTO__ETAT_DEPLACER);
		createEAttribute(mementoEClass, MEMENTO__POSITION_CURSEUR);
		createEAttribute(mementoEClass, MEMENTO__ETAT_COPIER);
		createEAttribute(mementoEClass, MEMENTO__ETAT_COLLER);
		createEAttribute(mementoEClass, MEMENTO__ETAT_DEFAIRE);
		createEAttribute(mementoEClass, MEMENTO__ETAT_REFAIRE);
		createEAttribute(mementoEClass, MEMENTO__DEBUT_SELECTION);
		createEAttribute(mementoEClass, MEMENTO__FIN_SELECTION);
		createEReference(mementoEClass, MEMENTO__SECTION_COURANTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sectionFeuilleEClass.getESuperTypes().add(this.getSection());
		sectionBrancheEClass.getESuperTypes().add(this.getSection());
		contenuEClass.getESuperTypes().add(this.getSujet());
		strategieInsertionTexteEClass.getESuperTypes().add(this.getStrategieInsertion());
		caractereEClass.getESuperTypes().add(this.getElement());
		actionDeplacerEClass.getESuperTypes().add(this.getAction());
		actionCollerEClass.getESuperTypes().add(this.getAction());
		actionSupprimerEClass.getESuperTypes().add(this.getAction());
		actionInsererEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Titre(), ecorePackage.getEString(), "titre", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_SectionRacine(), this.getSectionBranche(), this.getSectionBranche_Document(), "sectionRacine", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Modifie(), ecorePackage.getEBoolean(), "modifie", "false", 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDocument__Refaire__Action(), null, "refaire", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDocument__Defaire__Action(), null, "defaire", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_Titre(), ecorePackage.getEString(), "titre", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Parent(), this.getSectionBranche(), this.getSectionBranche_Enfant(), "parent", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Contenu(), this.getContenu(), this.getContenu_Section(), "contenu", null, 1, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Niveau(), ecorePackage.getEInt(), "niveau", "0", 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSection__Supprimer(), null, "supprimer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSection__GetSections__EList(), null, "getSections", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "liste", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(sectionFeuilleEClass, SectionFeuille.class, "SectionFeuille", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSectionFeuille__Supprimer(), null, "supprimer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSectionFeuille__GetSections__EList(), null, "getSections", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "liste", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(sectionBrancheEClass, SectionBranche.class, "SectionBranche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSectionBranche_Enfant(), this.getSection(), this.getSection_Parent(), "enfant", null, 0, -1, SectionBranche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionBranche_Document(), this.getDocument(), this.getDocument_SectionRacine(), "document", null, 1, 1, SectionBranche.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSectionBranche__AjouterSousSection__String(), this.getSection(), "ajouterSousSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "titre", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSectionBranche__Supprimer(), null, "supprimer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSectionBranche__GetSections__EList(), null, "getSections", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "liste", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(contenuEClass, Contenu.class, "Contenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenu_Strategie(), this.getStrategieInsertion(), this.getStrategieInsertion_Contenu(), "strategie", null, 1, 1, Contenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenu_Elements(), this.getElement(), null, "elements", null, 0, -1, Contenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContenu_Position(), ecorePackage.getEInt(), "position", null, 0, 1, Contenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenu_Section(), this.getSection(), this.getSection_Contenu(), "section", null, 1, 1, Contenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContenu_SectionSrc(), this.getSection(), null, "sectionSrc", null, 0, 1, Contenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getContenu__Supprimer__int_int(), null, "supprimer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "positionDebut", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "positionFin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContenu__Coller__Contenu_int(), null, "coller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContenu(), "contenu", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContenu__Copier__int_int(), this.getContenu(), "copier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "positionDebut", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "positionFin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strategieInsertionEClass, StrategieInsertion.class, "StrategieInsertion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategieInsertion_Contenu(), this.getContenu(), this.getContenu_Strategie(), "contenu", null, 1, 1, StrategieInsertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getStrategieInsertion__Inserer__Element_int(), null, "inserer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strategieInsertionTexteEClass, StrategieInsertionTexte.class, "StrategieInsertionTexte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStrategieInsertionTexte__Inserer__Element_int(), null, "inserer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caractereEClass, Caractere.class, "Caractere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaractere_Caractere(), ecorePackage.getEChar(), "caractere", null, 0, 1, Caractere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historiqueEClass, Historique.class, "Historique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistorique_Actions(), this.getAction(), null, "actions", null, 0, 5, Historique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistorique_ActionsDefaites(), this.getAction(), null, "actionsDefaites", null, 0, 5, Historique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getHistorique__Vider(), null, "vider", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Receveur(), this.getContenu(), null, "receveur", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__Faire(), null, "faire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__Defaire(), null, "defaire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionDeplacerEClass, ActionDeplacer.class, "ActionDeplacer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionDeplacer_Position(), ecorePackage.getEInt(), "position", null, 0, 1, ActionDeplacer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDeplacer_Contenu(), this.getContenu(), null, "contenu", null, 1, 1, ActionDeplacer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionDeplacer_Actions(), this.getAction(), null, "actions", null, 2, 2, ActionDeplacer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActionDeplacer__Faire(), null, "faire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getActionDeplacer__Defaire(), null, "defaire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionCollerEClass, ActionColler.class, "ActionColler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionColler_Position(), ecorePackage.getEInt(), "position", null, 0, 1, ActionColler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionColler_Contenu(), this.getContenu(), null, "contenu", null, 1, 1, ActionColler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActionColler__Faire(), null, "faire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getActionColler__Defaire(), null, "defaire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionSupprimerEClass, ActionSupprimer.class, "ActionSupprimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionSupprimer_Contenu(), this.getContenu(), null, "contenu", null, 1, 1, ActionSupprimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActionSupprimer__Faire(), null, "faire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getActionSupprimer__Defaire(), null, "defaire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionInsererEClass, ActionInserer.class, "ActionInserer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionInserer_Position(), ecorePackage.getEInt(), "position", null, 0, 1, ActionInserer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionInserer_Caractere(), ecorePackage.getEChar(), "caractere", null, 0, 1, ActionInserer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActionInserer__Faire(), null, "faire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getActionInserer__Defaire(), null, "defaire", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pressePapierEClass, PressePapier.class, "PressePapier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPressePapier_Contenu(), this.getContenu(), null, "contenu", null, 1, 1, PressePapier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPressePapier__Vider(), null, "vider", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(editeurEClass, Editeur.class, "Editeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditeur_DocumentCourant(), this.getDocument(), null, "documentCourant", null, 0, 1, Editeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditeur_PressePapier(), this.getPressePapier(), null, "pressePapier", null, 1, 1, Editeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditeur_Historique(), this.getHistorique(), null, "historique", null, 1, 1, Editeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditeur_SectionCourante(), this.getSection(), null, "sectionCourante", null, 1, 1, Editeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditeur_Caretaker(), this.getCaretaker(), null, "caretaker", null, 1, 1, Editeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEditeur__Sauvegarder__String(), null, "sauvegarder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nomFichier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEditeur__Ouvrir__String(), this.getDocument(), "ouvrir", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nomFichier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEditeur__CreerNouvDocument(), this.getDocument(), "creerNouvDocument", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sujetEClass, Sujet.class, "Sujet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSujet_Observateur(), this.getObservateur(), null, "observateur", null, 0, 1, Sujet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSujet__Attacher__Observateur(), null, "attacher", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObservateur(), "observateur", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSujet__Detacher__Observateur(), null, "detacher", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObservateur(), "observateur", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSujet__Informer(), null, "informer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(observateurEClass, Observateur.class, "Observateur", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getObservateur__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObservateur__SetDeplacer__boolean(), null, "setDeplacer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "etat", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObservateur__SetColler__boolean(), null, "setColler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "etat", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(caretakerEClass, Caretaker.class, "Caretaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaretaker_Memento(), this.getMemento(), null, "memento", null, 0, 5, Caretaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaretaker_MementoDefaits(), this.getMemento(), null, "mementoDefaits", null, 0, 5, Caretaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mementoEClass, Memento.class, "Memento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemento_EtatDeplacer(), ecorePackage.getEBoolean(), "etatDeplacer", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemento_PositionCurseur(), ecorePackage.getEInt(), "positionCurseur", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemento_EtatCopier(), ecorePackage.getEBoolean(), "etatCopier", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemento_EtatColler(), ecorePackage.getEBoolean(), "etatColler", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemento_EtatDefaire(), ecorePackage.getEBoolean(), "etatDefaire", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemento_EtatRefaire(), ecorePackage.getEBoolean(), "etatRefaire", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemento_DebutSelection(), ecorePackage.getEInt(), "debutSelection", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemento_FinSelection(), ecorePackage.getEInt(), "finSelection", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemento_SectionCourante(), this.getSection(), null, "sectionCourante", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl

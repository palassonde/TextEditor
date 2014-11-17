/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DocumentImpl
	 * @see model.impl.ModelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Section Racine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SECTION_RACINE = 1;

	/**
	 * The feature id for the '<em><b>Section Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SECTION_COURANTE = 2;

	/**
	 * The feature id for the '<em><b>Modifie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MODIFIE = 3;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Section <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Section
	 * @see model.impl.ModelPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 1;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENU = 2;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NIVEAU = 3;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Ajouter Sous Section</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___AJOUTER_SOUS_SECTION__STRING = 0;

	/**
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___SUPPRIMER = 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.SectionFeuilleImpl <em>Section Feuille</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SectionFeuilleImpl
	 * @see model.impl.ModelPackageImpl#getSectionFeuille()
	 * @generated
	 */
	int SECTION_FEUILLE = 2;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEUILLE__TITRE = SECTION__TITRE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEUILLE__PARENT = SECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEUILLE__CONTENU = SECTION__CONTENU;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEUILLE__NIVEAU = SECTION__NIVEAU;

	/**
	 * The number of structural features of the '<em>Section Feuille</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEUILLE_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Ajouter Sous Section</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEUILLE___AJOUTER_SOUS_SECTION__STRING = SECTION___AJOUTER_SOUS_SECTION__STRING;

	/**
	 * The operation id for the '<em>Renommer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEUILLE___RENOMMER__STRING = SECTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEUILLE___SUPPRIMER = SECTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section Feuille</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEUILLE_OPERATION_COUNT = SECTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.impl.SectionBrancheImpl <em>Section Branche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SectionBrancheImpl
	 * @see model.impl.ModelPackageImpl#getSectionBranche()
	 * @generated
	 */
	int SECTION_BRANCHE = 3;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE__TITRE = SECTION__TITRE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE__PARENT = SECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE__CONTENU = SECTION__CONTENU;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE__NIVEAU = SECTION__NIVEAU;

	/**
	 * The feature id for the '<em><b>Enfant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE__ENFANT = SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE__DOCUMENT = SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section Branche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE_FEATURE_COUNT = SECTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Renommer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE___RENOMMER__STRING = SECTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Ajouter Sous Section</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE___AJOUTER_SOUS_SECTION__STRING = SECTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE___SUPPRIMER = SECTION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Section Branche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_BRANCHE_OPERATION_COUNT = SECTION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link model.impl.ContenuImpl <em>Contenu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ContenuImpl
	 * @see model.impl.ModelPackageImpl#getContenu()
	 * @generated
	 */
	int CONTENU = 4;

	/**
	 * The feature id for the '<em><b>Strategie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU__STRATEGIE = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU__POSITION = 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU__SECTION = 3;

	/**
	 * The feature id for the '<em><b>Section Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU__SECTION_SRC = 4;

	/**
	 * The number of structural features of the '<em>Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU___SUPPRIMER__INT_INT = 0;

	/**
	 * The operation id for the '<em>Coller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU___COLLER__CONTENU_INT = 1;

	/**
	 * The operation id for the '<em>Copier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU___COPIER__INT_INT = 2;

	/**
	 * The operation id for the '<em>Defaire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU___DEFAIRE__ACTION = 3;

	/**
	 * The operation id for the '<em>Refaire</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU___REFAIRE__ACTION = 4;

	/**
	 * The number of operations of the '<em>Contenu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENU_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link model.StrategieInsertion <em>Strategie Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.StrategieInsertion
	 * @see model.impl.ModelPackageImpl#getStrategieInsertion()
	 * @generated
	 */
	int STRATEGIE_INSERTION = 5;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIE_INSERTION__CONTENU = 0;

	/**
	 * The number of structural features of the '<em>Strategie Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIE_INSERTION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Inserer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIE_INSERTION___INSERER__ELEMENT_INT = 0;

	/**
	 * The number of operations of the '<em>Strategie Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIE_INSERTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.StrategieInsertionTexteImpl <em>Strategie Insertion Texte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StrategieInsertionTexteImpl
	 * @see model.impl.ModelPackageImpl#getStrategieInsertionTexte()
	 * @generated
	 */
	int STRATEGIE_INSERTION_TEXTE = 6;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIE_INSERTION_TEXTE__CONTENU = STRATEGIE_INSERTION__CONTENU;

	/**
	 * The number of structural features of the '<em>Strategie Insertion Texte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIE_INSERTION_TEXTE_FEATURE_COUNT = STRATEGIE_INSERTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Inserer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIE_INSERTION_TEXTE___INSERER__ELEMENT_INT = STRATEGIE_INSERTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strategie Insertion Texte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGIE_INSERTION_TEXTE_OPERATION_COUNT = STRATEGIE_INSERTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ElementImpl
	 * @see model.impl.ModelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.CaractereImpl <em>Caractere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CaractereImpl
	 * @see model.impl.ModelPackageImpl#getCaractere()
	 * @generated
	 */
	int CARACTERE = 8;

	/**
	 * The feature id for the '<em><b>Caractere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERE__CARACTERE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Caractere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Caractere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARACTERE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.HistoriqueImpl <em>Historique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.HistoriqueImpl
	 * @see model.impl.ModelPackageImpl#getHistorique()
	 * @generated
	 */
	int HISTORIQUE = 9;

	/**
	 * The feature id for the '<em><b>Actions Defaites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE__ACTIONS_DEFAITES = 0;

	/**
	 * The feature id for the '<em><b>Actions Refaites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE__ACTIONS_REFAITES = 1;

	/**
	 * The number of structural features of the '<em>Historique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Vider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE___VIDER = 0;

	/**
	 * The number of operations of the '<em>Historique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ActionImpl
	 * @see model.impl.ModelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 10;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTENU = 0;

	/**
	 * The feature id for the '<em><b>Type Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE_ACTION = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.PressePapierImpl <em>Presse Papier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PressePapierImpl
	 * @see model.impl.ModelPackageImpl#getPressePapier()
	 * @generated
	 */
	int PRESSE_PAPIER = 11;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSE_PAPIER__CONTENU = 0;

	/**
	 * The number of structural features of the '<em>Presse Papier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSE_PAPIER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Vider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSE_PAPIER___VIDER = 0;

	/**
	 * The number of operations of the '<em>Presse Papier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSE_PAPIER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.EditeurImpl <em>Editeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EditeurImpl
	 * @see model.impl.ModelPackageImpl#getEditeur()
	 * @generated
	 */
	int EDITEUR = 12;

	/**
	 * The feature id for the '<em><b>Document Courant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITEUR__DOCUMENT_COURANT = 0;

	/**
	 * The feature id for the '<em><b>Presse Papier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITEUR__PRESSE_PAPIER = 1;

	/**
	 * The feature id for the '<em><b>Historique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITEUR__HISTORIQUE = 2;

	/**
	 * The number of structural features of the '<em>Editeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITEUR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Sauvegarder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITEUR___SAUVEGARDER__STRING = 0;

	/**
	 * The operation id for the '<em>Ouvrir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITEUR___OUVRIR__STRING = 1;

	/**
	 * The operation id for the '<em>Creer Nouv Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITEUR___CREER_NOUV_DOCUMENT = 2;

	/**
	 * The number of operations of the '<em>Editeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITEUR_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.TypeAction <em>Type Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TypeAction
	 * @see model.impl.ModelPackageImpl#getTypeAction()
	 * @generated
	 */
	int TYPE_ACTION = 13;


	/**
	 * Returns the meta object for class '{@link model.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see model.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link model.Document#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see model.Document#getTitre()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Titre();

	/**
	 * Returns the meta object for the containment reference '{@link model.Document#getSectionRacine <em>Section Racine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section Racine</em>'.
	 * @see model.Document#getSectionRacine()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_SectionRacine();

	/**
	 * Returns the meta object for the reference '{@link model.Document#getSectionCourante <em>Section Courante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section Courante</em>'.
	 * @see model.Document#getSectionCourante()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_SectionCourante();

	/**
	 * Returns the meta object for the attribute '{@link model.Document#isModifie <em>Modifie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifie</em>'.
	 * @see model.Document#isModifie()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Modifie();

	/**
	 * Returns the meta object for class '{@link model.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see model.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link model.Section#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see model.Section#getTitre()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Titre();

	/**
	 * Returns the meta object for the container reference '{@link model.Section#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see model.Section#getParent()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link model.Section#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contenu</em>'.
	 * @see model.Section#getContenu()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Contenu();

	/**
	 * Returns the meta object for the attribute '{@link model.Section#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau</em>'.
	 * @see model.Section#getNiveau()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Niveau();

	/**
	 * Returns the meta object for the '{@link model.Section#ajouterSousSection(java.lang.String) <em>Ajouter Sous Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter Sous Section</em>' operation.
	 * @see model.Section#ajouterSousSection(java.lang.String)
	 * @generated
	 */
	EOperation getSection__AjouterSousSection__String();

	/**
	 * Returns the meta object for the '{@link model.Section#supprimer() <em>Supprimer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer</em>' operation.
	 * @see model.Section#supprimer()
	 * @generated
	 */
	EOperation getSection__Supprimer();

	/**
	 * Returns the meta object for class '{@link model.SectionFeuille <em>Section Feuille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Feuille</em>'.
	 * @see model.SectionFeuille
	 * @generated
	 */
	EClass getSectionFeuille();

	/**
	 * Returns the meta object for the '{@link model.SectionFeuille#renommer(java.lang.String) <em>Renommer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Renommer</em>' operation.
	 * @see model.SectionFeuille#renommer(java.lang.String)
	 * @generated
	 */
	EOperation getSectionFeuille__Renommer__String();

	/**
	 * Returns the meta object for the '{@link model.SectionFeuille#supprimer() <em>Supprimer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer</em>' operation.
	 * @see model.SectionFeuille#supprimer()
	 * @generated
	 */
	EOperation getSectionFeuille__Supprimer();

	/**
	 * Returns the meta object for class '{@link model.SectionBranche <em>Section Branche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Branche</em>'.
	 * @see model.SectionBranche
	 * @generated
	 */
	EClass getSectionBranche();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SectionBranche#getEnfant <em>Enfant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enfant</em>'.
	 * @see model.SectionBranche#getEnfant()
	 * @see #getSectionBranche()
	 * @generated
	 */
	EReference getSectionBranche_Enfant();

	/**
	 * Returns the meta object for the container reference '{@link model.SectionBranche#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document</em>'.
	 * @see model.SectionBranche#getDocument()
	 * @see #getSectionBranche()
	 * @generated
	 */
	EReference getSectionBranche_Document();

	/**
	 * Returns the meta object for the '{@link model.SectionBranche#renommer(java.lang.String) <em>Renommer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Renommer</em>' operation.
	 * @see model.SectionBranche#renommer(java.lang.String)
	 * @generated
	 */
	EOperation getSectionBranche__Renommer__String();

	/**
	 * Returns the meta object for the '{@link model.SectionBranche#ajouterSousSection(java.lang.String) <em>Ajouter Sous Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter Sous Section</em>' operation.
	 * @see model.SectionBranche#ajouterSousSection(java.lang.String)
	 * @generated
	 */
	EOperation getSectionBranche__AjouterSousSection__String();

	/**
	 * Returns the meta object for the '{@link model.SectionBranche#supprimer() <em>Supprimer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer</em>' operation.
	 * @see model.SectionBranche#supprimer()
	 * @generated
	 */
	EOperation getSectionBranche__Supprimer();

	/**
	 * Returns the meta object for class '{@link model.Contenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenu</em>'.
	 * @see model.Contenu
	 * @generated
	 */
	EClass getContenu();

	/**
	 * Returns the meta object for the containment reference '{@link model.Contenu#getStrategie <em>Strategie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategie</em>'.
	 * @see model.Contenu#getStrategie()
	 * @see #getContenu()
	 * @generated
	 */
	EReference getContenu_Strategie();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Contenu#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see model.Contenu#getElements()
	 * @see #getContenu()
	 * @generated
	 */
	EReference getContenu_Elements();

	/**
	 * Returns the meta object for the attribute '{@link model.Contenu#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see model.Contenu#getPosition()
	 * @see #getContenu()
	 * @generated
	 */
	EAttribute getContenu_Position();

	/**
	 * Returns the meta object for the container reference '{@link model.Contenu#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Section</em>'.
	 * @see model.Contenu#getSection()
	 * @see #getContenu()
	 * @generated
	 */
	EReference getContenu_Section();

	/**
	 * Returns the meta object for the reference '{@link model.Contenu#getSectionSrc <em>Section Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Section Src</em>'.
	 * @see model.Contenu#getSectionSrc()
	 * @see #getContenu()
	 * @generated
	 */
	EReference getContenu_SectionSrc();

	/**
	 * Returns the meta object for the '{@link model.Contenu#supprimer(int, int) <em>Supprimer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer</em>' operation.
	 * @see model.Contenu#supprimer(int, int)
	 * @generated
	 */
	EOperation getContenu__Supprimer__int_int();

	/**
	 * Returns the meta object for the '{@link model.Contenu#coller(model.Contenu, int) <em>Coller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Coller</em>' operation.
	 * @see model.Contenu#coller(model.Contenu, int)
	 * @generated
	 */
	EOperation getContenu__Coller__Contenu_int();

	/**
	 * Returns the meta object for the '{@link model.Contenu#copier(int, int) <em>Copier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copier</em>' operation.
	 * @see model.Contenu#copier(int, int)
	 * @generated
	 */
	EOperation getContenu__Copier__int_int();

	/**
	 * Returns the meta object for the '{@link model.Contenu#defaire(model.Action) <em>Defaire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Defaire</em>' operation.
	 * @see model.Contenu#defaire(model.Action)
	 * @generated
	 */
	EOperation getContenu__Defaire__Action();

	/**
	 * Returns the meta object for the '{@link model.Contenu#refaire(model.Action) <em>Refaire</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refaire</em>' operation.
	 * @see model.Contenu#refaire(model.Action)
	 * @generated
	 */
	EOperation getContenu__Refaire__Action();

	/**
	 * Returns the meta object for class '{@link model.StrategieInsertion <em>Strategie Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategie Insertion</em>'.
	 * @see model.StrategieInsertion
	 * @generated
	 */
	EClass getStrategieInsertion();

	/**
	 * Returns the meta object for the container reference '{@link model.StrategieInsertion#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Contenu</em>'.
	 * @see model.StrategieInsertion#getContenu()
	 * @see #getStrategieInsertion()
	 * @generated
	 */
	EReference getStrategieInsertion_Contenu();

	/**
	 * Returns the meta object for the '{@link model.StrategieInsertion#inserer(model.Element, int) <em>Inserer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inserer</em>' operation.
	 * @see model.StrategieInsertion#inserer(model.Element, int)
	 * @generated
	 */
	EOperation getStrategieInsertion__Inserer__Element_int();

	/**
	 * Returns the meta object for class '{@link model.StrategieInsertionTexte <em>Strategie Insertion Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategie Insertion Texte</em>'.
	 * @see model.StrategieInsertionTexte
	 * @generated
	 */
	EClass getStrategieInsertionTexte();

	/**
	 * Returns the meta object for the '{@link model.StrategieInsertionTexte#inserer(model.Element, int) <em>Inserer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inserer</em>' operation.
	 * @see model.StrategieInsertionTexte#inserer(model.Element, int)
	 * @generated
	 */
	EOperation getStrategieInsertionTexte__Inserer__Element_int();

	/**
	 * Returns the meta object for class '{@link model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see model.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link model.Caractere <em>Caractere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caractere</em>'.
	 * @see model.Caractere
	 * @generated
	 */
	EClass getCaractere();

	/**
	 * Returns the meta object for the attribute '{@link model.Caractere#getCaractere <em>Caractere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caractere</em>'.
	 * @see model.Caractere#getCaractere()
	 * @see #getCaractere()
	 * @generated
	 */
	EAttribute getCaractere_Caractere();

	/**
	 * Returns the meta object for class '{@link model.Historique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historique</em>'.
	 * @see model.Historique
	 * @generated
	 */
	EClass getHistorique();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Historique#getActionsDefaites <em>Actions Defaites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions Defaites</em>'.
	 * @see model.Historique#getActionsDefaites()
	 * @see #getHistorique()
	 * @generated
	 */
	EReference getHistorique_ActionsDefaites();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Historique#getActionsRefaites <em>Actions Refaites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions Refaites</em>'.
	 * @see model.Historique#getActionsRefaites()
	 * @see #getHistorique()
	 * @generated
	 */
	EReference getHistorique_ActionsRefaites();

	/**
	 * Returns the meta object for the '{@link model.Historique#vider() <em>Vider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vider</em>' operation.
	 * @see model.Historique#vider()
	 * @generated
	 */
	EOperation getHistorique__Vider();

	/**
	 * Returns the meta object for class '{@link model.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see model.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference list '{@link model.Action#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contenu</em>'.
	 * @see model.Action#getContenu()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Contenu();

	/**
	 * Returns the meta object for the attribute '{@link model.Action#getTypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Action</em>'.
	 * @see model.Action#getTypeAction()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_TypeAction();

	/**
	 * Returns the meta object for class '{@link model.PressePapier <em>Presse Papier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presse Papier</em>'.
	 * @see model.PressePapier
	 * @generated
	 */
	EClass getPressePapier();

	/**
	 * Returns the meta object for the reference '{@link model.PressePapier#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contenu</em>'.
	 * @see model.PressePapier#getContenu()
	 * @see #getPressePapier()
	 * @generated
	 */
	EReference getPressePapier_Contenu();

	/**
	 * Returns the meta object for the '{@link model.PressePapier#vider() <em>Vider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vider</em>' operation.
	 * @see model.PressePapier#vider()
	 * @generated
	 */
	EOperation getPressePapier__Vider();

	/**
	 * Returns the meta object for class '{@link model.Editeur <em>Editeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editeur</em>'.
	 * @see model.Editeur
	 * @generated
	 */
	EClass getEditeur();

	/**
	 * Returns the meta object for the reference '{@link model.Editeur#getDocumentCourant <em>Document Courant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document Courant</em>'.
	 * @see model.Editeur#getDocumentCourant()
	 * @see #getEditeur()
	 * @generated
	 */
	EReference getEditeur_DocumentCourant();

	/**
	 * Returns the meta object for the containment reference '{@link model.Editeur#getPressePapier <em>Presse Papier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presse Papier</em>'.
	 * @see model.Editeur#getPressePapier()
	 * @see #getEditeur()
	 * @generated
	 */
	EReference getEditeur_PressePapier();

	/**
	 * Returns the meta object for the containment reference '{@link model.Editeur#getHistorique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Historique</em>'.
	 * @see model.Editeur#getHistorique()
	 * @see #getEditeur()
	 * @generated
	 */
	EReference getEditeur_Historique();

	/**
	 * Returns the meta object for the '{@link model.Editeur#sauvegarder(java.lang.String) <em>Sauvegarder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sauvegarder</em>' operation.
	 * @see model.Editeur#sauvegarder(java.lang.String)
	 * @generated
	 */
	EOperation getEditeur__Sauvegarder__String();

	/**
	 * Returns the meta object for the '{@link model.Editeur#ouvrir(java.lang.String) <em>Ouvrir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ouvrir</em>' operation.
	 * @see model.Editeur#ouvrir(java.lang.String)
	 * @generated
	 */
	EOperation getEditeur__Ouvrir__String();

	/**
	 * Returns the meta object for the '{@link model.Editeur#creerNouvDocument() <em>Creer Nouv Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creer Nouv Document</em>' operation.
	 * @see model.Editeur#creerNouvDocument()
	 * @generated
	 */
	EOperation getEditeur__CreerNouvDocument();

	/**
	 * Returns the meta object for enum '{@link model.TypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Action</em>'.
	 * @see model.TypeAction
	 * @generated
	 */
	EEnum getTypeAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DocumentImpl
		 * @see model.impl.ModelPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TITRE = eINSTANCE.getDocument_Titre();

		/**
		 * The meta object literal for the '<em><b>Section Racine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SECTION_RACINE = eINSTANCE.getDocument_SectionRacine();

		/**
		 * The meta object literal for the '<em><b>Section Courante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SECTION_COURANTE = eINSTANCE.getDocument_SectionCourante();

		/**
		 * The meta object literal for the '<em><b>Modifie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__MODIFIE = eINSTANCE.getDocument_Modifie();

		/**
		 * The meta object literal for the '{@link model.Section <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Section
		 * @see model.impl.ModelPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TITRE = eINSTANCE.getSection_Titre();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__PARENT = eINSTANCE.getSection_Parent();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CONTENU = eINSTANCE.getSection_Contenu();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__NIVEAU = eINSTANCE.getSection_Niveau();

		/**
		 * The meta object literal for the '<em><b>Ajouter Sous Section</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION___AJOUTER_SOUS_SECTION__STRING = eINSTANCE.getSection__AjouterSousSection__String();

		/**
		 * The meta object literal for the '<em><b>Supprimer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION___SUPPRIMER = eINSTANCE.getSection__Supprimer();

		/**
		 * The meta object literal for the '{@link model.impl.SectionFeuilleImpl <em>Section Feuille</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SectionFeuilleImpl
		 * @see model.impl.ModelPackageImpl#getSectionFeuille()
		 * @generated
		 */
		EClass SECTION_FEUILLE = eINSTANCE.getSectionFeuille();

		/**
		 * The meta object literal for the '<em><b>Renommer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_FEUILLE___RENOMMER__STRING = eINSTANCE.getSectionFeuille__Renommer__String();

		/**
		 * The meta object literal for the '<em><b>Supprimer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_FEUILLE___SUPPRIMER = eINSTANCE.getSectionFeuille__Supprimer();

		/**
		 * The meta object literal for the '{@link model.impl.SectionBrancheImpl <em>Section Branche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SectionBrancheImpl
		 * @see model.impl.ModelPackageImpl#getSectionBranche()
		 * @generated
		 */
		EClass SECTION_BRANCHE = eINSTANCE.getSectionBranche();

		/**
		 * The meta object literal for the '<em><b>Enfant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_BRANCHE__ENFANT = eINSTANCE.getSectionBranche_Enfant();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_BRANCHE__DOCUMENT = eINSTANCE.getSectionBranche_Document();

		/**
		 * The meta object literal for the '<em><b>Renommer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_BRANCHE___RENOMMER__STRING = eINSTANCE.getSectionBranche__Renommer__String();

		/**
		 * The meta object literal for the '<em><b>Ajouter Sous Section</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_BRANCHE___AJOUTER_SOUS_SECTION__STRING = eINSTANCE.getSectionBranche__AjouterSousSection__String();

		/**
		 * The meta object literal for the '<em><b>Supprimer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION_BRANCHE___SUPPRIMER = eINSTANCE.getSectionBranche__Supprimer();

		/**
		 * The meta object literal for the '{@link model.impl.ContenuImpl <em>Contenu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ContenuImpl
		 * @see model.impl.ModelPackageImpl#getContenu()
		 * @generated
		 */
		EClass CONTENU = eINSTANCE.getContenu();

		/**
		 * The meta object literal for the '<em><b>Strategie</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENU__STRATEGIE = eINSTANCE.getContenu_Strategie();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENU__ELEMENTS = eINSTANCE.getContenu_Elements();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENU__POSITION = eINSTANCE.getContenu_Position();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENU__SECTION = eINSTANCE.getContenu_Section();

		/**
		 * The meta object literal for the '<em><b>Section Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENU__SECTION_SRC = eINSTANCE.getContenu_SectionSrc();

		/**
		 * The meta object literal for the '<em><b>Supprimer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENU___SUPPRIMER__INT_INT = eINSTANCE.getContenu__Supprimer__int_int();

		/**
		 * The meta object literal for the '<em><b>Coller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENU___COLLER__CONTENU_INT = eINSTANCE.getContenu__Coller__Contenu_int();

		/**
		 * The meta object literal for the '<em><b>Copier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENU___COPIER__INT_INT = eINSTANCE.getContenu__Copier__int_int();

		/**
		 * The meta object literal for the '<em><b>Defaire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENU___DEFAIRE__ACTION = eINSTANCE.getContenu__Defaire__Action();

		/**
		 * The meta object literal for the '<em><b>Refaire</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENU___REFAIRE__ACTION = eINSTANCE.getContenu__Refaire__Action();

		/**
		 * The meta object literal for the '{@link model.StrategieInsertion <em>Strategie Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.StrategieInsertion
		 * @see model.impl.ModelPackageImpl#getStrategieInsertion()
		 * @generated
		 */
		EClass STRATEGIE_INSERTION = eINSTANCE.getStrategieInsertion();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGIE_INSERTION__CONTENU = eINSTANCE.getStrategieInsertion_Contenu();

		/**
		 * The meta object literal for the '<em><b>Inserer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGIE_INSERTION___INSERER__ELEMENT_INT = eINSTANCE.getStrategieInsertion__Inserer__Element_int();

		/**
		 * The meta object literal for the '{@link model.impl.StrategieInsertionTexteImpl <em>Strategie Insertion Texte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.StrategieInsertionTexteImpl
		 * @see model.impl.ModelPackageImpl#getStrategieInsertionTexte()
		 * @generated
		 */
		EClass STRATEGIE_INSERTION_TEXTE = eINSTANCE.getStrategieInsertionTexte();

		/**
		 * The meta object literal for the '<em><b>Inserer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRATEGIE_INSERTION_TEXTE___INSERER__ELEMENT_INT = eINSTANCE.getStrategieInsertionTexte__Inserer__Element_int();

		/**
		 * The meta object literal for the '{@link model.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ElementImpl
		 * @see model.impl.ModelPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link model.impl.CaractereImpl <em>Caractere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CaractereImpl
		 * @see model.impl.ModelPackageImpl#getCaractere()
		 * @generated
		 */
		EClass CARACTERE = eINSTANCE.getCaractere();

		/**
		 * The meta object literal for the '<em><b>Caractere</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARACTERE__CARACTERE = eINSTANCE.getCaractere_Caractere();

		/**
		 * The meta object literal for the '{@link model.impl.HistoriqueImpl <em>Historique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.HistoriqueImpl
		 * @see model.impl.ModelPackageImpl#getHistorique()
		 * @generated
		 */
		EClass HISTORIQUE = eINSTANCE.getHistorique();

		/**
		 * The meta object literal for the '<em><b>Actions Defaites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORIQUE__ACTIONS_DEFAITES = eINSTANCE.getHistorique_ActionsDefaites();

		/**
		 * The meta object literal for the '<em><b>Actions Refaites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORIQUE__ACTIONS_REFAITES = eINSTANCE.getHistorique_ActionsRefaites();

		/**
		 * The meta object literal for the '<em><b>Vider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORIQUE___VIDER = eINSTANCE.getHistorique__Vider();

		/**
		 * The meta object literal for the '{@link model.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ActionImpl
		 * @see model.impl.ModelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTENU = eINSTANCE.getAction_Contenu();

		/**
		 * The meta object literal for the '<em><b>Type Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE_ACTION = eINSTANCE.getAction_TypeAction();

		/**
		 * The meta object literal for the '{@link model.impl.PressePapierImpl <em>Presse Papier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PressePapierImpl
		 * @see model.impl.ModelPackageImpl#getPressePapier()
		 * @generated
		 */
		EClass PRESSE_PAPIER = eINSTANCE.getPressePapier();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESSE_PAPIER__CONTENU = eINSTANCE.getPressePapier_Contenu();

		/**
		 * The meta object literal for the '<em><b>Vider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRESSE_PAPIER___VIDER = eINSTANCE.getPressePapier__Vider();

		/**
		 * The meta object literal for the '{@link model.impl.EditeurImpl <em>Editeur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.EditeurImpl
		 * @see model.impl.ModelPackageImpl#getEditeur()
		 * @generated
		 */
		EClass EDITEUR = eINSTANCE.getEditeur();

		/**
		 * The meta object literal for the '<em><b>Document Courant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITEUR__DOCUMENT_COURANT = eINSTANCE.getEditeur_DocumentCourant();

		/**
		 * The meta object literal for the '<em><b>Presse Papier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITEUR__PRESSE_PAPIER = eINSTANCE.getEditeur_PressePapier();

		/**
		 * The meta object literal for the '<em><b>Historique</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITEUR__HISTORIQUE = eINSTANCE.getEditeur_Historique();

		/**
		 * The meta object literal for the '<em><b>Sauvegarder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDITEUR___SAUVEGARDER__STRING = eINSTANCE.getEditeur__Sauvegarder__String();

		/**
		 * The meta object literal for the '<em><b>Ouvrir</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDITEUR___OUVRIR__STRING = eINSTANCE.getEditeur__Ouvrir__String();

		/**
		 * The meta object literal for the '<em><b>Creer Nouv Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDITEUR___CREER_NOUV_DOCUMENT = eINSTANCE.getEditeur__CreerNouvDocument();

		/**
		 * The meta object literal for the '{@link model.TypeAction <em>Type Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.TypeAction
		 * @see model.impl.ModelPackageImpl#getTypeAction()
		 * @generated
		 */
		EEnum TYPE_ACTION = eINSTANCE.getTypeAction();

	}

} //ModelPackage

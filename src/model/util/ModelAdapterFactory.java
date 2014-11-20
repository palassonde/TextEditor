/**
 */
package model.util;

import model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseSectionFeuille(SectionFeuille object) {
				return createSectionFeuilleAdapter();
			}
			@Override
			public Adapter caseSectionBranche(SectionBranche object) {
				return createSectionBrancheAdapter();
			}
			@Override
			public Adapter caseContenu(Contenu object) {
				return createContenuAdapter();
			}
			@Override
			public Adapter caseStrategieInsertion(StrategieInsertion object) {
				return createStrategieInsertionAdapter();
			}
			@Override
			public Adapter caseStrategieInsertionTexte(StrategieInsertionTexte object) {
				return createStrategieInsertionTexteAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseCaractere(Caractere object) {
				return createCaractereAdapter();
			}
			@Override
			public Adapter caseHistorique(Historique object) {
				return createHistoriqueAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseActionDeplacer(ActionDeplacer object) {
				return createActionDeplacerAdapter();
			}
			@Override
			public Adapter caseActionColler(ActionColler object) {
				return createActionCollerAdapter();
			}
			@Override
			public Adapter caseActionSupprimer(ActionSupprimer object) {
				return createActionSupprimerAdapter();
			}
			@Override
			public Adapter caseActionInserer(ActionInserer object) {
				return createActionInsererAdapter();
			}
			@Override
			public Adapter casePressePapier(PressePapier object) {
				return createPressePapierAdapter();
			}
			@Override
			public Adapter caseEditeur(Editeur object) {
				return createEditeurAdapter();
			}
			@Override
			public Adapter caseSujet(Sujet object) {
				return createSujetAdapter();
			}
			@Override
			public Adapter caseObservateur(Observateur object) {
				return createObservateurAdapter();
			}
			@Override
			public Adapter caseCaretaker(Caretaker object) {
				return createCaretakerAdapter();
			}
			@Override
			public Adapter caseMemento(Memento object) {
				return createMementoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SectionFeuille <em>Section Feuille</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SectionFeuille
	 * @generated
	 */
	public Adapter createSectionFeuilleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SectionBranche <em>Section Branche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SectionBranche
	 * @generated
	 */
	public Adapter createSectionBrancheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Contenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Contenu
	 * @generated
	 */
	public Adapter createContenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.StrategieInsertion <em>Strategie Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.StrategieInsertion
	 * @generated
	 */
	public Adapter createStrategieInsertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.StrategieInsertionTexte <em>Strategie Insertion Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.StrategieInsertionTexte
	 * @generated
	 */
	public Adapter createStrategieInsertionTexteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Caractere <em>Caractere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Caractere
	 * @generated
	 */
	public Adapter createCaractereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Historique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Historique
	 * @generated
	 */
	public Adapter createHistoriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ActionDeplacer <em>Action Deplacer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ActionDeplacer
	 * @generated
	 */
	public Adapter createActionDeplacerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ActionColler <em>Action Coller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ActionColler
	 * @generated
	 */
	public Adapter createActionCollerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ActionSupprimer <em>Action Supprimer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ActionSupprimer
	 * @generated
	 */
	public Adapter createActionSupprimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ActionInserer <em>Action Inserer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ActionInserer
	 * @generated
	 */
	public Adapter createActionInsererAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PressePapier <em>Presse Papier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PressePapier
	 * @generated
	 */
	public Adapter createPressePapierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Editeur <em>Editeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Editeur
	 * @generated
	 */
	public Adapter createEditeurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Sujet <em>Sujet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Sujet
	 * @generated
	 */
	public Adapter createSujetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Observateur <em>Observateur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Observateur
	 * @generated
	 */
	public Adapter createObservateurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Caretaker <em>Caretaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Caretaker
	 * @generated
	 */
	public Adapter createCaretakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Memento <em>Memento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Memento
	 * @generated
	 */
	public Adapter createMementoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory

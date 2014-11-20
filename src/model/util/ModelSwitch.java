/**
 */
package model.util;

import model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SECTION_FEUILLE: {
				SectionFeuille sectionFeuille = (SectionFeuille)theEObject;
				T result = caseSectionFeuille(sectionFeuille);
				if (result == null) result = caseSection(sectionFeuille);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SECTION_BRANCHE: {
				SectionBranche sectionBranche = (SectionBranche)theEObject;
				T result = caseSectionBranche(sectionBranche);
				if (result == null) result = caseSection(sectionBranche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONTENU: {
				Contenu contenu = (Contenu)theEObject;
				T result = caseContenu(contenu);
				if (result == null) result = caseSujet(contenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRATEGIE_INSERTION: {
				StrategieInsertion strategieInsertion = (StrategieInsertion)theEObject;
				T result = caseStrategieInsertion(strategieInsertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRATEGIE_INSERTION_TEXTE: {
				StrategieInsertionTexte strategieInsertionTexte = (StrategieInsertionTexte)theEObject;
				T result = caseStrategieInsertionTexte(strategieInsertionTexte);
				if (result == null) result = caseStrategieInsertion(strategieInsertionTexte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CARACTERE: {
				Caractere caractere = (Caractere)theEObject;
				T result = caseCaractere(caractere);
				if (result == null) result = caseElement(caractere);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.HISTORIQUE: {
				Historique historique = (Historique)theEObject;
				T result = caseHistorique(historique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACTION_DEPLACER: {
				ActionDeplacer actionDeplacer = (ActionDeplacer)theEObject;
				T result = caseActionDeplacer(actionDeplacer);
				if (result == null) result = caseAction(actionDeplacer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACTION_COLLER: {
				ActionColler actionColler = (ActionColler)theEObject;
				T result = caseActionColler(actionColler);
				if (result == null) result = caseAction(actionColler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACTION_SUPPRIMER: {
				ActionSupprimer actionSupprimer = (ActionSupprimer)theEObject;
				T result = caseActionSupprimer(actionSupprimer);
				if (result == null) result = caseAction(actionSupprimer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACTION_INSERER: {
				ActionInserer actionInserer = (ActionInserer)theEObject;
				T result = caseActionInserer(actionInserer);
				if (result == null) result = caseAction(actionInserer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRESSE_PAPIER: {
				PressePapier pressePapier = (PressePapier)theEObject;
				T result = casePressePapier(pressePapier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EDITEUR: {
				Editeur editeur = (Editeur)theEObject;
				T result = caseEditeur(editeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SUJET: {
				Sujet sujet = (Sujet)theEObject;
				T result = caseSujet(sujet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OBSERVATEUR: {
				Observateur observateur = (Observateur)theEObject;
				T result = caseObservateur(observateur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CARETAKER: {
				Caretaker caretaker = (Caretaker)theEObject;
				T result = caseCaretaker(caretaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MEMENTO: {
				Memento memento = (Memento)theEObject;
				T result = caseMemento(memento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Feuille</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Feuille</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionFeuille(SectionFeuille object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Branche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Branche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionBranche(SectionBranche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contenu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contenu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContenu(Contenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategie Insertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategie Insertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategieInsertion(StrategieInsertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategie Insertion Texte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategie Insertion Texte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategieInsertionTexte(StrategieInsertionTexte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caractere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caractere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaractere(Caractere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistorique(Historique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Deplacer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Deplacer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDeplacer(ActionDeplacer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Coller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Coller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionColler(ActionColler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Supprimer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Supprimer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionSupprimer(ActionSupprimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Inserer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Inserer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionInserer(ActionInserer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presse Papier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presse Papier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressePapier(PressePapier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditeur(Editeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sujet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sujet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSujet(Sujet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observateur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observateur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservateur(Observateur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caretaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caretaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaretaker(Caretaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemento(Memento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch

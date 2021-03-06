/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Section Feuille</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section Feuille</em>'.
	 * @generated
	 */
	SectionFeuille createSectionFeuille();

	/**
	 * Returns a new object of class '<em>Section Branche</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section Branche</em>'.
	 * @generated
	 */
	SectionBranche createSectionBranche();

	/**
	 * Returns a new object of class '<em>Contenu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contenu</em>'.
	 * @generated
	 */
	Contenu createContenu();

	/**
	 * Returns a new object of class '<em>Strategie Insertion Texte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategie Insertion Texte</em>'.
	 * @generated
	 */
	StrategieInsertionTexte createStrategieInsertionTexte();

	/**
	 * Returns a new object of class '<em>Caractere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caractere</em>'.
	 * @generated
	 */
	Caractere createCaractere();

	/**
	 * Returns a new object of class '<em>Historique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historique</em>'.
	 * @generated
	 */
	Historique createHistorique();

	/**
	 * Returns a new object of class '<em>Action Deplacer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Deplacer</em>'.
	 * @generated
	 */
	ActionDeplacer createActionDeplacer();

	/**
	 * Returns a new object of class '<em>Action Coller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Coller</em>'.
	 * @generated
	 */
	ActionColler createActionColler();

	/**
	 * Returns a new object of class '<em>Action Supprimer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Supprimer</em>'.
	 * @generated
	 */
	ActionSupprimer createActionSupprimer();

	/**
	 * Returns a new object of class '<em>Action Inserer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Inserer</em>'.
	 * @generated
	 */
	ActionInserer createActionInserer();

	/**
	 * Returns a new object of class '<em>Presse Papier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presse Papier</em>'.
	 * @generated
	 */
	PressePapier createPressePapier();

	/**
	 * Returns a new object of class '<em>Editeur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editeur</em>'.
	 * @generated
	 */
	Editeur createEditeur();

	/**
	 * Returns a new object of class '<em>Caretaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caretaker</em>'.
	 * @generated
	 */
	Caretaker createCaretaker();

	/**
	 * Returns a new object of class '<em>Memento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memento</em>'.
	 * @generated
	 */
	Memento createMemento();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory

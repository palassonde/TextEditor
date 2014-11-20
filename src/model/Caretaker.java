/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caretaker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Caretaker#getMemento <em>Memento</em>}</li>
 *   <li>{@link model.Caretaker#getMementoDefaits <em>Memento Defaits</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getCaretaker()
 * @model
 * @generated
 */
public interface Caretaker extends EObject {
	/**
	 * Returns the value of the '<em><b>Memento</b></em>' reference list.
	 * The list contents are of type {@link model.Memento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memento</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memento</em>' reference list.
	 * @see model.ModelPackage#getCaretaker_Memento()
	 * @model upper="5"
	 * @generated
	 */
	EList<Memento> getMemento();

	/**
	 * Returns the value of the '<em><b>Memento Defaits</b></em>' reference list.
	 * The list contents are of type {@link model.Memento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memento Defaits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memento Defaits</em>' reference list.
	 * @see model.ModelPackage#getCaretaker_MementoDefaits()
	 * @model upper="5"
	 * @generated
	 */
	EList<Memento> getMementoDefaits();

} // Caretaker

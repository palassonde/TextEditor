/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presse Papier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.PressePapier#getContenu <em>Contenu</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getPressePapier()
 * @model
 * @generated
 */
public interface PressePapier extends EObject {
	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' containment reference.
	 * @see #setContenu(Contenu)
	 * @see model.ModelPackage#getPressePapier_Contenu()
	 * @model containment="true"
	 * @generated
	 */
	Contenu getContenu();

	/**
	 * Sets the value of the '{@link model.PressePapier#getContenu <em>Contenu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' containment reference.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(Contenu value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ajouter(Contenu contenu);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void vider();

} // PressePapier

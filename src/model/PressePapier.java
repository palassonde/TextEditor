/**
 */
package model;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Contenu</b></em>' containment reference list.
	 * The list contents are of type {@link model.Contenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' containment reference list.
	 * @see model.ModelPackage#getPressePapier_Contenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contenu> getContenu();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ajouterContenu();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void vider();

} // PressePapier

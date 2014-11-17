/**
 */
package model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Action#getContenu <em>Contenu</em>}</li>
 *   <li>{@link model.Action#getTypeAction <em>Type Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' reference list.
	 * The list contents are of type {@link model.Contenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' reference list.
	 * @see model.ModelPackage#getAction_Contenu()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Contenu> getContenu();

	/**
	 * Returns the value of the '<em><b>Type Action</b></em>' attribute.
	 * The literals are from the enumeration {@link model.TypeAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Action</em>' attribute.
	 * @see model.TypeAction
	 * @see #setTypeAction(TypeAction)
	 * @see model.ModelPackage#getAction_TypeAction()
	 * @model required="true"
	 * @generated
	 */
	TypeAction getTypeAction();

	/**
	 * Sets the value of the '{@link model.Action#getTypeAction <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Action</em>' attribute.
	 * @see model.TypeAction
	 * @see #getTypeAction()
	 * @generated
	 */
	void setTypeAction(TypeAction value);

} // Action

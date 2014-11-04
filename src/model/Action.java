/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Action#getJ <em>J</em>}</li>
 *   <li>{@link model.Action#getIiy <em>Iiy</em>}</li>
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
	 * Returns the value of the '<em><b>J</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>J</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>J</em>' reference.
	 * @see #setJ(Historique)
	 * @see model.ModelPackage#getAction_J()
	 * @model
	 * @generated
	 */
	Historique getJ();

	/**
	 * Sets the value of the '{@link model.Action#getJ <em>J</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>J</em>' reference.
	 * @see #getJ()
	 * @generated
	 */
	void setJ(Historique value);

	/**
	 * Returns the value of the '<em><b>Iiy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iiy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iiy</em>' reference.
	 * @see #setIiy(StrategieInsertion)
	 * @see model.ModelPackage#getAction_Iiy()
	 * @model
	 * @generated
	 */
	StrategieInsertion getIiy();

	/**
	 * Sets the value of the '{@link model.Action#getIiy <em>Iiy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iiy</em>' reference.
	 * @see #getIiy()
	 * @generated
	 */
	void setIiy(StrategieInsertion value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' containment reference.
	 * @see #setContenu(Contenu)
	 * @see model.ModelPackage#getAction_Contenu()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Contenu getContenu();

	/**
	 * Sets the value of the '{@link model.Action#getContenu <em>Contenu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' containment reference.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(Contenu value);

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
	 * @model
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

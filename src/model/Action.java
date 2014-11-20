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
 *   <li>{@link model.Action#getReceveur <em>Receveur</em>}</li>
 *   <li>{@link model.Action#getContenuPP <em>Contenu PP</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAction()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Receveur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receveur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receveur</em>' reference.
	 * @see #setReceveur(Contenu)
	 * @see model.ModelPackage#getAction_Receveur()
	 * @model required="true"
	 * @generated
	 */
	Contenu getReceveur();

	/**
	 * Sets the value of the '{@link model.Action#getReceveur <em>Receveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receveur</em>' reference.
	 * @see #getReceveur()
	 * @generated
	 */
	void setReceveur(Contenu value);

	/**
	 * Returns the value of the '<em><b>Contenu PP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu PP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu PP</em>' reference.
	 * @see #setContenuPP(Contenu)
	 * @see model.ModelPackage#getAction_ContenuPP()
	 * @model required="true"
	 * @generated
	 */
	Contenu getContenuPP();

	/**
	 * Sets the value of the '{@link model.Action#getContenuPP <em>Contenu PP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu PP</em>' reference.
	 * @see #getContenuPP()
	 * @generated
	 */
	void setContenuPP(Contenu value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void faire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void defaire();

} // Action

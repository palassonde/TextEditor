/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sujet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Sujet#getObservateur <em>Observateur</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getSujet()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Sujet extends EObject {
	/**
	 * Returns the value of the '<em><b>Observateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observateur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observateur</em>' reference.
	 * @see #setObservateur(Observateur)
	 * @see model.ModelPackage#getSujet_Observateur()
	 * @model
	 * @generated
	 */
	Observateur getObservateur();

	/**
	 * Sets the value of the '{@link model.Sujet#getObservateur <em>Observateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observateur</em>' reference.
	 * @see #getObservateur()
	 * @generated
	 */
	void setObservateur(Observateur value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void attacher(Observateur observateur);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void detacher(Observateur observateur);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void informer();

} // Sujet

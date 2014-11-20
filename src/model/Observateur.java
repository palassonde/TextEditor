/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observateur</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getObservateur()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Observateur extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setDeplacer(boolean etat);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setColler(boolean etat);

} // Observateur

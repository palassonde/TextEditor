/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Historique#getActions <em>Actions</em>}</li>
 *   <li>{@link model.Historique#getActionsDefaites <em>Actions Defaites</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getHistorique()
 * @model
 * @generated
 */
public interface Historique extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link model.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see model.ModelPackage#getHistorique_Actions()
	 * @model containment="true" upper="5"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Actions Defaites</b></em>' containment reference list.
	 * The list contents are of type {@link model.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Defaites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Defaites</em>' containment reference list.
	 * @see model.ModelPackage#getHistorique_ActionsDefaites()
	 * @model containment="true" upper="5"
	 * @generated
	 */
	EList<Action> getActionsDefaites();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void vider();

} // Historique

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
 *   <li>{@link model.Historique#getActionsDefaites <em>Actions Defaites</em>}</li>
 *   <li>{@link model.Historique#getActionsRefaites <em>Actions Refaites</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getHistorique()
 * @model
 * @generated
 */
public interface Historique extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions Defaites</b></em>' reference list.
	 * The list contents are of type {@link model.Action}.
	 * It is bidirectional and its opposite is '{@link model.Action#getHistorique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Defaites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Defaites</em>' reference list.
	 * @see model.ModelPackage#getHistorique_ActionsDefaites()
	 * @see model.Action#getHistorique
	 * @model opposite="historique"
	 * @generated
	 */
	EList<Action> getActionsDefaites();

	/**
	 * Returns the value of the '<em><b>Actions Refaites</b></em>' reference list.
	 * The list contents are of type {@link model.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions Refaites</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Refaites</em>' reference list.
	 * @see model.ModelPackage#getHistorique_ActionsRefaites()
	 * @model
	 * @generated
	 */
	EList<Action> getActionsRefaites();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getActionRefaite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getActionDefaite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void vider();

} // Historique

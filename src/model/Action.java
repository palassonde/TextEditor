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
 *   <li>{@link model.Action#getHistorique <em>Historique</em>}</li>
 *   <li>{@link model.Action#getStrategieInsertion <em>Strategie Insertion</em>}</li>
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
	 * Returns the value of the '<em><b>Historique</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.Historique#getActionsDefaites <em>Actions Defaites</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historique</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historique</em>' reference.
	 * @see #setHistorique(Historique)
	 * @see model.ModelPackage#getAction_Historique()
	 * @see model.Historique#getActionsDefaites
	 * @model opposite="actionsDefaites"
	 * @generated
	 */
	Historique getHistorique();

	/**
	 * Sets the value of the '{@link model.Action#getHistorique <em>Historique</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Historique</em>' reference.
	 * @see #getHistorique()
	 * @generated
	 */
	void setHistorique(Historique value);

	/**
	 * Returns the value of the '<em><b>Strategie Insertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategie Insertion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategie Insertion</em>' reference.
	 * @see #setStrategieInsertion(StrategieInsertion)
	 * @see model.ModelPackage#getAction_StrategieInsertion()
	 * @model
	 * @generated
	 */
	StrategieInsertion getStrategieInsertion();

	/**
	 * Sets the value of the '{@link model.Action#getStrategieInsertion <em>Strategie Insertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategie Insertion</em>' reference.
	 * @see #getStrategieInsertion()
	 * @generated
	 */
	void setStrategieInsertion(StrategieInsertion value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' reference.
	 * @see #setContenu(Contenu)
	 * @see model.ModelPackage#getAction_Contenu()
	 * @model required="true"
	 * @generated
	 */
	Contenu getContenu();

	/**
	 * Sets the value of the '{@link model.Action#getContenu <em>Contenu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' reference.
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

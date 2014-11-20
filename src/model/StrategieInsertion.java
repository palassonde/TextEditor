/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategie Insertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.StrategieInsertion#getContenu <em>Contenu</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getStrategieInsertion()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StrategieInsertion extends EObject {
	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.Contenu#getStrategie <em>Strategie</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' container reference.
	 * @see #setContenu(Contenu)
	 * @see model.ModelPackage#getStrategieInsertion_Contenu()
	 * @see model.Contenu#getStrategie
	 * @model opposite="strategie" required="true" transient="false"
	 * @generated
	 */
	Contenu getContenu();

	/**
	 * Sets the value of the '{@link model.StrategieInsertion#getContenu <em>Contenu</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' container reference.
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
	void inserer(Element element, int position, Contenu contenuPP);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void inserer(Element element, int position);

} // StrategieInsertion

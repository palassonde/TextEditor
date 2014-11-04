/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Branche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.SectionBranche#getEnfant <em>Enfant</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getSectionBranche()
 * @model
 * @generated
 */
public interface SectionBranche extends Section {
	/**
	 * Returns the value of the '<em><b>Enfant</b></em>' reference list.
	 * The list contents are of type {@link model.Section}.
	 * It is bidirectional and its opposite is '{@link model.Section#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enfant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enfant</em>' reference list.
	 * @see model.ModelPackage#getSectionBranche_Enfant()
	 * @see model.Section#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Section> getEnfant();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void renommer(String titre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ajouterSousSection(String titre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void supprimer();

} // SectionBranche

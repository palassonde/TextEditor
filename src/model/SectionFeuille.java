/**
 */
package model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Feuille</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getSectionFeuille()
 * @model
 * @generated
 */
public interface SectionFeuille extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void supprimer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false" listeMany="false"
	 */
	EList<Section> getSections(EList<Section> liste);

} // SectionFeuille

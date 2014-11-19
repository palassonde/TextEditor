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
 *   <li>{@link model.SectionBranche#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getSectionBranche()
 * @model
 * @generated
 */
public interface SectionBranche extends Section {
	/**
	 * Returns the value of the '<em><b>Enfant</b></em>' containment reference list.
	 * The list contents are of type {@link model.Section}.
	 * It is bidirectional and its opposite is '{@link model.Section#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enfant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enfant</em>' containment reference list.
	 * @see model.ModelPackage#getSectionBranche_Enfant()
	 * @see model.Section#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Section> getEnfant();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.Document#getSectionRacine <em>Section Racine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' container reference.
	 * @see #setDocument(Document)
	 * @see model.ModelPackage#getSectionBranche_Document()
	 * @see model.Document#getSectionRacine
	 * @model opposite="sectionRacine" required="true" transient="false"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link model.SectionBranche#getDocument <em>Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 */
	Section ajouterSousSection(String titre);

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

} // SectionBranche

/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contenu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Contenu#getStrategie <em>Strategie</em>}</li>
 *   <li>{@link model.Contenu#getElements <em>Elements</em>}</li>
 *   <li>{@link model.Contenu#getPosition <em>Position</em>}</li>
 *   <li>{@link model.Contenu#getSection <em>Section</em>}</li>
 *   <li>{@link model.Contenu#getSectionSrc <em>Section Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getContenu()
 * @model
 * @generated
 */
public interface Contenu extends Sujet {
	/**
	 * Returns the value of the '<em><b>Strategie</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link model.StrategieInsertion#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategie</em>' containment reference.
	 * @see #setStrategie(StrategieInsertion)
	 * @see model.ModelPackage#getContenu_Strategie()
	 * @see model.StrategieInsertion#getContenu
	 * @model opposite="contenu" containment="true" required="true"
	 * @generated
	 */
	StrategieInsertion getStrategie();

	/**
	 * Sets the value of the '{@link model.Contenu#getStrategie <em>Strategie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategie</em>' containment reference.
	 * @see #getStrategie()
	 * @generated
	 */
	void setStrategie(StrategieInsertion value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link model.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see model.ModelPackage#getContenu_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see model.ModelPackage#getContenu_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link model.Contenu#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.Section#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' container reference.
	 * @see #setSection(Section)
	 * @see model.ModelPackage#getContenu_Section()
	 * @see model.Section#getContenu
	 * @model opposite="contenu" required="true" transient="false"
	 * @generated
	 */
	Section getSection();

	/**
	 * Sets the value of the '{@link model.Contenu#getSection <em>Section</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' container reference.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Section value);

	/**
	 * Returns the value of the '<em><b>Section Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Src</em>' reference.
	 * @see #setSectionSrc(Section)
	 * @see model.ModelPackage#getContenu_SectionSrc()
	 * @model
	 * @generated
	 */
	Section getSectionSrc();

	/**
	 * Sets the value of the '{@link model.Contenu#getSectionSrc <em>Section Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Src</em>' reference.
	 * @see #getSectionSrc()
	 * @generated
	 */
	void setSectionSrc(Section value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void supprimer(int positionDebut, int positionFin, Contenu contenuPP);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void coller(Contenu contenu, int position, Contenu contenuPP);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Contenu copier(int positionDebut, int positionFin);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deplacer(Contenu contenu, int position, Contenu contenuPP);

} // Contenu

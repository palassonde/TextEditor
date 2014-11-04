/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Section#getTitre <em>Titre</em>}</li>
 *   <li>{@link model.Section#getDocument <em>Document</em>}</li>
 *   <li>{@link model.Section#getParent <em>Parent</em>}</li>
 *   <li>{@link model.Section#getContenu <em>Contenu</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getSection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Section extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see model.ModelPackage#getSection_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link model.Section#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

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
	 * @see model.ModelPackage#getSection_Document()
	 * @see model.Document#getSectionRacine
	 * @model opposite="sectionRacine" required="true" transient="false"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link model.Section#getDocument <em>Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.SectionBranche#getEnfant <em>Enfant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(SectionBranche)
	 * @see model.ModelPackage#getSection_Parent()
	 * @see model.SectionBranche#getEnfant
	 * @model opposite="enfant" required="true"
	 * @generated
	 */
	SectionBranche getParent();

	/**
	 * Sets the value of the '{@link model.Section#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SectionBranche value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.Contenu#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' reference.
	 * @see #setContenu(Contenu)
	 * @see model.ModelPackage#getSection_Contenu()
	 * @see model.Contenu#getSection
	 * @model opposite="section" required="true"
	 * @generated
	 */
	Contenu getContenu();

	/**
	 * Sets the value of the '{@link model.Section#getContenu <em>Contenu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' reference.
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

} // Section

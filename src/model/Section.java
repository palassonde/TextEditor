/**
 */
package model;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link model.Section#getParent <em>Parent</em>}</li>
 *   <li>{@link model.Section#getContenu <em>Contenu</em>}</li>
 *   <li>{@link model.Section#getNiveau <em>Niveau</em>}</li>
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
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link model.SectionBranche#getEnfant <em>Enfant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(SectionBranche)
	 * @see model.ModelPackage#getSection_Parent()
	 * @see model.SectionBranche#getEnfant
	 * @model opposite="enfant" transient="false"
	 * @generated
	 */
	SectionBranche getParent();

	/**
	 * Sets the value of the '{@link model.Section#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SectionBranche value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link model.Contenu#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' containment reference.
	 * @see #setContenu(Contenu)
	 * @see model.ModelPackage#getSection_Contenu()
	 * @see model.Contenu#getSection
	 * @model opposite="section" containment="true" required="true"
	 * @generated
	 */
	Contenu getContenu();

	/**
	 * Sets the value of the '{@link model.Section#getContenu <em>Contenu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' containment reference.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(Contenu value);

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see #setNiveau(int)
	 * @see model.ModelPackage#getSection_Niveau()
	 * @model default="0"
	 * @generated
	 */
	int getNiveau();

	/**
	 * Sets the value of the '{@link model.Section#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(int value);

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

} // Section

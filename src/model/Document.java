/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Document#getTitre <em>Titre</em>}</li>
 *   <li>{@link model.Document#getSectionRacine <em>Section Racine</em>}</li>
 *   <li>{@link model.Document#getSectionCourante <em>Section Courante</em>}</li>
 *   <li>{@link model.Document#isModifie <em>Modifie</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
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
	 * @see model.ModelPackage#getDocument_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link model.Document#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Section Racine</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link model.SectionBranche#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Racine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Racine</em>' containment reference.
	 * @see #setSectionRacine(SectionBranche)
	 * @see model.ModelPackage#getDocument_SectionRacine()
	 * @see model.SectionBranche#getDocument
	 * @model opposite="document" containment="true" required="true"
	 * @generated
	 */
	SectionBranche getSectionRacine();

	/**
	 * Sets the value of the '{@link model.Document#getSectionRacine <em>Section Racine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Racine</em>' containment reference.
	 * @see #getSectionRacine()
	 * @generated
	 */
	void setSectionRacine(SectionBranche value);

	/**
	 * Returns the value of the '<em><b>Section Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Courante</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Courante</em>' reference.
	 * @see #setSectionCourante(Section)
	 * @see model.ModelPackage#getDocument_SectionCourante()
	 * @model required="true"
	 * @generated
	 */
	Section getSectionCourante();

	/**
	 * Sets the value of the '{@link model.Document#getSectionCourante <em>Section Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Courante</em>' reference.
	 * @see #getSectionCourante()
	 * @generated
	 */
	void setSectionCourante(Section value);

	/**
	 * Returns the value of the '<em><b>Modifie</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifie</em>' attribute.
	 * @see #setModifie(boolean)
	 * @see model.ModelPackage#getDocument_Modifie()
	 * @model default="false"
	 * @generated
	 */
	boolean isModifie();

	/**
	 * Sets the value of the '{@link model.Document#isModifie <em>Modifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifie</em>' attribute.
	 * @see #isModifie()
	 * @generated
	 */
	void setModifie(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refaire(Action action);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void defaire(Action action);

} // Document

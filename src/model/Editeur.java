/**
 */
package model;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Editeur#getDocumentCourant <em>Document Courant</em>}</li>
 *   <li>{@link model.Editeur#getPressePapier <em>Presse Papier</em>}</li>
 *   <li>{@link model.Editeur#getHistorique <em>Historique</em>}</li>
 *   <li>{@link model.Editeur#getSectionCourante <em>Section Courante</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getEditeur()
 * @model
 * @generated
 */
public interface Editeur extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Courant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Courant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Courant</em>' reference.
	 * @see #setDocumentCourant(Document)
	 * @see model.ModelPackage#getEditeur_DocumentCourant()
	 * @model
	 * @generated
	 */
	Document getDocumentCourant();

	/**
	 * Sets the value of the '{@link model.Editeur#getDocumentCourant <em>Document Courant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Courant</em>' reference.
	 * @see #getDocumentCourant()
	 * @generated
	 */
	void setDocumentCourant(Document value);

	/**
	 * Returns the value of the '<em><b>Presse Papier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presse Papier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presse Papier</em>' containment reference.
	 * @see #setPressePapier(PressePapier)
	 * @see model.ModelPackage#getEditeur_PressePapier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PressePapier getPressePapier();

	/**
	 * Sets the value of the '{@link model.Editeur#getPressePapier <em>Presse Papier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presse Papier</em>' containment reference.
	 * @see #getPressePapier()
	 * @generated
	 */
	void setPressePapier(PressePapier value);

	/**
	 * Returns the value of the '<em><b>Historique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historique</em>' containment reference.
	 * @see #setHistorique(Historique)
	 * @see model.ModelPackage#getEditeur_Historique()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Historique getHistorique();

	/**
	 * Sets the value of the '{@link model.Editeur#getHistorique <em>Historique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Historique</em>' containment reference.
	 * @see #getHistorique()
	 * @generated
	 */
	void setHistorique(Historique value);

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
	 * @see model.ModelPackage#getEditeur_SectionCourante()
	 * @model required="true"
	 * @generated
	 */
	Section getSectionCourante();

	/**
	 * Sets the value of the '{@link model.Editeur#getSectionCourante <em>Section Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Courante</em>' reference.
	 * @see #getSectionCourante()
	 * @generated
	 */
	void setSectionCourante(Section value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sauvegarder(String nomFichier) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ouvrir(String nomFichier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void creerNouvDocument();

} // Editeur

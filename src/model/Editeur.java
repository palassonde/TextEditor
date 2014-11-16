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

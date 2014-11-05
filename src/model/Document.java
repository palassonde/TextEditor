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
 *   <li>{@link model.Document#getDebutSel <em>Debut Sel</em>}</li>
 *   <li>{@link model.Document#getHistorique <em>Historique</em>}</li>
 *   <li>{@link model.Document#getFinSel <em>Fin Sel</em>}</li>
 *   <li>{@link model.Document#getPositionCurseur <em>Position Curseur</em>}</li>
 *   <li>{@link model.Document#getTitre <em>Titre</em>}</li>
 *   <li>{@link model.Document#getSectionRacine <em>Section Racine</em>}</li>
 *   <li>{@link model.Document#getPressePapier <em>Presse Papier</em>}</li>
 *   <li>{@link model.Document#getSectionCourante <em>Section Courante</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Debut Sel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Sel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Sel</em>' attribute.
	 * @see #setDebutSel(int)
	 * @see model.ModelPackage#getDocument_DebutSel()
	 * @model
	 * @generated
	 */
	int getDebutSel();

	/**
	 * Sets the value of the '{@link model.Document#getDebutSel <em>Debut Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Sel</em>' attribute.
	 * @see #getDebutSel()
	 * @generated
	 */
	void setDebutSel(int value);

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
	 * @see model.ModelPackage#getDocument_Historique()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Historique getHistorique();

	/**
	 * Sets the value of the '{@link model.Document#getHistorique <em>Historique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Historique</em>' containment reference.
	 * @see #getHistorique()
	 * @generated
	 */
	void setHistorique(Historique value);

	/**
	 * Returns the value of the '<em><b>Fin Sel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Sel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Sel</em>' attribute.
	 * @see #setFinSel(int)
	 * @see model.ModelPackage#getDocument_FinSel()
	 * @model
	 * @generated
	 */
	int getFinSel();

	/**
	 * Sets the value of the '{@link model.Document#getFinSel <em>Fin Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Sel</em>' attribute.
	 * @see #getFinSel()
	 * @generated
	 */
	void setFinSel(int value);

	/**
	 * Returns the value of the '<em><b>Position Curseur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Curseur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Curseur</em>' attribute.
	 * @see #setPositionCurseur(int)
	 * @see model.ModelPackage#getDocument_PositionCurseur()
	 * @model
	 * @generated
	 */
	int getPositionCurseur();

	/**
	 * Sets the value of the '{@link model.Document#getPositionCurseur <em>Position Curseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Curseur</em>' attribute.
	 * @see #getPositionCurseur()
	 * @generated
	 */
	void setPositionCurseur(int value);

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Racine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Racine</em>' containment reference.
	 * @see #setSectionRacine(Section)
	 * @see model.ModelPackage#getDocument_SectionRacine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Section getSectionRacine();

	/**
	 * Sets the value of the '{@link model.Document#getSectionRacine <em>Section Racine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Racine</em>' containment reference.
	 * @see #getSectionRacine()
	 * @generated
	 */
	void setSectionRacine(Section value);

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
	 * @see model.ModelPackage#getDocument_PressePapier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PressePapier getPressePapier();

	/**
	 * Sets the value of the '{@link model.Document#getPressePapier <em>Presse Papier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presse Papier</em>' containment reference.
	 * @see #getPressePapier()
	 * @generated
	 */
	void setPressePapier(PressePapier value);

	/**
	 * Returns the value of the '<em><b>Section Courante</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.Section#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Courante</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Courante</em>' reference.
	 * @see #setSectionCourante(Section)
	 * @see model.ModelPackage#getDocument_SectionCourante()
	 * @see model.Section#getDocument
	 * @model opposite="document" required="true"
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

} // Document

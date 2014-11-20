/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Memento#isEtatDeplacer <em>Etat Deplacer</em>}</li>
 *   <li>{@link model.Memento#getPositionCurseur <em>Position Curseur</em>}</li>
 *   <li>{@link model.Memento#isEtatCopier <em>Etat Copier</em>}</li>
 *   <li>{@link model.Memento#isEtatColler <em>Etat Coller</em>}</li>
 *   <li>{@link model.Memento#isEtatDefaire <em>Etat Defaire</em>}</li>
 *   <li>{@link model.Memento#isEtatRefaire <em>Etat Refaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getMemento()
 * @model
 * @generated
 */
public interface Memento extends EObject {
	/**
	 * Returns the value of the '<em><b>Etat Deplacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Deplacer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Deplacer</em>' attribute.
	 * @see #setEtatDeplacer(boolean)
	 * @see model.ModelPackage#getMemento_EtatDeplacer()
	 * @model
	 * @generated
	 */
	boolean isEtatDeplacer();

	/**
	 * Sets the value of the '{@link model.Memento#isEtatDeplacer <em>Etat Deplacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Deplacer</em>' attribute.
	 * @see #isEtatDeplacer()
	 * @generated
	 */
	void setEtatDeplacer(boolean value);

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
	 * @see model.ModelPackage#getMemento_PositionCurseur()
	 * @model
	 * @generated
	 */
	int getPositionCurseur();

	/**
	 * Sets the value of the '{@link model.Memento#getPositionCurseur <em>Position Curseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Curseur</em>' attribute.
	 * @see #getPositionCurseur()
	 * @generated
	 */
	void setPositionCurseur(int value);

	/**
	 * Returns the value of the '<em><b>Etat Copier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Copier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Copier</em>' attribute.
	 * @see #setEtatCopier(boolean)
	 * @see model.ModelPackage#getMemento_EtatCopier()
	 * @model
	 * @generated
	 */
	boolean isEtatCopier();

	/**
	 * Sets the value of the '{@link model.Memento#isEtatCopier <em>Etat Copier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Copier</em>' attribute.
	 * @see #isEtatCopier()
	 * @generated
	 */
	void setEtatCopier(boolean value);

	/**
	 * Returns the value of the '<em><b>Etat Coller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Coller</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Coller</em>' attribute.
	 * @see #setEtatColler(boolean)
	 * @see model.ModelPackage#getMemento_EtatColler()
	 * @model
	 * @generated
	 */
	boolean isEtatColler();

	/**
	 * Sets the value of the '{@link model.Memento#isEtatColler <em>Etat Coller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Coller</em>' attribute.
	 * @see #isEtatColler()
	 * @generated
	 */
	void setEtatColler(boolean value);

	/**
	 * Returns the value of the '<em><b>Etat Defaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Defaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Defaire</em>' attribute.
	 * @see #setEtatDefaire(boolean)
	 * @see model.ModelPackage#getMemento_EtatDefaire()
	 * @model
	 * @generated
	 */
	boolean isEtatDefaire();

	/**
	 * Sets the value of the '{@link model.Memento#isEtatDefaire <em>Etat Defaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Defaire</em>' attribute.
	 * @see #isEtatDefaire()
	 * @generated
	 */
	void setEtatDefaire(boolean value);

	/**
	 * Returns the value of the '<em><b>Etat Refaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Refaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Refaire</em>' attribute.
	 * @see #setEtatRefaire(boolean)
	 * @see model.ModelPackage#getMemento_EtatRefaire()
	 * @model
	 * @generated
	 */
	boolean isEtatRefaire();

	/**
	 * Sets the value of the '{@link model.Memento#isEtatRefaire <em>Etat Refaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Refaire</em>' attribute.
	 * @see #isEtatRefaire()
	 * @generated
	 */
	void setEtatRefaire(boolean value);

} // Memento

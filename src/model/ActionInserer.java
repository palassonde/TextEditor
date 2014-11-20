/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Inserer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.ActionInserer#getPosition <em>Position</em>}</li>
 *   <li>{@link model.ActionInserer#getCaractere <em>Caractere</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getActionInserer()
 * @model
 * @generated
 */
public interface ActionInserer extends Action {
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
	 * @see model.ModelPackage#getActionInserer_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link model.ActionInserer#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Caractere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caractere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caractere</em>' attribute.
	 * @see #setCaractere(char)
	 * @see model.ModelPackage#getActionInserer_Caractere()
	 * @model
	 * @generated
	 */
	char getCaractere();

	/**
	 * Sets the value of the '{@link model.ActionInserer#getCaractere <em>Caractere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caractere</em>' attribute.
	 * @see #getCaractere()
	 * @generated
	 */
	void setCaractere(char value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void faire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void defaire();

} // ActionInserer

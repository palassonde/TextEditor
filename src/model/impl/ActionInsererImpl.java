/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.ActionInserer;
import model.Caractere;
import model.Contenu;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Inserer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ActionInsererImpl#getReceveur <em>Receveur</em>}</li>
 *   <li>{@link model.impl.ActionInsererImpl#getContenuPP <em>Contenu PP</em>}</li>
 *   <li>{@link model.impl.ActionInsererImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link model.impl.ActionInsererImpl#getCaractere <em>Caractere</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionInsererImpl extends MinimalEObjectImpl.Container implements ActionInserer {
	/**
	 * The cached value of the '{@link #getReceveur() <em>Receveur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceveur()
	 * @generated
	 * @ordered
	 */
	protected Contenu receveur;

	/**
	 * The cached value of the '{@link #getContenuPP() <em>Contenu PP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenuPP()
	 * @generated
	 * @ordered
	 */
	protected Contenu contenuPP;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaractere() <em>Caractere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaractere()
	 * @generated
	 * @ordered
	 */
	protected static final char CARACTERE_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getCaractere() <em>Caractere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaractere()
	 * @generated
	 * @ordered
	 */
	protected char caractere = CARACTERE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ActionInsererImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTION_INSERER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenu getReceveur() {
		if (receveur != null && receveur.eIsProxy()) {
			InternalEObject oldReceveur = (InternalEObject)receveur;
			receveur = (Contenu)eResolveProxy(oldReceveur);
			if (receveur != oldReceveur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION_INSERER__RECEVEUR, oldReceveur, receveur));
			}
		}
		return receveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenu basicGetReceveur() {
		return receveur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceveur(Contenu newReceveur) {
		Contenu oldReceveur = receveur;
		receveur = newReceveur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION_INSERER__RECEVEUR, oldReceveur, receveur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenu getContenuPP() {
		if (contenuPP != null && contenuPP.eIsProxy()) {
			InternalEObject oldContenuPP = (InternalEObject)contenuPP;
			contenuPP = (Contenu)eResolveProxy(oldContenuPP);
			if (contenuPP != oldContenuPP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION_INSERER__CONTENU_PP, oldContenuPP, contenuPP));
			}
		}
		return contenuPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenu basicGetContenuPP() {
		return contenuPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenuPP(Contenu newContenuPP) {
		Contenu oldContenuPP = contenuPP;
		contenuPP = newContenuPP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION_INSERER__CONTENU_PP, oldContenuPP, contenuPP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION_INSERER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getCaractere() {
		return caractere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaractere(char newCaractere) {
		char oldCaractere = caractere;
		caractere = newCaractere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION_INSERER__CARACTERE, oldCaractere, caractere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void faire() {
		Caractere chara = new CaractereImpl(this.caractere);
		this.receveur.getStrategie().inserer(chara, this.position, this.contenuPP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void defaire() {
		this.receveur.supprimer(this.position, this.position + 1, this.contenuPP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ACTION_INSERER__RECEVEUR:
				if (resolve) return getReceveur();
				return basicGetReceveur();
			case ModelPackage.ACTION_INSERER__CONTENU_PP:
				if (resolve) return getContenuPP();
				return basicGetContenuPP();
			case ModelPackage.ACTION_INSERER__POSITION:
				return getPosition();
			case ModelPackage.ACTION_INSERER__CARACTERE:
				return getCaractere();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ACTION_INSERER__RECEVEUR:
				setReceveur((Contenu)newValue);
				return;
			case ModelPackage.ACTION_INSERER__CONTENU_PP:
				setContenuPP((Contenu)newValue);
				return;
			case ModelPackage.ACTION_INSERER__POSITION:
				setPosition((Integer)newValue);
				return;
			case ModelPackage.ACTION_INSERER__CARACTERE:
				setCaractere((Character)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ACTION_INSERER__RECEVEUR:
				setReceveur((Contenu)null);
				return;
			case ModelPackage.ACTION_INSERER__CONTENU_PP:
				setContenuPP((Contenu)null);
				return;
			case ModelPackage.ACTION_INSERER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case ModelPackage.ACTION_INSERER__CARACTERE:
				setCaractere(CARACTERE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ACTION_INSERER__RECEVEUR:
				return receveur != null;
			case ModelPackage.ACTION_INSERER__CONTENU_PP:
				return contenuPP != null;
			case ModelPackage.ACTION_INSERER__POSITION:
				return position != POSITION_EDEFAULT;
			case ModelPackage.ACTION_INSERER__CARACTERE:
				return caractere != CARACTERE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.ACTION_INSERER___FAIRE:
				faire();
				return null;
			case ModelPackage.ACTION_INSERER___DEFAIRE:
				defaire();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (position: ");
		result.append(position);
		result.append(", caractere: ");
		result.append(caractere);
		result.append(')');
		return result.toString();
	}

} //ActionInsererImpl

/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.ActionColler;
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
 * An implementation of the model object '<em><b>Action Coller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ActionCollerImpl#getReceveur <em>Receveur</em>}</li>
 *   <li>{@link model.impl.ActionCollerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link model.impl.ActionCollerImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionCollerImpl extends MinimalEObjectImpl.Container implements ActionColler {
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
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected Contenu contenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ActionCollerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTION_COLLER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION_COLLER__RECEVEUR, oldReceveur, receveur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION_COLLER__RECEVEUR, oldReceveur, receveur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION_COLLER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenu getContenu() {
		if (contenu != null && contenu.eIsProxy()) {
			InternalEObject oldContenu = (InternalEObject)contenu;
			contenu = (Contenu)eResolveProxy(oldContenu);
			if (contenu != oldContenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION_COLLER__CONTENU, oldContenu, contenu));
			}
		}
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenu basicGetContenu() {
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenu(Contenu newContenu) {
		Contenu oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION_COLLER__CONTENU, oldContenu, contenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void faire() {
		this.receveur.coller(this.contenu, this.position);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void defaire() {
		this.receveur.supprimer(this.position, this.position + this.contenu.getElements().size());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ACTION_COLLER__RECEVEUR:
				if (resolve) return getReceveur();
				return basicGetReceveur();
			case ModelPackage.ACTION_COLLER__POSITION:
				return getPosition();
			case ModelPackage.ACTION_COLLER__CONTENU:
				if (resolve) return getContenu();
				return basicGetContenu();
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
			case ModelPackage.ACTION_COLLER__RECEVEUR:
				setReceveur((Contenu)newValue);
				return;
			case ModelPackage.ACTION_COLLER__POSITION:
				setPosition((Integer)newValue);
				return;
			case ModelPackage.ACTION_COLLER__CONTENU:
				setContenu((Contenu)newValue);
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
			case ModelPackage.ACTION_COLLER__RECEVEUR:
				setReceveur((Contenu)null);
				return;
			case ModelPackage.ACTION_COLLER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case ModelPackage.ACTION_COLLER__CONTENU:
				setContenu((Contenu)null);
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
			case ModelPackage.ACTION_COLLER__RECEVEUR:
				return receveur != null;
			case ModelPackage.ACTION_COLLER__POSITION:
				return position != POSITION_EDEFAULT;
			case ModelPackage.ACTION_COLLER__CONTENU:
				return contenu != null;
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
			case ModelPackage.ACTION_COLLER___FAIRE:
				faire();
				return null;
			case ModelPackage.ACTION_COLLER___DEFAIRE:
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
		result.append(')');
		return result.toString();
	}

} //ActionCollerImpl

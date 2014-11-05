/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.Action;
import model.Historique;
import model.ModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.HistoriqueImpl#getActionsDefaites <em>Actions Defaites</em>}</li>
 *   <li>{@link model.impl.HistoriqueImpl#getActionsRefaites <em>Actions Refaites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoriqueImpl extends MinimalEObjectImpl.Container implements Historique {
	/**
	 * The cached value of the '{@link #getActionsDefaites() <em>Actions Defaites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsDefaites()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actionsDefaites;
	/**
	 * The cached value of the '{@link #getActionsRefaites() <em>Actions Refaites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsRefaites()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actionsRefaites;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.HISTORIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActionsDefaites() {
		if (actionsDefaites == null) {
			actionsDefaites = new EObjectContainmentEList<Action>(Action.class, this, ModelPackage.HISTORIQUE__ACTIONS_DEFAITES);
		}
		return actionsDefaites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActionsRefaites() {
		if (actionsRefaites == null) {
			actionsRefaites = new EObjectWithInverseResolvingEList<Action>(Action.class, this, ModelPackage.HISTORIQUE__ACTIONS_REFAITES, ModelPackage.ACTION__HISTORIQUE);
		}
		return actionsRefaites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getActionRefaite() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getActionDefaite() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void vider() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.HISTORIQUE__ACTIONS_REFAITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActionsRefaites()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.HISTORIQUE__ACTIONS_DEFAITES:
				return ((InternalEList<?>)getActionsDefaites()).basicRemove(otherEnd, msgs);
			case ModelPackage.HISTORIQUE__ACTIONS_REFAITES:
				return ((InternalEList<?>)getActionsRefaites()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.HISTORIQUE__ACTIONS_DEFAITES:
				return getActionsDefaites();
			case ModelPackage.HISTORIQUE__ACTIONS_REFAITES:
				return getActionsRefaites();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.HISTORIQUE__ACTIONS_DEFAITES:
				getActionsDefaites().clear();
				getActionsDefaites().addAll((Collection<? extends Action>)newValue);
				return;
			case ModelPackage.HISTORIQUE__ACTIONS_REFAITES:
				getActionsRefaites().clear();
				getActionsRefaites().addAll((Collection<? extends Action>)newValue);
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
			case ModelPackage.HISTORIQUE__ACTIONS_DEFAITES:
				getActionsDefaites().clear();
				return;
			case ModelPackage.HISTORIQUE__ACTIONS_REFAITES:
				getActionsRefaites().clear();
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
			case ModelPackage.HISTORIQUE__ACTIONS_DEFAITES:
				return actionsDefaites != null && !actionsDefaites.isEmpty();
			case ModelPackage.HISTORIQUE__ACTIONS_REFAITES:
				return actionsRefaites != null && !actionsRefaites.isEmpty();
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
			case ModelPackage.HISTORIQUE___GET_ACTION_REFAITE:
				getActionRefaite();
				return null;
			case ModelPackage.HISTORIQUE___GET_ACTION_DEFAITE:
				getActionDefaite();
				return null;
			case ModelPackage.HISTORIQUE___VIDER:
				vider();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //HistoriqueImpl

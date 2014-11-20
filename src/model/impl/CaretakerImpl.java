/**
 */
package model.impl;

import java.util.Collection;

import model.Caretaker;
import model.Memento;
import model.ModelPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Caretaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.CaretakerImpl#getMemento <em>Memento</em>}</li>
 *   <li>{@link model.impl.CaretakerImpl#getMementoDefaits <em>Memento Defaits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaretakerImpl extends MinimalEObjectImpl.Container implements Caretaker {
	/**
	 * The cached value of the '{@link #getMemento() <em>Memento</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemento()
	 * @generated
	 * @ordered
	 */
	protected EList<Memento> memento;

	/**
	 * The cached value of the '{@link #getMementoDefaits() <em>Memento Defaits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMementoDefaits()
	 * @generated
	 * @ordered
	 */
	protected EList<Memento> mementoDefaits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaretakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CARETAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memento> getMemento() {
		if (memento == null) {
			memento = new EObjectResolvingEList<Memento>(Memento.class, this, ModelPackage.CARETAKER__MEMENTO);
		}
		return memento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memento> getMementoDefaits() {
		if (mementoDefaits == null) {
			mementoDefaits = new EObjectResolvingEList<Memento>(Memento.class, this, ModelPackage.CARETAKER__MEMENTO_DEFAITS);
		}
		return mementoDefaits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CARETAKER__MEMENTO:
				return getMemento();
			case ModelPackage.CARETAKER__MEMENTO_DEFAITS:
				return getMementoDefaits();
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
			case ModelPackage.CARETAKER__MEMENTO:
				getMemento().clear();
				getMemento().addAll((Collection<? extends Memento>)newValue);
				return;
			case ModelPackage.CARETAKER__MEMENTO_DEFAITS:
				getMementoDefaits().clear();
				getMementoDefaits().addAll((Collection<? extends Memento>)newValue);
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
			case ModelPackage.CARETAKER__MEMENTO:
				getMemento().clear();
				return;
			case ModelPackage.CARETAKER__MEMENTO_DEFAITS:
				getMementoDefaits().clear();
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
			case ModelPackage.CARETAKER__MEMENTO:
				return memento != null && !memento.isEmpty();
			case ModelPackage.CARETAKER__MEMENTO_DEFAITS:
				return mementoDefaits != null && !mementoDefaits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaretakerImpl

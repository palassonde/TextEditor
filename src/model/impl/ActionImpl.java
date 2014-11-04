/**
 */
package model.impl;

import model.Action;
import model.Contenu;
import model.Historique;
import model.ModelPackage;
import model.StrategieInsertion;
import model.TypeAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ActionImpl#getJ <em>J</em>}</li>
 *   <li>{@link model.impl.ActionImpl#getIiy <em>Iiy</em>}</li>
 *   <li>{@link model.impl.ActionImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link model.impl.ActionImpl#getTypeAction <em>Type Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getJ() <em>J</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJ()
	 * @generated
	 * @ordered
	 */
	protected Historique j;

	/**
	 * The cached value of the '{@link #getIiy() <em>Iiy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIiy()
	 * @generated
	 * @ordered
	 */
	protected StrategieInsertion iiy;

	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected Contenu contenu;

	/**
	 * The default value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAction TYPE_ACTION_EDEFAULT = TypeAction.DEPLACER;

	/**
	 * The cached value of the '{@link #getTypeAction() <em>Type Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAction()
	 * @generated
	 * @ordered
	 */
	protected TypeAction typeAction = TYPE_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historique getJ() {
		if (j != null && j.eIsProxy()) {
			InternalEObject oldJ = (InternalEObject)j;
			j = (Historique)eResolveProxy(oldJ);
			if (j != oldJ) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION__J, oldJ, j));
			}
		}
		return j;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historique basicGetJ() {
		return j;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJ(Historique newJ) {
		Historique oldJ = j;
		j = newJ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION__J, oldJ, j));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategieInsertion getIiy() {
		if (iiy != null && iiy.eIsProxy()) {
			InternalEObject oldIiy = (InternalEObject)iiy;
			iiy = (StrategieInsertion)eResolveProxy(oldIiy);
			if (iiy != oldIiy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION__IIY, oldIiy, iiy));
			}
		}
		return iiy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategieInsertion basicGetIiy() {
		return iiy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIiy(StrategieInsertion newIiy) {
		StrategieInsertion oldIiy = iiy;
		iiy = newIiy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION__IIY, oldIiy, iiy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenu getContenu() {
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenu(Contenu newContenu, NotificationChain msgs) {
		Contenu oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION__CONTENU, oldContenu, newContenu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenu(Contenu newContenu) {
		if (newContenu != contenu) {
			NotificationChain msgs = null;
			if (contenu != null)
				msgs = ((InternalEObject)contenu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ACTION__CONTENU, null, msgs);
			if (newContenu != null)
				msgs = ((InternalEObject)newContenu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ACTION__CONTENU, null, msgs);
			msgs = basicSetContenu(newContenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION__CONTENU, newContenu, newContenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAction getTypeAction() {
		return typeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAction(TypeAction newTypeAction) {
		TypeAction oldTypeAction = typeAction;
		typeAction = newTypeAction == null ? TYPE_ACTION_EDEFAULT : newTypeAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION__TYPE_ACTION, oldTypeAction, typeAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ACTION__CONTENU:
				return basicSetContenu(null, msgs);
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
			case ModelPackage.ACTION__J:
				if (resolve) return getJ();
				return basicGetJ();
			case ModelPackage.ACTION__IIY:
				if (resolve) return getIiy();
				return basicGetIiy();
			case ModelPackage.ACTION__CONTENU:
				return getContenu();
			case ModelPackage.ACTION__TYPE_ACTION:
				return getTypeAction();
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
			case ModelPackage.ACTION__J:
				setJ((Historique)newValue);
				return;
			case ModelPackage.ACTION__IIY:
				setIiy((StrategieInsertion)newValue);
				return;
			case ModelPackage.ACTION__CONTENU:
				setContenu((Contenu)newValue);
				return;
			case ModelPackage.ACTION__TYPE_ACTION:
				setTypeAction((TypeAction)newValue);
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
			case ModelPackage.ACTION__J:
				setJ((Historique)null);
				return;
			case ModelPackage.ACTION__IIY:
				setIiy((StrategieInsertion)null);
				return;
			case ModelPackage.ACTION__CONTENU:
				setContenu((Contenu)null);
				return;
			case ModelPackage.ACTION__TYPE_ACTION:
				setTypeAction(TYPE_ACTION_EDEFAULT);
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
			case ModelPackage.ACTION__J:
				return j != null;
			case ModelPackage.ACTION__IIY:
				return iiy != null;
			case ModelPackage.ACTION__CONTENU:
				return contenu != null;
			case ModelPackage.ACTION__TYPE_ACTION:
				return typeAction != TYPE_ACTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (typeAction: ");
		result.append(typeAction);
		result.append(')');
		return result.toString();
	}

} //ActionImpl

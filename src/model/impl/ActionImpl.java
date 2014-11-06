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
 *   <li>{@link model.impl.ActionImpl#getHistorique <em>Historique</em>}</li>
 *   <li>{@link model.impl.ActionImpl#getStrategieInsertion <em>Strategie Insertion</em>}</li>
 *   <li>{@link model.impl.ActionImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link model.impl.ActionImpl#getTypeAction <em>Type Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getHistorique() <em>Historique</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorique()
	 * @generated
	 * @ordered
	 */
	protected Historique historique;

	/**
	 * The cached value of the '{@link #getStrategieInsertion() <em>Strategie Insertion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategieInsertion()
	 * @generated
	 * @ordered
	 */
	protected StrategieInsertion strategieInsertion;

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
	public Historique getHistorique() {
		if (historique != null && historique.eIsProxy()) {
			InternalEObject oldHistorique = (InternalEObject)historique;
			historique = (Historique)eResolveProxy(oldHistorique);
			if (historique != oldHistorique) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION__HISTORIQUE, oldHistorique, historique));
			}
		}
		return historique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historique basicGetHistorique() {
		return historique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistorique(Historique newHistorique, NotificationChain msgs) {
		Historique oldHistorique = historique;
		historique = newHistorique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION__HISTORIQUE, oldHistorique, newHistorique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistorique(Historique newHistorique) {
		if (newHistorique != historique) {
			NotificationChain msgs = null;
			if (historique != null)
				msgs = ((InternalEObject)historique).eInverseRemove(this, ModelPackage.HISTORIQUE__ACTIONS_DEFAITES, Historique.class, msgs);
			if (newHistorique != null)
				msgs = ((InternalEObject)newHistorique).eInverseAdd(this, ModelPackage.HISTORIQUE__ACTIONS_DEFAITES, Historique.class, msgs);
			msgs = basicSetHistorique(newHistorique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION__HISTORIQUE, newHistorique, newHistorique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategieInsertion getStrategieInsertion() {
		if (strategieInsertion != null && strategieInsertion.eIsProxy()) {
			InternalEObject oldStrategieInsertion = (InternalEObject)strategieInsertion;
			strategieInsertion = (StrategieInsertion)eResolveProxy(oldStrategieInsertion);
			if (strategieInsertion != oldStrategieInsertion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION__STRATEGIE_INSERTION, oldStrategieInsertion, strategieInsertion));
			}
		}
		return strategieInsertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategieInsertion basicGetStrategieInsertion() {
		return strategieInsertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategieInsertion(StrategieInsertion newStrategieInsertion) {
		StrategieInsertion oldStrategieInsertion = strategieInsertion;
		strategieInsertion = newStrategieInsertion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION__STRATEGIE_INSERTION, oldStrategieInsertion, strategieInsertion));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ACTION__CONTENU, oldContenu, contenu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACTION__CONTENU, oldContenu, contenu));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ACTION__HISTORIQUE:
				if (historique != null)
					msgs = ((InternalEObject)historique).eInverseRemove(this, ModelPackage.HISTORIQUE__ACTIONS_DEFAITES, Historique.class, msgs);
				return basicSetHistorique((Historique)otherEnd, msgs);
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
			case ModelPackage.ACTION__HISTORIQUE:
				return basicSetHistorique(null, msgs);
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
			case ModelPackage.ACTION__HISTORIQUE:
				if (resolve) return getHistorique();
				return basicGetHistorique();
			case ModelPackage.ACTION__STRATEGIE_INSERTION:
				if (resolve) return getStrategieInsertion();
				return basicGetStrategieInsertion();
			case ModelPackage.ACTION__CONTENU:
				if (resolve) return getContenu();
				return basicGetContenu();
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
			case ModelPackage.ACTION__HISTORIQUE:
				setHistorique((Historique)newValue);
				return;
			case ModelPackage.ACTION__STRATEGIE_INSERTION:
				setStrategieInsertion((StrategieInsertion)newValue);
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
			case ModelPackage.ACTION__HISTORIQUE:
				setHistorique((Historique)null);
				return;
			case ModelPackage.ACTION__STRATEGIE_INSERTION:
				setStrategieInsertion((StrategieInsertion)null);
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
			case ModelPackage.ACTION__HISTORIQUE:
				return historique != null;
			case ModelPackage.ACTION__STRATEGIE_INSERTION:
				return strategieInsertion != null;
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

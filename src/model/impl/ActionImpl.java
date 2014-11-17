/**
 */
package model.impl;

import java.util.Collection;
import model.Action;
import model.Contenu;
import model.ModelPackage;
import model.TypeAction;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ActionImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link model.impl.ActionImpl#getTypeAction <em>Type Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected EList<Contenu> contenu;

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
	public EList<Contenu> getContenu() {
		if (contenu == null) {
			contenu = new EObjectResolvingEList<Contenu>(Contenu.class, this, ModelPackage.ACTION__CONTENU);
		}
		return contenu;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ACTION__CONTENU:
				getContenu().clear();
				getContenu().addAll((Collection<? extends Contenu>)newValue);
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
			case ModelPackage.ACTION__CONTENU:
				getContenu().clear();
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
			case ModelPackage.ACTION__CONTENU:
				return contenu != null && !contenu.isEmpty();
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

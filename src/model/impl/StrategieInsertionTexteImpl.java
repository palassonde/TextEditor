/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.Contenu;
import model.Element;
import model.ModelPackage;
import model.StrategieInsertionTexte;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategie Insertion Texte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.StrategieInsertionTexteImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategieInsertionTexteImpl extends MinimalEObjectImpl.Container implements StrategieInsertionTexte {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategieInsertionTexteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.STRATEGIE_INSERTION_TEXTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenu getContenu() {
		if (eContainerFeatureID() != ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU) return null;
		return (Contenu)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContenu(Contenu newContenu, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContenu, ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenu(Contenu newContenu) {
		if (newContenu != eInternalContainer() || (eContainerFeatureID() != ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU && newContenu != null)) {
			if (EcoreUtil.isAncestor(this, newContenu))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContenu != null)
				msgs = ((InternalEObject)newContenu).eInverseAdd(this, ModelPackage.CONTENU__STRATEGIE, Contenu.class, msgs);
			msgs = basicSetContenu(newContenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU, newContenu, newContenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void inserer(Element element, int position, Contenu contenuPP) {
		
		this.getContenu().getElements().add(position, element);
		if (contenuPP != null){
			if (this.getContenu().getSection() == contenuPP.getSectionSrc()){
				if (position <= contenuPP.getPosition()){
					contenuPP.setPosition(contenuPP.getPosition() + 1);
				}
				if (position > contenuPP.getPosition() && position < contenuPP.getPosition()+contenuPP.getElements().size()){
					if(this.getContenu().getObservateur() != null)
						this.getContenu().getObservateur().setDeplacer(false);
				}		
			}
			
		}	
		if(this.getContenu().getObservateur() != null)
			this.getContenu().informer();
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContenu((Contenu)otherEnd, msgs);
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
			case ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU:
				return eInternalContainer().eInverseRemove(this, ModelPackage.CONTENU__STRATEGIE, Contenu.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU:
				return getContenu();
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
			case ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU:
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
			case ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU:
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
			case ModelPackage.STRATEGIE_INSERTION_TEXTE__CONTENU:
				return getContenu() != null;
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
			case ModelPackage.STRATEGIE_INSERTION_TEXTE___INSERER__ELEMENT_INT_CONTENU:
				inserer((Element)arguments.get(0), (Integer)arguments.get(1), (Contenu)arguments.get(2));
				return null;
			case ModelPackage.STRATEGIE_INSERTION_TEXTE___INSERER__ELEMENT_INT:
				inserer((Element)arguments.get(0), (Integer)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void inserer(Element element, int position) {
		// TODO Auto-generated method stub
		
	}

} //StrategieInsertionTexteImpl

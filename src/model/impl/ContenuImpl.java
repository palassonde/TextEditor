/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.ListIterator;

import model.Action;
import model.Contenu;
import model.Element;
import model.ModelPackage;
import model.Section;
import model.StrategieInsertion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contenu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ContenuImpl#getStrategie <em>Strategie</em>}</li>
 *   <li>{@link model.impl.ContenuImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link model.impl.ContenuImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link model.impl.ContenuImpl#getSection <em>Section</em>}</li>
 *   <li>{@link model.impl.ContenuImpl#getSectionSrc <em>Section Src</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContenuImpl extends MinimalEObjectImpl.Container implements Contenu {
	/**
	 * The cached value of the '{@link #getStrategie() <em>Strategie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategie()
	 * @generated
	 * @ordered
	 */
	protected StrategieInsertion strategie;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

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
	 * The cached value of the '{@link #getSectionSrc() <em>Section Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionSrc()
	 * @generated
	 * @ordered
	 */
	protected Section sectionSrc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ContenuImpl() {
		super();
		this.strategie = new StrategieInsertionTexteImpl();
		this.strategie.setContenu(this);
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ContenuImpl(Section section) {
		super();
		this.setSection(section);
		this.strategie = new StrategieInsertionTexteImpl();
		this.strategie.setContenu(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONTENU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategieInsertion getStrategie() {
		return strategie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategie(StrategieInsertion newStrategie, NotificationChain msgs) {
		StrategieInsertion oldStrategie = strategie;
		strategie = newStrategie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENU__STRATEGIE, oldStrategie, newStrategie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategie(StrategieInsertion newStrategie) {
		if (newStrategie != strategie) {
			NotificationChain msgs = null;
			if (strategie != null)
				msgs = ((InternalEObject)strategie).eInverseRemove(this, ModelPackage.STRATEGIE_INSERTION__CONTENU, StrategieInsertion.class, msgs);
			if (newStrategie != null)
				msgs = ((InternalEObject)newStrategie).eInverseAdd(this, ModelPackage.STRATEGIE_INSERTION__CONTENU, StrategieInsertion.class, msgs);
			msgs = basicSetStrategie(newStrategie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENU__STRATEGIE, newStrategie, newStrategie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, ModelPackage.CONTENU__ELEMENTS);
		}
		return elements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENU__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getSection() {
		if (eContainerFeatureID() != ModelPackage.CONTENU__SECTION) return null;
		return (Section)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSection(Section newSection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSection, ModelPackage.CONTENU__SECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(Section newSection) {
		if (newSection != eInternalContainer() || (eContainerFeatureID() != ModelPackage.CONTENU__SECTION && newSection != null)) {
			if (EcoreUtil.isAncestor(this, newSection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSection != null)
				msgs = ((InternalEObject)newSection).eInverseAdd(this, ModelPackage.SECTION__CONTENU, Section.class, msgs);
			msgs = basicSetSection(newSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENU__SECTION, newSection, newSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getSectionSrc() {
		if (sectionSrc != null && sectionSrc.eIsProxy()) {
			InternalEObject oldSectionSrc = (InternalEObject)sectionSrc;
			sectionSrc = (Section)eResolveProxy(oldSectionSrc);
			if (sectionSrc != oldSectionSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CONTENU__SECTION_SRC, oldSectionSrc, sectionSrc));
			}
		}
		return sectionSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetSectionSrc() {
		return sectionSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionSrc(Section newSectionSrc) {
		Section oldSectionSrc = sectionSrc;
		sectionSrc = newSectionSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTENU__SECTION_SRC, oldSectionSrc, sectionSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void deplacer(Contenu contenu, int position) {
		this.supprimer(contenu.getPosition(), contenu.getPosition()+contenu.getElements().size());
		this.coller(contenu, position);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void supprimer(int positionDebut, int positionFin) {
		for(int i=positionFin-1; i >= positionDebut; i--)
			this.elements.remove(i);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void coller(Contenu contenu, int position) {
		ListIterator<Element> iter = contenu.getElements().listIterator();
		while(iter.hasNext()){
			Element c = new CaractereImpl(iter.next());
			this.strategie.inserer(c, position);
			position++;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Contenu copier(int positionDebut, int positionFin) {
		Contenu contenu = new ContenuImpl();
		int i = positionDebut;
		int j = 0;
		ListIterator<Element> iter = this.getElements().listIterator(positionDebut);
		while(i != positionFin){
			Element c = new CaractereImpl(iter.next());
			contenu.getStrategie().inserer(c, j);
			i++;
			j++;
		}
		contenu.setPosition(positionDebut);
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void defaire(Action action) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refaire(Action action) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CONTENU__STRATEGIE:
				if (strategie != null)
					msgs = ((InternalEObject)strategie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.CONTENU__STRATEGIE, null, msgs);
				return basicSetStrategie((StrategieInsertion)otherEnd, msgs);
			case ModelPackage.CONTENU__SECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSection((Section)otherEnd, msgs);
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
			case ModelPackage.CONTENU__STRATEGIE:
				return basicSetStrategie(null, msgs);
			case ModelPackage.CONTENU__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ModelPackage.CONTENU__SECTION:
				return basicSetSection(null, msgs);
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
			case ModelPackage.CONTENU__SECTION:
				return eInternalContainer().eInverseRemove(this, ModelPackage.SECTION__CONTENU, Section.class, msgs);
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
			case ModelPackage.CONTENU__STRATEGIE:
				return getStrategie();
			case ModelPackage.CONTENU__ELEMENTS:
				return getElements();
			case ModelPackage.CONTENU__POSITION:
				return getPosition();
			case ModelPackage.CONTENU__SECTION:
				return getSection();
			case ModelPackage.CONTENU__SECTION_SRC:
				if (resolve) return getSectionSrc();
				return basicGetSectionSrc();
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
			case ModelPackage.CONTENU__STRATEGIE:
				setStrategie((StrategieInsertion)newValue);
				return;
			case ModelPackage.CONTENU__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case ModelPackage.CONTENU__POSITION:
				setPosition((Integer)newValue);
				return;
			case ModelPackage.CONTENU__SECTION:
				setSection((Section)newValue);
				return;
			case ModelPackage.CONTENU__SECTION_SRC:
				setSectionSrc((Section)newValue);
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
			case ModelPackage.CONTENU__STRATEGIE:
				setStrategie((StrategieInsertion)null);
				return;
			case ModelPackage.CONTENU__ELEMENTS:
				getElements().clear();
				return;
			case ModelPackage.CONTENU__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case ModelPackage.CONTENU__SECTION:
				setSection((Section)null);
				return;
			case ModelPackage.CONTENU__SECTION_SRC:
				setSectionSrc((Section)null);
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
			case ModelPackage.CONTENU__STRATEGIE:
				return strategie != null;
			case ModelPackage.CONTENU__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ModelPackage.CONTENU__POSITION:
				return position != POSITION_EDEFAULT;
			case ModelPackage.CONTENU__SECTION:
				return getSection() != null;
			case ModelPackage.CONTENU__SECTION_SRC:
				return sectionSrc != null;
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
			case ModelPackage.CONTENU___SUPPRIMER__INT_INT:
				supprimer((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ModelPackage.CONTENU___COLLER__CONTENU_INT:
				coller((Contenu)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ModelPackage.CONTENU___COPIER__INT_INT:
				return copier((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ModelPackage.CONTENU___DEFAIRE__ACTION:
				defaire((Action)arguments.get(0));
				return null;
			case ModelPackage.CONTENU___REFAIRE__ACTION:
				refaire((Action)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		
		StringBuffer result = new StringBuffer();
		if(elements == null)
			result.append("");
		else {
			for(int i=0; i<elements.size(); i++){
				result.append(elements.get(i).toString());
			}
			if (elements.size() == 0)
				result.append("");
		}
		
		return result.toString();
	}

} //ContenuImpl

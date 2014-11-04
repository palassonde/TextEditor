/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.Contenu;
import model.Document;
import model.ModelPackage;
import model.SectionBranche;
import model.SectionFeuille;

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
 * An implementation of the model object '<em><b>Section Feuille</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.SectionFeuilleImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link model.impl.SectionFeuilleImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link model.impl.SectionFeuilleImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link model.impl.SectionFeuilleImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionFeuilleImpl extends MinimalEObjectImpl.Container implements SectionFeuille {
	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected SectionBranche parent;

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
	 * @generated
	 */
	protected SectionFeuilleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SECTION_FEUILLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_FEUILLE__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocument() {
		if (eContainerFeatureID() != ModelPackage.SECTION_FEUILLE__DOCUMENT) return null;
		return (Document)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Document newDocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocument, ModelPackage.SECTION_FEUILLE__DOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Document newDocument) {
		if (newDocument != eInternalContainer() || (eContainerFeatureID() != ModelPackage.SECTION_FEUILLE__DOCUMENT && newDocument != null)) {
			if (EcoreUtil.isAncestor(this, newDocument))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, ModelPackage.DOCUMENT__SECTION_RACINE, Document.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_FEUILLE__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionBranche getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (SectionBranche)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SECTION_FEUILLE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionBranche basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(SectionBranche newParent, NotificationChain msgs) {
		SectionBranche oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_FEUILLE__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SectionBranche newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, ModelPackage.SECTION_BRANCHE__ENFANT, SectionBranche.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModelPackage.SECTION_BRANCHE__ENFANT, SectionBranche.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_FEUILLE__PARENT, newParent, newParent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SECTION_FEUILLE__CONTENU, oldContenu, contenu));
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
	public NotificationChain basicSetContenu(Contenu newContenu, NotificationChain msgs) {
		Contenu oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_FEUILLE__CONTENU, oldContenu, newContenu);
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
				msgs = ((InternalEObject)contenu).eInverseRemove(this, ModelPackage.CONTENU__SECTION, Contenu.class, msgs);
			if (newContenu != null)
				msgs = ((InternalEObject)newContenu).eInverseAdd(this, ModelPackage.CONTENU__SECTION, Contenu.class, msgs);
			msgs = basicSetContenu(newContenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_FEUILLE__CONTENU, newContenu, newContenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void renommer(String titre) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void supprimer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ajouterSousSection(String titre) {
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
			case ModelPackage.SECTION_FEUILLE__DOCUMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocument((Document)otherEnd, msgs);
			case ModelPackage.SECTION_FEUILLE__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, ModelPackage.SECTION_BRANCHE__ENFANT, SectionBranche.class, msgs);
				return basicSetParent((SectionBranche)otherEnd, msgs);
			case ModelPackage.SECTION_FEUILLE__CONTENU:
				if (contenu != null)
					msgs = ((InternalEObject)contenu).eInverseRemove(this, ModelPackage.CONTENU__SECTION, Contenu.class, msgs);
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
			case ModelPackage.SECTION_FEUILLE__DOCUMENT:
				return basicSetDocument(null, msgs);
			case ModelPackage.SECTION_FEUILLE__PARENT:
				return basicSetParent(null, msgs);
			case ModelPackage.SECTION_FEUILLE__CONTENU:
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
			case ModelPackage.SECTION_FEUILLE__DOCUMENT:
				return eInternalContainer().eInverseRemove(this, ModelPackage.DOCUMENT__SECTION_RACINE, Document.class, msgs);
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
			case ModelPackage.SECTION_FEUILLE__TITRE:
				return getTitre();
			case ModelPackage.SECTION_FEUILLE__DOCUMENT:
				return getDocument();
			case ModelPackage.SECTION_FEUILLE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ModelPackage.SECTION_FEUILLE__CONTENU:
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
			case ModelPackage.SECTION_FEUILLE__TITRE:
				setTitre((String)newValue);
				return;
			case ModelPackage.SECTION_FEUILLE__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case ModelPackage.SECTION_FEUILLE__PARENT:
				setParent((SectionBranche)newValue);
				return;
			case ModelPackage.SECTION_FEUILLE__CONTENU:
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
			case ModelPackage.SECTION_FEUILLE__TITRE:
				setTitre(TITRE_EDEFAULT);
				return;
			case ModelPackage.SECTION_FEUILLE__DOCUMENT:
				setDocument((Document)null);
				return;
			case ModelPackage.SECTION_FEUILLE__PARENT:
				setParent((SectionBranche)null);
				return;
			case ModelPackage.SECTION_FEUILLE__CONTENU:
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
			case ModelPackage.SECTION_FEUILLE__TITRE:
				return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
			case ModelPackage.SECTION_FEUILLE__DOCUMENT:
				return getDocument() != null;
			case ModelPackage.SECTION_FEUILLE__PARENT:
				return parent != null;
			case ModelPackage.SECTION_FEUILLE__CONTENU:
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
			case ModelPackage.SECTION_FEUILLE___RENOMMER__STRING:
				renommer((String)arguments.get(0));
				return null;
			case ModelPackage.SECTION_FEUILLE___SUPPRIMER:
				supprimer();
				return null;
			case ModelPackage.SECTION_FEUILLE___AJOUTER_SOUS_SECTION__STRING:
				ajouterSousSection((String)arguments.get(0));
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
		result.append(" (titre: ");
		result.append(titre);
		result.append(')');
		return result.toString();
	}

} //SectionFeuilleImpl

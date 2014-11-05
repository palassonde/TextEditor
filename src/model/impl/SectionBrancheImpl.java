/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import model.Contenu;
import model.Document;
import model.ModelPackage;
import model.Section;
import model.SectionBranche;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Branche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.SectionBrancheImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link model.impl.SectionBrancheImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link model.impl.SectionBrancheImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link model.impl.SectionBrancheImpl#getContenu <em>Contenu</em>}</li>
 *   <li>{@link model.impl.SectionBrancheImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link model.impl.SectionBrancheImpl#getEnfant <em>Enfant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionBrancheImpl extends MinimalEObjectImpl.Container implements SectionBranche {
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
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Document document;

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
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final int NIVEAU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected int niveau = NIVEAU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnfant() <em>Enfant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnfant()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> enfant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionBrancheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SECTION_BRANCHE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_BRANCHE__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocument() {
		if (document != null && document.eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (Document)eResolveProxy(oldDocument);
			if (document != oldDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SECTION_BRANCHE__DOCUMENT, oldDocument, document));
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Document newDocument, NotificationChain msgs) {
		Document oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_BRANCHE__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Document newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, ModelPackage.DOCUMENT__SECTION_COURANTE, Document.class, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, ModelPackage.DOCUMENT__SECTION_COURANTE, Document.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_BRANCHE__DOCUMENT, newDocument, newDocument));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SECTION_BRANCHE__PARENT, oldParent, parent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_BRANCHE__PARENT, oldParent, newParent);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_BRANCHE__PARENT, newParent, newParent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SECTION_BRANCHE__CONTENU, oldContenu, contenu));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_BRANCHE__CONTENU, oldContenu, newContenu);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_BRANCHE__CONTENU, newContenu, newContenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(int newNiveau) {
		int oldNiveau = niveau;
		niveau = newNiveau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECTION_BRANCHE__NIVEAU, oldNiveau, niveau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getEnfant() {
		if (enfant == null) {
			enfant = new EObjectWithInverseResolvingEList<Section>(Section.class, this, ModelPackage.SECTION_BRANCHE__ENFANT, ModelPackage.SECTION__PARENT);
		}
		return enfant;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SECTION_BRANCHE__DOCUMENT:
				if (document != null)
					msgs = ((InternalEObject)document).eInverseRemove(this, ModelPackage.DOCUMENT__SECTION_COURANTE, Document.class, msgs);
				return basicSetDocument((Document)otherEnd, msgs);
			case ModelPackage.SECTION_BRANCHE__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, ModelPackage.SECTION_BRANCHE__ENFANT, SectionBranche.class, msgs);
				return basicSetParent((SectionBranche)otherEnd, msgs);
			case ModelPackage.SECTION_BRANCHE__CONTENU:
				if (contenu != null)
					msgs = ((InternalEObject)contenu).eInverseRemove(this, ModelPackage.CONTENU__SECTION, Contenu.class, msgs);
				return basicSetContenu((Contenu)otherEnd, msgs);
			case ModelPackage.SECTION_BRANCHE__ENFANT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnfant()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.SECTION_BRANCHE__DOCUMENT:
				return basicSetDocument(null, msgs);
			case ModelPackage.SECTION_BRANCHE__PARENT:
				return basicSetParent(null, msgs);
			case ModelPackage.SECTION_BRANCHE__CONTENU:
				return basicSetContenu(null, msgs);
			case ModelPackage.SECTION_BRANCHE__ENFANT:
				return ((InternalEList<?>)getEnfant()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SECTION_BRANCHE__TITRE:
				return getTitre();
			case ModelPackage.SECTION_BRANCHE__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case ModelPackage.SECTION_BRANCHE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ModelPackage.SECTION_BRANCHE__CONTENU:
				if (resolve) return getContenu();
				return basicGetContenu();
			case ModelPackage.SECTION_BRANCHE__NIVEAU:
				return getNiveau();
			case ModelPackage.SECTION_BRANCHE__ENFANT:
				return getEnfant();
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
			case ModelPackage.SECTION_BRANCHE__TITRE:
				setTitre((String)newValue);
				return;
			case ModelPackage.SECTION_BRANCHE__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case ModelPackage.SECTION_BRANCHE__PARENT:
				setParent((SectionBranche)newValue);
				return;
			case ModelPackage.SECTION_BRANCHE__CONTENU:
				setContenu((Contenu)newValue);
				return;
			case ModelPackage.SECTION_BRANCHE__NIVEAU:
				setNiveau((Integer)newValue);
				return;
			case ModelPackage.SECTION_BRANCHE__ENFANT:
				getEnfant().clear();
				getEnfant().addAll((Collection<? extends Section>)newValue);
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
			case ModelPackage.SECTION_BRANCHE__TITRE:
				setTitre(TITRE_EDEFAULT);
				return;
			case ModelPackage.SECTION_BRANCHE__DOCUMENT:
				setDocument((Document)null);
				return;
			case ModelPackage.SECTION_BRANCHE__PARENT:
				setParent((SectionBranche)null);
				return;
			case ModelPackage.SECTION_BRANCHE__CONTENU:
				setContenu((Contenu)null);
				return;
			case ModelPackage.SECTION_BRANCHE__NIVEAU:
				setNiveau(NIVEAU_EDEFAULT);
				return;
			case ModelPackage.SECTION_BRANCHE__ENFANT:
				getEnfant().clear();
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
			case ModelPackage.SECTION_BRANCHE__TITRE:
				return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
			case ModelPackage.SECTION_BRANCHE__DOCUMENT:
				return document != null;
			case ModelPackage.SECTION_BRANCHE__PARENT:
				return parent != null;
			case ModelPackage.SECTION_BRANCHE__CONTENU:
				return contenu != null;
			case ModelPackage.SECTION_BRANCHE__NIVEAU:
				return niveau != NIVEAU_EDEFAULT;
			case ModelPackage.SECTION_BRANCHE__ENFANT:
				return enfant != null && !enfant.isEmpty();
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
			case ModelPackage.SECTION_BRANCHE___RENOMMER__STRING:
				renommer((String)arguments.get(0));
				return null;
			case ModelPackage.SECTION_BRANCHE___AJOUTER_SOUS_SECTION__STRING:
				ajouterSousSection((String)arguments.get(0));
				return null;
			case ModelPackage.SECTION_BRANCHE___SUPPRIMER:
				supprimer();
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
		result.append(", niveau: ");
		result.append(niveau);
		result.append(')');
		return result.toString();
	}

} //SectionBrancheImpl

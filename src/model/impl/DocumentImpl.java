/**
 */
package model.impl;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import model.Action;
import model.Document;
import model.ModelPackage;
import model.SectionBranche;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.DocumentImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getSectionRacine <em>Section Racine</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#isModifie <em>Modifie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
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
	 * The cached value of the '{@link #getSectionRacine() <em>Section Racine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionRacine()
	 * @generated
	 * @ordered
	 */
	protected SectionBranche sectionRacine;

	/**
	 * The default value of the '{@link #isModifie() <em>Modifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModifie()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODIFIE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModifie() <em>Modifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModifie()
	 * @generated
	 * @ordered
	 */
	protected boolean modifie = MODIFIE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}
	
	public DocumentImpl(String titre) {
		super();
		this.titre = titre;
		this.sectionRacine = new SectionBrancheImpl(this);
		this.sectionRacine.setTitre(this.titre);
		this.sectionRacine.setNiveau(1);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DOCUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionBranche getSectionRacine() {
		return sectionRacine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionRacine(SectionBranche newSectionRacine, NotificationChain msgs) {
		SectionBranche oldSectionRacine = sectionRacine;
		sectionRacine = newSectionRacine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__SECTION_RACINE, oldSectionRacine, newSectionRacine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionRacine(SectionBranche newSectionRacine) {
		if (newSectionRacine != sectionRacine) {
			NotificationChain msgs = null;
			if (sectionRacine != null)
				msgs = ((InternalEObject)sectionRacine).eInverseRemove(this, ModelPackage.SECTION_BRANCHE__DOCUMENT, SectionBranche.class, msgs);
			if (newSectionRacine != null)
				msgs = ((InternalEObject)newSectionRacine).eInverseAdd(this, ModelPackage.SECTION_BRANCHE__DOCUMENT, SectionBranche.class, msgs);
			msgs = basicSetSectionRacine(newSectionRacine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__SECTION_RACINE, newSectionRacine, newSectionRacine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModifie() {
		return modifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifie(boolean newModifie) {
		boolean oldModifie = modifie;
		modifie = newModifie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__MODIFIE, oldModifie, modifie));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				if (sectionRacine != null)
					msgs = ((InternalEObject)sectionRacine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DOCUMENT__SECTION_RACINE, null, msgs);
				return basicSetSectionRacine((SectionBranche)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Document ouvrir(String nomFichier) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("document", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		//ligne ajoute
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		URI fileURI = URI.createFileURI(new File(nomFichier).getAbsolutePath());
		Resource documentResource = resSet.getResource(fileURI,true);
		Document document = (Document)documentResource.getContents().get(0);
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Document creerNouvDocument() {
		Document document= new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				return basicSetSectionRacine(null, msgs);
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
			case ModelPackage.DOCUMENT__TITRE:
				return getTitre();
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				return getSectionRacine();
			case ModelPackage.DOCUMENT__MODIFIE:
				return isModifie();
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
			case ModelPackage.DOCUMENT__TITRE:
				setTitre((String)newValue);
				return;
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				setSectionRacine((SectionBranche)newValue);
				return;
			case ModelPackage.DOCUMENT__MODIFIE:
				setModifie((Boolean)newValue);
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
			case ModelPackage.DOCUMENT__TITRE:
				setTitre(TITRE_EDEFAULT);
				return;
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				setSectionRacine((SectionBranche)null);
				return;
			case ModelPackage.DOCUMENT__MODIFIE:
				setModifie(MODIFIE_EDEFAULT);
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
			case ModelPackage.DOCUMENT__TITRE:
				return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				return sectionRacine != null;
			case ModelPackage.DOCUMENT__MODIFIE:
				return modifie != MODIFIE_EDEFAULT;
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
			case ModelPackage.DOCUMENT___REFAIRE__ACTION:
				refaire((Action)arguments.get(0));
				return null;
			case ModelPackage.DOCUMENT___DEFAIRE__ACTION:
				defaire((Action)arguments.get(0));
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
		result.append(", modifie: ");
		result.append(modifie);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl

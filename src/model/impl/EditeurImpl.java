/**
 */
package model.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import model.Caretaker;
import model.Document;
import model.Editeur;
import model.Historique;
import model.ModelPackage;
import model.PressePapier;

import model.Section;
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
 * An implementation of the model object '<em><b>Editeur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.EditeurImpl#getDocumentCourant <em>Document Courant</em>}</li>
 *   <li>{@link model.impl.EditeurImpl#getPressePapier <em>Presse Papier</em>}</li>
 *   <li>{@link model.impl.EditeurImpl#getHistorique <em>Historique</em>}</li>
 *   <li>{@link model.impl.EditeurImpl#getSectionCourante <em>Section Courante</em>}</li>
 *   <li>{@link model.impl.EditeurImpl#getCaretaker <em>Caretaker</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditeurImpl extends MinimalEObjectImpl.Container implements Editeur {
	/**
	 * The cached value of the '{@link #getDocumentCourant() <em>Document Courant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCourant()
	 * @generated
	 * @ordered
	 */
	protected Document documentCourant;

	/**
	 * The cached value of the '{@link #getPressePapier() <em>Presse Papier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressePapier()
	 * @generated
	 * @ordered
	 */
	protected PressePapier pressePapier;
	/**
	 * The cached value of the '{@link #getHistorique() <em>Historique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorique()
	 * @generated
	 * @ordered
	 */
	protected Historique historique;

	/**
	 * The cached value of the '{@link #getSectionCourante() <em>Section Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionCourante()
	 * @generated
	 * @ordered
	 */
	protected Section sectionCourante;

	/**
	 * The cached value of the '{@link #getCaretaker() <em>Caretaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaretaker()
	 * @generated
	 * @ordered
	 */
	protected Caretaker caretaker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EditeurImpl() {
		super();
		this.historique = new HistoriqueImpl();
		this.pressePapier = new PressePapierImpl();
		this.caretaker = new CaretakerImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EDITEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocumentCourant() {
		if (documentCourant != null && documentCourant.eIsProxy()) {
			InternalEObject oldDocumentCourant = (InternalEObject)documentCourant;
			documentCourant = (Document)eResolveProxy(oldDocumentCourant);
			if (documentCourant != oldDocumentCourant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EDITEUR__DOCUMENT_COURANT, oldDocumentCourant, documentCourant));
			}
		}
		return documentCourant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetDocumentCourant() {
		return documentCourant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentCourant(Document newDocumentCourant) {
		Document oldDocumentCourant = documentCourant;
		documentCourant = newDocumentCourant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EDITEUR__DOCUMENT_COURANT, oldDocumentCourant, documentCourant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressePapier getPressePapier() {
		return pressePapier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPressePapier(PressePapier newPressePapier, NotificationChain msgs) {
		PressePapier oldPressePapier = pressePapier;
		pressePapier = newPressePapier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.EDITEUR__PRESSE_PAPIER, oldPressePapier, newPressePapier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressePapier(PressePapier newPressePapier) {
		if (newPressePapier != pressePapier) {
			NotificationChain msgs = null;
			if (pressePapier != null)
				msgs = ((InternalEObject)pressePapier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EDITEUR__PRESSE_PAPIER, null, msgs);
			if (newPressePapier != null)
				msgs = ((InternalEObject)newPressePapier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EDITEUR__PRESSE_PAPIER, null, msgs);
			msgs = basicSetPressePapier(newPressePapier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EDITEUR__PRESSE_PAPIER, newPressePapier, newPressePapier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historique getHistorique() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.EDITEUR__HISTORIQUE, oldHistorique, newHistorique);
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
				msgs = ((InternalEObject)historique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EDITEUR__HISTORIQUE, null, msgs);
			if (newHistorique != null)
				msgs = ((InternalEObject)newHistorique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.EDITEUR__HISTORIQUE, null, msgs);
			msgs = basicSetHistorique(newHistorique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EDITEUR__HISTORIQUE, newHistorique, newHistorique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getSectionCourante() {
		if (sectionCourante != null && sectionCourante.eIsProxy()) {
			InternalEObject oldSectionCourante = (InternalEObject)sectionCourante;
			sectionCourante = (Section)eResolveProxy(oldSectionCourante);
			if (sectionCourante != oldSectionCourante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EDITEUR__SECTION_COURANTE, oldSectionCourante, sectionCourante));
			}
		}
		return sectionCourante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetSectionCourante() {
		return sectionCourante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionCourante(Section newSectionCourante) {
		Section oldSectionCourante = sectionCourante;
		sectionCourante = newSectionCourante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EDITEUR__SECTION_COURANTE, oldSectionCourante, sectionCourante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caretaker getCaretaker() {
		if (caretaker != null && caretaker.eIsProxy()) {
			InternalEObject oldCaretaker = (InternalEObject)caretaker;
			caretaker = (Caretaker)eResolveProxy(oldCaretaker);
			if (caretaker != oldCaretaker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EDITEUR__CARETAKER, oldCaretaker, caretaker));
			}
		}
		return caretaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caretaker basicGetCaretaker() {
		return caretaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaretaker(Caretaker newCaretaker) {
		Caretaker oldCaretaker = caretaker;
		caretaker = newCaretaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EDITEUR__CARETAKER, oldCaretaker, caretaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException 
	 */
	public void sauvegarder(String nomFichier) throws IOException {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("document", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(nomFichier);
		Resource restaurantResource = resSet.createResource(fileURI);
		restaurantResource.getContents().add(this.getDocumentCourant());
		restaurantResource.save(null);
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
		URI fileURI = URI.createFileURI(nomFichier);
		Resource documentResource = resSet.getResource(fileURI,true);
		Document document = (Document)documentResource.getContents().get(0);
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Document creerNouvDocument() {
		Document document= new DocumentImpl("untitled");
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
			case ModelPackage.EDITEUR__PRESSE_PAPIER:
				return basicSetPressePapier(null, msgs);
			case ModelPackage.EDITEUR__HISTORIQUE:
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
			case ModelPackage.EDITEUR__DOCUMENT_COURANT:
				if (resolve) return getDocumentCourant();
				return basicGetDocumentCourant();
			case ModelPackage.EDITEUR__PRESSE_PAPIER:
				return getPressePapier();
			case ModelPackage.EDITEUR__HISTORIQUE:
				return getHistorique();
			case ModelPackage.EDITEUR__SECTION_COURANTE:
				if (resolve) return getSectionCourante();
				return basicGetSectionCourante();
			case ModelPackage.EDITEUR__CARETAKER:
				if (resolve) return getCaretaker();
				return basicGetCaretaker();
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
			case ModelPackage.EDITEUR__DOCUMENT_COURANT:
				setDocumentCourant((Document)newValue);
				return;
			case ModelPackage.EDITEUR__PRESSE_PAPIER:
				setPressePapier((PressePapier)newValue);
				return;
			case ModelPackage.EDITEUR__HISTORIQUE:
				setHistorique((Historique)newValue);
				return;
			case ModelPackage.EDITEUR__SECTION_COURANTE:
				setSectionCourante((Section)newValue);
				return;
			case ModelPackage.EDITEUR__CARETAKER:
				setCaretaker((Caretaker)newValue);
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
			case ModelPackage.EDITEUR__DOCUMENT_COURANT:
				setDocumentCourant((Document)null);
				return;
			case ModelPackage.EDITEUR__PRESSE_PAPIER:
				setPressePapier((PressePapier)null);
				return;
			case ModelPackage.EDITEUR__HISTORIQUE:
				setHistorique((Historique)null);
				return;
			case ModelPackage.EDITEUR__SECTION_COURANTE:
				setSectionCourante((Section)null);
				return;
			case ModelPackage.EDITEUR__CARETAKER:
				setCaretaker((Caretaker)null);
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
			case ModelPackage.EDITEUR__DOCUMENT_COURANT:
				return documentCourant != null;
			case ModelPackage.EDITEUR__PRESSE_PAPIER:
				return pressePapier != null;
			case ModelPackage.EDITEUR__HISTORIQUE:
				return historique != null;
			case ModelPackage.EDITEUR__SECTION_COURANTE:
				return sectionCourante != null;
			case ModelPackage.EDITEUR__CARETAKER:
				return caretaker != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EDITEUR___SAUVEGARDER__STRING:
				try {
					sauvegarder((String)arguments.get(0));
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			case ModelPackage.EDITEUR___OUVRIR__STRING:
				ouvrir((String)arguments.get(0));
				return null;
			case ModelPackage.EDITEUR___CREER_NOUV_DOCUMENT:
				creerNouvDocument();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EditeurImpl

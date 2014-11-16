/**
 */
package model.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import model.Document;
import model.Editeur;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditeurImpl() {
		super();
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
	public void ouvrir(String nomFichier) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("document", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(nomFichier);
		Resource documentResource = resSet.getResource(fileURI,true);
		Document document = (Document)documentResource.getContents().get(0);
		this.documentCourant = document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void creerNouvDocument() {
		Document document= new DocumentImpl("untitled");
		this.documentCourant = document;
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
			case ModelPackage.EDITEUR___SAUVEGARDER__STRING:
				try {
					sauvegarder((String)arguments.get(0));
				} catch (IOException e) {
					// TODO Auto-generated catch block
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

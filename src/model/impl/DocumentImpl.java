/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.Document;
import model.Historique;
import model.ModelPackage;
import model.PressePapier;
import model.Section;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.DocumentImpl#getDebutSel <em>Debut Sel</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getHistorique <em>Historique</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getFinSel <em>Fin Sel</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getPositionCurseur <em>Position Curseur</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getSectionRacine <em>Section Racine</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getPressePapier <em>Presse Papier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
	/**
	 * The default value of the '{@link #getDebutSel() <em>Debut Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutSel()
	 * @generated
	 * @ordered
	 */
	protected static final int DEBUT_SEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDebutSel() <em>Debut Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutSel()
	 * @generated
	 * @ordered
	 */
	protected int debutSel = DEBUT_SEL_EDEFAULT;

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
	 * The default value of the '{@link #getFinSel() <em>Fin Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinSel()
	 * @generated
	 * @ordered
	 */
	protected static final int FIN_SEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFinSel() <em>Fin Sel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinSel()
	 * @generated
	 * @ordered
	 */
	protected int finSel = FIN_SEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionCurseur() <em>Position Curseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionCurseur()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_CURSEUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositionCurseur() <em>Position Curseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionCurseur()
	 * @generated
	 * @ordered
	 */
	protected int positionCurseur = POSITION_CURSEUR_EDEFAULT;

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
	protected Section sectionRacine;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
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
	public int getDebutSel() {
		return debutSel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutSel(int newDebutSel) {
		int oldDebutSel = debutSel;
		debutSel = newDebutSel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__DEBUT_SEL, oldDebutSel, debutSel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__HISTORIQUE, oldHistorique, newHistorique);
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
				msgs = ((InternalEObject)historique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DOCUMENT__HISTORIQUE, null, msgs);
			if (newHistorique != null)
				msgs = ((InternalEObject)newHistorique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DOCUMENT__HISTORIQUE, null, msgs);
			msgs = basicSetHistorique(newHistorique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__HISTORIQUE, newHistorique, newHistorique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFinSel() {
		return finSel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinSel(int newFinSel) {
		int oldFinSel = finSel;
		finSel = newFinSel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__FIN_SEL, oldFinSel, finSel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPositionCurseur() {
		return positionCurseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionCurseur(int newPositionCurseur) {
		int oldPositionCurseur = positionCurseur;
		positionCurseur = newPositionCurseur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__POSITION_CURSEUR, oldPositionCurseur, positionCurseur));
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
	public Section getSectionRacine() {
		return sectionRacine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionRacine(Section newSectionRacine, NotificationChain msgs) {
		Section oldSectionRacine = sectionRacine;
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
	public void setSectionRacine(Section newSectionRacine) {
		if (newSectionRacine != sectionRacine) {
			NotificationChain msgs = null;
			if (sectionRacine != null)
				msgs = ((InternalEObject)sectionRacine).eInverseRemove(this, ModelPackage.SECTION__DOCUMENT, Section.class, msgs);
			if (newSectionRacine != null)
				msgs = ((InternalEObject)newSectionRacine).eInverseAdd(this, ModelPackage.SECTION__DOCUMENT, Section.class, msgs);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__PRESSE_PAPIER, oldPressePapier, newPressePapier);
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
				msgs = ((InternalEObject)pressePapier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DOCUMENT__PRESSE_PAPIER, null, msgs);
			if (newPressePapier != null)
				msgs = ((InternalEObject)newPressePapier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DOCUMENT__PRESSE_PAPIER, null, msgs);
			msgs = basicSetPressePapier(newPressePapier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__PRESSE_PAPIER, newPressePapier, newPressePapier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void renommer() {
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
				return basicSetSectionRacine((Section)otherEnd, msgs);
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
			case ModelPackage.DOCUMENT__HISTORIQUE:
				return basicSetHistorique(null, msgs);
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				return basicSetSectionRacine(null, msgs);
			case ModelPackage.DOCUMENT__PRESSE_PAPIER:
				return basicSetPressePapier(null, msgs);
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
			case ModelPackage.DOCUMENT__DEBUT_SEL:
				return getDebutSel();
			case ModelPackage.DOCUMENT__HISTORIQUE:
				return getHistorique();
			case ModelPackage.DOCUMENT__FIN_SEL:
				return getFinSel();
			case ModelPackage.DOCUMENT__POSITION_CURSEUR:
				return getPositionCurseur();
			case ModelPackage.DOCUMENT__TITRE:
				return getTitre();
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				return getSectionRacine();
			case ModelPackage.DOCUMENT__PRESSE_PAPIER:
				return getPressePapier();
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
			case ModelPackage.DOCUMENT__DEBUT_SEL:
				setDebutSel((Integer)newValue);
				return;
			case ModelPackage.DOCUMENT__HISTORIQUE:
				setHistorique((Historique)newValue);
				return;
			case ModelPackage.DOCUMENT__FIN_SEL:
				setFinSel((Integer)newValue);
				return;
			case ModelPackage.DOCUMENT__POSITION_CURSEUR:
				setPositionCurseur((Integer)newValue);
				return;
			case ModelPackage.DOCUMENT__TITRE:
				setTitre((String)newValue);
				return;
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				setSectionRacine((Section)newValue);
				return;
			case ModelPackage.DOCUMENT__PRESSE_PAPIER:
				setPressePapier((PressePapier)newValue);
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
			case ModelPackage.DOCUMENT__DEBUT_SEL:
				setDebutSel(DEBUT_SEL_EDEFAULT);
				return;
			case ModelPackage.DOCUMENT__HISTORIQUE:
				setHistorique((Historique)null);
				return;
			case ModelPackage.DOCUMENT__FIN_SEL:
				setFinSel(FIN_SEL_EDEFAULT);
				return;
			case ModelPackage.DOCUMENT__POSITION_CURSEUR:
				setPositionCurseur(POSITION_CURSEUR_EDEFAULT);
				return;
			case ModelPackage.DOCUMENT__TITRE:
				setTitre(TITRE_EDEFAULT);
				return;
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				setSectionRacine((Section)null);
				return;
			case ModelPackage.DOCUMENT__PRESSE_PAPIER:
				setPressePapier((PressePapier)null);
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
			case ModelPackage.DOCUMENT__DEBUT_SEL:
				return debutSel != DEBUT_SEL_EDEFAULT;
			case ModelPackage.DOCUMENT__HISTORIQUE:
				return historique != null;
			case ModelPackage.DOCUMENT__FIN_SEL:
				return finSel != FIN_SEL_EDEFAULT;
			case ModelPackage.DOCUMENT__POSITION_CURSEUR:
				return positionCurseur != POSITION_CURSEUR_EDEFAULT;
			case ModelPackage.DOCUMENT__TITRE:
				return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
			case ModelPackage.DOCUMENT__SECTION_RACINE:
				return sectionRacine != null;
			case ModelPackage.DOCUMENT__PRESSE_PAPIER:
				return pressePapier != null;
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
			case ModelPackage.DOCUMENT___RENOMMER:
				renommer();
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
		result.append(" (debutSel: ");
		result.append(debutSel);
		result.append(", finSel: ");
		result.append(finSel);
		result.append(", positionCurseur: ");
		result.append(positionCurseur);
		result.append(", titre: ");
		result.append(titre);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl

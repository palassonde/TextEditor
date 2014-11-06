/**
 */
package model.impl;

import java.util.Collection;
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link model.impl.DocumentImpl#getSectionCourante <em>Section Courante</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#isModifie <em>Modifie</em>}</li>
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
	 * The cached value of the '{@link #getSectionRacine() <em>Section Racine</em>}' reference.
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
	 * The cached value of the '{@link #getSectionCourante() <em>Section Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionCourante()
	 * @generated
	 * @ordered
	 */
	protected Section sectionCourante;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

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
		this.titre = "untitled";
		this.sectionRacine = new SectionBrancheImpl();
		this.historique = new HistoriqueImpl();
		this.pressePapier = new PressePapierImpl();
		this.sectionCourante = this.sectionRacine;
	}
	
	public DocumentImpl(String titre) {
		super();
		this.titre = titre;
		this.sectionRacine = new SectionBrancheImpl();
		this.historique = new HistoriqueImpl();
		this.pressePapier = new PressePapierImpl();
		this.sectionCourante = this.sectionRacine;
		
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
		if (sectionRacine != null && sectionRacine.eIsProxy()) {
			InternalEObject oldSectionRacine = (InternalEObject)sectionRacine;
			sectionRacine = (Section)eResolveProxy(oldSectionRacine);
			if (sectionRacine != oldSectionRacine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.DOCUMENT__SECTION_RACINE, oldSectionRacine, sectionRacine));
			}
		}
		return sectionRacine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section basicGetSectionRacine() {
		return sectionRacine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionRacine(Section newSectionRacine) {
		Section oldSectionRacine = sectionRacine;
		sectionRacine = newSectionRacine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__SECTION_RACINE, oldSectionRacine, sectionRacine));
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
	public Section getSectionCourante() {
		if (sectionCourante != null && sectionCourante.eIsProxy()) {
			InternalEObject oldSectionCourante = (InternalEObject)sectionCourante;
			sectionCourante = (Section)eResolveProxy(oldSectionCourante);
			if (sectionCourante != oldSectionCourante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.DOCUMENT__SECTION_COURANTE, oldSectionCourante, sectionCourante));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__SECTION_COURANTE, oldSectionCourante, sectionCourante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentWithInverseEList<Section>(Section.class, this, ModelPackage.DOCUMENT__SECTIONS, ModelPackage.SECTION__DOCUMENT);
		}
		return sections;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DOCUMENT__SECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSections()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.DOCUMENT__PRESSE_PAPIER:
				return basicSetPressePapier(null, msgs);
			case ModelPackage.DOCUMENT__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
				if (resolve) return getSectionRacine();
				return basicGetSectionRacine();
			case ModelPackage.DOCUMENT__PRESSE_PAPIER:
				return getPressePapier();
			case ModelPackage.DOCUMENT__SECTION_COURANTE:
				if (resolve) return getSectionCourante();
				return basicGetSectionCourante();
			case ModelPackage.DOCUMENT__SECTIONS:
				return getSections();
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
	@SuppressWarnings("unchecked")
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
			case ModelPackage.DOCUMENT__SECTION_COURANTE:
				setSectionCourante((Section)newValue);
				return;
			case ModelPackage.DOCUMENT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
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
			case ModelPackage.DOCUMENT__SECTION_COURANTE:
				setSectionCourante((Section)null);
				return;
			case ModelPackage.DOCUMENT__SECTIONS:
				getSections().clear();
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
			case ModelPackage.DOCUMENT__SECTION_COURANTE:
				return sectionCourante != null;
			case ModelPackage.DOCUMENT__SECTIONS:
				return sections != null && !sections.isEmpty();
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
		result.append(", modifie: ");
		result.append(modifie);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl

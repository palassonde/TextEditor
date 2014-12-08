/**
 */
package model.impl;

import model.Memento;
import model.ModelPackage;

import model.Section;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.MementoImpl#isEtatDeplacer <em>Etat Deplacer</em>}</li>
 *   <li>{@link model.impl.MementoImpl#getPositionCurseur <em>Position Curseur</em>}</li>
 *   <li>{@link model.impl.MementoImpl#isEtatCopier <em>Etat Copier</em>}</li>
 *   <li>{@link model.impl.MementoImpl#isEtatColler <em>Etat Coller</em>}</li>
 *   <li>{@link model.impl.MementoImpl#isEtatDefaire <em>Etat Defaire</em>}</li>
 *   <li>{@link model.impl.MementoImpl#isEtatRefaire <em>Etat Refaire</em>}</li>
 *   <li>{@link model.impl.MementoImpl#getDebutSelection <em>Debut Selection</em>}</li>
 *   <li>{@link model.impl.MementoImpl#getFinSelection <em>Fin Selection</em>}</li>
 *   <li>{@link model.impl.MementoImpl#getSectionCourante <em>Section Courante</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MementoImpl extends MinimalEObjectImpl.Container implements Memento {
	/**
	 * The default value of the '{@link #isEtatDeplacer() <em>Etat Deplacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatDeplacer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ETAT_DEPLACER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEtatDeplacer() <em>Etat Deplacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatDeplacer()
	 * @generated
	 * @ordered
	 */
	protected boolean etatDeplacer = ETAT_DEPLACER_EDEFAULT;

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
	 * The default value of the '{@link #isEtatCopier() <em>Etat Copier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatCopier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ETAT_COPIER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEtatCopier() <em>Etat Copier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatCopier()
	 * @generated
	 * @ordered
	 */
	protected boolean etatCopier = ETAT_COPIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isEtatColler() <em>Etat Coller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatColler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ETAT_COLLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEtatColler() <em>Etat Coller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatColler()
	 * @generated
	 * @ordered
	 */
	protected boolean etatColler = ETAT_COLLER_EDEFAULT;

	/**
	 * The default value of the '{@link #isEtatDefaire() <em>Etat Defaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatDefaire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ETAT_DEFAIRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEtatDefaire() <em>Etat Defaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatDefaire()
	 * @generated
	 * @ordered
	 */
	protected boolean etatDefaire = ETAT_DEFAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEtatRefaire() <em>Etat Refaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatRefaire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ETAT_REFAIRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEtatRefaire() <em>Etat Refaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEtatRefaire()
	 * @generated
	 * @ordered
	 */
	protected boolean etatRefaire = ETAT_REFAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebutSelection() <em>Debut Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutSelection()
	 * @generated
	 * @ordered
	 */
	protected static final int DEBUT_SELECTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDebutSelection() <em>Debut Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutSelection()
	 * @generated
	 * @ordered
	 */
	protected int debutSelection = DEBUT_SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinSelection() <em>Fin Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinSelection()
	 * @generated
	 * @ordered
	 */
	protected static final int FIN_SELECTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFinSelection() <em>Fin Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinSelection()
	 * @generated
	 * @ordered
	 */
	protected int finSelection = FIN_SELECTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public MementoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MEMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEtatDeplacer() {
		return etatDeplacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatDeplacer(boolean newEtatDeplacer) {
		boolean oldEtatDeplacer = etatDeplacer;
		etatDeplacer = newEtatDeplacer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MEMENTO__ETAT_DEPLACER, oldEtatDeplacer, etatDeplacer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MEMENTO__POSITION_CURSEUR, oldPositionCurseur, positionCurseur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEtatCopier() {
		return etatCopier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatCopier(boolean newEtatCopier) {
		boolean oldEtatCopier = etatCopier;
		etatCopier = newEtatCopier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MEMENTO__ETAT_COPIER, oldEtatCopier, etatCopier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEtatColler() {
		return etatColler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatColler(boolean newEtatColler) {
		boolean oldEtatColler = etatColler;
		etatColler = newEtatColler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MEMENTO__ETAT_COLLER, oldEtatColler, etatColler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEtatDefaire() {
		return etatDefaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatDefaire(boolean newEtatDefaire) {
		boolean oldEtatDefaire = etatDefaire;
		etatDefaire = newEtatDefaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MEMENTO__ETAT_DEFAIRE, oldEtatDefaire, etatDefaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEtatRefaire() {
		return etatRefaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatRefaire(boolean newEtatRefaire) {
		boolean oldEtatRefaire = etatRefaire;
		etatRefaire = newEtatRefaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MEMENTO__ETAT_REFAIRE, oldEtatRefaire, etatRefaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDebutSelection() {
		return debutSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutSelection(int newDebutSelection) {
		int oldDebutSelection = debutSelection;
		debutSelection = newDebutSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MEMENTO__DEBUT_SELECTION, oldDebutSelection, debutSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFinSelection() {
		return finSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinSelection(int newFinSelection) {
		int oldFinSelection = finSelection;
		finSelection = newFinSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MEMENTO__FIN_SELECTION, oldFinSelection, finSelection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MEMENTO__SECTION_COURANTE, oldSectionCourante, sectionCourante));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MEMENTO__SECTION_COURANTE, oldSectionCourante, sectionCourante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MEMENTO__ETAT_DEPLACER:
				return isEtatDeplacer();
			case ModelPackage.MEMENTO__POSITION_CURSEUR:
				return getPositionCurseur();
			case ModelPackage.MEMENTO__ETAT_COPIER:
				return isEtatCopier();
			case ModelPackage.MEMENTO__ETAT_COLLER:
				return isEtatColler();
			case ModelPackage.MEMENTO__ETAT_DEFAIRE:
				return isEtatDefaire();
			case ModelPackage.MEMENTO__ETAT_REFAIRE:
				return isEtatRefaire();
			case ModelPackage.MEMENTO__DEBUT_SELECTION:
				return getDebutSelection();
			case ModelPackage.MEMENTO__FIN_SELECTION:
				return getFinSelection();
			case ModelPackage.MEMENTO__SECTION_COURANTE:
				if (resolve) return getSectionCourante();
				return basicGetSectionCourante();
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
			case ModelPackage.MEMENTO__ETAT_DEPLACER:
				setEtatDeplacer((Boolean)newValue);
				return;
			case ModelPackage.MEMENTO__POSITION_CURSEUR:
				setPositionCurseur((Integer)newValue);
				return;
			case ModelPackage.MEMENTO__ETAT_COPIER:
				setEtatCopier((Boolean)newValue);
				return;
			case ModelPackage.MEMENTO__ETAT_COLLER:
				setEtatColler((Boolean)newValue);
				return;
			case ModelPackage.MEMENTO__ETAT_DEFAIRE:
				setEtatDefaire((Boolean)newValue);
				return;
			case ModelPackage.MEMENTO__ETAT_REFAIRE:
				setEtatRefaire((Boolean)newValue);
				return;
			case ModelPackage.MEMENTO__DEBUT_SELECTION:
				setDebutSelection((Integer)newValue);
				return;
			case ModelPackage.MEMENTO__FIN_SELECTION:
				setFinSelection((Integer)newValue);
				return;
			case ModelPackage.MEMENTO__SECTION_COURANTE:
				setSectionCourante((Section)newValue);
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
			case ModelPackage.MEMENTO__ETAT_DEPLACER:
				setEtatDeplacer(ETAT_DEPLACER_EDEFAULT);
				return;
			case ModelPackage.MEMENTO__POSITION_CURSEUR:
				setPositionCurseur(POSITION_CURSEUR_EDEFAULT);
				return;
			case ModelPackage.MEMENTO__ETAT_COPIER:
				setEtatCopier(ETAT_COPIER_EDEFAULT);
				return;
			case ModelPackage.MEMENTO__ETAT_COLLER:
				setEtatColler(ETAT_COLLER_EDEFAULT);
				return;
			case ModelPackage.MEMENTO__ETAT_DEFAIRE:
				setEtatDefaire(ETAT_DEFAIRE_EDEFAULT);
				return;
			case ModelPackage.MEMENTO__ETAT_REFAIRE:
				setEtatRefaire(ETAT_REFAIRE_EDEFAULT);
				return;
			case ModelPackage.MEMENTO__DEBUT_SELECTION:
				setDebutSelection(DEBUT_SELECTION_EDEFAULT);
				return;
			case ModelPackage.MEMENTO__FIN_SELECTION:
				setFinSelection(FIN_SELECTION_EDEFAULT);
				return;
			case ModelPackage.MEMENTO__SECTION_COURANTE:
				setSectionCourante((Section)null);
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
			case ModelPackage.MEMENTO__ETAT_DEPLACER:
				return etatDeplacer != ETAT_DEPLACER_EDEFAULT;
			case ModelPackage.MEMENTO__POSITION_CURSEUR:
				return positionCurseur != POSITION_CURSEUR_EDEFAULT;
			case ModelPackage.MEMENTO__ETAT_COPIER:
				return etatCopier != ETAT_COPIER_EDEFAULT;
			case ModelPackage.MEMENTO__ETAT_COLLER:
				return etatColler != ETAT_COLLER_EDEFAULT;
			case ModelPackage.MEMENTO__ETAT_DEFAIRE:
				return etatDefaire != ETAT_DEFAIRE_EDEFAULT;
			case ModelPackage.MEMENTO__ETAT_REFAIRE:
				return etatRefaire != ETAT_REFAIRE_EDEFAULT;
			case ModelPackage.MEMENTO__DEBUT_SELECTION:
				return debutSelection != DEBUT_SELECTION_EDEFAULT;
			case ModelPackage.MEMENTO__FIN_SELECTION:
				return finSelection != FIN_SELECTION_EDEFAULT;
			case ModelPackage.MEMENTO__SECTION_COURANTE:
				return sectionCourante != null;
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
		result.append(" (etatDeplacer: ");
		result.append(etatDeplacer);
		result.append(", positionCurseur: ");
		result.append(positionCurseur);
		result.append(", etatCopier: ");
		result.append(etatCopier);
		result.append(", etatColler: ");
		result.append(etatColler);
		result.append(", etatDefaire: ");
		result.append(etatDefaire);
		result.append(", etatRefaire: ");
		result.append(etatRefaire);
		result.append(", debutSelection: ");
		result.append(debutSelection);
		result.append(", finSelection: ");
		result.append(finSelection);
		result.append(')');
		return result.toString();
	}

} //MementoImpl

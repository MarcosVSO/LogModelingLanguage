/**
 */
package logmetamodel.impl;

import java.util.Collection;

import logmetamodel.ConjuntoRotas;
import logmetamodel.DataSchema;
import logmetamodel.LogmetamodelPackage;
import logmetamodel.Restricao;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.DataSchemaImpl#getRestricao <em>Restricao</em>}</li>
 *   <li>{@link logmetamodel.impl.DataSchemaImpl#getDsID <em>Ds ID</em>}</li>
 *   <li>{@link logmetamodel.impl.DataSchemaImpl#getCsID <em>Cs ID</em>}</li>
 *   <li>{@link logmetamodel.impl.DataSchemaImpl#getConjuntorotas <em>Conjuntorotas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSchemaImpl extends MinimalEObjectImpl.Container implements DataSchema {
	/**
	 * The cached value of the '{@link #getRestricao() <em>Restricao</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestricao()
	 * @generated
	 * @ordered
	 */
	protected EList<Restricao> restricao;

	/**
	 * The default value of the '{@link #getDsID() <em>Ds ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsID()
	 * @generated
	 * @ordered
	 */
	protected static final int DS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDsID() <em>Ds ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsID()
	 * @generated
	 * @ordered
	 */
	protected int dsID = DS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsID() <em>Cs ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsID()
	 * @generated
	 * @ordered
	 */
	protected static final int CS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCsID() <em>Cs ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsID()
	 * @generated
	 * @ordered
	 */
	protected int csID = CS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConjuntorotas() <em>Conjuntorotas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjuntorotas()
	 * @generated
	 * @ordered
	 */
	protected ConjuntoRotas conjuntorotas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.DATA_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Restricao> getRestricao() {
		if (restricao == null) {
			restricao = new EObjectContainmentEList<Restricao>(Restricao.class, this, LogmetamodelPackage.DATA_SCHEMA__RESTRICAO);
		}
		return restricao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDsID() {
		return dsID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsID(int newDsID) {
		int oldDsID = dsID;
		dsID = newDsID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.DATA_SCHEMA__DS_ID, oldDsID, dsID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCsID() {
		return csID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsID(int newCsID) {
		int oldCsID = csID;
		csID = newCsID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.DATA_SCHEMA__CS_ID, oldCsID, csID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjuntoRotas getConjuntorotas() {
		return conjuntorotas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConjuntorotas(ConjuntoRotas newConjuntorotas, NotificationChain msgs) {
		ConjuntoRotas oldConjuntorotas = conjuntorotas;
		conjuntorotas = newConjuntorotas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.DATA_SCHEMA__CONJUNTOROTAS, oldConjuntorotas, newConjuntorotas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConjuntorotas(ConjuntoRotas newConjuntorotas) {
		if (newConjuntorotas != conjuntorotas) {
			NotificationChain msgs = null;
			if (conjuntorotas != null)
				msgs = ((InternalEObject)conjuntorotas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogmetamodelPackage.DATA_SCHEMA__CONJUNTOROTAS, null, msgs);
			if (newConjuntorotas != null)
				msgs = ((InternalEObject)newConjuntorotas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogmetamodelPackage.DATA_SCHEMA__CONJUNTOROTAS, null, msgs);
			msgs = basicSetConjuntorotas(newConjuntorotas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.DATA_SCHEMA__CONJUNTOROTAS, newConjuntorotas, newConjuntorotas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmetamodelPackage.DATA_SCHEMA__RESTRICAO:
				return ((InternalEList<?>)getRestricao()).basicRemove(otherEnd, msgs);
			case LogmetamodelPackage.DATA_SCHEMA__CONJUNTOROTAS:
				return basicSetConjuntorotas(null, msgs);
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
			case LogmetamodelPackage.DATA_SCHEMA__RESTRICAO:
				return getRestricao();
			case LogmetamodelPackage.DATA_SCHEMA__DS_ID:
				return getDsID();
			case LogmetamodelPackage.DATA_SCHEMA__CS_ID:
				return getCsID();
			case LogmetamodelPackage.DATA_SCHEMA__CONJUNTOROTAS:
				return getConjuntorotas();
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
			case LogmetamodelPackage.DATA_SCHEMA__RESTRICAO:
				getRestricao().clear();
				getRestricao().addAll((Collection<? extends Restricao>)newValue);
				return;
			case LogmetamodelPackage.DATA_SCHEMA__DS_ID:
				setDsID((Integer)newValue);
				return;
			case LogmetamodelPackage.DATA_SCHEMA__CS_ID:
				setCsID((Integer)newValue);
				return;
			case LogmetamodelPackage.DATA_SCHEMA__CONJUNTOROTAS:
				setConjuntorotas((ConjuntoRotas)newValue);
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
			case LogmetamodelPackage.DATA_SCHEMA__RESTRICAO:
				getRestricao().clear();
				return;
			case LogmetamodelPackage.DATA_SCHEMA__DS_ID:
				setDsID(DS_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.DATA_SCHEMA__CS_ID:
				setCsID(CS_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.DATA_SCHEMA__CONJUNTOROTAS:
				setConjuntorotas((ConjuntoRotas)null);
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
			case LogmetamodelPackage.DATA_SCHEMA__RESTRICAO:
				return restricao != null && !restricao.isEmpty();
			case LogmetamodelPackage.DATA_SCHEMA__DS_ID:
				return dsID != DS_ID_EDEFAULT;
			case LogmetamodelPackage.DATA_SCHEMA__CS_ID:
				return csID != CS_ID_EDEFAULT;
			case LogmetamodelPackage.DATA_SCHEMA__CONJUNTOROTAS:
				return conjuntorotas != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dsID: ");
		result.append(dsID);
		result.append(", csID: ");
		result.append(csID);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public void setRestricoes(EList<Restricao> listaRestricao) {
		this.restricao = listaRestricao;
	}

} //DataSchemaImpl

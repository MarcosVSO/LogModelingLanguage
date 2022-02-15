/**
 */
package logmetamodel.impl;

import logmetamodel.ControlSchema;
import logmetamodel.DataSchema;
import logmetamodel.DomainSchema;
import logmetamodel.LogmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.DomainSchemaImpl#getControlschema <em>Controlschema</em>}</li>
 *   <li>{@link logmetamodel.impl.DomainSchemaImpl#getDataschema <em>Dataschema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainSchemaImpl extends MinimalEObjectImpl.Container implements DomainSchema {
	/**
	 * The cached value of the '{@link #getControlschema() <em>Controlschema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlschema()
	 * @generated
	 * @ordered
	 */
	protected ControlSchema controlschema;

	/**
	 * The cached value of the '{@link #getDataschema() <em>Dataschema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataschema()
	 * @generated
	 * @ordered
	 */
	protected DataSchema dataschema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.DOMAIN_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlSchema getControlschema() {
		return controlschema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlschema(ControlSchema newControlschema, NotificationChain msgs) {
		ControlSchema oldControlschema = controlschema;
		controlschema = newControlschema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.DOMAIN_SCHEMA__CONTROLSCHEMA, oldControlschema, newControlschema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlschema(ControlSchema newControlschema) {
		if (newControlschema != controlschema) {
			NotificationChain msgs = null;
			if (controlschema != null)
				msgs = ((InternalEObject)controlschema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogmetamodelPackage.DOMAIN_SCHEMA__CONTROLSCHEMA, null, msgs);
			if (newControlschema != null)
				msgs = ((InternalEObject)newControlschema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogmetamodelPackage.DOMAIN_SCHEMA__CONTROLSCHEMA, null, msgs);
			msgs = basicSetControlschema(newControlschema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.DOMAIN_SCHEMA__CONTROLSCHEMA, newControlschema, newControlschema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema getDataschema() {
		return dataschema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataschema(DataSchema newDataschema, NotificationChain msgs) {
		DataSchema oldDataschema = dataschema;
		dataschema = newDataschema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.DOMAIN_SCHEMA__DATASCHEMA, oldDataschema, newDataschema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataschema(DataSchema newDataschema) {
		if (newDataschema != dataschema) {
			NotificationChain msgs = null;
			if (dataschema != null)
				msgs = ((InternalEObject)dataschema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogmetamodelPackage.DOMAIN_SCHEMA__DATASCHEMA, null, msgs);
			if (newDataschema != null)
				msgs = ((InternalEObject)newDataschema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogmetamodelPackage.DOMAIN_SCHEMA__DATASCHEMA, null, msgs);
			msgs = basicSetDataschema(newDataschema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.DOMAIN_SCHEMA__DATASCHEMA, newDataschema, newDataschema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmetamodelPackage.DOMAIN_SCHEMA__CONTROLSCHEMA:
				return basicSetControlschema(null, msgs);
			case LogmetamodelPackage.DOMAIN_SCHEMA__DATASCHEMA:
				return basicSetDataschema(null, msgs);
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
			case LogmetamodelPackage.DOMAIN_SCHEMA__CONTROLSCHEMA:
				return getControlschema();
			case LogmetamodelPackage.DOMAIN_SCHEMA__DATASCHEMA:
				return getDataschema();
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
			case LogmetamodelPackage.DOMAIN_SCHEMA__CONTROLSCHEMA:
				setControlschema((ControlSchema)newValue);
				return;
			case LogmetamodelPackage.DOMAIN_SCHEMA__DATASCHEMA:
				setDataschema((DataSchema)newValue);
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
			case LogmetamodelPackage.DOMAIN_SCHEMA__CONTROLSCHEMA:
				setControlschema((ControlSchema)null);
				return;
			case LogmetamodelPackage.DOMAIN_SCHEMA__DATASCHEMA:
				setDataschema((DataSchema)null);
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
			case LogmetamodelPackage.DOMAIN_SCHEMA__CONTROLSCHEMA:
				return controlschema != null;
			case LogmetamodelPackage.DOMAIN_SCHEMA__DATASCHEMA:
				return dataschema != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainSchemaImpl

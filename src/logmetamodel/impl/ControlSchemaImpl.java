/**
 */
package logmetamodel.impl;

import logmetamodel.ConjuntoColetas;
import logmetamodel.ControlSchema;
import logmetamodel.LogmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.ControlSchemaImpl#getCsID <em>Cs ID</em>}</li>
 *   <li>{@link logmetamodel.impl.ControlSchemaImpl#getConjuntocoletas <em>Conjuntocoletas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSchemaImpl extends MinimalEObjectImpl.Container implements ControlSchema {
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
	 * The cached value of the '{@link #getConjuntocoletas() <em>Conjuntocoletas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjuntocoletas()
	 * @generated
	 * @ordered
	 */
	protected ConjuntoColetas conjuntocoletas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.CONTROL_SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.CONTROL_SCHEMA__CS_ID, oldCsID, csID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjuntoColetas getConjuntocoletas() {
		return conjuntocoletas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConjuntocoletas(ConjuntoColetas newConjuntocoletas, NotificationChain msgs) {
		ConjuntoColetas oldConjuntocoletas = conjuntocoletas;
		conjuntocoletas = newConjuntocoletas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.CONTROL_SCHEMA__CONJUNTOCOLETAS, oldConjuntocoletas, newConjuntocoletas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConjuntocoletas(ConjuntoColetas newConjuntocoletas) {
		if (newConjuntocoletas != conjuntocoletas) {
			NotificationChain msgs = null;
			if (conjuntocoletas != null)
				msgs = ((InternalEObject)conjuntocoletas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogmetamodelPackage.CONTROL_SCHEMA__CONJUNTOCOLETAS, null, msgs);
			if (newConjuntocoletas != null)
				msgs = ((InternalEObject)newConjuntocoletas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogmetamodelPackage.CONTROL_SCHEMA__CONJUNTOCOLETAS, null, msgs);
			msgs = basicSetConjuntocoletas(newConjuntocoletas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.CONTROL_SCHEMA__CONJUNTOCOLETAS, newConjuntocoletas, newConjuntocoletas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmetamodelPackage.CONTROL_SCHEMA__CONJUNTOCOLETAS:
				return basicSetConjuntocoletas(null, msgs);
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
			case LogmetamodelPackage.CONTROL_SCHEMA__CS_ID:
				return getCsID();
			case LogmetamodelPackage.CONTROL_SCHEMA__CONJUNTOCOLETAS:
				return getConjuntocoletas();
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
			case LogmetamodelPackage.CONTROL_SCHEMA__CS_ID:
				setCsID((Integer)newValue);
				return;
			case LogmetamodelPackage.CONTROL_SCHEMA__CONJUNTOCOLETAS:
				setConjuntocoletas((ConjuntoColetas)newValue);
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
			case LogmetamodelPackage.CONTROL_SCHEMA__CS_ID:
				setCsID(CS_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.CONTROL_SCHEMA__CONJUNTOCOLETAS:
				setConjuntocoletas((ConjuntoColetas)null);
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
			case LogmetamodelPackage.CONTROL_SCHEMA__CS_ID:
				return csID != CS_ID_EDEFAULT;
			case LogmetamodelPackage.CONTROL_SCHEMA__CONJUNTOCOLETAS:
				return conjuntocoletas != null;
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
		result.append(" (csID: ");
		result.append(csID);
		result.append(')');
		return result.toString();
	}

} //ControlSchemaImpl

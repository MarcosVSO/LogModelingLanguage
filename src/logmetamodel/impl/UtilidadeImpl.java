/**
 */
package logmetamodel.impl;

import logmetamodel.LogmetamodelPackage;
import logmetamodel.Utilidade;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utilidade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.UtilidadeImpl#getColetaId <em>Coleta Id</em>}</li>
 *   <li>{@link logmetamodel.impl.UtilidadeImpl#getRotaId <em>Rota Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilidadeImpl extends MinimalEObjectImpl.Container implements Utilidade {
	/**
	 * The default value of the '{@link #getColetaId() <em>Coleta Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColetaId()
	 * @generated
	 * @ordered
	 */
	protected static final int COLETA_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColetaId() <em>Coleta Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColetaId()
	 * @generated
	 * @ordered
	 */
	protected int coletaId = COLETA_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotaId() <em>Rota Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotaId()
	 * @generated
	 * @ordered
	 */
	protected static final int ROTA_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRotaId() <em>Rota Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotaId()
	 * @generated
	 * @ordered
	 */
	protected int rotaId = ROTA_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilidadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.UTILIDADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColetaId() {
		return coletaId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColetaId(int newColetaId) {
		int oldColetaId = coletaId;
		coletaId = newColetaId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.UTILIDADE__COLETA_ID, oldColetaId, coletaId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRotaId() {
		return rotaId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotaId(int newRotaId) {
		int oldRotaId = rotaId;
		rotaId = newRotaId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.UTILIDADE__ROTA_ID, oldRotaId, rotaId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogmetamodelPackage.UTILIDADE__COLETA_ID:
				return getColetaId();
			case LogmetamodelPackage.UTILIDADE__ROTA_ID:
				return getRotaId();
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
			case LogmetamodelPackage.UTILIDADE__COLETA_ID:
				setColetaId((Integer)newValue);
				return;
			case LogmetamodelPackage.UTILIDADE__ROTA_ID:
				setRotaId((Integer)newValue);
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
			case LogmetamodelPackage.UTILIDADE__COLETA_ID:
				setColetaId(COLETA_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.UTILIDADE__ROTA_ID:
				setRotaId(ROTA_ID_EDEFAULT);
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
			case LogmetamodelPackage.UTILIDADE__COLETA_ID:
				return coletaId != COLETA_ID_EDEFAULT;
			case LogmetamodelPackage.UTILIDADE__ROTA_ID:
				return rotaId != ROTA_ID_EDEFAULT;
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
		result.append(" (coletaId: ");
		result.append(coletaId);
		result.append(", rotaId: ");
		result.append(rotaId);
		result.append(')');
		return result.toString();
	}

} //UtilidadeImpl

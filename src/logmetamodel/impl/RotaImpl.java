/**
 */
package logmetamodel.impl;

import java.util.Collection;

import logmetamodel.LogmetamodelPackage;
import logmetamodel.Rota;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rota</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.RotaImpl#getRotaId <em>Rota Id</em>}</li>
 *   <li>{@link logmetamodel.impl.RotaImpl#getCoordenadas <em>Coordenadas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotaImpl extends MinimalEObjectImpl.Container implements Rota {
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
	 * The cached value of the '{@link #getCoordenadas() <em>Coordenadas</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenadas()
	 * @generated
	 * @ordered
	 */
	protected EList<String> coordenadas;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.ROTA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.ROTA__ROTA_ID, oldRotaId, rotaId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCoordenadas() {
		if (coordenadas == null) {
			coordenadas = new EDataTypeUniqueEList<String>(String.class, this, LogmetamodelPackage.ROTA__COORDENADAS);
		}
		return coordenadas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogmetamodelPackage.ROTA__ROTA_ID:
				return getRotaId();
			case LogmetamodelPackage.ROTA__COORDENADAS:
				return getCoordenadas();
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
			case LogmetamodelPackage.ROTA__ROTA_ID:
				setRotaId((Integer)newValue);
				return;
			case LogmetamodelPackage.ROTA__COORDENADAS:
				getCoordenadas().clear();
				getCoordenadas().addAll((Collection<? extends String>)newValue);
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
			case LogmetamodelPackage.ROTA__ROTA_ID:
				setRotaId(ROTA_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.ROTA__COORDENADAS:
				getCoordenadas().clear();
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
			case LogmetamodelPackage.ROTA__ROTA_ID:
				return rotaId != ROTA_ID_EDEFAULT;
			case LogmetamodelPackage.ROTA__COORDENADAS:
				return coordenadas != null && !coordenadas.isEmpty();
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
		result.append(" (rotaId: ");
		result.append(rotaId);
		result.append(", coordenadas: ");
		result.append(coordenadas);
		result.append(')');
		return result.toString();
	}
	
	
	public void setCoordenadas(EList<String> coordenadas) {
		this.coordenadas = coordenadas;
	}

} //RotaImpl

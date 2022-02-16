/**
 */
package logmetamodel.impl;

import java.util.Collection;

import logmetamodel.ConjuntoCusto;
import logmetamodel.LogmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjunto Custo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.ConjuntoCustoImpl#getConjuntoCustoId <em>Conjunto Custo Id</em>}</li>
 *   <li>{@link logmetamodel.impl.ConjuntoCustoImpl#getRestricaoId <em>Restricao Id</em>}</li>
 *   <li>{@link logmetamodel.impl.ConjuntoCustoImpl#getCustosRotas <em>Custos Rotas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjuntoCustoImpl extends MinimalEObjectImpl.Container implements ConjuntoCusto {
	/**
	 * The default value of the '{@link #getConjuntoCustoId() <em>Conjunto Custo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjuntoCustoId()
	 * @generated
	 * @ordered
	 */
	protected static final int CONJUNTO_CUSTO_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConjuntoCustoId() <em>Conjunto Custo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjuntoCustoId()
	 * @generated
	 * @ordered
	 */
	protected int conjuntoCustoId = CONJUNTO_CUSTO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestricaoId() <em>Restricao Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestricaoId()
	 * @generated
	 * @ordered
	 */
	protected static final int RESTRICAO_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRestricaoId() <em>Restricao Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestricaoId()
	 * @generated
	 * @ordered
	 */
	protected int restricaoId = RESTRICAO_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustosRotas() <em>Custos Rotas</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustosRotas()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> custosRotas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjuntoCustoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.CONJUNTO_CUSTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConjuntoCustoId() {
		return conjuntoCustoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConjuntoCustoId(int newConjuntoCustoId) {
		int oldConjuntoCustoId = conjuntoCustoId;
		conjuntoCustoId = newConjuntoCustoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.CONJUNTO_CUSTO__CONJUNTO_CUSTO_ID, oldConjuntoCustoId, conjuntoCustoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRestricaoId() {
		return restricaoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestricaoId(int newRestricaoId) {
		int oldRestricaoId = restricaoId;
		restricaoId = newRestricaoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.CONJUNTO_CUSTO__RESTRICAO_ID, oldRestricaoId, restricaoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getCustosRotas() {
		if (custosRotas == null) {
			custosRotas = new EDataTypeUniqueEList<Float>(Float.class, this, LogmetamodelPackage.CONJUNTO_CUSTO__CUSTOS_ROTAS);
		}
		return custosRotas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogmetamodelPackage.CONJUNTO_CUSTO__CONJUNTO_CUSTO_ID:
				return getConjuntoCustoId();
			case LogmetamodelPackage.CONJUNTO_CUSTO__RESTRICAO_ID:
				return getRestricaoId();
			case LogmetamodelPackage.CONJUNTO_CUSTO__CUSTOS_ROTAS:
				return getCustosRotas();
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
			case LogmetamodelPackage.CONJUNTO_CUSTO__CONJUNTO_CUSTO_ID:
				setConjuntoCustoId((Integer)newValue);
				return;
			case LogmetamodelPackage.CONJUNTO_CUSTO__RESTRICAO_ID:
				setRestricaoId((Integer)newValue);
				return;
			case LogmetamodelPackage.CONJUNTO_CUSTO__CUSTOS_ROTAS:
				getCustosRotas().clear();
				getCustosRotas().addAll((Collection<? extends Float>)newValue);
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
			case LogmetamodelPackage.CONJUNTO_CUSTO__CONJUNTO_CUSTO_ID:
				setConjuntoCustoId(CONJUNTO_CUSTO_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.CONJUNTO_CUSTO__RESTRICAO_ID:
				setRestricaoId(RESTRICAO_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.CONJUNTO_CUSTO__CUSTOS_ROTAS:
				getCustosRotas().clear();
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
			case LogmetamodelPackage.CONJUNTO_CUSTO__CONJUNTO_CUSTO_ID:
				return conjuntoCustoId != CONJUNTO_CUSTO_ID_EDEFAULT;
			case LogmetamodelPackage.CONJUNTO_CUSTO__RESTRICAO_ID:
				return restricaoId != RESTRICAO_ID_EDEFAULT;
			case LogmetamodelPackage.CONJUNTO_CUSTO__CUSTOS_ROTAS:
				return custosRotas != null && !custosRotas.isEmpty();
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
		result.append(" (ConjuntoCustoId: ");
		result.append(conjuntoCustoId);
		result.append(", restricaoId: ");
		result.append(restricaoId);
		result.append(", custosRotas: ");
		result.append(custosRotas);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public void setCustosRotas(EList<Float> custos) {
		this.custosRotas = custos;
	}

} //ConjuntoCustoImpl

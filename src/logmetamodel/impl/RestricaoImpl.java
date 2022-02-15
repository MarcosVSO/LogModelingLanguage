/**
 */
package logmetamodel.impl;

import logmetamodel.LogmetamodelPackage;
import logmetamodel.Restricao;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restricao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.RestricaoImpl#getRestricaoId <em>Restricao Id</em>}</li>
 *   <li>{@link logmetamodel.impl.RestricaoImpl#getDescricao <em>Descricao</em>}</li>
 *   <li>{@link logmetamodel.impl.RestricaoImpl#getPeso <em>Peso</em>}</li>
 *   <li>{@link logmetamodel.impl.RestricaoImpl#getValorMaximo <em>Valor Maximo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestricaoImpl extends MinimalEObjectImpl.Container implements Restricao {
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
	 * The default value of the '{@link #getDescricao() <em>Descricao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescricao()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRICAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescricao() <em>Descricao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescricao()
	 * @generated
	 * @ordered
	 */
	protected String descricao = DESCRICAO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeso() <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeso()
	 * @generated
	 * @ordered
	 */
	protected static final int PESO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeso() <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeso()
	 * @generated
	 * @ordered
	 */
	protected int peso = PESO_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorMaximo() <em>Valor Maximo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorMaximo()
	 * @generated
	 * @ordered
	 */
	protected static final float VALOR_MAXIMO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValorMaximo() <em>Valor Maximo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorMaximo()
	 * @generated
	 * @ordered
	 */
	protected float valorMaximo = VALOR_MAXIMO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestricaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.RESTRICAO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.RESTRICAO__RESTRICAO_ID, oldRestricaoId, restricaoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescricao(String newDescricao) {
		String oldDescricao = descricao;
		descricao = newDescricao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.RESTRICAO__DESCRICAO, oldDescricao, descricao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeso(int newPeso) {
		int oldPeso = peso;
		peso = newPeso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.RESTRICAO__PESO, oldPeso, peso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValorMaximo() {
		return valorMaximo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorMaximo(float newValorMaximo) {
		float oldValorMaximo = valorMaximo;
		valorMaximo = newValorMaximo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.RESTRICAO__VALOR_MAXIMO, oldValorMaximo, valorMaximo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogmetamodelPackage.RESTRICAO__RESTRICAO_ID:
				return getRestricaoId();
			case LogmetamodelPackage.RESTRICAO__DESCRICAO:
				return getDescricao();
			case LogmetamodelPackage.RESTRICAO__PESO:
				return getPeso();
			case LogmetamodelPackage.RESTRICAO__VALOR_MAXIMO:
				return getValorMaximo();
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
			case LogmetamodelPackage.RESTRICAO__RESTRICAO_ID:
				setRestricaoId((Integer)newValue);
				return;
			case LogmetamodelPackage.RESTRICAO__DESCRICAO:
				setDescricao((String)newValue);
				return;
			case LogmetamodelPackage.RESTRICAO__PESO:
				setPeso((Integer)newValue);
				return;
			case LogmetamodelPackage.RESTRICAO__VALOR_MAXIMO:
				setValorMaximo((Float)newValue);
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
			case LogmetamodelPackage.RESTRICAO__RESTRICAO_ID:
				setRestricaoId(RESTRICAO_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.RESTRICAO__DESCRICAO:
				setDescricao(DESCRICAO_EDEFAULT);
				return;
			case LogmetamodelPackage.RESTRICAO__PESO:
				setPeso(PESO_EDEFAULT);
				return;
			case LogmetamodelPackage.RESTRICAO__VALOR_MAXIMO:
				setValorMaximo(VALOR_MAXIMO_EDEFAULT);
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
			case LogmetamodelPackage.RESTRICAO__RESTRICAO_ID:
				return restricaoId != RESTRICAO_ID_EDEFAULT;
			case LogmetamodelPackage.RESTRICAO__DESCRICAO:
				return DESCRICAO_EDEFAULT == null ? descricao != null : !DESCRICAO_EDEFAULT.equals(descricao);
			case LogmetamodelPackage.RESTRICAO__PESO:
				return peso != PESO_EDEFAULT;
			case LogmetamodelPackage.RESTRICAO__VALOR_MAXIMO:
				return valorMaximo != VALOR_MAXIMO_EDEFAULT;
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
		result.append(" (restricaoId: ");
		result.append(restricaoId);
		result.append(", descricao: ");
		result.append(descricao);
		result.append(", peso: ");
		result.append(peso);
		result.append(", valorMaximo: ");
		result.append(valorMaximo);
		result.append(')');
		return result.toString();
	}

} //RestricaoImpl

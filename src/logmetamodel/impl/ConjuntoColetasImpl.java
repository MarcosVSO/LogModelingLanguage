/**
 */
package logmetamodel.impl;

import java.net.http.HttpClient;
import java.util.Collection;
import java.util.Random;

import logmetamodel.Coleta;
import logmetamodel.ConjuntoColetas;
import logmetamodel.LogmetamodelFactory;
import logmetamodel.LogmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.gson.Gson;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjunto Coletas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.ConjuntoColetasImpl#getColeta <em>Coleta</em>}</li>
 *   <li>{@link logmetamodel.impl.ConjuntoColetasImpl#getConjuntoColetasID <em>Conjunto Coletas ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjuntoColetasImpl extends MinimalEObjectImpl.Container implements ConjuntoColetas {
	/**
	 * The cached value of the '{@link #getColeta() <em>Coleta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColeta()
	 * @generated
	 * @ordered
	 */
	protected EList<Coleta> coleta;

	/**
	 * The default value of the '{@link #getConjuntoColetasID() <em>Conjunto Coletas ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjuntoColetasID()
	 * @generated
	 * @ordered
	 */
	protected static final int CONJUNTO_COLETAS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConjuntoColetasID() <em>Conjunto Coletas ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjuntoColetasID()
	 * @generated
	 * @ordered
	 */
	protected int conjuntoColetasID = CONJUNTO_COLETAS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjuntoColetasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.CONJUNTO_COLETAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coleta> getColeta() {
		if (coleta == null) {
			coleta = new EObjectContainmentEList<Coleta>(Coleta.class, this, LogmetamodelPackage.CONJUNTO_COLETAS__COLETA);
		}
		return coleta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConjuntoColetasID() {
		return conjuntoColetasID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConjuntoColetasID(int newConjuntoColetasID) {
		int oldConjuntoColetasID = conjuntoColetasID;
		conjuntoColetasID = newConjuntoColetasID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.CONJUNTO_COLETAS__CONJUNTO_COLETAS_ID, oldConjuntoColetasID, conjuntoColetasID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmetamodelPackage.CONJUNTO_COLETAS__COLETA:
				return ((InternalEList<?>)getColeta()).basicRemove(otherEnd, msgs);
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
			case LogmetamodelPackage.CONJUNTO_COLETAS__COLETA:
				return getColeta();
			case LogmetamodelPackage.CONJUNTO_COLETAS__CONJUNTO_COLETAS_ID:
				return getConjuntoColetasID();
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
			case LogmetamodelPackage.CONJUNTO_COLETAS__COLETA:
				getColeta().clear();
				getColeta().addAll((Collection<? extends Coleta>)newValue);
				return;
			case LogmetamodelPackage.CONJUNTO_COLETAS__CONJUNTO_COLETAS_ID:
				setConjuntoColetasID((Integer)newValue);
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
			case LogmetamodelPackage.CONJUNTO_COLETAS__COLETA:
				getColeta().clear();
				return;
			case LogmetamodelPackage.CONJUNTO_COLETAS__CONJUNTO_COLETAS_ID:
				setConjuntoColetasID(CONJUNTO_COLETAS_ID_EDEFAULT);
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
			case LogmetamodelPackage.CONJUNTO_COLETAS__COLETA:
				return coleta != null && !coleta.isEmpty();
			case LogmetamodelPackage.CONJUNTO_COLETAS__CONJUNTO_COLETAS_ID:
				return conjuntoColetasID != CONJUNTO_COLETAS_ID_EDEFAULT;
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
		result.append(" (conjuntoColetasID: ");
		result.append(conjuntoColetasID);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public void createConjuntoColetas(Integer qtdColetas) {
		EList<Coleta> coletasGeradas = new BasicEList<Coleta>();
		
		float maxLat = (float) -16.6296;
		float minLat = (float) -16.7638;
		float maxLong = (float) -49.2194;
		float minLong = (float) -49.3334;
		
		Random rand = new Random();
		
		for (int i = 0; i < qtdColetas; i++) {
			String coordinate = "";
			coordinate += Math.random()*(maxLong - minLong) + minLong;
			coordinate += ",";
			coordinate += Math.random()*(maxLat - minLat) + minLat;
						
			Coleta coletaGerada = LogmetamodelFactory.eINSTANCE.createColeta();
			coletaGerada.setColetaId(i);
			coletaGerada.setCoordernada(coordinate);
			
			coletasGeradas.add(coletaGerada);
		}
		
		this.coleta = coletasGeradas;
	}
} //ConjuntoColetasImpl

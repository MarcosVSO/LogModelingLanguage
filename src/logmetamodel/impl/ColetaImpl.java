/**
 */
package logmetamodel.impl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collection;

import logmetamodel.Coleta;
import logmetamodel.ConjuntoCusto;
import logmetamodel.LogmetamodelFactory;
import logmetamodel.LogmetamodelPackage;
import logmetamodel.Restricao;
import logmetamodel.Rota;
import logmetamodel.Utilidade;
import logmetamodel.application.Route;

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
 * An implementation of the model object '<em><b>Coleta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.ColetaImpl#getColetaId <em>Coleta Id</em>}</li>
 *   <li>{@link logmetamodel.impl.ColetaImpl#getCoordernada <em>Coordernada</em>}</li>
 *   <li>{@link logmetamodel.impl.ColetaImpl#getUtilidade <em>Utilidade</em>}</li>
 *   <li>{@link logmetamodel.impl.ColetaImpl#getConjuntocusto <em>Conjuntocusto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColetaImpl extends MinimalEObjectImpl.Container implements Coleta {
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
	 * The default value of the '{@link #getCoordernada() <em>Coordernada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordernada()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDERNADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordernada() <em>Coordernada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordernada()
	 * @generated
	 * @ordered
	 */
	protected String coordernada = COORDERNADA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUtilidade() <em>Utilidade</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilidade()
	 * @generated
	 * @ordered
	 */
	protected EList<Utilidade> utilidade;

	/**
	 * The cached value of the '{@link #getConjuntocusto() <em>Conjuntocusto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjuntocusto()
	 * @generated
	 * @ordered
	 */
	protected EList<ConjuntoCusto> conjuntocusto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.COLETA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.COLETA__COLETA_ID, oldColetaId, coletaId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoordernada() {
		return coordernada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordernada(String newCoordernada) {
		String oldCoordernada = coordernada;
		coordernada = newCoordernada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.COLETA__COORDERNADA, oldCoordernada, coordernada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Utilidade> getUtilidade() {
		if (utilidade == null) {
			utilidade = new EObjectContainmentEList<Utilidade>(Utilidade.class, this, LogmetamodelPackage.COLETA__UTILIDADE);
		}
		return utilidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConjuntoCusto> getConjuntocusto() {
		if (conjuntocusto == null) {
			conjuntocusto = new EObjectContainmentEList<ConjuntoCusto>(ConjuntoCusto.class, this, LogmetamodelPackage.COLETA__CONJUNTOCUSTO);
		}
		return conjuntocusto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmetamodelPackage.COLETA__UTILIDADE:
				return ((InternalEList<?>)getUtilidade()).basicRemove(otherEnd, msgs);
			case LogmetamodelPackage.COLETA__CONJUNTOCUSTO:
				return ((InternalEList<?>)getConjuntocusto()).basicRemove(otherEnd, msgs);
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
			case LogmetamodelPackage.COLETA__COLETA_ID:
				return getColetaId();
			case LogmetamodelPackage.COLETA__COORDERNADA:
				return getCoordernada();
			case LogmetamodelPackage.COLETA__UTILIDADE:
				return getUtilidade();
			case LogmetamodelPackage.COLETA__CONJUNTOCUSTO:
				return getConjuntocusto();
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
			case LogmetamodelPackage.COLETA__COLETA_ID:
				setColetaId((Integer)newValue);
				return;
			case LogmetamodelPackage.COLETA__COORDERNADA:
				setCoordernada((String)newValue);
				return;
			case LogmetamodelPackage.COLETA__UTILIDADE:
				getUtilidade().clear();
				getUtilidade().addAll((Collection<? extends Utilidade>)newValue);
				return;
			case LogmetamodelPackage.COLETA__CONJUNTOCUSTO:
				getConjuntocusto().clear();
				getConjuntocusto().addAll((Collection<? extends ConjuntoCusto>)newValue);
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
			case LogmetamodelPackage.COLETA__COLETA_ID:
				setColetaId(COLETA_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.COLETA__COORDERNADA:
				setCoordernada(COORDERNADA_EDEFAULT);
				return;
			case LogmetamodelPackage.COLETA__UTILIDADE:
				getUtilidade().clear();
				return;
			case LogmetamodelPackage.COLETA__CONJUNTOCUSTO:
				getConjuntocusto().clear();
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
			case LogmetamodelPackage.COLETA__COLETA_ID:
				return coletaId != COLETA_ID_EDEFAULT;
			case LogmetamodelPackage.COLETA__COORDERNADA:
				return COORDERNADA_EDEFAULT == null ? coordernada != null : !COORDERNADA_EDEFAULT.equals(coordernada);
			case LogmetamodelPackage.COLETA__UTILIDADE:
				return utilidade != null && !utilidade.isEmpty();
			case LogmetamodelPackage.COLETA__CONJUNTOCUSTO:
				return conjuntocusto != null && !conjuntocusto.isEmpty();
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
		result.append(", coordernada: ");
		result.append(coordernada);
		result.append(')');
		return result.toString();
	}
	
	public void setConjuntoCusto(EList<Rota> rotas, EList<Restricao> restricoes) throws IOException, InterruptedException {
		EList<ConjuntoCusto> listaConjuntoCusto = new BasicEList<ConjuntoCusto>();
		for(Restricao r : restricoes) {
			ConjuntoCusto conjuntoCustosCalculados = calculateConjuntoCusto(rotas,r);
			listaConjuntoCusto.add(conjuntoCustosCalculados);
		}
		this.conjuntocusto = listaConjuntoCusto;
	}
	
	public ConjuntoCusto calculateConjuntoCusto(EList<Rota> rotas, Restricao restricao) throws IOException, InterruptedException {
		ConjuntoCusto custoRotas = LogmetamodelFactory.eINSTANCE.createConjuntoCusto();
		custoRotas.setRestricaoId(restricao.getRestricaoId());
		EList<Float> custosCalculados = new BasicEList<Float>();
		switch (restricao.getRestricaoId()) {
			case 0:
				custosCalculados = calculateCustoDistancia(rotas,restricao);
			break;
			case 1:
				custosCalculados = calculateCustoTempo(rotas,restricao);
				break;
			case 2:
				custosCalculados = calculateCustoDesvio(rotas, restricao);
				break;
		}
		
		custoRotas.setCustosRotas(custosCalculados);
		return custoRotas;	
	}
	
	public EList<Float> calculateCustoDistancia(EList<Rota> rotas, Restricao restricao) throws IOException, InterruptedException{
		EList<Float> custoDistanciaRotas = new BasicEList<Float>();
		
		float minDistance = 1000000;
		Gson gson = new Gson();
		var client = HttpClient.newHttpClient();
		
		for (Rota r : rotas) {
			for (String coord : r.getCoordenadas()) {
				//System.out.println(coord[0]+" , "+coord[1]);
				
				HttpRequest request = HttpRequest.newBuilder()
				          .uri(URI.create("http://0.0.0.0:5000/route/v1/driving/"+coord+";"+this.getCoordernada()+"?geometries=geojson"))
				          .header("Accept", "application/json")
				          .build();
				
				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
				
				Route rotaAux = gson.fromJson(response.body(),Route.class);
				//System.out.println(rotaAux.getRoutesDistance());
				if (Float.parseFloat(rotaAux.getRoutesDistance()) < minDistance) {
					minDistance = Float.parseFloat(rotaAux.getRoutesDistance());
				}
			}
			custoDistanciaRotas.add(minDistance);
			minDistance = 1000000;
		}
		
		return custoDistanciaRotas;
	}
	
	public EList<Float> calculateCustoTempo(EList<Rota> rotas, Restricao restricao){
		EList<Float> custoTempoRotas = new BasicEList<Float>();
		return custoTempoRotas;
	} 
	
	public EList<Float> calculateCustoDesvio(EList<Rota> rotas, Restricao restricao){
		EList<Float> custoDesvioRotas = new BasicEList<Float>();
		return custoDesvioRotas;
	} 
}  

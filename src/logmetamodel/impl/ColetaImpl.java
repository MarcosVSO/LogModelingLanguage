/**
 */
package logmetamodel.impl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
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
			conjuntoCustosCalculados.normalizeCustos();
			listaConjuntoCusto.add(conjuntoCustosCalculados);
		}
		this.conjuntocusto = listaConjuntoCusto;
	}
	
	public ConjuntoCusto calculateConjuntoCusto(EList<Rota> rotas, Restricao restricao) throws IOException, InterruptedException {
		ConjuntoCusto custoRotas = LogmetamodelFactory.eINSTANCE.createConjuntoCusto();
		custoRotas.setRestricaoId(restricao.getRestricaoId());
		custoRotas.setConjuntoCustoId(this.getColetaId());
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
		
		Gson gson = new Gson();
		var client = HttpClient.newHttpClient();
		int i=0;
		
		for (Rota r : rotas) {
			i=0;
			Float[] distancias = new Float[r.getCoordenadas().size()];
			for (String coord : r.getCoordenadas()) {
				
				HttpRequest request = HttpRequest.newBuilder()
				          .uri(URI.create("http://0.0.0.0:5000/route/v1/driving/"+coord+";"+this.getCoordernada()+"?geometries=geojson"))
				          .header("Accept", "application/json")
				          .build();
				
				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
				
				Route rotaAux = gson.fromJson(response.body(),Route.class);
				
				distancias[i]= Float.valueOf(rotaAux.getRoutesDistance());
				i++;
			}
			Arrays.sort(distancias);
			custoDistanciaRotas.add(distancias[distancias.length -1]);
		}
		
		return custoDistanciaRotas;
	}
	
	public EList<Float> calculateCustoTempo(EList<Rota> rotas, Restricao restricao) throws IOException, InterruptedException{
		EList<Float> custoTempoRotas = new BasicEList<Float>();
		
		Gson gson = new Gson();
		var client = HttpClient.newHttpClient();
		int i=0;
		for (Rota r : rotas) {
			i=0;
			Float[] tempos = new Float[r.getCoordenadas().size()];
			for (String coord : r.getCoordenadas()) {
				
						HttpRequest request = HttpRequest.newBuilder()
				          .uri(URI.create("http://0.0.0.0:5000/route/v1/driving/"+coord+";"+this.getCoordernada()+"?geometries=geojson"))
				          .header("Accept", "application/json")
				          .build();
						
				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
				Route rotaAux = gson.fromJson(response.body(),Route.class);
				//System.out.println(rotaAux.getRoutesDistance());
				tempos[i] = Float.valueOf(rotaAux.getRoutesDuration());
				i++;
			}
			Arrays.sort(tempos);
			custoTempoRotas.add((float)tempos[tempos.length -1]);
		}
		return custoTempoRotas;
	} 
	
	public EList<Float> calculateCustoDesvio(EList<Rota> rotas, Restricao restricao) throws IOException, InterruptedException{
		EList<Float> custoDesvioRotas = new BasicEList<Float>();
		Gson gson = new Gson();
		var client = HttpClient.newHttpClient();
		
		for (Rota r : rotas) {
			EList<String> entrega = r.getCoordenadas();
			Float[] desvios = new Float[entrega.size() - 1];
			
			for (int i = 0; i < entrega.size() - 1; i++) {
				//System.out.println(ent);
				
				HttpRequest request1 = HttpRequest.newBuilder()
						.uri(URI.create("http://0.0.0.0:5000/route/v1/driving/"+entrega.get(i)+";"+this.getCoordernada()+"?geometries=geojson"))
						.header("Accept", "application/json")
						.build();
				HttpResponse<String> response1 = client.send(request1, HttpResponse.BodyHandlers.ofString());
				Route rotaAux1 = gson.fromJson(response1.body(), Route.class);
				
				HttpRequest request2 = HttpRequest.newBuilder()
						.uri(URI.create("http://0.0.0.0:5000/route/v1/driving/"+this.getCoordernada()+";"+entrega.get(i+1)+"?geometries=geojson"))
						.header("Accept", "application/json")
						.build();
				HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());
				Route rotaAux2 = gson.fromJson(response1.body(), Route.class);
				
				float somaDistanciais = Float.parseFloat(rotaAux1.getRoutesDistance()) + Float.parseFloat(rotaAux2.getRoutesDistance());
				desvios[i] = somaDistanciais;
			}
			Arrays.sort(desvios);
			custoDesvioRotas.add(desvios[desvios.length -1]);
		}
		return custoDesvioRotas;
	}
	
	@Override
	public void calculateUtilidade(EList<Restricao> restricoes) {
		EList<Utilidade> utilidades = new BasicEList<Utilidade>();
		EList<Float> utilidadesCalculadas = new BasicEList<Float>();
		
		int i = 0;
		for (ConjuntoCusto custos : this.conjuntocusto) {
			utilidadesCalculadas.add((float)0);
			for (Float c : custos.getCustosRotas()) {
				System.out.println(c*restricoes.get(i).getPeso());
				utilidadesCalculadas.set(i,utilidadesCalculadas.get(i)+c*restricoes.get(i).getPeso());
			}
			i++;
		}
		
		i = 0;
		for (Float utilidadeCalculada : utilidadesCalculadas) {
			Utilidade auxUtil = LogmetamodelFactory.eINSTANCE.createUtilidade();
			auxUtil.setColetaId(this.coletaId);
			auxUtil.setRotaId(i);
			auxUtil.setUtilidade(utilidadeCalculada);
			utilidades.add(auxUtil);
			i++;
		}
		
		this.utilidade = utilidades;
	}
}  

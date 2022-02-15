/**
 */
package logmetamodel.impl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import logmetamodel.ConjuntoRotas;
import logmetamodel.LogmetamodelFactory;
import logmetamodel.LogmetamodelPackage;
import logmetamodel.Rota;
import logmetamodel.application.Route;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
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
 * An implementation of the model object '<em><b>Conjunto Rotas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.impl.ConjuntoRotasImpl#getConjuntoRotasId <em>Conjunto Rotas Id</em>}</li>
 *   <li>{@link logmetamodel.impl.ConjuntoRotasImpl#getRota <em>Rota</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjuntoRotasImpl extends MinimalEObjectImpl.Container implements ConjuntoRotas {
	/**
	 * The default value of the '{@link #getConjuntoRotasId() <em>Conjunto Rotas Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjuntoRotasId()
	 * @generated
	 * @ordered
	 */
	protected static final int CONJUNTO_ROTAS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConjuntoRotasId() <em>Conjunto Rotas Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjuntoRotasId()
	 * @generated
	 * @ordered
	 */
	protected int conjuntoRotasId = CONJUNTO_ROTAS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRota() <em>Rota</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRota()
	 * @generated
	 * @ordered
	 */
	protected EList<Rota> rota;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjuntoRotasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.CONJUNTO_ROTAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConjuntoRotasId() {
		return conjuntoRotasId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConjuntoRotasId(int newConjuntoRotasId) {
		int oldConjuntoRotasId = conjuntoRotasId;
		conjuntoRotasId = newConjuntoRotasId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.CONJUNTO_ROTAS__CONJUNTO_ROTAS_ID, oldConjuntoRotasId, conjuntoRotasId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rota> getRota() {
		if (rota == null) {
			rota = new EObjectContainmentEList<Rota>(Rota.class, this, LogmetamodelPackage.CONJUNTO_ROTAS__ROTA);
		}
		return rota;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmetamodelPackage.CONJUNTO_ROTAS__ROTA:
				return ((InternalEList<?>)getRota()).basicRemove(otherEnd, msgs);
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
			case LogmetamodelPackage.CONJUNTO_ROTAS__CONJUNTO_ROTAS_ID:
				return getConjuntoRotasId();
			case LogmetamodelPackage.CONJUNTO_ROTAS__ROTA:
				return getRota();
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
			case LogmetamodelPackage.CONJUNTO_ROTAS__CONJUNTO_ROTAS_ID:
				setConjuntoRotasId((Integer)newValue);
				return;
			case LogmetamodelPackage.CONJUNTO_ROTAS__ROTA:
				getRota().clear();
				getRota().addAll((Collection<? extends Rota>)newValue);
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
			case LogmetamodelPackage.CONJUNTO_ROTAS__CONJUNTO_ROTAS_ID:
				setConjuntoRotasId(CONJUNTO_ROTAS_ID_EDEFAULT);
				return;
			case LogmetamodelPackage.CONJUNTO_ROTAS__ROTA:
				getRota().clear();
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
			case LogmetamodelPackage.CONJUNTO_ROTAS__CONJUNTO_ROTAS_ID:
				return conjuntoRotasId != CONJUNTO_ROTAS_ID_EDEFAULT;
			case LogmetamodelPackage.CONJUNTO_ROTAS__ROTA:
				return rota != null && !rota.isEmpty();
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
		result.append(" (conjuntoRotasId: ");
		result.append(conjuntoRotasId);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public ArrayList<String[]> generateRoutes(int qtdRotas, int qtdPontosEntrega) throws Exception, InterruptedException {
		float maxLat = (float) -16.6296;
		float minLat = (float) -16.7638;
		float maxLong = (float) -49.2194;
		float minLong = (float) -49.3334;
		
		Gson gson = new Gson();
		var client = HttpClient.newHttpClient();
		Random rand = new Random();
		int index;
		
		String[] randomPoints = new String[qtdRotas];
		ArrayList<String[]> rotas = new ArrayList<String[]>();
		EList<Rota> rotasMeta = new BasicEList<Rota>();
		String centroDeDistribuicao = "-49.2576,-16.6800";
				
		for (int i = 0; i < qtdRotas; i++) {
			String coordinate = "";
			coordinate += Math.random()*(maxLong - minLong) + minLong;
			coordinate += ",";
			coordinate += Math.random()*(maxLat - minLat) + minLat;
			
			randomPoints[i] =  String.valueOf(coordinate);
		}
		
		//System.out.println("Ponto Inicial: "+centroDeDistribuicao);
		//System.out.println("Ponto Final: "+randomPoints[0]);
		
		for (int i = 0; i < qtdRotas; i++) {
			HttpRequest request = HttpRequest.newBuilder()
			          .uri(URI.create("http://0.0.0.0:5000/route/v1/driving/"+centroDeDistribuicao+";"+randomPoints[i]+"?geometries=geojson"))
			          .header("Accept", "application/json")
			          .build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			Route rotaAux = gson.fromJson(response.body(),Route.class);
			
			ArrayList<String[]> coordenadas = rotaAux.getCoordenadasRota();
			
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			Random randomGenerator = new Random();
			while (numbers.size() < qtdPontosEntrega) {
				 int random = randomGenerator .nextInt(coordenadas.size() - 1) + 1;
				 if (!numbers.contains(random)) {
				        numbers.add(random);
			     }
			}
			
			int[] sortedIndexList = sortIndex(numbers);
			
			String[] rotaCalculada = new String[qtdPontosEntrega + 2];
			rotaCalculada[0] = centroDeDistribuicao;
			for (int k = 1; k < qtdPontosEntrega + 1 ; k++) {
				rotaCalculada[k] = coordenadas.get(sortedIndexList[k - 1])[0]+","+coordenadas.get(sortedIndexList[k - 1])[1];
			}
			rotaCalculada[qtdPontosEntrega + 1] = randomPoints[i];
			
			String rotaString = "";
			for (String coord : rotaCalculada) {
				rotaString+=coord +  "|"; 
			}
			//System.out.println(rotaString);
			
			rotas.add(rotaCalculada);
			
			Rota rotaCriada = LogmetamodelFactory.eINSTANCE.createRota();
			rotaCriada.setRotaId(i);
			rotaCriada.setCoordenadas(convertArrayStringToElist(rotaCalculada));
			rotasMeta.add(rotaCriada);
		}
		
		this.rota = rotasMeta;
		return rotas;
	}
	
	public int[] sortIndex(ArrayList<Integer> numbers){
		int[] listaAsc = new int[numbers.size()];
		int aux;
		
		for (int i = 0; i < numbers.size(); i++) {
			listaAsc[i] = numbers.get(i);
		}
		
		for (int i = 0; i < numbers.size() - 1 ; i++) {
			if (listaAsc[i] > listaAsc[i+1]) {
				aux = listaAsc[i];
				listaAsc[i] = listaAsc[i+1];
				listaAsc[i+1] = aux;
			}
		}
		return listaAsc;
	}
		
	public EList<String> convertArrayStringToElist(String[] coords){
		EList<String> listaCoordenadas = new BasicEList<String>();
		for (String c:coords) {
			listaCoordenadas.add(c);
		}
		return listaCoordenadas;
	}

} //ConjuntoRotasImpl

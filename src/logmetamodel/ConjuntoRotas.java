/**
 */
package logmetamodel;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjunto Rotas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.ConjuntoRotas#getConjuntoRotasId <em>Conjunto Rotas Id</em>}</li>
 *   <li>{@link logmetamodel.ConjuntoRotas#getRota <em>Rota</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getConjuntoRotas()
 * @model
 * @generated
 */
public interface ConjuntoRotas extends EObject {
	/**
	 * Returns the value of the '<em><b>Conjunto Rotas Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjunto Rotas Id</em>' attribute.
	 * @see #setConjuntoRotasId(int)
	 * @see logmetamodel.LogmetamodelPackage#getConjuntoRotas_ConjuntoRotasId()
	 * @model
	 * @generated
	 */
	int getConjuntoRotasId();

	/**
	 * Sets the value of the '{@link logmetamodel.ConjuntoRotas#getConjuntoRotasId <em>Conjunto Rotas Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjunto Rotas Id</em>' attribute.
	 * @see #getConjuntoRotasId()
	 * @generated
	 */
	void setConjuntoRotasId(int value);

	/**
	 * Returns the value of the '<em><b>Rota</b></em>' containment reference list.
	 * The list contents are of type {@link logmetamodel.Rota}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rota</em>' containment reference list.
	 * @see logmetamodel.LogmetamodelPackage#getConjuntoRotas_Rota()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rota> getRota();
	
	public ArrayList<String[]> generateRoutes(int qtdRotas, int qtdPontosEntrega)  throws Exception, InterruptedException;
} // ConjuntoRotas

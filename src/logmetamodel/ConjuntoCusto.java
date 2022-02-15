/**
 */
package logmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjunto Custo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.ConjuntoCusto#getConjuntoCustoId <em>Conjunto Custo Id</em>}</li>
 *   <li>{@link logmetamodel.ConjuntoCusto#getRestricaoId <em>Restricao Id</em>}</li>
 *   <li>{@link logmetamodel.ConjuntoCusto#getCustosRotas <em>Custos Rotas</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getConjuntoCusto()
 * @model
 * @generated
 */
public interface ConjuntoCusto extends EObject {
	/**
	 * Returns the value of the '<em><b>Conjunto Custo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjunto Custo Id</em>' attribute.
	 * @see #setConjuntoCustoId(int)
	 * @see logmetamodel.LogmetamodelPackage#getConjuntoCusto_ConjuntoCustoId()
	 * @model
	 * @generated
	 */
	int getConjuntoCustoId();

	/**
	 * Sets the value of the '{@link logmetamodel.ConjuntoCusto#getConjuntoCustoId <em>Conjunto Custo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjunto Custo Id</em>' attribute.
	 * @see #getConjuntoCustoId()
	 * @generated
	 */
	void setConjuntoCustoId(int value);

	/**
	 * Returns the value of the '<em><b>Restricao Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricao Id</em>' attribute.
	 * @see #setRestricaoId(int)
	 * @see logmetamodel.LogmetamodelPackage#getConjuntoCusto_RestricaoId()
	 * @model
	 * @generated
	 */
	int getRestricaoId();

	/**
	 * Sets the value of the '{@link logmetamodel.ConjuntoCusto#getRestricaoId <em>Restricao Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricao Id</em>' attribute.
	 * @see #getRestricaoId()
	 * @generated
	 */
	void setRestricaoId(int value);

	/**
	 * Returns the value of the '<em><b>Custos Rotas</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custos Rotas</em>' attribute list.
	 * @see logmetamodel.LogmetamodelPackage#getConjuntoCusto_CustosRotas()
	 * @model
	 * @generated
	 */
	EList<Float> getCustosRotas();

} // ConjuntoCusto

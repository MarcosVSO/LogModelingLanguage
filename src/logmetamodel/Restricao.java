/**
 */
package logmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restricao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.Restricao#getRestricaoId <em>Restricao Id</em>}</li>
 *   <li>{@link logmetamodel.Restricao#getDescricao <em>Descricao</em>}</li>
 *   <li>{@link logmetamodel.Restricao#getPeso <em>Peso</em>}</li>
 *   <li>{@link logmetamodel.Restricao#getValorMaximo <em>Valor Maximo</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getRestricao()
 * @model
 * @generated
 */
public interface Restricao extends EObject {
	/**
	 * Returns the value of the '<em><b>Restricao Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricao Id</em>' attribute.
	 * @see #setRestricaoId(int)
	 * @see logmetamodel.LogmetamodelPackage#getRestricao_RestricaoId()
	 * @model
	 * @generated
	 */
	int getRestricaoId();

	/**
	 * Sets the value of the '{@link logmetamodel.Restricao#getRestricaoId <em>Restricao Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricao Id</em>' attribute.
	 * @see #getRestricaoId()
	 * @generated
	 */
	void setRestricaoId(int value);

	/**
	 * Returns the value of the '<em><b>Descricao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descricao</em>' attribute.
	 * @see #setDescricao(String)
	 * @see logmetamodel.LogmetamodelPackage#getRestricao_Descricao()
	 * @model
	 * @generated
	 */
	String getDescricao();

	/**
	 * Sets the value of the '{@link logmetamodel.Restricao#getDescricao <em>Descricao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descricao</em>' attribute.
	 * @see #getDescricao()
	 * @generated
	 */
	void setDescricao(String value);

	/**
	 * Returns the value of the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peso</em>' attribute.
	 * @see #setPeso(int)
	 * @see logmetamodel.LogmetamodelPackage#getRestricao_Peso()
	 * @model
	 * @generated
	 */
	int getPeso();

	/**
	 * Sets the value of the '{@link logmetamodel.Restricao#getPeso <em>Peso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peso</em>' attribute.
	 * @see #getPeso()
	 * @generated
	 */
	void setPeso(int value);

	/**
	 * Returns the value of the '<em><b>Valor Maximo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Maximo</em>' attribute.
	 * @see #setValorMaximo(float)
	 * @see logmetamodel.LogmetamodelPackage#getRestricao_ValorMaximo()
	 * @model
	 * @generated
	 */
	float getValorMaximo();

	/**
	 * Sets the value of the '{@link logmetamodel.Restricao#getValorMaximo <em>Valor Maximo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Maximo</em>' attribute.
	 * @see #getValorMaximo()
	 * @generated
	 */
	void setValorMaximo(float value);

} // Restricao

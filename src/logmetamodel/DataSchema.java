/**
 */
package logmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.DataSchema#getRestricao <em>Restricao</em>}</li>
 *   <li>{@link logmetamodel.DataSchema#getDsID <em>Ds ID</em>}</li>
 *   <li>{@link logmetamodel.DataSchema#getCsID <em>Cs ID</em>}</li>
 *   <li>{@link logmetamodel.DataSchema#getConjuntorotas <em>Conjuntorotas</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getDataSchema()
 * @model
 * @generated
 */
public interface DataSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Restricao</b></em>' containment reference list.
	 * The list contents are of type {@link logmetamodel.Restricao}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricao</em>' containment reference list.
	 * @see logmetamodel.LogmetamodelPackage#getDataSchema_Restricao()
	 * @model containment="true"
	 * @generated
	 */
	EList<Restricao> getRestricao();

	/**
	 * Returns the value of the '<em><b>Ds ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ds ID</em>' attribute.
	 * @see #setDsID(int)
	 * @see logmetamodel.LogmetamodelPackage#getDataSchema_DsID()
	 * @model
	 * @generated
	 */
	int getDsID();

	/**
	 * Sets the value of the '{@link logmetamodel.DataSchema#getDsID <em>Ds ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ds ID</em>' attribute.
	 * @see #getDsID()
	 * @generated
	 */
	void setDsID(int value);

	/**
	 * Returns the value of the '<em><b>Cs ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs ID</em>' attribute.
	 * @see #setCsID(int)
	 * @see logmetamodel.LogmetamodelPackage#getDataSchema_CsID()
	 * @model
	 * @generated
	 */
	int getCsID();

	/**
	 * Sets the value of the '{@link logmetamodel.DataSchema#getCsID <em>Cs ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs ID</em>' attribute.
	 * @see #getCsID()
	 * @generated
	 */
	void setCsID(int value);

	/**
	 * Returns the value of the '<em><b>Conjuntorotas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjuntorotas</em>' containment reference.
	 * @see #setConjuntorotas(ConjuntoRotas)
	 * @see logmetamodel.LogmetamodelPackage#getDataSchema_Conjuntorotas()
	 * @model containment="true"
	 * @generated
	 */
	ConjuntoRotas getConjuntorotas();

	/**
	 * Sets the value of the '{@link logmetamodel.DataSchema#getConjuntorotas <em>Conjuntorotas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjuntorotas</em>' containment reference.
	 * @see #getConjuntorotas()
	 * @generated
	 */
	void setConjuntorotas(ConjuntoRotas value);
	
	void setRestricoes(EList<Restricao> listaRestricao);

} // DataSchema

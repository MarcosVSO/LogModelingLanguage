/**
 */
package logmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjunto Coletas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.ConjuntoColetas#getColeta <em>Coleta</em>}</li>
 *   <li>{@link logmetamodel.ConjuntoColetas#getConjuntoColetasID <em>Conjunto Coletas ID</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getConjuntoColetas()
 * @model
 * @generated
 */
public interface ConjuntoColetas extends EObject {
	/**
	 * Returns the value of the '<em><b>Coleta</b></em>' containment reference list.
	 * The list contents are of type {@link logmetamodel.Coleta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coleta</em>' containment reference list.
	 * @see logmetamodel.LogmetamodelPackage#getConjuntoColetas_Coleta()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coleta> getColeta();

	/**
	 * Returns the value of the '<em><b>Conjunto Coletas ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjunto Coletas ID</em>' attribute.
	 * @see #setConjuntoColetasID(int)
	 * @see logmetamodel.LogmetamodelPackage#getConjuntoColetas_ConjuntoColetasID()
	 * @model
	 * @generated
	 */
	int getConjuntoColetasID();

	/**
	 * Sets the value of the '{@link logmetamodel.ConjuntoColetas#getConjuntoColetasID <em>Conjunto Coletas ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjunto Coletas ID</em>' attribute.
	 * @see #getConjuntoColetasID()
	 * @generated
	 */
	void setConjuntoColetasID(int value);

} // ConjuntoColetas

/**
 */
package logmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.ControlSchema#getCsID <em>Cs ID</em>}</li>
 *   <li>{@link logmetamodel.ControlSchema#getConjuntocoletas <em>Conjuntocoletas</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getControlSchema()
 * @model
 * @generated
 */
public interface ControlSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Cs ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs ID</em>' attribute.
	 * @see #setCsID(int)
	 * @see logmetamodel.LogmetamodelPackage#getControlSchema_CsID()
	 * @model
	 * @generated
	 */
	int getCsID();

	/**
	 * Sets the value of the '{@link logmetamodel.ControlSchema#getCsID <em>Cs ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs ID</em>' attribute.
	 * @see #getCsID()
	 * @generated
	 */
	void setCsID(int value);

	/**
	 * Returns the value of the '<em><b>Conjuntocoletas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjuntocoletas</em>' containment reference.
	 * @see #setConjuntocoletas(ConjuntoColetas)
	 * @see logmetamodel.LogmetamodelPackage#getControlSchema_Conjuntocoletas()
	 * @model containment="true"
	 * @generated
	 */
	ConjuntoColetas getConjuntocoletas();

	/**
	 * Sets the value of the '{@link logmetamodel.ControlSchema#getConjuntocoletas <em>Conjuntocoletas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjuntocoletas</em>' containment reference.
	 * @see #getConjuntocoletas()
	 * @generated
	 */
	void setConjuntocoletas(ConjuntoColetas value);

} // ControlSchema

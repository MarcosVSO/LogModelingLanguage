/**
 */
package logmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.DomainSchema#getControlschema <em>Controlschema</em>}</li>
 *   <li>{@link logmetamodel.DomainSchema#getDataschema <em>Dataschema</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getDomainSchema()
 * @model
 * @generated
 */
public interface DomainSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Controlschema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlschema</em>' containment reference.
	 * @see #setControlschema(ControlSchema)
	 * @see logmetamodel.LogmetamodelPackage#getDomainSchema_Controlschema()
	 * @model containment="true"
	 * @generated
	 */
	ControlSchema getControlschema();

	/**
	 * Sets the value of the '{@link logmetamodel.DomainSchema#getControlschema <em>Controlschema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlschema</em>' containment reference.
	 * @see #getControlschema()
	 * @generated
	 */
	void setControlschema(ControlSchema value);

	/**
	 * Returns the value of the '<em><b>Dataschema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataschema</em>' containment reference.
	 * @see #setDataschema(DataSchema)
	 * @see logmetamodel.LogmetamodelPackage#getDomainSchema_Dataschema()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getDataschema();

	/**
	 * Sets the value of the '{@link logmetamodel.DomainSchema#getDataschema <em>Dataschema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataschema</em>' containment reference.
	 * @see #getDataschema()
	 * @generated
	 */
	void setDataschema(DataSchema value);

} // DomainSchema

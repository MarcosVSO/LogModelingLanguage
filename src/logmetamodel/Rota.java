/**
 */
package logmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rota</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.Rota#getRotaId <em>Rota Id</em>}</li>
 *   <li>{@link logmetamodel.Rota#getCoordenadas <em>Coordenadas</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getRota()
 * @model
 * @generated
 */
public interface Rota extends EObject {
	/**
	 * Returns the value of the '<em><b>Rota Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rota Id</em>' attribute.
	 * @see #setRotaId(int)
	 * @see logmetamodel.LogmetamodelPackage#getRota_RotaId()
	 * @model
	 * @generated
	 */
	int getRotaId();

	/**
	 * Sets the value of the '{@link logmetamodel.Rota#getRotaId <em>Rota Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rota Id</em>' attribute.
	 * @see #getRotaId()
	 * @generated
	 */
	void setRotaId(int value);

	/**
	 * Returns the value of the '<em><b>Coordenadas</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordenadas</em>' attribute list.
	 * @see logmetamodel.LogmetamodelPackage#getRota_Coordenadas()
	 * @model
	 * @generated
	 */
	EList<String> getCoordenadas();
	
	void setCoordenadas(EList<String> coordenadas);

} // Rota

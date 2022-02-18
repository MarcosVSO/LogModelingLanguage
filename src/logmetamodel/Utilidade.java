/**
 */
package logmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilidade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.Utilidade#getColetaId <em>Coleta Id</em>}</li>
 *   <li>{@link logmetamodel.Utilidade#getRotaId <em>Rota Id</em>}</li>
 *   <li>{@link logmetamodel.Utilidade#getUtilidade <em>Utilidade</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getUtilidade()
 * @model
 * @generated
 */
public interface Utilidade extends EObject {
	/**
	 * Returns the value of the '<em><b>Coleta Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coleta Id</em>' attribute.
	 * @see #setColetaId(int)
	 * @see logmetamodel.LogmetamodelPackage#getUtilidade_ColetaId()
	 * @model
	 * @generated
	 */
	int getColetaId();

	/**
	 * Sets the value of the '{@link logmetamodel.Utilidade#getColetaId <em>Coleta Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coleta Id</em>' attribute.
	 * @see #getColetaId()
	 * @generated
	 */
	void setColetaId(int value);

	/**
	 * Returns the value of the '<em><b>Rota Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rota Id</em>' attribute.
	 * @see #setRotaId(int)
	 * @see logmetamodel.LogmetamodelPackage#getUtilidade_RotaId()
	 * @model
	 * @generated
	 */
	int getRotaId();

	/**
	 * Sets the value of the '{@link logmetamodel.Utilidade#getRotaId <em>Rota Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rota Id</em>' attribute.
	 * @see #getRotaId()
	 * @generated
	 */
	void setRotaId(int value);

	/**
	 * Returns the value of the '<em><b>Utilidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilidade</em>' attribute.
	 * @see #setUtilidade(float)
	 * @see logmetamodel.LogmetamodelPackage#getUtilidade_Utilidade()
	 * @model
	 * @generated
	 */
	float getUtilidade();

	/**
	 * Sets the value of the '{@link logmetamodel.Utilidade#getUtilidade <em>Utilidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilidade</em>' attribute.
	 * @see #getUtilidade()
	 * @generated
	 */
	void setUtilidade(float value);

} // Utilidade

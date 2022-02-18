/**
 */
package logmetamodel;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coleta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logmetamodel.Coleta#getColetaId <em>Coleta Id</em>}</li>
 *   <li>{@link logmetamodel.Coleta#getCoordernada <em>Coordernada</em>}</li>
 *   <li>{@link logmetamodel.Coleta#getUtilidade <em>Utilidade</em>}</li>
 *   <li>{@link logmetamodel.Coleta#getConjuntocusto <em>Conjuntocusto</em>}</li>
 * </ul>
 *
 * @see logmetamodel.LogmetamodelPackage#getColeta()
 * @model
 * @generated
 */
public interface Coleta extends EObject {
	/**
	 * Returns the value of the '<em><b>Coleta Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coleta Id</em>' attribute.
	 * @see #setColetaId(int)
	 * @see logmetamodel.LogmetamodelPackage#getColeta_ColetaId()
	 * @model
	 * @generated
	 */
	int getColetaId();

	/**
	 * Sets the value of the '{@link logmetamodel.Coleta#getColetaId <em>Coleta Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coleta Id</em>' attribute.
	 * @see #getColetaId()
	 * @generated
	 */
	void setColetaId(int value);

	/**
	 * Returns the value of the '<em><b>Coordernada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordernada</em>' attribute.
	 * @see #setCoordernada(String)
	 * @see logmetamodel.LogmetamodelPackage#getColeta_Coordernada()
	 * @model
	 * @generated
	 */
	String getCoordernada();

	/**
	 * Sets the value of the '{@link logmetamodel.Coleta#getCoordernada <em>Coordernada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordernada</em>' attribute.
	 * @see #getCoordernada()
	 * @generated
	 */
	void setCoordernada(String value);

	/**
	 * Returns the value of the '<em><b>Utilidade</b></em>' containment reference list.
	 * The list contents are of type {@link logmetamodel.Utilidade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilidade</em>' containment reference list.
	 * @see logmetamodel.LogmetamodelPackage#getColeta_Utilidade()
	 * @model containment="true"
	 * @generated
	 */
	EList<Utilidade> getUtilidade();

	/**
	 * Returns the value of the '<em><b>Conjuntocusto</b></em>' containment reference list.
	 * The list contents are of type {@link logmetamodel.ConjuntoCusto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjuntocusto</em>' containment reference list.
	 * @see logmetamodel.LogmetamodelPackage#getColeta_Conjuntocusto()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConjuntoCusto> getConjuntocusto();
	
	void setConjuntoCusto(EList<Rota> rotas, EList<Restricao> restricoes) throws IOException, InterruptedException;
	
	public void calculateUtilidade(EList<Restricao> restricoes);
	
} // Coleta

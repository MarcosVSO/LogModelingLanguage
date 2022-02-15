/**
 */
package logmetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logmetamodel.LogmetamodelPackage
 * @generated
 */
public interface LogmetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogmetamodelFactory eINSTANCE = logmetamodel.impl.LogmetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Schema</em>'.
	 * @generated
	 */
	DomainSchema createDomainSchema();

	/**
	 * Returns a new object of class '<em>Control Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Schema</em>'.
	 * @generated
	 */
	ControlSchema createControlSchema();

	/**
	 * Returns a new object of class '<em>Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Schema</em>'.
	 * @generated
	 */
	DataSchema createDataSchema();

	/**
	 * Returns a new object of class '<em>Restricao</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restricao</em>'.
	 * @generated
	 */
	Restricao createRestricao();

	/**
	 * Returns a new object of class '<em>Coleta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coleta</em>'.
	 * @generated
	 */
	Coleta createColeta();

	/**
	 * Returns a new object of class '<em>Conjunto Coletas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunto Coletas</em>'.
	 * @generated
	 */
	ConjuntoColetas createConjuntoColetas();

	/**
	 * Returns a new object of class '<em>Utilidade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utilidade</em>'.
	 * @generated
	 */
	Utilidade createUtilidade();

	/**
	 * Returns a new object of class '<em>Conjunto Rotas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunto Rotas</em>'.
	 * @generated
	 */
	ConjuntoRotas createConjuntoRotas();

	/**
	 * Returns a new object of class '<em>Rota</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rota</em>'.
	 * @generated
	 */
	Rota createRota();

	/**
	 * Returns a new object of class '<em>Conjunto Custo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunto Custo</em>'.
	 * @generated
	 */
	ConjuntoCusto createConjuntoCusto();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogmetamodelPackage getLogmetamodelPackage();

} //LogmetamodelFactory

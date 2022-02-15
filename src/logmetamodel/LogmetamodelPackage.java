/**
 */
package logmetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see logmetamodel.LogmetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface LogmetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logmetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "logmetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logmetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogmetamodelPackage eINSTANCE = logmetamodel.impl.LogmetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link logmetamodel.impl.DomainSchemaImpl <em>Domain Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.DomainSchemaImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getDomainSchema()
	 * @generated
	 */
	int DOMAIN_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Controlschema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SCHEMA__CONTROLSCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Dataschema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SCHEMA__DATASCHEMA = 1;

	/**
	 * The number of structural features of the '<em>Domain Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmetamodel.impl.ControlSchemaImpl <em>Control Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.ControlSchemaImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getControlSchema()
	 * @generated
	 */
	int CONTROL_SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Cs ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SCHEMA__CS_ID = 0;

	/**
	 * The feature id for the '<em><b>Conjuntocoletas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SCHEMA__CONJUNTOCOLETAS = 1;

	/**
	 * The number of structural features of the '<em>Control Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmetamodel.impl.DataSchemaImpl <em>Data Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.DataSchemaImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getDataSchema()
	 * @generated
	 */
	int DATA_SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Restricao</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__RESTRICAO = 0;

	/**
	 * The feature id for the '<em><b>Ds ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__DS_ID = 1;

	/**
	 * The feature id for the '<em><b>Cs ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__CS_ID = 2;

	/**
	 * The feature id for the '<em><b>Conjuntorotas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__CONJUNTOROTAS = 3;

	/**
	 * The number of structural features of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmetamodel.impl.RestricaoImpl <em>Restricao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.RestricaoImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getRestricao()
	 * @generated
	 */
	int RESTRICAO = 3;

	/**
	 * The feature id for the '<em><b>Restricao Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICAO__RESTRICAO_ID = 0;

	/**
	 * The feature id for the '<em><b>Descricao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICAO__DESCRICAO = 1;

	/**
	 * The feature id for the '<em><b>Peso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICAO__PESO = 2;

	/**
	 * The feature id for the '<em><b>Valor Maximo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICAO__VALOR_MAXIMO = 3;

	/**
	 * The number of structural features of the '<em>Restricao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICAO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Restricao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICAO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmetamodel.impl.ColetaImpl <em>Coleta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.ColetaImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getColeta()
	 * @generated
	 */
	int COLETA = 4;

	/**
	 * The feature id for the '<em><b>Coleta Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLETA__COLETA_ID = 0;

	/**
	 * The feature id for the '<em><b>Coordernada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLETA__COORDERNADA = 1;

	/**
	 * The feature id for the '<em><b>Utilidade</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLETA__UTILIDADE = 2;

	/**
	 * The feature id for the '<em><b>Conjuntocusto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLETA__CONJUNTOCUSTO = 3;

	/**
	 * The number of structural features of the '<em>Coleta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLETA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Coleta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLETA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmetamodel.impl.ConjuntoColetasImpl <em>Conjunto Coletas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.ConjuntoColetasImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getConjuntoColetas()
	 * @generated
	 */
	int CONJUNTO_COLETAS = 5;

	/**
	 * The feature id for the '<em><b>Coleta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_COLETAS__COLETA = 0;

	/**
	 * The feature id for the '<em><b>Conjunto Coletas ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_COLETAS__CONJUNTO_COLETAS_ID = 1;

	/**
	 * The number of structural features of the '<em>Conjunto Coletas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_COLETAS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conjunto Coletas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_COLETAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmetamodel.impl.UtilidadeImpl <em>Utilidade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.UtilidadeImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getUtilidade()
	 * @generated
	 */
	int UTILIDADE = 6;

	/**
	 * The feature id for the '<em><b>Coleta Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIDADE__COLETA_ID = 0;

	/**
	 * The feature id for the '<em><b>Rota Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIDADE__ROTA_ID = 1;

	/**
	 * The number of structural features of the '<em>Utilidade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIDADE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Utilidade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILIDADE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmetamodel.impl.ConjuntoRotasImpl <em>Conjunto Rotas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.ConjuntoRotasImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getConjuntoRotas()
	 * @generated
	 */
	int CONJUNTO_ROTAS = 7;

	/**
	 * The feature id for the '<em><b>Conjunto Rotas Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_ROTAS__CONJUNTO_ROTAS_ID = 0;

	/**
	 * The feature id for the '<em><b>Rota</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_ROTAS__ROTA = 1;

	/**
	 * The number of structural features of the '<em>Conjunto Rotas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_ROTAS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conjunto Rotas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_ROTAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmetamodel.impl.RotaImpl <em>Rota</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.RotaImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getRota()
	 * @generated
	 */
	int ROTA = 8;

	/**
	 * The feature id for the '<em><b>Rota Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTA__ROTA_ID = 0;

	/**
	 * The feature id for the '<em><b>Coordenadas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTA__COORDENADAS = 1;

	/**
	 * The number of structural features of the '<em>Rota</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rota</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logmetamodel.impl.ConjuntoCustoImpl <em>Conjunto Custo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logmetamodel.impl.ConjuntoCustoImpl
	 * @see logmetamodel.impl.LogmetamodelPackageImpl#getConjuntoCusto()
	 * @generated
	 */
	int CONJUNTO_CUSTO = 9;

	/**
	 * The feature id for the '<em><b>Conjunto Custo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_CUSTO__CONJUNTO_CUSTO_ID = 0;

	/**
	 * The feature id for the '<em><b>Restricao Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_CUSTO__RESTRICAO_ID = 1;

	/**
	 * The feature id for the '<em><b>Custos Rotas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_CUSTO__CUSTOS_ROTAS = 2;

	/**
	 * The number of structural features of the '<em>Conjunto Custo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_CUSTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conjunto Custo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTO_CUSTO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link logmetamodel.DomainSchema <em>Domain Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Schema</em>'.
	 * @see logmetamodel.DomainSchema
	 * @generated
	 */
	EClass getDomainSchema();

	/**
	 * Returns the meta object for the containment reference '{@link logmetamodel.DomainSchema#getControlschema <em>Controlschema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controlschema</em>'.
	 * @see logmetamodel.DomainSchema#getControlschema()
	 * @see #getDomainSchema()
	 * @generated
	 */
	EReference getDomainSchema_Controlschema();

	/**
	 * Returns the meta object for the containment reference '{@link logmetamodel.DomainSchema#getDataschema <em>Dataschema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dataschema</em>'.
	 * @see logmetamodel.DomainSchema#getDataschema()
	 * @see #getDomainSchema()
	 * @generated
	 */
	EReference getDomainSchema_Dataschema();

	/**
	 * Returns the meta object for class '{@link logmetamodel.ControlSchema <em>Control Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Schema</em>'.
	 * @see logmetamodel.ControlSchema
	 * @generated
	 */
	EClass getControlSchema();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.ControlSchema#getCsID <em>Cs ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs ID</em>'.
	 * @see logmetamodel.ControlSchema#getCsID()
	 * @see #getControlSchema()
	 * @generated
	 */
	EAttribute getControlSchema_CsID();

	/**
	 * Returns the meta object for the containment reference '{@link logmetamodel.ControlSchema#getConjuntocoletas <em>Conjuntocoletas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conjuntocoletas</em>'.
	 * @see logmetamodel.ControlSchema#getConjuntocoletas()
	 * @see #getControlSchema()
	 * @generated
	 */
	EReference getControlSchema_Conjuntocoletas();

	/**
	 * Returns the meta object for class '{@link logmetamodel.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Schema</em>'.
	 * @see logmetamodel.DataSchema
	 * @generated
	 */
	EClass getDataSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link logmetamodel.DataSchema#getRestricao <em>Restricao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restricao</em>'.
	 * @see logmetamodel.DataSchema#getRestricao()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Restricao();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.DataSchema#getDsID <em>Ds ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ds ID</em>'.
	 * @see logmetamodel.DataSchema#getDsID()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_DsID();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.DataSchema#getCsID <em>Cs ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs ID</em>'.
	 * @see logmetamodel.DataSchema#getCsID()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_CsID();

	/**
	 * Returns the meta object for the containment reference '{@link logmetamodel.DataSchema#getConjuntorotas <em>Conjuntorotas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conjuntorotas</em>'.
	 * @see logmetamodel.DataSchema#getConjuntorotas()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Conjuntorotas();

	/**
	 * Returns the meta object for class '{@link logmetamodel.Restricao <em>Restricao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricao</em>'.
	 * @see logmetamodel.Restricao
	 * @generated
	 */
	EClass getRestricao();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.Restricao#getRestricaoId <em>Restricao Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restricao Id</em>'.
	 * @see logmetamodel.Restricao#getRestricaoId()
	 * @see #getRestricao()
	 * @generated
	 */
	EAttribute getRestricao_RestricaoId();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.Restricao#getDescricao <em>Descricao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descricao</em>'.
	 * @see logmetamodel.Restricao#getDescricao()
	 * @see #getRestricao()
	 * @generated
	 */
	EAttribute getRestricao_Descricao();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.Restricao#getPeso <em>Peso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peso</em>'.
	 * @see logmetamodel.Restricao#getPeso()
	 * @see #getRestricao()
	 * @generated
	 */
	EAttribute getRestricao_Peso();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.Restricao#getValorMaximo <em>Valor Maximo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Maximo</em>'.
	 * @see logmetamodel.Restricao#getValorMaximo()
	 * @see #getRestricao()
	 * @generated
	 */
	EAttribute getRestricao_ValorMaximo();

	/**
	 * Returns the meta object for class '{@link logmetamodel.Coleta <em>Coleta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coleta</em>'.
	 * @see logmetamodel.Coleta
	 * @generated
	 */
	EClass getColeta();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.Coleta#getColetaId <em>Coleta Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coleta Id</em>'.
	 * @see logmetamodel.Coleta#getColetaId()
	 * @see #getColeta()
	 * @generated
	 */
	EAttribute getColeta_ColetaId();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.Coleta#getCoordernada <em>Coordernada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordernada</em>'.
	 * @see logmetamodel.Coleta#getCoordernada()
	 * @see #getColeta()
	 * @generated
	 */
	EAttribute getColeta_Coordernada();

	/**
	 * Returns the meta object for the containment reference list '{@link logmetamodel.Coleta#getUtilidade <em>Utilidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Utilidade</em>'.
	 * @see logmetamodel.Coleta#getUtilidade()
	 * @see #getColeta()
	 * @generated
	 */
	EReference getColeta_Utilidade();

	/**
	 * Returns the meta object for the containment reference list '{@link logmetamodel.Coleta#getConjuntocusto <em>Conjuntocusto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conjuntocusto</em>'.
	 * @see logmetamodel.Coleta#getConjuntocusto()
	 * @see #getColeta()
	 * @generated
	 */
	EReference getColeta_Conjuntocusto();

	/**
	 * Returns the meta object for class '{@link logmetamodel.ConjuntoColetas <em>Conjunto Coletas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunto Coletas</em>'.
	 * @see logmetamodel.ConjuntoColetas
	 * @generated
	 */
	EClass getConjuntoColetas();

	/**
	 * Returns the meta object for the containment reference list '{@link logmetamodel.ConjuntoColetas#getColeta <em>Coleta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coleta</em>'.
	 * @see logmetamodel.ConjuntoColetas#getColeta()
	 * @see #getConjuntoColetas()
	 * @generated
	 */
	EReference getConjuntoColetas_Coleta();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.ConjuntoColetas#getConjuntoColetasID <em>Conjunto Coletas ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conjunto Coletas ID</em>'.
	 * @see logmetamodel.ConjuntoColetas#getConjuntoColetasID()
	 * @see #getConjuntoColetas()
	 * @generated
	 */
	EAttribute getConjuntoColetas_ConjuntoColetasID();

	/**
	 * Returns the meta object for class '{@link logmetamodel.Utilidade <em>Utilidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilidade</em>'.
	 * @see logmetamodel.Utilidade
	 * @generated
	 */
	EClass getUtilidade();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.Utilidade#getColetaId <em>Coleta Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coleta Id</em>'.
	 * @see logmetamodel.Utilidade#getColetaId()
	 * @see #getUtilidade()
	 * @generated
	 */
	EAttribute getUtilidade_ColetaId();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.Utilidade#getRotaId <em>Rota Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rota Id</em>'.
	 * @see logmetamodel.Utilidade#getRotaId()
	 * @see #getUtilidade()
	 * @generated
	 */
	EAttribute getUtilidade_RotaId();

	/**
	 * Returns the meta object for class '{@link logmetamodel.ConjuntoRotas <em>Conjunto Rotas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunto Rotas</em>'.
	 * @see logmetamodel.ConjuntoRotas
	 * @generated
	 */
	EClass getConjuntoRotas();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.ConjuntoRotas#getConjuntoRotasId <em>Conjunto Rotas Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conjunto Rotas Id</em>'.
	 * @see logmetamodel.ConjuntoRotas#getConjuntoRotasId()
	 * @see #getConjuntoRotas()
	 * @generated
	 */
	EAttribute getConjuntoRotas_ConjuntoRotasId();

	/**
	 * Returns the meta object for the containment reference list '{@link logmetamodel.ConjuntoRotas#getRota <em>Rota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rota</em>'.
	 * @see logmetamodel.ConjuntoRotas#getRota()
	 * @see #getConjuntoRotas()
	 * @generated
	 */
	EReference getConjuntoRotas_Rota();

	/**
	 * Returns the meta object for class '{@link logmetamodel.Rota <em>Rota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rota</em>'.
	 * @see logmetamodel.Rota
	 * @generated
	 */
	EClass getRota();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.Rota#getRotaId <em>Rota Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rota Id</em>'.
	 * @see logmetamodel.Rota#getRotaId()
	 * @see #getRota()
	 * @generated
	 */
	EAttribute getRota_RotaId();

	/**
	 * Returns the meta object for the attribute list '{@link logmetamodel.Rota#getCoordenadas <em>Coordenadas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coordenadas</em>'.
	 * @see logmetamodel.Rota#getCoordenadas()
	 * @see #getRota()
	 * @generated
	 */
	EAttribute getRota_Coordenadas();

	/**
	 * Returns the meta object for class '{@link logmetamodel.ConjuntoCusto <em>Conjunto Custo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjunto Custo</em>'.
	 * @see logmetamodel.ConjuntoCusto
	 * @generated
	 */
	EClass getConjuntoCusto();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.ConjuntoCusto#getConjuntoCustoId <em>Conjunto Custo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conjunto Custo Id</em>'.
	 * @see logmetamodel.ConjuntoCusto#getConjuntoCustoId()
	 * @see #getConjuntoCusto()
	 * @generated
	 */
	EAttribute getConjuntoCusto_ConjuntoCustoId();

	/**
	 * Returns the meta object for the attribute '{@link logmetamodel.ConjuntoCusto#getRestricaoId <em>Restricao Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restricao Id</em>'.
	 * @see logmetamodel.ConjuntoCusto#getRestricaoId()
	 * @see #getConjuntoCusto()
	 * @generated
	 */
	EAttribute getConjuntoCusto_RestricaoId();

	/**
	 * Returns the meta object for the attribute list '{@link logmetamodel.ConjuntoCusto#getCustosRotas <em>Custos Rotas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Custos Rotas</em>'.
	 * @see logmetamodel.ConjuntoCusto#getCustosRotas()
	 * @see #getConjuntoCusto()
	 * @generated
	 */
	EAttribute getConjuntoCusto_CustosRotas();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogmetamodelFactory getLogmetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link logmetamodel.impl.DomainSchemaImpl <em>Domain Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.DomainSchemaImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getDomainSchema()
		 * @generated
		 */
		EClass DOMAIN_SCHEMA = eINSTANCE.getDomainSchema();

		/**
		 * The meta object literal for the '<em><b>Controlschema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SCHEMA__CONTROLSCHEMA = eINSTANCE.getDomainSchema_Controlschema();

		/**
		 * The meta object literal for the '<em><b>Dataschema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SCHEMA__DATASCHEMA = eINSTANCE.getDomainSchema_Dataschema();

		/**
		 * The meta object literal for the '{@link logmetamodel.impl.ControlSchemaImpl <em>Control Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.ControlSchemaImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getControlSchema()
		 * @generated
		 */
		EClass CONTROL_SCHEMA = eINSTANCE.getControlSchema();

		/**
		 * The meta object literal for the '<em><b>Cs ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_SCHEMA__CS_ID = eINSTANCE.getControlSchema_CsID();

		/**
		 * The meta object literal for the '<em><b>Conjuntocoletas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_SCHEMA__CONJUNTOCOLETAS = eINSTANCE.getControlSchema_Conjuntocoletas();

		/**
		 * The meta object literal for the '{@link logmetamodel.impl.DataSchemaImpl <em>Data Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.DataSchemaImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getDataSchema()
		 * @generated
		 */
		EClass DATA_SCHEMA = eINSTANCE.getDataSchema();

		/**
		 * The meta object literal for the '<em><b>Restricao</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__RESTRICAO = eINSTANCE.getDataSchema_Restricao();

		/**
		 * The meta object literal for the '<em><b>Ds ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__DS_ID = eINSTANCE.getDataSchema_DsID();

		/**
		 * The meta object literal for the '<em><b>Cs ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__CS_ID = eINSTANCE.getDataSchema_CsID();

		/**
		 * The meta object literal for the '<em><b>Conjuntorotas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__CONJUNTOROTAS = eINSTANCE.getDataSchema_Conjuntorotas();

		/**
		 * The meta object literal for the '{@link logmetamodel.impl.RestricaoImpl <em>Restricao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.RestricaoImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getRestricao()
		 * @generated
		 */
		EClass RESTRICAO = eINSTANCE.getRestricao();

		/**
		 * The meta object literal for the '<em><b>Restricao Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICAO__RESTRICAO_ID = eINSTANCE.getRestricao_RestricaoId();

		/**
		 * The meta object literal for the '<em><b>Descricao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICAO__DESCRICAO = eINSTANCE.getRestricao_Descricao();

		/**
		 * The meta object literal for the '<em><b>Peso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICAO__PESO = eINSTANCE.getRestricao_Peso();

		/**
		 * The meta object literal for the '<em><b>Valor Maximo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTRICAO__VALOR_MAXIMO = eINSTANCE.getRestricao_ValorMaximo();

		/**
		 * The meta object literal for the '{@link logmetamodel.impl.ColetaImpl <em>Coleta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.ColetaImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getColeta()
		 * @generated
		 */
		EClass COLETA = eINSTANCE.getColeta();

		/**
		 * The meta object literal for the '<em><b>Coleta Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLETA__COLETA_ID = eINSTANCE.getColeta_ColetaId();

		/**
		 * The meta object literal for the '<em><b>Coordernada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLETA__COORDERNADA = eINSTANCE.getColeta_Coordernada();

		/**
		 * The meta object literal for the '<em><b>Utilidade</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLETA__UTILIDADE = eINSTANCE.getColeta_Utilidade();

		/**
		 * The meta object literal for the '<em><b>Conjuntocusto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLETA__CONJUNTOCUSTO = eINSTANCE.getColeta_Conjuntocusto();

		/**
		 * The meta object literal for the '{@link logmetamodel.impl.ConjuntoColetasImpl <em>Conjunto Coletas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.ConjuntoColetasImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getConjuntoColetas()
		 * @generated
		 */
		EClass CONJUNTO_COLETAS = eINSTANCE.getConjuntoColetas();

		/**
		 * The meta object literal for the '<em><b>Coleta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUNTO_COLETAS__COLETA = eINSTANCE.getConjuntoColetas_Coleta();

		/**
		 * The meta object literal for the '<em><b>Conjunto Coletas ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONJUNTO_COLETAS__CONJUNTO_COLETAS_ID = eINSTANCE.getConjuntoColetas_ConjuntoColetasID();

		/**
		 * The meta object literal for the '{@link logmetamodel.impl.UtilidadeImpl <em>Utilidade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.UtilidadeImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getUtilidade()
		 * @generated
		 */
		EClass UTILIDADE = eINSTANCE.getUtilidade();

		/**
		 * The meta object literal for the '<em><b>Coleta Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIDADE__COLETA_ID = eINSTANCE.getUtilidade_ColetaId();

		/**
		 * The meta object literal for the '<em><b>Rota Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILIDADE__ROTA_ID = eINSTANCE.getUtilidade_RotaId();

		/**
		 * The meta object literal for the '{@link logmetamodel.impl.ConjuntoRotasImpl <em>Conjunto Rotas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.ConjuntoRotasImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getConjuntoRotas()
		 * @generated
		 */
		EClass CONJUNTO_ROTAS = eINSTANCE.getConjuntoRotas();

		/**
		 * The meta object literal for the '<em><b>Conjunto Rotas Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONJUNTO_ROTAS__CONJUNTO_ROTAS_ID = eINSTANCE.getConjuntoRotas_ConjuntoRotasId();

		/**
		 * The meta object literal for the '<em><b>Rota</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONJUNTO_ROTAS__ROTA = eINSTANCE.getConjuntoRotas_Rota();

		/**
		 * The meta object literal for the '{@link logmetamodel.impl.RotaImpl <em>Rota</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.RotaImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getRota()
		 * @generated
		 */
		EClass ROTA = eINSTANCE.getRota();

		/**
		 * The meta object literal for the '<em><b>Rota Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTA__ROTA_ID = eINSTANCE.getRota_RotaId();

		/**
		 * The meta object literal for the '<em><b>Coordenadas</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTA__COORDENADAS = eINSTANCE.getRota_Coordenadas();

		/**
		 * The meta object literal for the '{@link logmetamodel.impl.ConjuntoCustoImpl <em>Conjunto Custo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logmetamodel.impl.ConjuntoCustoImpl
		 * @see logmetamodel.impl.LogmetamodelPackageImpl#getConjuntoCusto()
		 * @generated
		 */
		EClass CONJUNTO_CUSTO = eINSTANCE.getConjuntoCusto();

		/**
		 * The meta object literal for the '<em><b>Conjunto Custo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONJUNTO_CUSTO__CONJUNTO_CUSTO_ID = eINSTANCE.getConjuntoCusto_ConjuntoCustoId();

		/**
		 * The meta object literal for the '<em><b>Restricao Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONJUNTO_CUSTO__RESTRICAO_ID = eINSTANCE.getConjuntoCusto_RestricaoId();

		/**
		 * The meta object literal for the '<em><b>Custos Rotas</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONJUNTO_CUSTO__CUSTOS_ROTAS = eINSTANCE.getConjuntoCusto_CustosRotas();

	}

} //LogmetamodelPackage

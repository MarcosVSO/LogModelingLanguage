/**
 */
package logmetamodel.impl;

import logmetamodel.Coleta;
import logmetamodel.ConjuntoColetas;
import logmetamodel.ConjuntoCusto;
import logmetamodel.ConjuntoRotas;
import logmetamodel.ControlSchema;
import logmetamodel.DataSchema;
import logmetamodel.DomainSchema;
import logmetamodel.LogmetamodelFactory;
import logmetamodel.LogmetamodelPackage;
import logmetamodel.Restricao;
import logmetamodel.Rota;
import logmetamodel.Utilidade;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogmetamodelPackageImpl extends EPackageImpl implements LogmetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restricaoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coletaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjuntoColetasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilidadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjuntoRotasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjuntoCustoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see logmetamodel.LogmetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogmetamodelPackageImpl() {
		super(eNS_URI, LogmetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LogmetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogmetamodelPackage init() {
		if (isInited) return (LogmetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(LogmetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogmetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogmetamodelPackageImpl theLogmetamodelPackage = registeredLogmetamodelPackage instanceof LogmetamodelPackageImpl ? (LogmetamodelPackageImpl)registeredLogmetamodelPackage : new LogmetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLogmetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theLogmetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogmetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogmetamodelPackage.eNS_URI, theLogmetamodelPackage);
		return theLogmetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSchema() {
		return domainSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSchema_Controlschema() {
		return (EReference)domainSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainSchema_Dataschema() {
		return (EReference)domainSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlSchema() {
		return controlSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlSchema_CsID() {
		return (EAttribute)controlSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlSchema_Conjuntocoletas() {
		return (EReference)controlSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSchema() {
		return dataSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSchema_Restricao() {
		return (EReference)dataSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_DsID() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_CsID() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSchema_Conjuntorotas() {
		return (EReference)dataSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestricao() {
		return restricaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestricao_RestricaoId() {
		return (EAttribute)restricaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestricao_Descricao() {
		return (EAttribute)restricaoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestricao_Peso() {
		return (EAttribute)restricaoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestricao_ValorMaximo() {
		return (EAttribute)restricaoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColeta() {
		return coletaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColeta_ColetaId() {
		return (EAttribute)coletaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColeta_Coordernada() {
		return (EAttribute)coletaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColeta_Utilidade() {
		return (EReference)coletaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColeta_Conjuntocusto() {
		return (EReference)coletaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjuntoColetas() {
		return conjuntoColetasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConjuntoColetas_Coleta() {
		return (EReference)conjuntoColetasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConjuntoColetas_ConjuntoColetasID() {
		return (EAttribute)conjuntoColetasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilidade() {
		return utilidadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilidade_ColetaId() {
		return (EAttribute)utilidadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilidade_RotaId() {
		return (EAttribute)utilidadeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilidade_Utilidade() {
		return (EAttribute)utilidadeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjuntoRotas() {
		return conjuntoRotasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConjuntoRotas_ConjuntoRotasId() {
		return (EAttribute)conjuntoRotasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConjuntoRotas_Rota() {
		return (EReference)conjuntoRotasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRota() {
		return rotaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRota_RotaId() {
		return (EAttribute)rotaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRota_Coordenadas() {
		return (EAttribute)rotaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjuntoCusto() {
		return conjuntoCustoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConjuntoCusto_ConjuntoCustoId() {
		return (EAttribute)conjuntoCustoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConjuntoCusto_RestricaoId() {
		return (EAttribute)conjuntoCustoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConjuntoCusto_CustosRotas() {
		return (EAttribute)conjuntoCustoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogmetamodelFactory getLogmetamodelFactory() {
		return (LogmetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainSchemaEClass = createEClass(DOMAIN_SCHEMA);
		createEReference(domainSchemaEClass, DOMAIN_SCHEMA__CONTROLSCHEMA);
		createEReference(domainSchemaEClass, DOMAIN_SCHEMA__DATASCHEMA);

		controlSchemaEClass = createEClass(CONTROL_SCHEMA);
		createEAttribute(controlSchemaEClass, CONTROL_SCHEMA__CS_ID);
		createEReference(controlSchemaEClass, CONTROL_SCHEMA__CONJUNTOCOLETAS);

		dataSchemaEClass = createEClass(DATA_SCHEMA);
		createEReference(dataSchemaEClass, DATA_SCHEMA__RESTRICAO);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__DS_ID);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__CS_ID);
		createEReference(dataSchemaEClass, DATA_SCHEMA__CONJUNTOROTAS);

		restricaoEClass = createEClass(RESTRICAO);
		createEAttribute(restricaoEClass, RESTRICAO__RESTRICAO_ID);
		createEAttribute(restricaoEClass, RESTRICAO__DESCRICAO);
		createEAttribute(restricaoEClass, RESTRICAO__PESO);
		createEAttribute(restricaoEClass, RESTRICAO__VALOR_MAXIMO);

		coletaEClass = createEClass(COLETA);
		createEAttribute(coletaEClass, COLETA__COLETA_ID);
		createEAttribute(coletaEClass, COLETA__COORDERNADA);
		createEReference(coletaEClass, COLETA__UTILIDADE);
		createEReference(coletaEClass, COLETA__CONJUNTOCUSTO);

		conjuntoColetasEClass = createEClass(CONJUNTO_COLETAS);
		createEReference(conjuntoColetasEClass, CONJUNTO_COLETAS__COLETA);
		createEAttribute(conjuntoColetasEClass, CONJUNTO_COLETAS__CONJUNTO_COLETAS_ID);

		utilidadeEClass = createEClass(UTILIDADE);
		createEAttribute(utilidadeEClass, UTILIDADE__COLETA_ID);
		createEAttribute(utilidadeEClass, UTILIDADE__ROTA_ID);
		createEAttribute(utilidadeEClass, UTILIDADE__UTILIDADE);

		conjuntoRotasEClass = createEClass(CONJUNTO_ROTAS);
		createEAttribute(conjuntoRotasEClass, CONJUNTO_ROTAS__CONJUNTO_ROTAS_ID);
		createEReference(conjuntoRotasEClass, CONJUNTO_ROTAS__ROTA);

		rotaEClass = createEClass(ROTA);
		createEAttribute(rotaEClass, ROTA__ROTA_ID);
		createEAttribute(rotaEClass, ROTA__COORDENADAS);

		conjuntoCustoEClass = createEClass(CONJUNTO_CUSTO);
		createEAttribute(conjuntoCustoEClass, CONJUNTO_CUSTO__CONJUNTO_CUSTO_ID);
		createEAttribute(conjuntoCustoEClass, CONJUNTO_CUSTO__RESTRICAO_ID);
		createEAttribute(conjuntoCustoEClass, CONJUNTO_CUSTO__CUSTOS_ROTAS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(domainSchemaEClass, DomainSchema.class, "DomainSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainSchema_Controlschema(), this.getControlSchema(), null, "controlschema", null, 0, 1, DomainSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainSchema_Dataschema(), this.getDataSchema(), null, "dataschema", null, 0, 1, DomainSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlSchemaEClass, ControlSchema.class, "ControlSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlSchema_CsID(), ecorePackage.getEInt(), "csID", null, 0, 1, ControlSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlSchema_Conjuntocoletas(), this.getConjuntoColetas(), null, "conjuntocoletas", null, 0, 1, ControlSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSchemaEClass, DataSchema.class, "DataSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSchema_Restricao(), this.getRestricao(), null, "restricao", null, 0, -1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_DsID(), ecorePackage.getEInt(), "dsID", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_CsID(), ecorePackage.getEInt(), "csID", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_Conjuntorotas(), this.getConjuntoRotas(), null, "conjuntorotas", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restricaoEClass, Restricao.class, "Restricao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestricao_RestricaoId(), ecorePackage.getEInt(), "restricaoId", null, 0, 1, Restricao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestricao_Descricao(), ecorePackage.getEString(), "descricao", null, 0, 1, Restricao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestricao_Peso(), ecorePackage.getEInt(), "peso", null, 0, 1, Restricao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestricao_ValorMaximo(), ecorePackage.getEFloat(), "valorMaximo", null, 0, 1, Restricao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coletaEClass, Coleta.class, "Coleta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColeta_ColetaId(), ecorePackage.getEInt(), "coletaId", null, 0, 1, Coleta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColeta_Coordernada(), ecorePackage.getEString(), "coordernada", null, 0, 1, Coleta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColeta_Utilidade(), this.getUtilidade(), null, "utilidade", null, 0, -1, Coleta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColeta_Conjuntocusto(), this.getConjuntoCusto(), null, "conjuntocusto", null, 0, -1, Coleta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conjuntoColetasEClass, ConjuntoColetas.class, "ConjuntoColetas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjuntoColetas_Coleta(), this.getColeta(), null, "coleta", null, 0, -1, ConjuntoColetas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConjuntoColetas_ConjuntoColetasID(), ecorePackage.getEInt(), "conjuntoColetasID", null, 0, 1, ConjuntoColetas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilidadeEClass, Utilidade.class, "Utilidade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtilidade_ColetaId(), ecorePackage.getEInt(), "coletaId", null, 0, 1, Utilidade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilidade_RotaId(), ecorePackage.getEInt(), "rotaId", null, 0, 1, Utilidade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilidade_Utilidade(), ecorePackage.getEFloat(), "utilidade", null, 0, 1, Utilidade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conjuntoRotasEClass, ConjuntoRotas.class, "ConjuntoRotas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConjuntoRotas_ConjuntoRotasId(), ecorePackage.getEInt(), "conjuntoRotasId", null, 0, 1, ConjuntoRotas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConjuntoRotas_Rota(), this.getRota(), null, "rota", null, 0, -1, ConjuntoRotas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotaEClass, Rota.class, "Rota", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRota_RotaId(), ecorePackage.getEInt(), "rotaId", null, 0, 1, Rota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRota_Coordenadas(), ecorePackage.getEString(), "coordenadas", null, 0, -1, Rota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conjuntoCustoEClass, ConjuntoCusto.class, "ConjuntoCusto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConjuntoCusto_ConjuntoCustoId(), ecorePackage.getEInt(), "ConjuntoCustoId", null, 0, 1, ConjuntoCusto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConjuntoCusto_RestricaoId(), ecorePackage.getEInt(), "restricaoId", null, 0, 1, ConjuntoCusto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConjuntoCusto_CustosRotas(), ecorePackage.getEFloat(), "custosRotas", null, 0, -1, ConjuntoCusto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LogmetamodelPackageImpl

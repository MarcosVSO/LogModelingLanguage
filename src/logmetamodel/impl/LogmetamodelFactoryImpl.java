/**
 */
package logmetamodel.impl;

import logmetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogmetamodelFactoryImpl extends EFactoryImpl implements LogmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogmetamodelFactory init() {
		try {
			LogmetamodelFactory theLogmetamodelFactory = (LogmetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(LogmetamodelPackage.eNS_URI);
			if (theLogmetamodelFactory != null) {
				return theLogmetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogmetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogmetamodelPackage.DOMAIN_SCHEMA: return createDomainSchema();
			case LogmetamodelPackage.CONTROL_SCHEMA: return createControlSchema();
			case LogmetamodelPackage.DATA_SCHEMA: return createDataSchema();
			case LogmetamodelPackage.RESTRICAO: return createRestricao();
			case LogmetamodelPackage.COLETA: return createColeta();
			case LogmetamodelPackage.CONJUNTO_COLETAS: return createConjuntoColetas();
			case LogmetamodelPackage.UTILIDADE: return createUtilidade();
			case LogmetamodelPackage.CONJUNTO_ROTAS: return createConjuntoRotas();
			case LogmetamodelPackage.ROTA: return createRota();
			case LogmetamodelPackage.CONJUNTO_CUSTO: return createConjuntoCusto();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSchema createDomainSchema() {
		DomainSchemaImpl domainSchema = new DomainSchemaImpl();
		return domainSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlSchema createControlSchema() {
		ControlSchemaImpl controlSchema = new ControlSchemaImpl();
		return controlSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSchema createDataSchema() {
		DataSchemaImpl dataSchema = new DataSchemaImpl();
		return dataSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restricao createRestricao() {
		RestricaoImpl restricao = new RestricaoImpl();
		return restricao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coleta createColeta() {
		ColetaImpl coleta = new ColetaImpl();
		return coleta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjuntoColetas createConjuntoColetas() {
		ConjuntoColetasImpl conjuntoColetas = new ConjuntoColetasImpl();
		return conjuntoColetas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilidade createUtilidade() {
		UtilidadeImpl utilidade = new UtilidadeImpl();
		return utilidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjuntoRotas createConjuntoRotas() {
		ConjuntoRotasImpl conjuntoRotas = new ConjuntoRotasImpl();
		return conjuntoRotas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rota createRota() {
		RotaImpl rota = new RotaImpl();
		return rota;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjuntoCusto createConjuntoCusto() {
		ConjuntoCustoImpl conjuntoCusto = new ConjuntoCustoImpl();
		return conjuntoCusto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogmetamodelPackage getLogmetamodelPackage() {
		return (LogmetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogmetamodelPackage getPackage() {
		return LogmetamodelPackage.eINSTANCE;
	}

} //LogmetamodelFactoryImpl

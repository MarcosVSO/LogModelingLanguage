/**
 */
package logmetamodel.util;

import logmetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see logmetamodel.LogmetamodelPackage
 * @generated
 */
public class LogmetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogmetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogmetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogmetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogmetamodelSwitch<Adapter> modelSwitch =
		new LogmetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseDomainSchema(DomainSchema object) {
				return createDomainSchemaAdapter();
			}
			@Override
			public Adapter caseControlSchema(ControlSchema object) {
				return createControlSchemaAdapter();
			}
			@Override
			public Adapter caseDataSchema(DataSchema object) {
				return createDataSchemaAdapter();
			}
			@Override
			public Adapter caseRestricao(Restricao object) {
				return createRestricaoAdapter();
			}
			@Override
			public Adapter caseColeta(Coleta object) {
				return createColetaAdapter();
			}
			@Override
			public Adapter caseConjuntoColetas(ConjuntoColetas object) {
				return createConjuntoColetasAdapter();
			}
			@Override
			public Adapter caseUtilidade(Utilidade object) {
				return createUtilidadeAdapter();
			}
			@Override
			public Adapter caseConjuntoRotas(ConjuntoRotas object) {
				return createConjuntoRotasAdapter();
			}
			@Override
			public Adapter caseRota(Rota object) {
				return createRotaAdapter();
			}
			@Override
			public Adapter caseConjuntoCusto(ConjuntoCusto object) {
				return createConjuntoCustoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.DomainSchema <em>Domain Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.DomainSchema
	 * @generated
	 */
	public Adapter createDomainSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.ControlSchema <em>Control Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.ControlSchema
	 * @generated
	 */
	public Adapter createControlSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.DataSchema
	 * @generated
	 */
	public Adapter createDataSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.Restricao <em>Restricao</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.Restricao
	 * @generated
	 */
	public Adapter createRestricaoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.Coleta <em>Coleta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.Coleta
	 * @generated
	 */
	public Adapter createColetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.ConjuntoColetas <em>Conjunto Coletas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.ConjuntoColetas
	 * @generated
	 */
	public Adapter createConjuntoColetasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.Utilidade <em>Utilidade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.Utilidade
	 * @generated
	 */
	public Adapter createUtilidadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.ConjuntoRotas <em>Conjunto Rotas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.ConjuntoRotas
	 * @generated
	 */
	public Adapter createConjuntoRotasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.Rota <em>Rota</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.Rota
	 * @generated
	 */
	public Adapter createRotaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logmetamodel.ConjuntoCusto <em>Conjunto Custo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logmetamodel.ConjuntoCusto
	 * @generated
	 */
	public Adapter createConjuntoCustoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogmetamodelAdapterFactory

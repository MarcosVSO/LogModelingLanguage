/**
 */
package logmetamodel.util;

import logmetamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see logmetamodel.LogmetamodelPackage
 * @generated
 */
public class LogmetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogmetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogmetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = LogmetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogmetamodelPackage.DOMAIN_SCHEMA: {
				DomainSchema domainSchema = (DomainSchema)theEObject;
				T result = caseDomainSchema(domainSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogmetamodelPackage.CONTROL_SCHEMA: {
				ControlSchema controlSchema = (ControlSchema)theEObject;
				T result = caseControlSchema(controlSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogmetamodelPackage.DATA_SCHEMA: {
				DataSchema dataSchema = (DataSchema)theEObject;
				T result = caseDataSchema(dataSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogmetamodelPackage.RESTRICAO: {
				Restricao restricao = (Restricao)theEObject;
				T result = caseRestricao(restricao);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogmetamodelPackage.COLETA: {
				Coleta coleta = (Coleta)theEObject;
				T result = caseColeta(coleta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogmetamodelPackage.CONJUNTO_COLETAS: {
				ConjuntoColetas conjuntoColetas = (ConjuntoColetas)theEObject;
				T result = caseConjuntoColetas(conjuntoColetas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogmetamodelPackage.UTILIDADE: {
				Utilidade utilidade = (Utilidade)theEObject;
				T result = caseUtilidade(utilidade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogmetamodelPackage.CONJUNTO_ROTAS: {
				ConjuntoRotas conjuntoRotas = (ConjuntoRotas)theEObject;
				T result = caseConjuntoRotas(conjuntoRotas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogmetamodelPackage.ROTA: {
				Rota rota = (Rota)theEObject;
				T result = caseRota(rota);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogmetamodelPackage.CONJUNTO_CUSTO: {
				ConjuntoCusto conjuntoCusto = (ConjuntoCusto)theEObject;
				T result = caseConjuntoCusto(conjuntoCusto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSchema(DomainSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSchema(ControlSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSchema(DataSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restricao</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricao</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestricao(Restricao object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coleta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coleta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColeta(Coleta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunto Coletas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunto Coletas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjuntoColetas(ConjuntoColetas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilidade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilidade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilidade(Utilidade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunto Rotas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunto Rotas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjuntoRotas(ConjuntoRotas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rota</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rota</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRota(Rota object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjunto Custo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjunto Custo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjuntoCusto(ConjuntoCusto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogmetamodelSwitch

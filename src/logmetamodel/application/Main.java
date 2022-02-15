package logmetamodel.application;

import java.util.ArrayList;

import logmetamodel.ConjuntoRotas;
import logmetamodel.ControlSchema;
import logmetamodel.DataSchema;
import logmetamodel.DomainSchema;
import logmetamodel.LogmetamodelFactory;

public class Main {
	public static void main(String[] args) throws InterruptedException, Exception {
		DomainSchema domainSchema = LogmetamodelFactory.eINSTANCE.createDomainSchema();
		DataSchema dataSchema = LogmetamodelFactory.eINSTANCE.createDataSchema();
		ControlSchema controlSchema = LogmetamodelFactory.eINSTANCE.createControlSchema();
		
		ConjuntoRotas rotas = LogmetamodelFactory.eINSTANCE.createConjuntoRotas();
		rotas.generateRoutes(5,2);
		
		System.out.println(rotas.getRota());
	}
}

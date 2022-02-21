package logmetamodel.application;

import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import logmetamodel.Coleta;
import logmetamodel.ConjuntoColetas;
import logmetamodel.ConjuntoRotas;
import logmetamodel.ControlSchema;
import logmetamodel.DataSchema;
import logmetamodel.DomainSchema;
import logmetamodel.LogmetamodelFactory;
import logmetamodel.Restricao;

public class Main {
	public static void main(String[] args) throws InterruptedException, Exception {
		DomainSchema domainSchema = LogmetamodelFactory.eINSTANCE.createDomainSchema();
		DataSchema dataSchema = LogmetamodelFactory.eINSTANCE.createDataSchema();
		ControlSchema controlSchema = LogmetamodelFactory.eINSTANCE.createControlSchema();
		ConjuntoColetas conjuntoColetas = LogmetamodelFactory.eINSTANCE.createConjuntoColetas();
		ConjuntoRotas rotas = LogmetamodelFactory.eINSTANCE.createConjuntoRotas();
		
		EList<Restricao> listaRestricoes = new BasicEList<Restricao>();
		Restricao restricao1 = LogmetamodelFactory.eINSTANCE.createRestricao();
		restricao1.setRestricaoId(0);
		restricao1.setDescricao("distância");
		restricao1.setPeso(2);
		restricao1.setValorMaximo(10000);
		Restricao restricao2 = LogmetamodelFactory.eINSTANCE.createRestricao();
		restricao2.setRestricaoId(1);
		restricao2.setDescricao("tempo");
		restricao2.setPeso(10);
		restricao2.setValorMaximo(3600);
		Restricao restricao3 = LogmetamodelFactory.eINSTANCE.createRestricao();
		restricao3.setRestricaoId(2);
		restricao3.setDescricao("desvio");
		restricao3.setPeso(5);
		restricao3.setValorMaximo(12000);
		listaRestricoes.add(restricao1);
		listaRestricoes.add(restricao2);
		listaRestricoes.add(restricao3);
		dataSchema.setRestricoes(listaRestricoes);


		domainSchema.setDataschema(dataSchema);
		domainSchema.setControlschema(controlSchema);
		dataSchema.setConjuntorotas(rotas);
		controlSchema.setConjuntocoletas(conjuntoColetas);
		
		rotas.generateRoutes(4,2);
		conjuntoColetas.createConjuntoColetas(2);
		
		for(Coleta c : conjuntoColetas.getColeta()) {
			c.setConjuntoCusto(rotas.getRota(),listaRestricoes);
		}
		
		for(Coleta c : conjuntoColetas.getColeta()) {
			c.calculateUtilidade(listaRestricoes);
		}
		
		System.out.println("----Rotas----\n"+domainSchema.getDataschema().getConjuntorotas().getRota()+"\n");
		System.out.println("----Restrições----\n"+dataSchema.getRestricao()+"\n");
		System.out.println("----Coletas----\n"+conjuntoColetas.getColeta().toString()+"\n");
		
		System.out.println("----Custos das Coletas------");
		for (Coleta c : conjuntoColetas.getColeta()) {
			System.out.println("----Coleta "+c.getColetaId()+"------");
			System.out.println(c.getConjuntocusto());
		}
		
		System.out.println("\n----Utilidade------");
		for (Coleta c : conjuntoColetas.getColeta()) {
			System.out.println("----Coleta "+c.getColetaId()+"------");
			System.out.println(c.getUtilidade());
		}

	}
}

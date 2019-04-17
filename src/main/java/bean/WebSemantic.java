/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import ontology.OntoClass;
import ontology.OntoIndividual;

public class WebSemantic {
    public static void main(String[] args){
        OntoClass scanners = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Scanner");
        
        OntoClass firewall = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Firewall");
        
        OntoClass integridade = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Integridade");
        OntoClass confidencialidade = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Confidencialidade");
        OntoClass autenticidade = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Autenticidade");
        OntoClass disponibilidade = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Disponibilidade");
        
        OntoClass interceptacao = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Interceptação");
        OntoClass interrupcao = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Interrupção");
        OntoClass modificacao = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Modificação");
        OntoClass personificacao = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Personificação");


        List<OntoIndividual> ontologiaIndividuos = scanners.getIndividuals();
        
        List<OntoIndividual> ontologiaFirewalls = firewall.getIndividuals();
        
        List<OntoIndividual> ontologiaIntegridade = integridade.getIndividuals();
        List<OntoIndividual> ontologiaConfidencialidade = confidencialidade.getIndividuals();
        List<OntoIndividual> ontologiaAutenticidade = autenticidade.getIndividuals();
        List<OntoIndividual> ontologiaDisponibilidade = disponibilidade.getIndividuals();
        
        List<OntoIndividual> ontologiaInterceptacao = interceptacao.getIndividuals();
        List<OntoIndividual> ontologiaInterrupcao = interrupcao.getIndividuals();
        List<OntoIndividual> ontologiaModificacao = modificacao.getIndividuals();
        List<OntoIndividual> ontologiaPersonificacao = personificacao.getIndividuals();




        //QUANTIDADE DE INDIVIDUOS INSERIDOS
        //System.out.println(ontologiaFirewalls.size());
        
        //GET NAS SCANNERS INSERIDAS NA LISTA ontologiaIndividuos
        OntoIndividual onto0 = ontologiaIndividuos.get(0);
        OntoIndividual onto1 = ontologiaIndividuos.get(1);
        OntoIndividual onto2 = ontologiaIndividuos.get(2);
        OntoIndividual onto3 = ontologiaIndividuos.get(3);
        OntoIndividual onto4 = ontologiaIndividuos.get(4);
        OntoIndividual onto5 = ontologiaIndividuos.get(5);
        
        //GET NOS FIREWALLS INSERIDOS NA LISTA ontologiaFirewalls
        OntoIndividual firewalls0 = ontologiaFirewalls.get(0);
        OntoIndividual firewalls1 = ontologiaFirewalls.get(1);
        OntoIndividual firewalls2 = ontologiaFirewalls.get(2);
        OntoIndividual firewalls3 = ontologiaFirewalls.get(3);
        
        //GET NAS CATEGORIAS DE VULNERABILIDADES INSERIDAS
        OntoIndividual integridade0 = ontologiaIntegridade.get(0);
        OntoIndividual confidencialidade1 = ontologiaConfidencialidade.get(0);
        OntoIndividual autenticidade2 = ontologiaAutenticidade.get(0);
        OntoIndividual disponibilidade3 = ontologiaDisponibilidade.get(0);

        //GET NAS CATEGORIAS DE ATAQUES
        OntoIndividual interceptacao0 = ontologiaInterceptacao.get(0);
        OntoIndividual interrupcao1 = ontologiaInterrupcao.get(0);
        OntoIndividual modificacao2 = ontologiaModificacao.get(0);
        OntoIndividual personificacao3 = ontologiaPersonificacao.get(0);
        
        // PRINTANDO OS GET CRIADOS ACIMA COM OS SEUS IRI
        
        //System.out.println(onto0.getIdentifier());
        //System.out.println(onto1.getIdentifier());
        //System.out.println(onto2.getIdentifier());
        //System.out.println(onto3.getIdentifier());
        //System.out.println(onto4.getIdentifier());
        //System.out.println(onto5.getIdentifier());
        
        //System.out.println(firewalls0.getIdentifier());
        //System.out.println(firewalls1.getIdentifier());
        //System.out.println(firewalls2.getIdentifier());
        //System.out.println(firewalls3.getIdentifier());

       //PRINTANDO AS LABEL's DAS SCANNERS DE VULNERABILIDADES
        System.out.println("Scanners de vulnerabilidades: \n");
        System.out.println("1- " + onto0.getLabel());
        System.out.println("2- " + onto1.getLabel());
        System.out.println("3- " + onto2.getLabel());
        System.out.println("4- " + onto3.getLabel());
        System.out.println("5- " + onto4.getLabel());
        System.out.println("6- " + onto5.getLabel());

       //PRINTANDO AS LABEL's DOS FIREWALLS 
        System.out.println("\nFirewalls: \n");
        System.out.println("1- " + firewalls0.getLabel());
        System.out.println("2- " + firewalls1.getLabel());
        System.out.println("3- " + firewalls2.getLabel());
        System.out.println("4- " + firewalls3.getLabel());

        //PRINTANDO AS CATEGORIAS DE VULNERABILIDADES QUE PODEM EXISTIR
        System.out.println("\nCategoria de Vulnerabilidades\n");
        System.out.println("Integridade: " + integridade0.getLabel());
        System.out.println("Confidencialidade: " + confidencialidade1.getLabel());
        System.out.println("Autenticidade:  " + autenticidade2.getLabel());
        System.out.println("Disponibilidade: " + disponibilidade3.getLabel());
        
        //PRINTANDO AS CATEGORIAS DE ATAQUES QUE PODEM EXISTIR
        System.out.println("\nCategoria de Ataques\n");
        System.out.println("Interceptação: " + interceptacao0.getLabel());
        System.out.println("Interrupção: " + interrupcao1.getLabel());
        System.out.println("Modificação:  " + modificacao2.getLabel());
        System.out.println("Personificação: " + personificacao3.getLabel());

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ontology.OntoClass;
import ontology.OntoIndividual;

/**
 *
 * @author isado
 */
@WebServlet(name = "NovoServlet", urlPatterns = {"/NovoServlet"})
public class NovoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String dos = request.getParameter("dos");
            String middle = request.getParameter("middle");
            String replaypersonificacaoquebraautenticacao = request.getParameter("replaypersonificacaoquebraautenticacao");
            String configuracaoIncorreta = request.getParameter("configuracaoIncorreta");
            String cross = request.getParameter("cross");
            String referenciaInsegura = request.getParameter("referenciaInsegura");
            String scanner = request.getParameter("scanner");
            String firewall = request.getParameter("firewall");
            
            //VARIAVEIS AUXILIARES
            
            String denial = "DoSNao";
            String middleIn = "MiddleNao";
            String replay = "ReplayPersonificacaoQuebraAutenticacaoNao";
            String config = "configuracaoIncorretaNao";
            String croscript = "crossNao";
            String ref = "referenciaInseguraNao";

            OntoClass scanners = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Scanner");
            OntoClass firewalls = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Firewall");
            OntoClass integridade = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Integridade");
            OntoClass confidencialidade = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Confidencialidade");
            OntoClass autenticidade = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Autenticidade");
            OntoClass disponibilidade = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Disponibilidade");
            OntoClass interceptacao = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Interceptação");
            OntoClass interrupcao = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Interrupção");
            OntoClass modificacao = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Modificação");
            OntoClass personificacao = new OntoClass("http://www.semanticweb.org/sherl/ontologies/2017/9/untitled-ontology-4#Personificação");
            
            List<OntoIndividual> ontologiaIndividuos = scanners.getIndividuals();
        
            List<OntoIndividual> ontologiaFirewalls = firewalls.getIndividuals();

            List<OntoIndividual> ontologiaIntegridade = integridade.getIndividuals();
            List<OntoIndividual> ontologiaConfidencialidade = confidencialidade.getIndividuals();
            List<OntoIndividual> ontologiaAutenticidade = autenticidade.getIndividuals();
            List<OntoIndividual> ontologiaDisponibilidade = disponibilidade.getIndividuals();

            List<OntoIndividual> ontologiaInterceptacao = interceptacao.getIndividuals();
            List<OntoIndividual> ontologiaInterrupcao = interrupcao.getIndividuals();
            List<OntoIndividual> ontologiaModificacao = modificacao.getIndividuals();
            List<OntoIndividual> ontologiaPersonificacao = personificacao.getIndividuals();

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
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Web Security</title>");            
            out.println("</head>");
            out.println("<body style='background-color:#E8E8E8'>");
            out.println("<h1 style='margin-left: 400px;'>");
            out.println("Dicas de Segurança em Desenvolvimento Web");
            out.println("</h1>");
            out.println("<h3>");
            if(dos.equals(denial)){
                out.println("Seu sistema pode sofrer ataque de: ");
                out.println("Interrupção: " + interrupcao1.getLabel());
                out.println("<br>");
            } else{
                out.println("");
            }
           // out.println("<br>");

            if(middle.equals(middleIn)){
                out.println("Seu sistema pode sofrer ataque de: ");
                out.println("Interceptação: " + interceptacao0.getLabel());
                out.println("<br>");
            } else{
                out.println("");
            }
            //out.println(middle);
            if(replaypersonificacaoquebraautenticacao.equals(replay)){
                out.println("Seu sistema pode sofrer ataque de: \n");
                out.println("Modificação:  " + modificacao2.getLabel());
                //out.println("<br>");
                System.out.println("Personificação: " + personificacao3.getLabel());
                out.println("<br>");
                out.println("Possui vulnerabilidade de: ");
                out.println("Autenticidade:  " + autenticidade2.getLabel());
            } else{
                out.println("");
            }
            out.println("<br>");
            //out.println(replaypersonificacaoquebraautenticacao);
            //out.println(configuracaoIncorreta);
            if(configuracaoIncorreta.equals(config)){
                out.println("Seu sistema possui vulnerabidade de: \n");
                out.println("Integridade: " + integridade0.getLabel());
            } else{
                out.println("");
            }

            out.println("<br>");
            if(cross.equals(croscript)){
                out.println("Seu sistema possui vulnerabilidade de: \n");
                out.println("Confidencialidade: " + confidencialidade1.getLabel());
            } else{
                out.println("");
            }
            //out.println(cross);
            out.println("<br>");
            
            if(referenciaInsegura.equals(ref)){
                out.println("Seu sistema possui vulnerabilidade de: \n");
                out.println("Disponibilidade: " + disponibilidade3.getLabel());
            } else{
                out.println("");
            }
            //out.println(referenciaInsegura);
            out.println("<br>");
            out.println("<br>");
            out.println("Recomendamos as seguintes scanners para detectar vulnerabilidades no seu sistema web: \n");
            out.println("<br>");
            //out.println(scanner);
            out.println("1- " + onto0.getLabel());
            out.println("<br>");
            out.println("2- " + onto1.getLabel());
            out.println("<br>");
            out.println("3- " + onto2.getLabel());
            out.println("<br>");
            out.println("4- " + onto3.getLabel());
            out.println("<br>");
            out.println("5- " + onto4.getLabel());
            out.println("<br>");
            out.println("6- " + onto5.getLabel());
            
            out.println("<br>");
            out.println("<br>");
            out.println("Recomendamos os seguintes firewalls para proteger seu sistema: \n");
            out.println("<br>");
            //out.println(firewall);
            out.println("1- " + firewalls0.getLabel());
            out.println("<br>");
            out.println("2- " + firewalls1.getLabel());
            out.println("<br>");
            out.println("3- " + firewalls2.getLabel());
            out.println("<br>");
            out.println("4- " + firewalls3.getLabel());
            out.println("<br>");
            out.println("<br>");
            out.println("</h3>");
            out.println("<h3 style='color:red;'>");
            out.println("Dúvidas sobre os ataques e vulnerabilidades: https://drive.google.com/file/d/15yYPOiodmmS");
            out.println("<br>");
            out.println("Para mais informações, acesse: https://www.owasp.org/index.php/Main_Page");
            out.println("</h3>");
            out.println("<a href='index' style='font-size:15px;'>");
            out.println("Voltar para o questionário");
            out.println("</a>");
                   //PRINTANDO AS LABEL's DOS FIREWALLS 
       
            
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
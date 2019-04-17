<%-- 
    Document   : index
    Created on : 04/12/2017, 21:21:37
    Author     : isado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Security</title>
    </head>
 <body style="background-color:#E8E8E8">
        
        <%HttpSession sesion = request.getSession();%>

        <h1 style="margin-left: 400px;">Dicas de Segurança em Desenvolvimento Web </h1>
        <h3 style="margin-left: 200px;">Sistema Web desenvolvido durante a disciplina de Web Semântica com o intuito de auxiliar usuários que não dominam a área de segurança</h3><br>
        <img src="imagens/logoSecurity.png" style="margin-left: 600px; height: 160px; width: 160px;"/><br>

        <form action="NovoServlet" method="post">
            
            <h3>1- Seu sistema verifica a quantidade de requisições enviadas por um determinado IP em uma certa quantia de tempo?</h3>
            <input type="radio" name="dos" value="DoSSim" >Sim<br>
            <input type="radio" name="dos" value="DoSNao">Não<br><br>
            
            <h3>2- Seu sistema possui criptografia para tokens, senhas etc?</h3>
            <input type="radio" name="middle" value="MiddleSim">Sim<br>
            <input type="radio" name="middle" value="MiddleNao">Não<br><br>
            
            <h3>3- Seu sistema toma cuidado ao não passar informações (variáveis e afins) através da URL?</h3>
            <input type="radio" name="replaypersonificacaoquebraautenticacao" value="ReplayPersonificacaoQuebraAutenticacaoSim">Sim<br>
            <input type="radio" name="replaypersonificacaoquebraautenticacao" value="ReplayPersonificacaoQuebraAutenticacaoNao">Não<br><br>
            
            <h3>4- Seu sistema possui restrições para configurações de páginas?</h3>
            <input type="radio" name="configuracaoIncorreta" value="configuracaoIncorretaSim">Sim<br>
            <input type="radio" name="configuracaoIncorreta" value="configuracaoIncorretaNao">Não<br><br>
            
            <h3>5- Seu sistema possui validações adequadas? <br> 
                Faça esse teste agora mesmo, caso queira testar! <br><br>
                Usuário: window.location.href=”www.qualquersite.com” <- entre a tag script<br>
                Senha: digitaQualquerUma <br></h3>
            <input type="radio" name="cross" value="crossSim">Sim<br>
            <input type="radio" name="cross" value="crossNao">Não<br><br>
            
            <h3>6- Seu servidor possui verificação de nível de acesso para arquivos com implementação da estrutura do banco de dados?</h3>
            <input type="radio" name="referenciaInsegura" value="refenreciaInseguraSim">Sim<br>
            <input type="radio" name="referenciaInsegura" value="referenciaInseguraNao">Não<br><br>
            
            <h3>7- Você costuma usar scanners de vulnerabilidades antes de hospedar seus sitemas?</h3>
            <input type="radio" name="scanner" value="scannerSim">Sim<br>
            <input type="radio" name="scanner" value="scannerNao">Não<br><br>
            
            <h3>8- Você costuma usar firewalls antes de hospedar seus sistemas?</h3>
            <input type="radio" name="firewall" value="firewallSim">Sim<br>
            <input type="radio" name="firewall" value="firewallNao">Não<br><br>
            
            <button style="background-color:black; color:white; font-size:15px;" type="submit">Verificar</button>

        </form>
    </body>
</html>

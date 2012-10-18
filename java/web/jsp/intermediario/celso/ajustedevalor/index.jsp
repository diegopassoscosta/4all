<%-- 
    Document   : index.jsp
    Created on : 10/10/2012, 14:52:44
    Author     : Celso Barreto - profCelsoBarreto@hotmail.com
--%>

<%@page import="br.org.senai.exemplo.pessoa.celso.PessoasComParametro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercicio2: com passagem de Parâmetros</title>
    </head>
    <body>
        <%
            PessoasComParametro pcp =new PessoasComParametro();            

            // A linha abaixo mostra valordo tipo String. 
            out.println("O Nome é: "+pcp.trocaNome("Qualquer nome que eu quiser </br>"));

            // A linha abaixo mostra valordo tipo inteiro.
            out.println("O Peso é: "+pcp.pesoDaPessoa(120)+"</br>");
            
            // A linha abaixo mescla dois tipos de valor: String e Inteiro
            out.println("O Nome é: "+pcp.trocaNome("Qualquer nome que eu quiser")+" O Peso é: "+pcp.pesoDaPessoa(120));
        %>
    </body>
</html>

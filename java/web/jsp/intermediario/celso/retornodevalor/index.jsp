<%-- 
    Document   : index.jsp
    Created on : 10/10/2012, 14:52:44
    Author     : Celso Barreto - profCelsoBarreto@hotmail.com
--%>

<%@page import="br.org.senai.exemplo.pessoa.celso.Pessoas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercicio1: Sem passagem de Parâmetros</title>
    </head>
    <body>
        <%
            Pessoas novonome =new Pessoas();            
            out.print("O Nome é: "+novonome.TrocaNome()+" e o peso é: "+novonome.PesoDaPessoa());            
        %>
    </body>
</html>

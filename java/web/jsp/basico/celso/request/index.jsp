<%-- 
    Document   : index
    Created on : 11/10/2012, 09:13:15
    Author     : vboxsenai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemplo de request</title>
    </head>
    <body>
       <%
        //Recebendo informações do formulário de contato: Nome,CPF
          String nome = request.getParameter("txtnome");
          String cpf = request.getParameter("txtcpf");
          
        //Verificando se o campo nome está vazio
          if(nome.equals("")){            
              out.println("preencha o campo nome");
              out.println("preencha o campo cpf");
          }else{
              out.println("o nome cadastrado é: "+nome);
              out.println("o cpf cadastrado é: "+cpf);
          } 
        %>
    </body>
</html>

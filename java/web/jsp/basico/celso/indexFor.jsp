<%-- 
    Document   : index
    Created on : 11/10/2012, 11:14:52
    Author     : Celso Barreto
    E-mail     : profCelsoBarreto@hotmail.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Utilizando Request e For</title>
    </head>
    <body>
        <%
            //Recebendo informações do formulário: Número      
            Integer num = Integer.parseInt(request.getParameter("intnum"));            

            if (num.equals("")) {
                out.println("Variável vazia");
            } else {
                for (int i = 1; i <= num; i++) {
                    out.println("</br>"+i+" : "+num);
                }

            }
            
%>
    </body>
</html>

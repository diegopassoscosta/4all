<%-- 
    Document   : calcSoma
    Created on : 18/09/2012, 11:24:46
    Author     : Celso Barreto - profCelsoBarreto@hotmail.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemplo de Soma de Dois Números</title>
    </head>
    <body>
        <h1>Soma dois números</h1>
        <form action="index.jsp" method="get">
            <input type="text" name="num1"/>
            <input type="text" name="num2"/>
             <input type="submit" value="enviar"/>
        </form>
        
        <%                         
            int a;
            int b;
            String r1= request.getParameter("num1");
            String r2= request.getParameter("num2");
            
            if((r1!=null) && (r2!=null)){
               
                a=Integer.parseInt(r1);
                b=Integer.parseInt(r2);
                out.println("O resultado da some é: "+ a+b);
            }
                             
        %>
    </body>
</html>

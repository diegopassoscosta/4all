<%-- 
    Document   : index
    Created on : 11/10/2012, 08:43:55
    Author     : Celso Barreto
    Email      : profCelsoBarreto@hotmail.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaração de Variáveis</title>
    </head>
    <body>
        <%
        // Declarando uma variável x do tipo inteira.
        //Delcarando uma variável y do tipo interia e atribuindo o valor 10.
            int x;        
            int y=10;
        //Declarando uma variável s do tipo String;
        //Declarando uma variável w do tipo String e atribuindo um valor;
            String s;
            String w="Qualquer texto";
            
        //Declarando uma variável v do tipo boolean;
        //Declarando uma variável f do tipo boolean e atribuindo um valor true;  
            boolean v;
            boolean f=true;
            
        //imprimindo os valores das variáveis em tela;
        //a TAG BR foi utilizada para quebra de linnha    
        out.println("Valor da variável inteira y: "+y+"</br>");               
        out.println("</br>");               
        out.println("Valor da variável String w: "+w+"</br>");
        out.println("</br>");               
        out.println("Valor da variável boolean f: "+f+"</br>");
        %>        
    </body>
</html>
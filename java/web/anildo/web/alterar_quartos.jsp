<%-- 
    Document   : quartos
    Created on : 14/10/2012, 11:58:44
    Author     : SIMATTOS
--%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
    <link href="css/principal.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu.css" rel="stylesheet" type="text/css"/>
    <link href="css/formulario.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu2.css" rel="stylesheet" type="text/css" />
    <script src="script/valida.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>     
        <div id="geral">
        <div class="bar"></div>  
	    <div id="topo"> <h1>Hotel Manager</h1> <h2>Sistema de Gerenciamento de Hotéis.</h2> </div>
        <div id="menu">        	
            <div id="menubv">
                    <h3><a href="principal.jsp"> Home </a></h3>
                    <b/><br/>
                    <h3>Cadastro</h3>
                    <b/>
                    <ul id="menuver">
                            <li><a href="consultar_cliente.jsp" title="Cadastrar Cliente">Cliente</a></li>
                            <li><a href="listar_funcionario.jsp" title="Funcionario">Funcionario</a></li>                        
                            <li><a href="listar_quartos.jsp" title="Cadastrar Quartos">Quartos</a></li>                    
                    </ul>
                    <br/>
                    <br/>
                    <h3>Reservar Quartos</h3>                                        
                    <ul id="menuver">                            
                            <li><a href="listar_servicos.jsp" title="Liberar Quartos">Liberar Quartos</a></li>                                            
                    </ul>
                    <br/>   
                    <br/>
                    <h3>Relatorios</h3>
                    <br/>
                    <ul id="menuver">                            
                            <li><a href="con_relatorio.jsp" title="Relatório Mensal">Relatório Mensal</a></li>                                            
                    </ul>
            </div>
        </div>

        <div id="corpo">             
            <br/>                            
                <br/>  
                  <%      
                            Model.Quarto quarto = new Model.Quarto();
                            int codigo = Integer.parseInt(request.getParameter("codigo"));
                            quarto.PegarQuarto(codigo);                            

                            Iterator itcodigo = quarto.licodigo.iterator();
                            Iterator itstatus = quarto.listatus.iterator();
                            Iterator ittipo = quarto.litipo.iterator();
                            Iterator itvalor = quarto.livalor.iterator();                            
                  %>
                  
                <div id="profissional">
                    <h3>Alterar Quartos</h3>  
                    <form  action="NewAlterarQuartos" method="post" name="profissional" id="form">                          
                        <input name="codigo" type="hidden" value="<%=itcodigo.next().toString()%>"/>
                        <label>Status:</label>  
                        <input type="text" name="status" obrigatorio="1" descricao="Status" value="<%=itstatus.next().toString()%>">                          
                        <label>Tipo:</label>  
                        <input type="text" name="tipo" obrigatorio="1" value="<%=ittipo.next().toString()%>"/>                          
                        <label>Valor:</label>  
                        <input type="text" name="valor" obrigatorio="1" value="<%=itvalor.next().toString()%>"/>                                                 
                        <input type="button" value="Enviar" name="enviar" onclick="submitar(profissional)"/>                         
                        <input type="button" value="Limpar" name="limpar" id="limpar"/> 
                    </form>  
                </div> 
                
        </div>
            
            <div id="jstl">
                <sql:setDataSource dataSource="jdbc:mysql://localhost:3306/projeto_senai,com.mysql.jdbc.Driver,anildo,anildo" var="conexao" scope="session"/>                                    
                
                <c:if test="${!empty param.categoria}">	
                    <sql:update dataSource="${conexao}" var="insercao" >	
                        insert categorias (categoria) values(?)		
                    <sql:param value="${param.categoria }"/>		
                    </sql:update>
                </c:if>                
            </div>

	    <div id="rodape"> 
            <p>  simattos11@gmail.com <br/> site reservado ao projeto do SENAI. <br/> Telefone: 8845-7152 / 9297-9957 </p>            
        </div>
    </div>
</div>
</body>
</html>
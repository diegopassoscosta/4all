<%-- 
    Document   : quartos
    Created on : 14/10/2012, 11:58:44
    Author     : SIMATTOS
--%>
<%@page import="java.util.Iterator"%>
<%@page import="Model.Funcionario"%>
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
                            Model.Funcionario funcionario = new Funcionario();
                            int codigo = Integer.parseInt(request.getParameter("codigo"));
                            funcionario.PegarFuncionario(codigo);

                            Iterator itcodigo = funcionario.codigo1.iterator();
                            Iterator itnome = funcionario.listanome.iterator();
                            Iterator itsenha = funcionario.listasenha.iterator();
                            
                  %>
                  
                <div id="profissional">
                    <h3>Cadastrar Profissional</h3>  
                    <form  action="NewAlterarFuncionario" method="post" name="profissional" id="form">                          
                        <input name="codigo" type="hidden" value="<%=itcodigo.next().toString()%>"/>
                        <label>Login:</label>  
                        <input type="text" name="login" obrigatorio="1" descricao="Valor Apresentado" value="<%=itnome.next().toString()%>">                          
                        <label>Senha:</label>  
                        <input type="text" name="senha" obrigatorio="1" value="<%=itsenha.next().toString()%>"/>                          
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
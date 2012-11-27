<%-- 
    Document   : quartos
    Created on : 14/10/2012, 11:58:44
    Author     : SIMATTOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <div id="cadastro-quartos">
                    <h3>Cadastrar Quarto</h3>  
                    <form  action="NewCadastrarQuartos" method="post" name="quartos" id="form">                          
                        <label>Tipo:</label>  
                        <input type="text" name="tipo" obrigatorio="1" descricao="Valor Apresentado">  
                        <label>Status:</label>                          
                        <select name="status" obrigatorio="1">
                            <option value="" selected>Selecione...</option>
                            <option value="1">Ativo</option>
                            <option value="2">Inativo</option>
                        </select>
                        <label>Valor:</label>  
                        <input type="text" name="valor" obrigatorio="1" />                          
                        <input type="button" value="Enviar" name="enviar" onclick="submitar(quartos)"/>                         
                        <input type="button" value="Limpar" name="limpar" id="limpar"/> 
                    </form>  
                </div>               
        </div>

	    <div id="rodape"> 
            <p>  simattos11@gmail.com <br/> site reservado ao projeto do SENAI. <br/> Telefone: 8845-7152 / 9297-9957 </p>            
        </div>
    </div>
</div>
</body>
</html>
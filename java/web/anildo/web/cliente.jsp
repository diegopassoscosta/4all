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
    <script src="script/valida.js" type="text/javascript"></script>
    <script src="script/formatar.js" type="text/javascript"></script>
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
                    <h3>Cadastrar Cliente</h3>  
                    <form  action="NewCadastrarClientes" method="post" name="formulario">                          
                        <label>Nome:</label>  
                        <input type="text" name="nome" id="1" descricao="Arquivo" />  
                        <label>Sobre Nome:</label>                          
                        <input type="text" name="sobrenome" id="1" descricao="Arquivo" />  
                        <label>Endereço:</label>                          
                        <input type="text" name="endereco" id="1" descricao="Arquivo" />  
                        <label>Data de Nascimento:</label>                          
                        <input type="text" name="data" id="1" descricao="Arquivo" onkeypress="formatar(this,'##/##/####');" maxlength="10"/>  
                        <label>Idade:</label>                          
                        <input type="text" name="idade" id="1" descricao="Arquivo"  />  
                        <label>Sexo:</label>                          
                        <input type="text" name="sexo" id="1" descricao="Arquivo"  />  
                        <label>Cpf:</label>                          
                        <input type="text" name="cpf" id="1" descricao="Arquivo" onkeypress="formatar(this,'###.###.###-##');" maxlength="14"/>  
                        <label>Rg:</label>                          
                        <input type="text" name="rg" id="1" descricao="Arquivo"  onkeypress="formatar(this,'########-##');" maxlength="11"/>  
                        <label>Telefone:</label>                          
                        <input type="text" name="telefone" id="1" descricao="Arquivo"  onkeypress="formatar(this,'##-####-####');" maxlength="12"/>  
                        <label>Cel:</label>                          
                        <input type="text" name="cel" id="1" descricao="Arquivo"  onkeypress="formatar(this,'##-####-####');" maxlength="12"/>  
                        
                        <input type="button" value="Enviar" name="enviar" onClick="ValidarCampos(formulario);"/>                         
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

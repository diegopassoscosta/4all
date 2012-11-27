<%-- 
    Document   : principal
    Created on : 14/10/2012, 11:56:41
    Author     : SIMATTOS
--%>
<%
    Model.Cliente cliente = new Model.Cliente();
    if (request.getParameter("excluirid_quarto") != ""){
        //excluir_categ request("excluirid_categ")
        cliente.deletar(request.getParameter("excluirid_quarto"));
    }            
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Cliente" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <link href="css/principal.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu2.css" rel="stylesheet" type="text/css" />
    <link href="css/formulario.css" rel="stylesheet" type="text/css" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="jquery/jquery-1.6.3.js"></script>
    
    <script type="text/javascript">
        $(document).ready(function(){
            $("#cadastro").hide('slow');
            $("#reservaQT").hide('slow');
            $("#relatorios").hide('slow');
            
            $('#example').dataTable();
            
            $("#cad").toggle(function() {
                $("#cadastro").hide('slow');
                }, function() {
                $("#cadastro").show('fast');
            });
            
            $("#res").toggle(function() {
                $("#reservaQT").hide('slow');
                }, function() {
                $("#reservaQT").show('fast');
            });
            
            $("#rel").toggle(function() {
                $("#relatorios").hide('slow');
                }, function() {
                $("#relatorios").show('fast');
            });                                    
            
        });
    </script>
</head>

<body>
	<div id="geral">
        <div class="bar"></div>  
	<div id="topo"> <h1>Hotel Manager</h1> <h2>Sistema de Gerenciamento de Hotéis.</h2> </div>
        <div id="menu">        	
            <div id="menubv">
                <h3><a href="principal.jsp"> Home </a></h3>
                    <b/><br/>                    
                   <h3 id="cad"><a href="#">Cadastro</a></h3>
                   <div id="cadastro">     
                        <b/>
                        <ul id="menuver">
                                <li><a href="consultar_cliente.jsp" title="Cadastrar Cliente">Cliente</a></li>
                                <li><a href="listar_funcionario.jsp" title="Funcionario">Funcionario</a></li>                        
                                <li><a href="listar_quartos.jsp" title="Cadastrar Quartos">Quartos</a></li>                    
                        </ul>
                    </div>                        
                    <br/>                                        
                    <h3 id="res"><a href="#">Reservar Quartos</a></h3>
                    <div id="reservaQT">
                        <ul id="menuver">                            
                                <li><a href="listar_servicos.jsp" title="Liberar Quartos">Liberar Quartos</a></li>                                            
                        </ul>
                    </div>                        
                    <br/>                       
                    <h3 id="rel"><a href="#"> Relatorios </a></h3>                    
                    <div id="relatorios">
                        <ul id="menuver">                            
                                <li><a href="con_relatorio.jsp" title="Relatório Mensal">Relatório Mensal</a></li>                                            
                        </ul>
                    </div>
            </div>
        </div>

        <div id="corpo"> 
            <div id="listar-quartos">
                    
                    <h4>Usuário <% out.println(session.getAttribute("usuario"));%> logado no sistema.                        
                    </h4> 
                    
                    <br/>
                    <h3>Reservas</h3>   
                    <div id="exemplos">
                        Tabela
                    </div>
                    
                    <table width="600" border="0" cellspacing="0" cellpadding=" 0">
                          <%                               
                            cliente.VerificarReservaInativa();

                            Iterator itcodigo = cliente.licodigo1.iterator();
                            Iterator itnome = cliente.listanome.iterator();
                            Iterator itidade = cliente.liidade1.iterator();
                            Iterator itsexo = cliente.lisexo1.iterator();
                            Iterator itcpf = cliente.licpf1.iterator();                            
                            Iterator ittelefone = cliente.listartelefone.iterator();
                            Iterator itcel = cliente.listarcel.iterator();
                          %>
                          <tr bgcolor="#CDC9C9"> 
                            <td width="59"><div align="center">Nome</div></td>                            
                            <td width="94"><div align="center">Sexo</div></td>
                            <td width="78"><div align="center">Cpf</div></td>                            
                            <td width="102"><div align="center">Telefone</div></td>
                            <td width="102"><div align="center">Celular</div></td>                            
                            <td width="41"><div align="center">Reservar</div></td>
                          </tr>
                          <%
                             int linha = 0;
                            String cor = "";
                            while(itcodigo.hasNext())
                            {
                                String codigo = itcodigo.next().toString();
                                //String idade = itidade.next().toString(); 
                                if(linha == 0){
                                    cor ="#FFFFFF";
                                    linha = 1;
                                }else{
                                    cor ="#F5F5DC";
                                    linha = 0;
                                }                                                              
                          %>
                          <tr bgcolor="<%=cor%>"> 
                              <td align="center"><%=itnome.next().toString()%></td>                              
                              <td align="center"><%=itsexo.next().toString()%></td>
                              <td align="center"><%=itcpf.next().toString()%></td>
                              <td align="center"><%=ittelefone.next().toString()%></td>
                              <td align="center"><%=itcel.next().toString()%></td> 
                              <td align="center"><a href="javascript:abrir('confirma.jsp?codigo=<%=codigo%>');"><img src="images/edit.png"/></a></td>
                            </tr>
                          <% } %>
                    </table>   
                </div>                              
        </div>

	    <div id="rodape"> 
            <p>  simattos11@gmail.com <br/> site reservado ao projeto do SENAI. <br/> Telefone: 8845-7152 / 9297-9957 </p>            
        </div>
    </div>
</div>
</body>
</html>
<script language="JavaScript"> 
    function abrir(URL) {  
        var width = 800;  var height = 400;  var center = 10;  var top = 100;  
        window.open(URL,'janela', 'width='+width+', height='+height+', top='+top+', left='+center+', scrollbars=yes, status=no, toolbar=no, location=no, directories=no, menubar=no, resizable=no, fullscreen=no'); 
    } 
</script> 



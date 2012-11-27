<%-- 
    Document   : listar_quartos
    Created on : 14/10/2012, 15:57:22
    Author     : SIMATTOS
--%>


<%@page import="java.awt.event.ItemEvent"%>
<%@page import="Model.Quarto" %>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Quarto quarto = new Quarto();
              
%>

<!DOCTYPE html>
<html>
<head>
    <link href="css/principal.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu.css" rel="stylesheet" type="text/css"/>        
    <link href="css/menu2.css" rel="stylesheet" type="text/css" />
    <link href="css/formulario.css" rel="stylesheet" type="text/css" />
    <script src="script/valida.js"></script>
    <script language="JavaScript" src="script/excluir_quarto.js"></script>
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
                <div id="listar-quartos">
                    <h3>Quartos Ocupados</h3>                      
                    <table width="600" border="0" cellspacing="0" cellpadding=" 0">
                          <%                            
                            quarto.LiberarQuarto();
                            
                            Iterator itnome = quarto.linomeCliente.iterator();                            
                            Iterator itvalor = quarto.livalorCalculado.iterator();                            
                            Iterator itdataEntrada = quarto.lidataEntrada.iterator();
                            Iterator itdataSaida = quarto.lidataSaida.iterator();
                            Iterator itdias = quarto.lidias.iterator();
                            Iterator itstatus = quarto.listatus.iterator();
                            Iterator ittipo = quarto.litipo.iterator();
                            Iterator itcodservico = quarto.licodigo.iterator();
                            Iterator itcodquarto = quarto.idQuarto.iterator();
                            Iterator itcodcliente = quarto.idCliente.iterator();                            
                            
                          %>
                          
                          <tr bgcolor="#CDC9C9"> 
                            <td width="59"><div align="center">None</div></td>
                            <td width="41"><div align="center">Valor</div></td>
                            <td width="94"><div align="center">Data Entrada</div></td>
                            <td width="78"><div align="center">Data Saida</div></td>
                            <td width="66"><div align="center">Dias</div></td>
                            <td width="102"><div align="center">Status</div></td>
                            <td width="102"><div align="center">Tipo</div></td>
                            <td width="102"><div align="center">baixa</div></td>
                          </tr>
                          <%
                            while(ittipo.hasNext())
                            {
                                String nome = itnome.next().toString();                                
                                String codcliente = itcodcliente.next().toString();
                                String codquarto = itcodquarto.next().toString();
                                String codservico = itcodservico.next().toString();

                          %>
                          <tr> 
                            <td align="center"><%=nome%></td>
                            <td align="center"><%=itvalor.next().toString()%></td>
                            <td align="center"><%=itdataEntrada.next().toString()%></td>
                            <td align="center"><%=itdataSaida.next().toString()%></td>
                            <td align="center"><%=itdias.next().toString()%></td>
                            <td align="center"><%=itstatus.next().toString()%></td>
                            <td align="center"><%=ittipo.next().toString()%></td>                           
                            <td><div align="center"><a href="NewBaixaServico?cliente=<%=codcliente%>&quarto=<%=codquarto%>&servico=<%=codservico%>"><img src="images/trashcan_empty.png" width="22" height="22"></a></div></td>
                          </tr>
                          <% } %>
                    </table>   
                </div>               
                <br/>
                <br/>
                      
                
        </div>
	    <div id="rodape"> 
            <p>  simattos11@gmail.com <br/> site reservado ao projeto do SENAI. <br/> Telefone: 8845-7152 / 9297-9957 </p>            
            </div>
    </div>

</div>
</body>
</html>

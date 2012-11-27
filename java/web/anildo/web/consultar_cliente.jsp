<%-- 
    Document   : listar_quartos
    Created on : 14/10/2012, 15:57:22
    Author     : SIMATTOS
--%>


<%@page import="Model.Quarto" %>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Model.Cliente cliente = new Model.Cliente();
%>

<!DOCTYPE html>
<html>
<head>
    <link href="css/principal.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu.css" rel="stylesheet" type="text/css"/>
    <link href="css/formulario.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu2.css" rel="stylesheet" type="text/css" />
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
                    <h3>Clietes</h3>                      
                    <table width="595" border="0" cellspacing="0" cellpadding=" 0">
                          
                          <%                            
                            cliente.Consultar();
                            
                            
                            Iterator itnome = cliente.listanome.iterator();
                            Iterator itcpf = cliente.licpf1.iterator();
                            Iterator itsexo = cliente.lisexo1.iterator();
                            Iterator ittelefone = cliente.listartelefone.iterator();
                            Iterator itcelular = cliente.listarcel.iterator();
                                                        
                          %>
                          
                          <tr>
                              <td colspan="4">
                                  <a href="cliente.jsp" class="img_cad"><img src="images/cad.png"></a>
                              </td>
                              <td>
                                 
                              </td> 
                          </tr>                          
                          <tr bgcolor="#CDC9C9"> 
                            <td width="59" class="titulo"><div align="center">Nome</div></td>
                            <td width="41" class="titulo"><div align="center">Cpf</div></td>
                            <td width="94" class="titulo"><div align="center">Sexo</div></td>
                            <td width="78" class="titulo"><div align="center">Telefone</div></td>
                            <td width="66" class="titulo"><div align="center">Celular</div></td>                            
                          </tr>
                          <%
                            int linha = 0;
                            String cor = "";
                            while(itnome.hasNext())
                            {
                                if(linha == 0){
                                    cor ="#FFFFFF";
                                    linha = 1;
                                }else{
                                    cor ="#F5F5DC";
                                    linha = 0;
                                }
                                //String codigo = itcodigo.next().toString();

                          %>
                          <tr class="dif" bgcolor="<%=cor%>"> 
                            <td align="center" ><%=itnome.next().toString()%></td>
                            <td align="center" ><%=itcpf.next().toString()%></td>
                            <td align="center" ><%=itsexo.next().toString()%></td>
                            <td align="center" ><%=ittelefone.next().toString()%></td>
                            <td align="center" ><%=itcelular.next().toString()%></td>                            
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

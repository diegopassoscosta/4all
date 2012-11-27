<%-- 
    Document   : quartos
    Created on : 14/10/2012, 11:58:44
    Author     : SIMATTOS
--%>

<%@page import="java.sql.Date"%>
<%@page import="Model.Quarto"%>
<%@page import="java.util.Iterator"%>
<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="css/principal.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu.css" rel="stylesheet" type="text/css"/>
    <link href="css/formulario.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu2.css" rel="stylesheet" type="text/css" />
    <script src="script/valida.js"></script>
    <script src="script/formatar.js"></script>
    <script src="script/numero.js"></script>
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
	<div id="geral">
        <div class="bar"></div>  	        
        <div id="corpo">             
            <br/>                            
                <br/>                
                <div id="cadastro-quartos">
                    <h3>Confirmar Reserva</h3>  
                    <form  action="NewConfirmarReserva" method="post" name="reserva" id="form">                         
                        <label>Cliente:</label>  
                        <select name="id_cliente" obrigatorio="1">
                            <%
                                
                                Cliente cliente = new Cliente();
                                cliente.ValidarCliente(Integer.parseInt(request.getParameter("codigo")));
                                
                                Iterator itcodigo = cliente.licodigo1.iterator();
                                Iterator itnome = cliente.listanome.iterator();
                                Iterator itcpf = cliente.licpf1.iterator();
                                
                                while(itcodigo.hasNext()){ 
                                    
                                String codigo = itcodigo.next().toString();                                 
                                String nome = itnome.next().toString();                                
                                String nomeCompleto =  itcpf.next().toString() +" "+nome;
                                
                            %>
                            
                                <option value="<%=codigo%>" selected><%=nomeCompleto%></option>
                                
                            <% } %>
                        </select> 
                        
                        <label>Tipo:</label>                          
                        <select name="id_quarto" id="id_quarto" onchange="afixar(reserva);">
                            <option selected="selected">Escolha um quarto</option>
                            <%
                                Quarto quarto = new Quarto();
                                quarto.ConsultarLivre();
                                
                                Iterator itcodigo1 = quarto.licodigo.iterator();
                                Iterator ittipo = quarto.litipo.iterator();
                                Iterator itvalor = quarto.livalor.iterator();
                                        
                                while(itcodigo1.hasNext()){
                                    String codigo1 = itcodigo1.next().toString();                                 
                                    String tipo = ittipo.next().toString();
                                    String valor = itvalor.next().toString();
                            %>
                            <option value="<%=valor%>,<%=codigo1%>" valor_qt="<%=valor%>"><%=tipo%></option>                                
                            
                            <% } %>                        
                        </select>
                        
                        <input type="hidden" name="id_quarto1" id="id_quarto1" value="">                         
                        <input type="hidden" name="valor_quarto" id="valor_quarto" value="">                         
                        
                        <label>Diaria:</label>  
                        <input type="text" name="dias" id="1" obrigatorio="1" maxlength="4" onkeypress="Enum(this);"  onblur="reserva.valor_acumulado.value = eval(reserva.dias.value * reserva.valor_quarto.value);"/>                          
                        
                        <label>Total:</label>                           
                        <input type="text" name="valor_acumulado" obrigatorio="1" value="" />                          
                        <label>Data Entrada:</label>  
                        <input type="text" name="data_entrada" obrigatorio="1"  onkeypress="formatar(this,'##/##/####');" maxlength="10"/>                          
                        <label>Data Saida:</label>  
                        <input type="text" name="data_saida" obrigatorio="1" onkeypress="formatar(this,'##/##/####');" maxlength="10" />                          
                        <label>Status:</label>  
                        <select name="id_status">
                            <option value="1"> Ativo </option>
                            <option value="2"> Inativo </option>
                        </select>
                        <br/>                        
                        <input type="button" value="Enviar" name="enviar" onclick="ValidarCampos(reserva)"/>                         
                        <input type="button" value="Fechar" name="limpar" id="limpar" onclick="window.opener.location.reload();window.close();" /> 
                    </form>  
                </div>               
        </div>	    
    </div>
</div>
</body>
</html>
<SCRIPT LANGUAGE="javascript">
    function afixar() { 
        
        var dados = document.getElementById('id_quarto').value;
        novoArray = dados.split(',',2);
        
        var valor = novoArray[0];
        var codquarto = novoArray[1];
        
        alert(valor);
        alert(codquarto);                
        
        document.reserva.valor_quarto.value = valor;
        document.reserva.id_quarto1.value = codquarto;                             
    } 
</SCRIPT>
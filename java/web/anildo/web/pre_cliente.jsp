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
    <link href="css/formulario.css" rel="stylesheet" type="text/css"/>    
    <script src="script/valida.js"></script>
    <script src="script/formatar.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>	                         
                <div id="corpo">
                    <h3>Cadastrar Cliente</h3>  
                    <form  action="NewPre_reservas" method="post" name="formulario">                          
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
</body>
</html>

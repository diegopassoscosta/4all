<%-- 
    Document   : index
    Created on : 11/10/2012, 15:12:17
    Author     : SIMATTOS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
﻿<html>
    
<head>
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
    <link href="css/principal.css" rel="stylesheet" type="text/css"/>
    <link href="css/menu.css" rel="stylesheet" type="text/css"/>   
    
    <link href="../style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="jquery-carrocel/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="jquery-carrocel/jquery.jcarousel.min.js"></script>
    <link rel="stylesheet" type="text/css" href="jquery-carrocel/skin.css" />

<script type="text/javascript">

jQuery(document).ready(function() {
    jQuery('#mycarousel').jcarousel({
        vertical: true,
        scroll: 2
    });
});

</script>
</head>

<body>
	<div id="geral">
        <div class="bar"></div>  
	    <div id="topo"> <h1>Hotel Manager</h1> <h2>Sistema de Gerãnciamento de Hotéis.</h2> </div>
        <div id="menu">
        	
            <div id="quartos">                
                <ul id="mycarousel" class="jcarousel jcarousel-skin-tango">
                    <li><img src="images/luxo.png" width="171" height="134" alt="Quarto de Luxo, Valor 500" /></li>                    
                    <li><img src="images/simples.png" width="171" height="134" alt="Quarto de Simples, Valor 300" /></li>
                    <li><img src="images/luxo.png" width="171" height="134" alt="Quarto de Luxo, Valor 500" /></li>                    
                    <li><img src="images/luxo.png" width="171" height="134" alt="Quarto de Luxo, Valor 500" /></li>
                    <li><img src="images/simples.png" width="171" height="134" alt="Quarto de Simples, Valor 300" /></li>
                    <li><img src="images/luxo.png" width="171" height="134" alt="Quarto de Luxo, Valor 500" /></li>                    
                </ul>
            </div>

        	<div id="login">        		
        		<form name="login" method="post" action="NewConsultarFuncionario" class="login"> 
					<br/>
					<caption><h3>Area Administrativa</h3></caption>
					<br/><br/>
					<label>Usuário: 
						<input name="login" type="text" tabindex="1" size="15" class="campos"> 
						<br/>
					</label>

					<label>Senha: 
						&nbsp;&nbsp;
						<input name="senha" type="password" tabindex="2" size="15" class="campos"> 
						<br/><br/>
					</label> 
                                                <input type="submit" name="Submit" value="Enviar" tabindex="3" class="botao">&nbsp;						
						<input type="reset" name="Submit" value="Cancelar" tabindex="3" class="botao">
						<br/>
					
				</form>
        	</div>
        </div>

        <div id="corpo"> 
            <p> <h2> Seja Bem vindo! </h2> </p>
            <br/>            
                <caption> <h3>Guardai contigo apenas as coisas boas </h3></caption>
                <br/>                
                <h5>
                    Não te atenha a guardar contigo as coisas ruins, por que é como o homem que guarda em seu terreno o lixo e coisas podres: sempre se sentirá mal, e lhe ocorrerão doenças, e quem o ver dirá: aquele homem sóguarda coisas podres, e outros dirão ainda que ele é porco, é sujo, é doente e é fedido por que guarda coisas ruins, e assim todos se afastarão dele.
                    <br><br>
                    Tu, portanto, cuidarás em guardar contigo apenas as coisas boas, como aquele que acolhe flores em seu terreno, e assim sempre se sentirá bem, gozará de boa saúde, e quem o ver dirá que tu és bom, que és puro, e que tudo em ti exala bom perfume e bons sentimentos por que guardas coisas boas, e serão muitos os que terão prazer em se aproximar de ti, por que tua morada será como um majestoso jardim, e tua vida será sempre repleta de flores.
                    <br/><br/>
                    <i>Augusto Branco</i>
                </h5>
                <div id="pre-reserva">
                    <a href="javascript:abrir('pre_cliente.jsp');"> <img src="images/post-it.png"> </a>   
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
        var width = 620;  var height = 500;  var center = 10;  var top = 100;  
        window.open(URL,'janela', 'width='+width+', height='+height+', top='+top+', left='+center+', scrollbars=yes, status=no, toolbar=no, location=no, directories=no, menubar=no, resizable=no, fullscreen=no'); 
    } 
</script> 

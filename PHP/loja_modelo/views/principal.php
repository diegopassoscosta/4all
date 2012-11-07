<?php
ob_start();
require_once("../lib/secao.php");
require_once('../lib/conexao.php');
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
    
    <title>Loja Virtual</title>
    
    <link rel="icon" href="../img/favicon.ico" />
    <link rel="stylesheet" type="text/css" href="../css/newsletter.generic.css" />
    <link rel="stylesheet" type="text/css" href="../css/menu.css" />

    <script language="JavaScript1.2" src="../js/funcoes.js" type="text/javascript"></script>
    
    <script language="JavaScript1.2" type="text/javascript">
        
        function logout(){
            if (confirm('Deseja realmente sair do sistema?')){
        		window.location.href = '../lib/logout.php';
        	}else{
        		return false;
        	};
        }
    </script>  
</head>
<body onLoad='resizeFields();'>
    <div id="container">
        <div id="header"><img src="../img/newsLetter.png" alt="eNewsletter"/></div>
        <div id="content">
            <div id="logout" style="padding-bottom:8px; font-size: 11px; border-bottom:solid #cccccc 0.1em; margin-bottom:26px;">
                <div style="text-align:right;">
	                Seja bem vindo: <b><?php echo $_SESSION['dados']['usuario']["login"]?></b>
	               ( <a href="#" onclick="logout();">Sair</a> )
				</div>
            </div>        
            <?php
            include('menu.php');
            ?>
			<div id="logout" style="padding-bottom:8px; font-size: 11px; border-bottom:solid #cccccc 0.1em; margin-bottom:26px;">
            </div>             
            <!-- CONTEÚDO DA PAGINA -->    
            <br/>
            <br/>
            <?php
           	$path = 'principal.php?view=' . $_GET['view']; 
            if ($_GET['view'] != ''){
            	require_once ($_GET['view'] .'/' . $_GET['link'] . '.php');
            }
            ?>
            <!-- CONTEÚDO DA PAGINA -->
        </div>
        <div id="footer">Copyright® <b>Ágape Treinamentos e Consultoria</b> 2010</div>
    </div>  
</body>
</html>
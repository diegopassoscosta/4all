<?php 
//STARTA AS SESSÕES QUE SERÃO CRIADAS NO SERVIDOR
session_start();
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
	
    <style type="text/css">#content{min-height: 160px;}</style>
	<link rel="stylesheet" type="text/css" href="../FrameWork/css/estilos.css" />
	<link rel="stylesheet" type="text/css" href="../FrameWork/css/menu.css" />
</head>
<body>
    <div id="container">
        <div id="content">
            
            <div id="login">
            <fieldset style="padding:15px;padding-top:0px;">
                <legend style="margin-left:0px;">Acesso ao Sistema</legend>
                <form name="form1" action="index.php" method="post">
					<input type="hidden" name="acao" value="1" />
					<input type="hidden" name="operacao" value="2" />

					<label style="margin-top:10px;">Login</label>
					<input style="width:99%" type="text" name="login"/>
					<label>Senha</label>
					<input type="password" name="senha" style="width:200px; display:inline;"/>
					<input name="logar" type="submit" value="Logar" style="width:49px;" />
				</form>
            </fieldset>
			<?php
            if ( $_REQUEST['resp_erro'] != "" ){
            	require( "../lib/msg_generica.php" );
            }                       
            ?>            
			</div>            
        </div>
        <div id="footer"><img src="../img/newsLetterLogin.png" /></div>
    </div>  
</body>
</html>
<?php 
if ($_REQUEST['acao'] == 1 && $_REQUEST['operacao'] == 2) {
		
	$sql = " SELECT";
	$sql.= "   u.id";
	$sql.= "  ,u.login";
	$sql.= "  ,u.senha";
	$sql.= " FROM";
	$sql.= "  usuarios u ";
	$sql.= " WHERE";
	$sql.= "     u.login     = '" . $_REQUEST['login'] . "'";
	$sql.= "     AND u.senha = MD5('" . $_REQUEST['senha'] . "')";


	$rs    = mysql_query($sql) or die(mysql_error());
	$linha = mysql_fetch_array($rs);
	
	if ($linha['id'] != '') {
		$_SESSION["dados"]['usuario']['id']    =  $linha['id'];
		$_SESSION["dados"]['usuario']['login'] =  $linha['login'];
				
		header('location:principal.php');
	}else{
		header('location:index.php?resp_erro=Usuário ou senha inválidos.');
	}
}
?>


<?php 
	require_once("conexao.php");
			
	extract($_POST);
	$query_insert = "INSERT INTO usuario 
		(usu_nome,usu_senha, usu_ativo, usu_login) 
			values 
		('".$txt_nome."', '".$txt_senha."', ".$rad_ativo.",'".$txt_login."');";
	//exit($query_insert);
	$result_insert = mysql_query($query_insert);
	
	if(!$result_insert){
		header('Location: usuario_lista.php?msg='.mysql_error());
	}else{
		header('Location: usuario_lista.php?msg=Inserido com sucesso!');
	}
?>

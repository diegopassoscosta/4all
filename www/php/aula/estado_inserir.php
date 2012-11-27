<?php 
	require_once("conexao.php");
			
	extract($_POST);
	$query_insert = "INSERT INTO estado 
		(est_nome, est_sigla) 
			values
		('".$txt_nome."', '".$txt_sigla."');";
	//exit($query_insert);
	$result_insert = mysql_query($query_insert);
	
	if(!$result_insert){
		header('Location: estado_lista.php?msg='.mysql_error());
	}else{
		header('Location: estado_lista.php?msg=Inserido com sucesso!');
	}
?>

<?php 
	require_once("conexao.php");
			
	extract($_POST);
	$query_insert = "INSERT INTO cidade 
		(fk_est_id, cid_nome) values ('".$txt_estado_sigla."', '".$txt_nome."')";
	$result_insert = mysql_query($query_insert);
	
	if(!$result_insert){
		header('Location: cidade_lista.php?msg='.mysql_error());
	}else{
		header('Location: cidade_lista.php?msg=Inserido com sucesso!');
	}
?>

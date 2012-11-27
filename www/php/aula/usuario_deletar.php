<?php 
	require_once("conexao.php");
	
	$query_delete = "DELETE FROM usuario 
				WHERE usu_id =".$_GET['id'].";";
	//exit($query_delete);
	$result_delete = mysql_query($query_delete);
	
	if(!$result_delete){
		header('Location: usuario_lista.php?msg='.mysql_error());
	}else{
	header('Location: usuario_lista.php?msg=Excluido com sucesso!');
	}
?>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<?php
	//warning (Aviso)
	//include_once("conexao.php");

	require_once("conexao.php");// Fatal error

	$query = "SELECT * FROM estado";
	$result = mysql_query($query);

	if(!$result){
		die("Query não executada". mysql_error());
	}
?>
<center>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Nome</td>
			<td>Sigla</td>
			<td>Opções</td>
		</tr>
		<?php 
			while ($registro = mysql_fetch_array($result)) { 
		?>
		<tr>
			<td><?php echo($registro['est_id']); ?></td>
			<td><?php echo(utf8_encode($registro['est_nome'])); ?></td>
			<td><?php echo($registro['est_sigla']); ?></td>
	<td>
	<a href="estado_deletar.php?id= <?php echo($registro['est_id']);?>">Deletar
	</a>
	</td>
		</tr>
		<?php
			}	
		?>
	</table>

	<form method="POST" action="estado_inserir.php">
		Nome: <input type="text" name="txt_nome" /></br>
		sigla: <input type="text" name="txt_sigla" maxlength="2" /></br>
		<input type="submit" value="Inserir"/></br>
	</form>
</center>
<?php 
	echo($_GET['msg']);
?>






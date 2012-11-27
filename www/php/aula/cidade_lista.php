<?php
	//warning (Aviso)
	//include_once("conexao.php");

	require_once("conexao.php");// Fatal error

	$query = "SELECT DISTINCT(est_id), 
			est_nome, 
			est_sigla,
			cid_nome
		  FROM estado
		  INNER JOIN cidade ON estado.est_id=cidade.fk_est_id";
	$result = mysql_query($query);

	if(!$result){
		die("Query não executada". mysql_error());
	}
?>
<center>
	<form method="POST" action="cidade_inserir.php">
		Nome: <input type="text" name="txt_nome" /></br>
		Id do Estado: <input type="text" name="txt_estado_sigla" maxlength="2" /></br>
		<input type="submit" value="Inserir"/></br>
	</form>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Nome</td>
			<td>Estado</td>
			<td>Cidade</td>
			<td>Opcoes</td>
		</tr>
		<?php 
			while ($registro = mysql_fetch_array($result)) { 
		?>
		<tr>
			<td><?php echo($registro['est_id']); ?></td>
			<td><?php echo($registro['est_nome']); ?></td>
			<td><?php echo($registro['est_sigla']); ?></td>
			<td><?php echo($registro['cid_nome']); ?></td>
	<td>
	<a href="cidade_deletar.php?id= <?php echo($registro['cid_id']);?>">Deletar
	</a>
	</td>
		</tr>
		<?php
			}	
		?>
	</table>

	
</center>
<?php 
	echo($_GET['msg']);
?>






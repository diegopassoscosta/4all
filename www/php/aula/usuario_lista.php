<?php
	//warning (Aviso)
	//include_once("conexao.php");

	require_once("conexao.php");// Fatal error

	$query = "SELECT * FROM usuario";
	$result = mysql_query($query);

	if(!$result){
		die("Query não executada". mysql_error());
	}
?>
<form method="POST" action="usuario_inserir.php">
	Nome: <input type="text" name="txt_nome" /></br>
	Usuário: <input type="text" name="txt_login" /></br>
	Senha: <input type="password" name="txt_senha" /></br>
	Sim<input type="radio" name="rad_ativo" value="1" />
	Não<input type="radio" name="rad_ativo" value="0" /></br>
	<input type="submit" value="Inserir"/></br>
</form>
<table>
	<tr>
		<td>ID</td>
		<td>Nome</td>
		<td>Login</td>
		<td>Senha</td>
		<td>Ativo</td>
		<td>Opções</td>
	</tr>
	<?php 
		while ($registro = mysql_fetch_array($result)) { 
        ?>
	<tr>
		<td><?php echo($registro['usu_id']); ?></td>
		<td><?php echo($registro['usu_nome']); ?></td>
		<td><?php echo($registro['usu_login']); ?></td>
		<td><?php echo($registro['usu_senha']); ?></td>
		<td><?php echo($registro['usu_ativo']); ?></td>
<td>
<a href="usuario_deletar.php?id= <?php echo($registro['usu_id']);?>">Deletar
</a>
</td>
	</tr>
	<?php
		}	
	?>
</table>
<?php 
	echo($_GET['msg']);
?>






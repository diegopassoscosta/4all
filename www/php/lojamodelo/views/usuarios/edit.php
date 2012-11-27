<?php 
    $sql = "SELECT";
    $sql.= "   u.id";
    $sql.= "  ,u.login";
    $sql.= " FROM";
    $sql.= "  usuarios u";
    $sql.= " WHERE";
   	$sql.= "    u.id = " . $_REQUEST['id'];
    
    $rs  = mysql_query($sql) or die(mysql_error());
    $row = mysql_fetch_object($rs);  
?>
<form name="form1" method="post" action="<?php echo $path?>&link=edit">
    <input type="hidden" name="acao" value="2">
    <input type="hidden" name="operacao" value="2">
    <input type="hidden" name="id" value="<?php echo $row->id?>">
    
    <fieldset id='form'>
	    <legend>Alterar Usuário</legend>
	    
	    <table width="100%" class="tabela_interna" border="0">
	        <tr>
	            <td style="width:20%; text-align:left;">* Login:</td>
	            <td style="width:80%;">
	                <input type="text" name="login" maxlength="100" class="input_texto" value='<?php echo $row->login?>'>
	            </td>
	        </tr>
	        <tr>
	            <td style="width:20%; text-align:left;">* Senha:</td>
	            <td style="width:80%;">
	                <input type="password" name="senha" class="input_texto">
	            </td>
	        </tr>
	        <tr>
	            <td colspan="2">* obrigat&oacute;rio(s)</td>
	        </tr>
	        <tr align="center"> 
	            <td colspan="2"> 
						<input name="submit" type="submit" value="Salvar">
		                <input name="reset" type="reset" value="Limpar">
		                <input name="button" type="button" value="Voltar" onClick="location.href = '<?php echo $path?>&link=index'">                
	            </td>
	        </tr>
 			<tr align="center"> 
            <td colspan="2"> 
				<?php 
				
				if ( $_REQUEST['resp_erro'] != "" ){
					require( "../lib/msg_generica.php" );
				}elseif( $_REQUEST['msg_ok'] != "" ){
					require( "../lib/msg_ok.php" );
				}
				?>
            </td>
        </tr>
    </table>        
    </fieldset>
</form>

<?php
if ($_REQUEST['acao'] == 2 && $_REQUEST['operacao'] == 2){
	$sql = "UPDATE usuarios SET";
	$sql.= "    login  = '" . $_REQUEST['login'] . "'";
	
	if($_REQUEST['senha'] != ''){
		$sql.= "   ,senha  = MD5('" . $_REQUEST['senha'] . "')";
	}
	
	$sql.= " WHERE ";
	$sql.= "  id = " . $_REQUEST['id'];
	
	mysql_query($sql) or die(mysql_error());
	
	header('location:' . $path . '&link=edit&id=' . $_REQUEST['id'] . '&msg_ok=ok');
}

?>
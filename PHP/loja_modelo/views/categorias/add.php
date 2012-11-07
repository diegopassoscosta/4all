<form name="form1" method="post" action="<?php echo $path?>&link=add">
    <input type="hidden" name="acao" value="1">
    <input type="hidden" name="operacao" value="2">
    
    <fieldset id='form'>
    <legend>Cadastrar Categoria</legend>
    
    <table width="100%" class="tabela_interna" border="0">
        <tr>
            <td style="text-align:left;">Categoria Pai:</td>
            <td style="text-align: left;">
                <select name="categoria_id" style="width:315px;">
                	<option value=''>* Selecione</option>
                	<?php 
				    $sql = "SELECT";
				    $sql.= "   c.id";
				    $sql.= "  ,c.nome";
				    $sql.= " FROM";
				    $sql.= "  categorias c";
				    $sql.= " WHERE ";
				    $sql.= " 	categoria_id IS NULL ";
				    $sql.= " ORDER BY c.nome";
				    
				    $rs = mysql_query($sql) or die( mysql_error());
				    
				    while($row = mysql_fetch_object($rs)){ 
				    ?>
	                	<option value='<?php echo $row->id?>'><?php echo $row->nome?></option>
	                <?php 
				    }
	                ?>
                </select>
            </td>
        </tr>
        <tr>
            <td style="text-align:left;">* Nome:</td>
            <td>
                <input type="text" name="nome" maxlength="100" class="input_texto">
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
if ($_REQUEST['acao'] == 1 && $_REQUEST['operacao'] == 2){
	$sql = "INSERT INTO categorias (";
	$sql.= "   nome";
	$sql.= "  ,categoria_id";
	$sql.= ")VALUES(";
	$sql.= "   '" . $_REQUEST['nome'] . "'";
	
	if($_REQUEST['categoria_id'] != ''){
		$sql.= "  , " . $_REQUEST['categoria_id'];
	}else {
		$sql.= "  , NULL";
	}
	
	$sql.= ")";
	
	mysql_query($sql) or die(mysql_error());
	
	header('location:' . $path . '&link=add&msg_ok=ok');
}

?>
<form name="form1" method="post" action="<?php echo $path?>&link=add" enctype="multipart/form-data">
    <input type="hidden" name="acao" value="1">
    <input type="hidden" name="operacao" value="2">
    
    <fieldset id='form'>
    <legend>Cadastrar Produto</legend>
    
    <table width="100%" class="tabela_interna" border="0">
        <tr>
            <td style="text-align:left;">* Categoria:</td>
            <td style="text-align: left;">
                <select name="categoria_id" style="width:80%;">
                	<option value=''>* Selecione</option>
                	<?php 
				    $sql = "SELECT";
				    $sql.= "   c.id";
				    $sql.= "  ,c.nome";
				    $sql.= " FROM";
				    $sql.= "  categorias c";
				    $sql.= " WHERE ";
				    $sql.= " 	categoria_id IS NOT NULL ";
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
            <td style="text-align:left;">* Marca:</td>
            <td style="text-align: left;">
                <select name="marca_id" style="width:80%;">
                	<option value=''>* Selecione</option>
                	<?php 
				    $sql = "SELECT";
				    $sql.= "   m.id";
				    $sql.= "  ,m.nome";
				    $sql.= " FROM";
				    $sql.= "  marcas m";
				    $sql.= " ORDER BY m.nome";
				    
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
            <td style="text-align:left;">* Resumo:</td>
            <td>
                <input type="text" name="resumo" maxlength="100" class="input_texto">
            </td>
        </tr>
        <tr>
            <td style="text-align:left;">* Imagem:</td>
            <td>
                <input type="file" name="imagem" class="input_texto">
            </td>
        </tr>        
        <tr>
            <td style="text-align:left;">* Valor:</td>
            <td>
                <input type="text" name="valor" maxlength="100" class="input_texto" style='width: 100px;'>
            </td>
        </tr>
        <tr>
            <td style="text-align:left;">* Peso:</td>
            <td>
                <input type="text" name="peso" maxlength="100" class="input_texto" style='width: 100px;'>
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
	
	require_once('../lib/UploadFiles.php');
	$upload = new UploadFiles();
	
	extract($_REQUEST);
	
	$upload->upload('../img/produtos/', $_FILES['imagem']);
	
	
	$sql = "INSERT INTo produtos(";
	$sql.= "   categoria_id";
	$sql.= "  ,marca_id";
	$sql.= "  ,resumo";
	$sql.= "  ,valor";
	$sql.= "  ,peso";
	$sql.= "  ,nome";
	$sql.= "  ,imagem";
	$sql.= ")VALUES(";
	$sql.= 	        $categoria_id;
	$sql.= "  ,"  . $marca_id;
	$sql.= "  ,'" . $resumo . "'";
	$sql.= "  ,"  . str_replace(',', '.', str_replace('.', '', $valor));
	$sql.= "  ,"  . $peso;
	$sql.= "  ,'" . $nome . "'";
	$sql.= "  ,'" . $upload->getNameFile() . "'";
	$sql.= ")";
	
//	die($sql);
	
	mysql_query($sql) or die(mysql_error());
	
	header('location:' . $path . '&link=add&msg_ok=ok');
}

?>

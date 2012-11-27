<?php 
    $sql = " SELECT ";
    $sql.= "   p.id";
    $sql.= "  ,p.categoria_id";
    $sql.= "  ,p.marca_id";
    $sql.= "  ,p.nome";
    $sql.= "  ,p.resumo";
    $sql.= "  ,p.valor";
    $sql.= "  ,p.peso";
    $sql.= "  ,p.imagem";
    $sql.= "  ,c.nome AS categoria";
    $sql.= "  ,m.nome AS marca";
    $sql.= " FROM";
    $sql.= "   produtos p";
    $sql.= "  ,categorias c";
    $sql.= "  ,marcas m";
    $sql.= " WHERE ";
    $sql.= "  p.categoria_id = c.id";
    $sql.= "  AND p.marca_id = m.id";
   	$sql.= "  AND p.id       = " . $_REQUEST['id'];
    
    $rs  = mysql_query($sql) or die(mysql_error());
    $row = mysql_fetch_object($rs);
    
    /**
     * CATEGORIA ID
     * @var Integer
     */
    $categoria_id = $row->categoria_id;
    $marca_id     = $row->marca_id;
?>
<form name="form1" method="post" action="<?php echo $path?>&link=edit" enctype="multipart/form-data">
    <input type="hidden" name="acao" value="2">
    <input type="hidden" name="operacao" value="2">
    <input type="hidden" name="id" value="<?php echo $row->id?>">
    
    <fieldset id='form'>
	    <legend>Alterar Produto</legend>
	    
		<table width="100%" class="tabela_interna" border="0">
		        <tr>
		            <td style="text-align:left; width: 20%;">* Categoria:</td>
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
						    
						    while($linha = mysql_fetch_object($rs)){
						    	if($categoria_id == $linha->id){
						    		$selected = 'selected';
						    	}else{
						    		$selected = '';
						    	}
						    ?>
			                	<option <?php echo $selected?> value='<?php echo $linha->id?>'>
			                		<?php echo $linha->nome?>
			                	</option>
			                <?php 
						    }
						    $linha    = null;
						    $selected = null; 
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
						    
						    while($linha = mysql_fetch_object($rs)){
						    	if($marca_id == $linha->id){
						    		$selected = 'selected';
						    	}else{
						    		$selected = '';
						    	}
						    ?>
			                	<option <?php echo $selected?> value='<?php echo $linha->id?>'>
			                		<?php echo $linha->nome?>
			                	</option>
			                <?php 
						    }
			                ?>
		                </select>
		            </td>
		        </tr>
		        <tr>
		            <td style="text-align:left;">* Nome:</td>
		            <td>
		                <input type="text" name="nome" maxlength="100" class="input_texto" value='<?php echo $row->nome?>'>
		            </td>
		        </tr>
		        <tr>
		            <td style="text-align:left;">* Resumo:</td>
		            <td>
		                <input type="text" name="resumo" maxlength="100" class="input_texto" value='<?php echo $row->resumo?>'>
		            </td>
		        </tr>
		        <tr>
		            <td style="text-align:left;">* Imagem:</td>
		            <td>
		                <input type="file" name="imagem" class="input_texto">
		            </td>
		        </tr>
		        <tr>
		        	<td></td>
		            <td style="text-align:left;">
		            	<img src='../img/produtos/<?php echo $row->imagem?>' style='width: 30%;'>
		            	
		            	<input type="hidden" name="imgNome" value="../img/produtos/<?php echo $row->imagem?>">
		            </td>
		        </tr>        
		        <tr>
		            <td style="text-align:left;">* Valor:</td>
		            <td>
		                <input type="text" name="valor" maxlength="100" class="input_texto" style='width: 100px;' value='<?php echo number_format($row->valor, 2, ',', '.')?>'>
		            </td>
		        </tr>
		        <tr>
		            <td style="text-align:left;">* Peso:</td>
		            <td>
		                <input type="text" name="peso" maxlength="100" class="input_texto" style='width: 100px;' value='<?php echo $row->peso?>'>
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
	require_once('../lib/UploadFiles.php');
	$upload = new UploadFiles();
	
	extract($_REQUEST);
	
	$upload->upload('../img/produtos/', $_FILES['imagem']);
	
	
	$sql = "UPDATE produtos SET";
	$sql.= "   categoria_id = "  . $categoria_id;
	$sql.= "  ,marca_id     = "  . $marca_id;
	$sql.= "  ,resumo 		= '" . $resumo . "'";;
	$sql.= "  ,valor 		= "  . str_replace(',', '.', str_replace('.', '', $valor));
	$sql.= "  ,peso 		= "  . $peso;
	$sql.= "  ,nome 		= '" . $nome . "'";
	
	if($_FILES['imagem']['name'] != ''){
		@unlink($imgNome);
		$upload->upload('../img/produtos/', $_FILES['imagem']);
		$sql.= "  ,imagem  = '" . $upload->getNameFile() . "'";
	}
	
	$sql.= " WHERE ";
	$sql.= "  id = " . $_REQUEST['id'];
	
//	die($sql);
	
	mysql_query($sql) or die(mysql_error());
	
	header('location:' . $path . '&link=edit&id=' . $_REQUEST['id'] . '&msg_ok=ok');
}

?>
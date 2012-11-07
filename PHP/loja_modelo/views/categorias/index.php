	<form name="form1" method="post" action="<?php echo $path?>&link=index">
	    <input type="hidden" name="acao" value="4">
	    <input type="hidden" name="operacao" value="1">
	    
	    <fieldset id="pesquisar">
	    <legend>Pesquisar Categorias</legend>
	    <table>
	        <tr>
	            <td style="text-align:left;">Categoria Pai:</td>
	            <td style="text-align: left;">
	                <select name="categoria_id" style="width:338px;">
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
	            <td style="width:20%; text-align:left;">* Nome:</td>
	            <td>
	            	<input type="text" name="nome">
	            </td>
	        </tr>
	        <tr>
	            <td colspan="2">* Obrigat&oacute;rio(s)</td>
	        </tr>
	        <tr class="actions">
	            <td colspan="2"><input type="submit" value="Buscar" class="botao" ></td>
	        </tr>
	    </table>
	    </fieldset>
	</form>
    
    <div id="novo">
        <input style="float:right;margin-top:-6px;"onclick="location.href='<?php echo $path?>&link=add'" type="button" name="novo" value="Novo" style="font-size: 100%;"/>
        Clique aqui em <b>novo</b> para inserir um novo registro.  
    </div>
    <?php
    if ( $_REQUEST['resp_erro'] != "" ){
        require( "../lib/msg_generica.php" );
    }elseif( $_REQUEST['msg_ok'] != "" ){
        require( "../lib/msg_ok.php" );
    } 

    $sql = "SELECT";
    $sql.= "   cf.id";
    $sql.= "  ,cf.nome";
    $sql.= "  ,cp.nome AS categoria_pai";
    $sql.= " FROM";
    $sql.= "  categorias cf LEFT JOIN categorias cp";
    $sql.= "  ON cf.categoria_id = cp.id";
    $sql.= " WHERE 1=1";
    
    if($_REQUEST['nome'] != ''){
    	$sql.= "      AND cf.nome LIKE '%" . $_REQUEST['nome'] . "%'";
    }
    
    if($_REQUEST['categoria_id'] != ''){
    	$sql.= "      AND cf.categoria_id = " . $_REQUEST['categoria_id'];
    }
    
    $sql.= " ORDER BY cp.nome, cf.nome";
    
    $rs = mysql_query($sql) or die(mysql_error()); 
    ?>
    <div id="resultado">
	    <table>
	        <tr>
	            <th>Nome</th>
	            <th>Categoria Pai</th>
	            <th>Op&ccedil;&otilde;es</th>
	        </tr>
	        <?php 
	        while($row = mysql_fetch_object($rs)){
	        ?>
		        <tr <?php echo ($i % 2 == 0) ? 'class="altrow"' : 'class=""'; ?>>
		            <td><?php echo $row->nome?></td>
		            <td><?php echo $row->categoria_pai?></td>
		            <td style="width:150px">
						<!-- a href="">
							<img src="../img/actions/lupa.png" title="Vizualizar" alt="" />
						</a-->
						<a href="<?php echo $path?>&link=edit&id=<?php echo $row->id?>">
							<img src="../img/actions/edit.png" title="Editar" alt="" />
						</a>
						<a href="<?php echo $path?>&link=index&id=<?php echo $row->id?>&acao=3&operacao=2" onclick="return confirm('Deseja realmente deletar o registro');">
							<img src="../img/actions/delete.png" title="Deletar" alt="" />
						</a>                
		            </td>
		        </tr>
	        <?php
	        	$i++;
	        }
	        ?>
	    </table>
    </div>
<?php
if ($_REQUEST['acao'] ==3 && $_REQUEST['operacao'] == 2){
	$sql = "DELETE FROM categorias	";
	$sql.= " WHERE ";
	$sql.= "  id = " . $_REQUEST['id'];
	
	mysql_query($sql) or die(mysql_error());
	
	header('location:' . $path . '&link=index&msg_ok=ok');
}

?>    
    
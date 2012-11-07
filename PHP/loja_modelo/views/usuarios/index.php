	<form name="form1" method="post" action="<?php echo $path?>&link=index">
	    <input type="hidden" name="acao" value="4">
	    <input type="hidden" name="operacao" value="1">
	    
	    <fieldset id="pesquisar">
	    <legend>Pesquisar Usuários</legend>
	    <table>
	        <tr>
	            <td style="width:20%; text-align:left;">* login:</td>
	            <td style="width:80%;"><input type="text" name="login"></td>
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
    $sql.= "   u.id";
    $sql.= "  ,u.login";
    $sql.= " FROM";
    $sql.= "  usuarios u";
    $sql.= " WHERE 1=1";
    
    if($_REQUEST['login'] != ''){
    	$sql.= "      AND u.login LIKE '%" . $_REQUEST['login'] . "%'";
    }
    
    $sql.= " ORDER BY u.login";
    
    $rs = mysql_query($sql) or die(mysql_error()); 
    ?>
    <div id="resultado">
	    <table>
	        <tr>
	            <th>login</th>
	            <th>Op&ccedil;&otilde;es</th>
	        </tr>
	        <?php 
	        while($row = mysql_fetch_object($rs)){
	        ?>
		        <tr <?php echo ($i % 2 == 0) ? 'class="altrow"' : 'class=""'; ?>>
		            <td><?php echo $row->login?></td>
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
	$sql = "DELETE FROM usuarios";
	$sql.= " WHERE ";
	$sql.= "  id = " . $_REQUEST['id'];
	
	mysql_query($sql) or die(mysql_error());
	
	header('location:' . $path . '&link=index&msg_ok=ok');
}

?>    
    
<form name="form1" method="post" action="<?php echo $path?>&link=add">
    <input type="hidden" name="acao" value="1">
    <input type="hidden" name="operacao" value="2">
    
    <fieldset id='form'>
    <legend>Cadastrar Países</legend>
    
    <table width="100%" class="tabela_interna" border="0">
        <tr>
            <td style="width:20%; text-align:left;">* Descrição:</td>
            <td style="width:80%;">
                <input type="text" name="descricao" maxlength="100" class="input_texto">
            </td>
        </tr>
        <tr>
            <td style="width:20%; text-align:left;">* Sigla:</td>
            <td style="width:80%;">
                <input type="text" name="sigla" maxlength="3" class="input_texto" size="10">
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
    </table>
    </fieldset>
</form>
<?php
if ( $_REQUEST['resp_erro'] != "" ){
	require( "../../lib/msg_generica.php" );
}elseif( $_REQUEST['msg_ok'] != "" ){
	require( "../../lib/msg_ok.php" );
}



?>
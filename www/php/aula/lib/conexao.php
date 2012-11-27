<?php
$link = mysql_connect(¨localhost¨, ¨usuario¨, ¨senha¨);
if(!link){
  die(¨Não foi possível conectar ao servidor: ¨. mysql_error());
}

$db = mysql_select_db(¨nome_esquema¨, $link);

if(!$db){
  die(¨Não foi possível conectar ao esquema: ¨. mysql_error());
}

?>

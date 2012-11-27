<?php
$link = mysql_connect('localhost', 'root', '');
if(!link){
  die('Não foi possível conectar ao servidor: '. mysql_error());
}

$db = mysql_select_db('loja_curso', $link);

if(!$db){
  die('Não foi possível conectar ao esquema: '. mysql_error());
}

?>

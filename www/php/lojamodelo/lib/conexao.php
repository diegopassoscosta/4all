<?php
$conn = mysql_connect('localhost', 'root', 'l30n4rd0') or die('Falha na Conexão ' . mysql_error());
$bd   = mysql_select_db('loja_curso', $conn) or die('Banco de Dados não encontrado ' . mysql_error());

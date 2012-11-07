<?php
	//INICIALIZANDO A SESSÃO
	session_start();
	
	//DESTRUINDO AS VARIÁVEIS
	unset($_SESSION[dados]);
	
	//Redirecionando para a página de login
	header("location:../index.php");
?>
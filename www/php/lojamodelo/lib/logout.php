<?php
	//INICIALIZANDO A SESS�O
	session_start();
	
	//DESTRUINDO AS VARI�VEIS
	unset($_SESSION[dados]);
	
	//Redirecionando para a p�gina de login
	header("location:../index.php");
?>
<?php
session_start();

if (!isset($_SESSION["dados"]['usuario']['id'])) {
	header("location:index.php?resp_erro=Usuário não está autenticado.");
}

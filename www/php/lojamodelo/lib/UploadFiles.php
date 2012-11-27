<?php
class UploadFiles
{
	
	private $nameFile;
	
	/**
	 * Enter description here...
	 *
	 * @param String $destino
	 * @param GLOBAL $file
	 * @return $_FILES
	 */
	public function upload($destino, $file){
	
		$arquivoTmp = $file["tmp_name"];
		
		$file = $file["name"];
		
		$file = ereg_replace("[аюбц]","A", $file);
		$file = ereg_replace("[АЮБЦ╙]","a", $file);
		$file = ereg_replace("[ихй]","E", $file);
		$file = ereg_replace("[ИХЙ]","e", $file);
		$file = ereg_replace("[срту]","O", $file);
		$file = ereg_replace("[СРТУ╨]","o", $file);
		$file = ereg_replace("[зыш]","U", $file);
		$file = ereg_replace("[ЗЫШ]","u", $file);
		$file = str_replace("г","C", $file);
		$file = str_replace("Г","c", $file);
		$file = str_replace("-","", $file);
		
		$nomeArquivo = date('Ymd').time() . str_replace(" ", "", $file);
		$arquivo    = $destino . date('Ymd').time() . str_replace(" ", "", $file);
//		exit($arquivoTmp);
	
		if(!move_uploaded_file($arquivoTmp, $arquivo)) {
			$retorno = false;
		} else {
			$retorno = true;
		}
	
		$this->nameFile = $nomeArquivo;
		
		return $retorno;
	}
	
	/**
	 * RETORNA O NOME DO ARQUIVO
	 *
	 * @return $this->nameFile;
	 */
	public function getNameFile(){
		return $this->nameFile;
	}
}
?>
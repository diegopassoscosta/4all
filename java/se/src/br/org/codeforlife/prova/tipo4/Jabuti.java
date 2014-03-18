package br.org.codeforlife.prova.tipo4;

public class Jabuti{
	//Atributo que guarda a caracter�stica do Jabuti.
	private int quantidadeDePatas;
	
	/**
	 * M�todo (a��o) que ajusta a quantidade de patas do Jabuti
	 * @param novaIdade
	 */
	public void ajustaQuantidadeDePatas(int novaQuantidadeDePatas){
		quantidadeDePatas = novaQuantidadeDePatas;
	}
	
	/**
	 * M�todo (a��o) que retorna a quantidade de patas do Jabuti
	 * @return
	 */
	public int retornaQuantidadeDePatas(){
		return quantidadeDePatas;
	}
	
}



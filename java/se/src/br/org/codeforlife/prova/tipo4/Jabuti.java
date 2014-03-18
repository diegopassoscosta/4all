package br.org.codeforlife.prova.tipo4;

public class Jabuti{
	//Atributo que guarda a característica do Jabuti.
	private int quantidadeDePatas;
	
	/**
	 * Método (ação) que ajusta a quantidade de patas do Jabuti
	 * @param novaIdade
	 */
	public void ajustaQuantidadeDePatas(int novaQuantidadeDePatas){
		quantidadeDePatas = novaQuantidadeDePatas;
	}
	
	/**
	 * Método (ação) que retorna a quantidade de patas do Jabuti
	 * @return
	 */
	public int retornaQuantidadeDePatas(){
		return quantidadeDePatas;
	}
	
}



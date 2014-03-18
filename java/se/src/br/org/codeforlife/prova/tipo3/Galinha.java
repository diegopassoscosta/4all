package br.org.codeforlife.prova.tipo3;

public class Galinha {
	//Caracteristíca nome
	private String nomeCompleto = "Rex";
	
	/**
	 * Ação ajustaNomeDaGalinha(String novoNome)
	 * @param novoNome
	 */
	public void ajustaNomeDaGalinha(String novoNome){
		nomeCompleto = novoNome;
	} 
	
	/**
	 * Ação retornarNomeDaGalinha()
	 * @return
	 */
	public String retornarNomeDaGalinha(){
		return nomeCompleto;
	}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.sintaxe.arraylist0;

import java.util.ArrayList;

/**
 *
 * @author Antonio
 * Classe principal de execução
 */
public class UsoDoArrayList {
    
    
    public static void main(String args[]){
    
        //cria um vetor de pessoa VECTOR
        ArrayList<Pessoa> meuVetor = new ArrayList();
        
        //instancia as pessoas 2 no caso em questao
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        //seta as informações de pessoa 1
        p1.setIdade(12);
        p1.setPeso(44);
        
        //seta as informações de pessoa 2
        p2.setIdade(14);
        p2.setPeso(46);
        
        //adiciona pessoas ao vetor com o método add
        meuVetor.add(p1);
        meuVetor.add(p2);
    
        //mostra o resultado na tela
        for (Pessoa pessoa : meuVetor) {
            //Imprima
            System.out.println(pessoa.getIdade());
            System.out.println(pessoa.getPeso());
        }
    
    }
    
}

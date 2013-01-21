/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.orientado.lista03.exercicio01;


import br.org.codeforlife.orientado.lista03.exercicio01.fruta.Maca;
import br.org.codeforlife.orientado.lista03.exercicio01.fruta.Mamao;
import br.org.codeforlife.orientado.lista03.exercicio01.pessoa.Pessoa;
import br.org.codeforlife.orientado.lista03.exercicio01.verdura.Abobora;
import br.org.codeforlife.orientado.lista03.exercicio01.verdura.Beterraba;

/**
 *
 * @author Diego Passos Costa
 */
public class Principal {
    
    public static void main (String args[]){
    
        Pessoa astrobaldo = new Pessoa();
        Maca maca = new Maca(1, 2);
        Mamao mamao = new Mamao(2, 3);
        Abobora abobora = new Abobora(3,4);
        Beterraba beterraba = new Beterraba(4,5);
           
        astrobaldo.come(abobora);
        astrobaldo.come(beterraba);
        astrobaldo.come(maca);
        astrobaldo.come(mamao);
        
        System.out.println(astrobaldo.peso());
        System.out.println(astrobaldo.energia());
      
        
    }
    
}

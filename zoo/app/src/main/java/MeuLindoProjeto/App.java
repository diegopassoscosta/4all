/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MeuLindoProjeto;

import utils.Balança;
import zoologico.Cachorro;
import zoologico.Gato;
import zoologico.Metamorfo;



public class App {

    public static void main(String[] args) {
        System.out.println("Vaquinhas");
        
        
        Cachorro c1 = new Cachorro();
        c1.Comer();
        c1.Comer();
        c1.Comer();
        
        Gato g1 = new Gato();        
        g1.Comer();
        g1.Comer();
        g1.Comer();
               
        Balança balança = new Balança();
        balança.setPeso(c1);
        balança.setPeso(g1);
        
        System.out.println("peso total da galera: " + balança.retornaPesoTotalDosAnimais());
        
        
        
        Metamorfo m = new Metamorfo(c1);
        c1.setTamanho(100);
        System.out.println("peso cachorro : "+ m.getTamanho());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        m = new Metamorfo(g1);
        
        System.out.println("peso gato: "+ m.getTamanho());
        
        
        
        
        
        
        
        
    }
}
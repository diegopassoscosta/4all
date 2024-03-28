
package Veiculo;


public class CarroTeste {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Fiat", "1998");
        c1.Acelerar(2);
        c1.Acelerar(2);
        c1.Acelerar(2);
        c1.Acelerar(2);
        c1.Acelerar(2);
        
        System.out.println("Tamo indo rapido de mais sacana " + c1.velocidade);
                
       
        c1.Bater();
        
    }
}


package Veiculo;

public class Carro {
    
    private String marca;
    private String ano;
    int velocidade = 20;

    
       public Carro(){
        
    }
    
    public Carro(String marca, String ano){
        this.marca = marca;
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }

   
    public void setMarca(String marca) {
        this.marca = marca;
    }

   
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public void Ligar(){
        System.out.println("Carro esta ligado!");
    }
    public void Desligar(){
        System.out.println("Carro esta desligado!");
    }
    
    public void Acelerar(double velocidade){
        this.velocidade = (int) (velocidade * 0.5);
    }
    
    public void Bater(){
        System.out.println("Voce bateu no POSTE!!");
        System.out.println("SE FUDEU!!");
    }
    
    
}

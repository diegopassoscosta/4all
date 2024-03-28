/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import zoologico.Animal;
import zoologico.Cachorro;
import zoologico.Gato;
import zoologico.Hipopotamo;
import zoologico.Passaro;
import zoologico.Vaca;

/**
 *
 * @author diego
 */
public class Balança {
    private double pesoTotalDeTodosOsAnimais; 
    
    
    
    
    public void setPesoGato(Gato g){
        this.pesoTotalDeTodosOsAnimais += this.pesoTotalDeTodosOsAnimais + g.getPeso();
    }
    
    public void setPesoCachorro(Cachorro c){
        this.pesoTotalDeTodosOsAnimais += this.pesoTotalDeTodosOsAnimais + c.getPeso();
    }
    
    public void setPesoPassaro(Passaro p){
        this.pesoTotalDeTodosOsAnimais += this.pesoTotalDeTodosOsAnimais + p.getPeso();
    }
    
    public void setPesoHipopotamo(Hipopotamo h){
        this.pesoTotalDeTodosOsAnimais += this.pesoTotalDeTodosOsAnimais + h.getPeso();
    }
    
    public void setPesoVaca(Vaca v){
        this.pesoTotalDeTodosOsAnimais += this.pesoTotalDeTodosOsAnimais + v.getPeso();
    }
    
    
    public void setPeso(Animal a){
        this.pesoTotalDeTodosOsAnimais = this.pesoTotalDeTodosOsAnimais + a.getPeso();
    }
    
    public double retornaPesoTotalDosAnimais(){
    
        return this.pesoTotalDeTodosOsAnimais;
    
    }
}

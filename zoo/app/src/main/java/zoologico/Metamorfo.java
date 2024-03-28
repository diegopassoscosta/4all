/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Metamorfo {
    private Cachorro auau;
    private Gato miau;    

    public Metamorfo(Animal a){
        this.auau = auau;
    }
    
    public Metamorfo(Cachorro auau){
        this.auau = auau;
    }
    
    public Metamorfo(Gato miau){
        this.miau = miau;
    }
    
    public double getTamanho(){
        if (this.auau != null  ){
             return this.auau.getTamanho();
        }else{
            return this.miau.getTamanho();
        }
        
        
        
    }
      
    /**
     * @return the auau
     */
    public Cachorro getAuau() {
        return auau;
    }

    /**
     * @param auau the auau to set
     */
    public void setAuau(Cachorro auau) {
        this.auau = auau;
    }

    /**
     * @return the miau
     */
    public Gato getMiau() {
        return miau;
    }

    /**
     * @param miau the miau to set
     */
    public void setMiau(Gato miau) {
        this.miau = miau;
    }
    
}

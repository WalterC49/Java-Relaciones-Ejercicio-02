/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author Walter
 */
public class RevolverDeAgua {
    private Integer posicionTambor;
    private Integer posicionAgua;
    
    public RevolverDeAgua(){
    }
    
    public RevolverDeAgua(Integer posicionTambor,Integer posicionAgua){
        this.posicionTambor = posicionTambor;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionTambor() {
        return posicionTambor;
    }

    public void setPosicionTambor(Integer posicionTambor) {
        this.posicionTambor = posicionTambor;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    //METODOS
    
    public void LlenarRevolver(){
        posicionTambor=(int)(Math.random()*6+1);
        posicionAgua=(int)(Math.random()*6+1);
    }
    
    public boolean Mojar(){
        return posicionTambor==posicionAgua;
    }
    
    public void SiguienteChorro(){
        if(posicionTambor==6){
            posicionTambor=1;
        }
        else{
            posicionTambor++;
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionTambor=" + posicionTambor + ", posicionAgua=" + posicionAgua + '}';
    }
}

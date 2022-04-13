/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Walter
 */
public class Jugador {
    private Integer id;
    private String nombre;
    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id) {
        this.id = id;
        this.nombre="Jugador "+id;
        this.mojado=false;
    }
    
    public Jugador(Integer id, String nombre, Boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    //METODOS
    
    public boolean Disparo(RevolverDeAgua r){
        mojado=r.Mojar();
        r.SiguienteChorro();
        return mojado;
    }
}

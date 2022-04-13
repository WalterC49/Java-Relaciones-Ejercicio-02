/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa simula una ruleta rusa de agua.");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("\nIngrese la cantidad de jugadores: ");
        int cantJugadores=leer.nextInt();
        
        if(cantJugadores<1||cantJugadores>6){
            cantJugadores=6;
        }
        
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("\nCargando jugadores.");
        
        for(int i=0;i<cantJugadores;i++){
            jugadores.add(new Jugador(i+1));
        }
        
        System.out.println("\nCargando revolver de agua.");
        RevolverDeAgua r = new RevolverDeAgua();
        r.LlenarRevolver();
        
        System.out.println("Revolver cargado, se iniciará el juego.");
        Juego j = new Juego();
        j.LlenarJuego(jugadores, r);
        
        int turno=0;
        boolean continuar=true;
        do{
            if(turno==cantJugadores){
                turno=0;
            }
            System.out.println("\n"+r);
            System.out.println("\nEl "+jugadores.get(turno).getNombre()+" toma el revolver y dispara.");
            if(j.Ronda(turno)){
                System.out.println("El "+jugadores.get(turno).getNombre()+" no se mojó.");
                System.out.println("El juego continua.");
            }
            else{
                System.out.println("El "+jugadores.get(turno).getNombre()+" se mojó.");
                continuar=false;
                System.out.println("El juego terminó");
            }
            turno++;
        }while(continuar);
        
    }
    
}

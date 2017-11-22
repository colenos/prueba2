/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulacion;

import Arbol.ArbolBinario;
import Arbol.NodoArbol;
import Campeonato.Equipo;
import Campeonato.Jugador;
import Campeonato.Partido;
import javax.swing.JOptionPane;

/**
 *
 * @author Yi
 */
public class JuegoPingPong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 0;
        int valor=0;
        Partido p=null;
        ArbolBinario objArbol = new ArbolBinario();
        String nombreEquipo,nombreJugadorA,nombreJugadorB;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null
                        ,"1. Agregar Equipo\n" 
                            +"2. Salir\n"
                            +"Ingrese una Opcion -->"
                        ,"Juego Ping Pong"
                        ,JOptionPane.QUESTION_MESSAGE));
                
                switch(opcion){
                    case 1:
                            nombreEquipo= JOptionPane.showInputDialog(null,
                                    "Ingrese nombre Equipo.."
                                    ,"Agregando nombre Equipo"
                                    ,JOptionPane.QUESTION_MESSAGE);
                            nombreJugadorA=JOptionPane.showInputDialog(null,"Ingrese nombre jugador A"
                            ,"Agregando Jugador A"
                            ,JOptionPane.QUESTION_MESSAGE);
                            nombreJugadorB=JOptionPane.showInputDialog(null,"Ingrese nombre jugador B"
                            ,"Agregando Jugador B"
                            ,JOptionPane.QUESTION_MESSAGE);
                            valor = Integer.parseInt(JOptionPane.showInputDialog(null
                                ,"1. Elija Jugador A\n" 
                                +"2. Elija Jugador B\n"
                                +"Ingrese una Opcion -->"
                                ,"Eligiendo Jugador"
                                ,JOptionPane.QUESTION_MESSAGE));
                            if (valor==1) {
                            p = new Partido(new Equipo(nombreEquipo, new Jugador(nombreJugadorA), 1));
                            }else{
                            p = new Partido(new Equipo(nombreEquipo, new Jugador(nombreJugadorB), 2)); 
                            }
                            System.out.println(p.toString());
                            
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Finalizando Juego");
                        break;
                }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error "+ n.getMessage() );
                
            }
        }while(opcion !=2);
        
    
        
    }
    
}

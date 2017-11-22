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
        Partido p1=null;
        Partido p2=null;
       
        //NodoArbol nodoAux = null ;
        ArbolBinario objArbol = new ArbolBinario();
        String nombreEquipoA,nombreEquipoB,nombreJugadorA,nombreJugadorB;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null
                        ,"1. Agregar Equipo y Jugar\n"
                            +"2. Ver Ganador\n"
                            +"3. Salir\n"
                            +"Ingrese una Opcion -->"
                        ,"Juego Ping Pong"
                        ,JOptionPane.QUESTION_MESSAGE));
                
                switch(opcion){
                    case 1:
                            nombreEquipoA= JOptionPane.showInputDialog(null,
                                    "Ingrese nombre Equipo 1.."
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
                            p1 = new Partido(new Equipo(nombreEquipoA, new Jugador(nombreJugadorA), 1));
                            
                            objArbol.agregarNodo(new NodoArbol(p1.getEquipo().getIdJugador(), p1), new NodoArbol(p1.getEquipo().getIdJugador(), p1));
                                 System.out.println(p1.toString());       
                            }else{
                            p1 = new Partido(new Equipo(nombreEquipoA, new Jugador(nombreJugadorB), 2)); 
                             objArbol.agregarNodo(new NodoArbol(p1.getEquipo().getIdJugador(), p1), new NodoArbol(p1.getEquipo().getIdJugador(), p1));
                            System.out.println(p1.toString());
                            }
                            nombreEquipoB= JOptionPane.showInputDialog(null,
                                    "Ingrese nombre Equipo 2.."
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
                            p2 = new Partido(new Equipo(nombreEquipoB, new Jugador(nombreJugadorA), 1));
                            
                            objArbol.agregarNodo(new NodoArbol(p2.getEquipo().getIdJugador(), p2), new NodoArbol(p2.getEquipo().getIdJugador(), p2));
                                  
                            System.out.println(p2.toString());       
                            }else{
                            p2 = new Partido(new Equipo(nombreEquipoB, new Jugador(nombreJugadorB), 2)); 
                             objArbol.agregarNodo(new NodoArbol(p2.getEquipo().getIdJugador(), p2), new NodoArbol(p2.getEquipo().getIdJugador(), p2));
                               
                             System.out.println(p2.toString());
                            }
                           
                            
                            System.out.println("Partido 1");
                            
                            objArbol.jugar(p1, p2);
                            
                            System.out.println("Partido 2");
                           
                            objArbol.jugar(p1, p2);
                            
                            
                            
                        break;
                    
                    case 2:
                        System.out.println("Ganador Campeonato Ping Pong");
                                                
                        objArbol.agregarRaiz(new NodoArbol(p2.getEquipo().getIdJugador(), p2));
                        objArbol.getRaiz();
                        System.out.println(p2.getEquipo().getNombreEquipo());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Finalizando Juego");
                        break;
                }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error "+ n.getMessage() );
                
            }
        }while(opcion !=3);
        
    
        
    }
    
    
}

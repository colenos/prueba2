/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campeonato;

/**
 *
 * @author Yi
 */
public class Equipo {
    private String nombreEquipo;
    private int idJugador;
    private Jugador jugador;

    public Equipo(String nombreEquipo, Jugador jugador,int id) {
        this.nombreEquipo = nombreEquipo;
        this.jugador=jugador;
        this.idJugador = id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return " Nombre Equipo = " + nombreEquipo +", Nombre Jugador = "+jugador+ ", jugador n° = " + idJugador ;
    }
    
   
    
}

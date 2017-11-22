/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import Campeonato.Partido;

/**
 *
 * @author Yi
 */
public class NodoArbol {
    
    private Partido partido;
    private NodoArbol hijoIzquierdo;
    private NodoArbol hijoDerecho;
    
    
    
    public NodoArbol(Partido play){
        
        this.partido=play;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    @Override
    public String toString() {
        return "partido=" + partido;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }
    
    
}

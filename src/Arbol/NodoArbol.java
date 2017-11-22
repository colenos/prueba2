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
    private int id;
    private Partido partido;
    private NodoArbol hijoIzquierdo;
    private NodoArbol hijoDerecho;
    
    
    
    public NodoArbol(Partido partido,int id){
        this.id = id;
        this.partido=partido;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

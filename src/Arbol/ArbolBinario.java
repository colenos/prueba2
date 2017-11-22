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
public class ArbolBinario {
    NodoArbol raiz;

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
    public NodoArbol agregarRaiz(NodoArbol nodo){
        if (raiz==null) {
            this.setRaiz(nodo);
        }
        return nodo;
    }
    
    public void agregarNodo(NodoArbol nodo,NodoArbol raiz){
        NodoArbol nuevo = new  NodoArbol(nodo.getId(),nodo.getPartido());
        if (raiz==null) {
            this.setRaiz(nuevo);
        }else{
            if (nodo.getId()<raiz.getId()) {
                if (raiz.getHijoIzquierdo()==null) {
                    raiz.setHijoIzquierdo(nuevo);
                }else{
                    agregarNodo(nodo, raiz.getHijoIzquierdo());
                }
            }else{
                if (raiz.getHijoDerecho()==null) {
                    raiz.setHijoDerecho(nuevo);
                }else{
                    agregarNodo(nuevo, raiz.getHijoDerecho());
                }
                
            }
                
            
            }
            
    }
    
    
    public ArbolBinario(){
        raiz = null;
    }
    public void preorden()
    {
        preorden(this.raiz);
    }
    public void preorden(NodoArbol n)
    {
        if (n != null)
        {
            System.out.print(" "+ n.getPartido());
            preorden(n.getHijoIzquierdo());
            preorden(n.getHijoDerecho());
        }
    }
    public boolean estaVacio(){
        return raiz==null ;
    }
    
    public Partido jugar(Partido p1,Partido p2){
    int random = (int) Math.floor(Math.random()*2+1);
    Partido ganador = null;
        if (p1.getEquipo().getIdJugador()==random) {
            System.out.println("Ganador Equipo 1, Nombre Equipo 1 = "+p1.getEquipo().getNombreEquipo()
            + " Nombre Jugador = " +p1.getEquipo().getJugador().getNombre());
            ganador = p1;
        }else{
            System.out.println("Ganador Equipo 2, Nombre Equipo 2 = "+p2.getEquipo().getNombreEquipo()
            + " Nombre Jugador = " +p2.getEquipo().getJugador().getNombre());
            ganador=p2;
        }
        return ganador;
        
    }
        public String ganador(Partido p){
            return p.getEquipo().getNombreEquipo();
        }
    }
    
    
     


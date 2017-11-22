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
    
    public void agregarNodo(NodoArbol nodo,NodoArbol raiz){
        NodoArbol nuevo = new  NodoArbol(nodo.getId(),nodo.getPartido());
        if (raiz==null) {
            this.setRaiz(nuevo);
        }else{
            if (nodo.getId()<=raiz.getId()) {
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
    
    public void jugar(){
    
        
        
    }
     
}

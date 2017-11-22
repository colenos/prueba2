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
    
    public void agregarNodo(Partido partido, int id){
        NodoArbol nuevo = new  NodoArbol(partido,id);
        if (raiz==null) {
            raiz = null;
        }else{
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while(true){ 
                padre=auxiliar;
                int random = (int) ( Math.random() * 2 + 1);
                if (id==random) {
                    auxiliar=auxiliar.getHijoIzquierdo();
                    if (auxiliar==null) {
                        padre.setHijoIzquierdo(nuevo);
                        return;
                    }
            } else{
                    auxiliar=auxiliar.getHijoDerecho();
                    if (auxiliar==null) {
                        padre.setHijoDerecho(nuevo);
                        return;
                    }
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
    private void preorden(NodoArbol n)
    {
        if (n != null)
        {
            System.out.print(" "+ n.getPartido());
            preorden(n.getHijoIzquierdo());
            preorden(n.getHijoDerecho());
        }
    }
    
    
     
}

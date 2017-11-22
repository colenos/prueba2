/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;



/**
 *
 * @author Yi
 */
public class ArbolBinario {
    NodoArbol raiz;
    
    
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.util.Vector;

/**
 *
 * @author lucy_
 */
class Pila {

    Vector pila;

    Pila() {
        pila = new Vector();
    }

    void apilar(int n) {
        pila.addElement(new Integer(n));
    }

    int desapilar() {
        int retorno = ((Integer) pila.lastElement()).intValue();
        pila.removeElementAt(pila.size() - 1);
        return retorno;
    }

    int verCima() {
        return ((Integer) pila.lastElement()).intValue();
    }
}

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
class Lista {

    Vector lista;

    Lista() {
        lista = new Vector();
    }

    void addCadena(String c) {
        lista.addElement(c);
    }

    String getCadena(int i) {
        return (String) lista.elementAt(i);
    }

    int size() {
        return lista.size();
    }
}

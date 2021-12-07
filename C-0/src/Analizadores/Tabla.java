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
public class Tabla {

    private Vector<Simbolo> tablaSimbolos;
    private Vector<Tipo> tablaTipos;

    public Tabla() {
        tablaSimbolos = new Vector<>();
        tablaTipos = new Vector<>();
        addSimbolo("int");
    }

    public void addSimbolo(String id) {
        tablaSimbolos.add(new Simbolo());
    }

    public void addTipo(String id) {
        tablaTipos.add(new Tipo());
    }

    public boolean existeSimbolo(String id) {
        return getSimbolo(id) != null;
    }

    public Simbolo getSimbolo(String id) {
        for (Simbolo simbolo : tablaSimbolos) {
            if (simbolo.getId().equals(id)) {
                return simbolo;
            }
        }
        return null;
    }

    public void setSimbolo(Simbolo s) {
        int cod = s.getCod();
        tablaSimbolos.setElementAt(s, cod);
    }

    void setDireccionSimbolo(String id, int d) {
        Simbolo simbolo = getSimbolo(id);
        simbolo.setDireccion(d);
        setSimbolo(simbolo);
    }
}

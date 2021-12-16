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
        tablaSimbolos = new Vector<Simbolo>();
        tablaTipos = new Vector<Tipo>();
        addSimbolo("int");
    }

    public void addSimbolo(String id) {
        int x = tablaSimbolos.size();
        tablaSimbolos.add(new Simbolo(x, id));
    }

    public void addTipo(String id) {
        int x = tablaTipos.size();
        tablaTipos.add(new Tipo(x, id));
    }

    public boolean existeSimbolo(String id) {
        return getSimbolo(id) != null;
    }

    public boolean existeTipo(String id) {
        return getTipo(id) != null;
    }

    public Simbolo getSimbolo(String id) {
        for (Simbolo simbolo : tablaSimbolos) {
            if (simbolo.getId().equals(id)) {
                return simbolo;
            }
        }
        return null;
    }

    public Tipo getTipo(String id) {
        for (Tipo tipo : tablaTipos) {
            if (tipo.getId().equals(id)) {
                return tipo;
            }
        }
        return null;
    }

    public Simbolo getSimbolo(int pos) {
        return (Simbolo) tablaSimbolos.elementAt(pos);
    }

    public Tipo getTipo(int pos) {
        return (Tipo) tablaTipos.elementAt(pos);
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

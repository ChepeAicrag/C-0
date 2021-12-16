package Analizadores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucy_
 * // Esta clase se utiliza para guardar y recuperar
    //informacion de punto del codigo
    // fuente por el que se va analizando
 */
class InformacionCodigo {

    public static int linea;
    public static String token;

    public static void guardarInformacionCodigo(int l, String t) {
        linea = l;
        token = t;
    }
}

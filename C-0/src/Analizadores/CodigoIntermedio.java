package Analizadores;

import java.io.*;
import java.util.*;

class CodigoIntermedio {

    String nombreFichero = null;
    PrintWriter ficheroEscritura;
    BufferedReader ficheroLectura;
    Vector instrucciones;

    public CodigoIntermedio(String nombre) {
        nombreFichero = nombre;
        ficheroLectura = null;
        ficheroEscritura = null;
        crearInstrucciones();
    }

    private void crearInstrucciones() {
        instrucciones = new Vector();
    }

    public void abrirFicheroLectura() throws IOException {
        ficheroLectura = new BufferedReader(
                new FileReader(nombreFichero));
    }

    public void cerrarFicheroLectura() throws IOException {
        ficheroLectura.close();
    }

    public void abrirFicheroEscritura() throws IOException {
        ficheroEscritura = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(nombreFichero)));
    }

    public void cerrarFicheroEscritura() {
        Cuadrupla cuadrupla;
        for (int i = 0; i < instrucciones.size(); i++) {
            cuadrupla = (Cuadrupla) instrucciones.elementAt(i);
            ficheroEscritura.println(cuadrupla.getNombre()
                    + " " + cuadrupla.getOp1()
                    + " " + cuadrupla.getOp2()
                    + " " + cuadrupla.getRes());
        }
        ficheroEscritura.close();
    }

    public void guardarCuadrupla(Cuadrupla cuadrupla) {
        instrucciones.addElement(cuadrupla);
    }
}
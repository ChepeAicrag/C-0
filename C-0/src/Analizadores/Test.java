/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author lucy_
 */
public class Test {
    
   public static String codFuente;

   public static void main(String args[]) throws Exception {
        if (args.length != 1) {
            System.out.println("Manda un archivo, plox");
        } else {
            try {
                Yylex lexico = new Yylex(new FileReader(args[0]));
                String name = (String) args[0];
                codFuente = name.substring(0, name.lastIndexOf("."));
                new parser(lexico).parse();
            } catch (FileNotFoundException e1) {
                System.out.println(e1);
            }
        }
    }

    
}

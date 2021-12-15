/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

/**
 *
 * @author lucy_
 */
public class Simbolo {
    
    private String id;
    private int direccion;
    private int cod;
    
    public Simbolo(){
        cod = -1;
        id = "";
    }
    
    Simbolo(int c, String i) {
        cod = c;
        id = i;
    }
    
    public void setDireccion(int d){
        direccion = d;
    }
    
    public int getDireccion(){
        return direccion;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public int getCod(){
        return 0;
    }
}

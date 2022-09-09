/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gato;

import javax.swing.JOptionPane;

/**
 *
 * @author Internet
 */
public class Gato extends Animal{

    public String color;
    public float tamanio;
    public float peso;
    public String nombre;
    public String raza;

    public Gato(String especie, boolean carnivoro) {
        super(especie, carnivoro);
    }
    
    
    public Gato(String color, float tamanio, float peso, String nombre, String raza, String especie, boolean carnivoro) {
        super(especie, carnivoro);
        this.color = color;
        this.tamanio = tamanio;
        this.peso = peso;
        this.nombre = nombre;
        this.raza = raza;
    }

    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
            
    public void jugar(){
        JOptionPane.showMessageDialog(null, "Estoy jugando");
    }
    
    public String dormir(){
        return "estoy mimido";
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Gato("gris", 45.6f, 20f, "Misifus", "Angora","Felino",false).jugar();
        System.out.println(new Gato("Felino",false).dormir());
    }
    
}

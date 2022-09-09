/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gato;

/**
 *
 * @author Internet
 */
public class Animal {
    
    public String especie;
    public boolean carnivoro;

    public Animal(String especie, boolean carnivoro) {
        this.especie = especie;
        this.carnivoro = carnivoro;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }
    
    
}

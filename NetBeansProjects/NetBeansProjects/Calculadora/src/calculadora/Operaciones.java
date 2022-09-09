/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Internet
 */
public class Operaciones implements SumaDAO{

    @Override
    public double suma(double numero1, double numero2) {
        return numero1+numero2;
    }

    @Override
    public double resta(double numero1, double numero2) {
        return numero1-numero2;
    }

    @Override
    public double multiplicacion(double numero1, double numero2) {
        return numero1*numero2;
    }

    @Override
    public double division(double numero1, double numero2) {
        return numero1/numero2;
    }
    
    
}

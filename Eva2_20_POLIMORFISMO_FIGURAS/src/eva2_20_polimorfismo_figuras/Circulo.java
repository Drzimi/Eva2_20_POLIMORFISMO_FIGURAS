/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_polimorfismo_figuras;

/**
 *
 * @author invitado
 */
public class Circulo implements Figuras , MostrarDatos{
    private double radio;
    
    public Circulo(){
    this.radio = 0;
}

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
//La interfaz es como un contrato , te obliga a seguir cierto comportamiento
    @Override
    public double Calarea() {
       return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double CalcularPeri() {
      return Math.PI * (radio * 2);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Este circulo vale:");
        System.out.println("Radio:" + radio );
        System.out.println("Area:" + Calarea());
        System.out.println("Perimetro:" + CalcularPeri());
    }
    
}

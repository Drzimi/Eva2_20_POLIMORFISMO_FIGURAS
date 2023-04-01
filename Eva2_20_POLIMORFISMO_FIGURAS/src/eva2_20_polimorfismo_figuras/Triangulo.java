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
public class Triangulo implements Figuras , MostrarDatos {
    private double Base;
    private double Altura;
    
    public Triangulo(){
        this.Base = 0.0;
        this.Altura = 0.0;
    }

    public Triangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public double Calarea() {
        return (Base * Altura)/2;
    }

    @Override
    public double CalcularPeri() {
        
        double hip = Math.sqrt(Math.pow(Base, 2) + Math.pow(Altura, 2));
        return Base + Altura + (hip);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Base:" + Base);
        System.out.println("Altura:" + Altura);
        System.out.println("Area:" + Calarea());
        System.out.println("Perimetro:" + CalcularPeri());
        
    }
    
    
}

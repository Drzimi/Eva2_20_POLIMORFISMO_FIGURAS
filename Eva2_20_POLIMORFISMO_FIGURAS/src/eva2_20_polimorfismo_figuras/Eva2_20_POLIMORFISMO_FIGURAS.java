/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_20_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circu = new Circulo(5);
circu.imprimirDatos();
//Figura es padre de circulo
//Podemos asignar un objeto circulo a una variable figura 


//int[] arreg1lo = new int[10];//Arreglo que guarda 10 enteros
//Un arreglo donde inicia y termina
//Primera posicion:0
//Ultima posicion: N -1 , N cantidad de elementos de arreglo
//arreglo[0] = 100;
  //      System.out.println(arreglo[0]);
        System.out.println("¿Cuantas figuras le pongo joven?");
        Scanner input = new Scanner(System.in);
        int cant = input.nextInt();
    Figuras[] figuras = new Figuras[cant];
    
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("¿Que figuras quiere chavo? (1.-Circulo "
                    + "2.-Triangulo");
            int tipo = input.nextInt();
            if(tipo == 1){//Ciculo
                Circulo cir = new Circulo();
                System.out.println("¿Cual es el radio papi?");
                cir.setRadio(input.nextDouble());//Capturamos el dato del radio
                figuras[i] = cir;
            }else{//Triangulo
                Triangulo Tri = new Triangulo();
                System.out.println("¿Cual es la base papi?");
                Tri.setBase(input.nextDouble());
                System.out.println("¿Cual es la altura papi?");
                Tri.setAltura(input.nextDouble());
                figuras[i] = Tri;
            }
            //Imprimir resultados
            for (int j = 0; j < figuras.length; j++) {
                if(figuras[i] instanceof Circulo){
                    System.out.println("Circulo:" + i);
                    //Casting: --> Conversion
                    //Ejemplo
                  //int val = (int)(Math.random()*100);
                    Circulo circun = (Circulo)figuras[i];
                    circu.imprimirDatos();
                }
                
                else{
                    System.out.println("Triangulo:" + i);
                    //Casting 
                    Triangulo Trian = (Triangulo)figuras[i];
                    Trian.imprimirDatos();
                }
                System.out.println("Figura:" + i);
                System.out.println("Area:"+  figuras[i].Calarea());
                System.out.println("Perimetro:" +  figuras[i].CalcularPeri());
            }
        }   
       /* Circulo[] circulos = new Circulo[cant];
        for (int i = 0; i < cant; i++) {
            circulos[i] = new Circulo();
       
        }
        for (int i = 0; i < circulos.length; i++) {
            circulos[i].imprimirDatos();
        */}
    }
    

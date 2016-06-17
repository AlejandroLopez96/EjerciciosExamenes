/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenRec1;

import java.util.Scanner;

/**
 *
 * @author Alex Lopez
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);     
        int [] numeros = new int [20];
        for (int x = 0; x < 20; x++) {
            numeros[x] = (int)(Math.random() * 101);
        }
        
        for (int x = 0; x < 20; x++) {
          System.out.print(numeros[x] + " ");
        }
        
        System.out.println();
        System.out.print("Por favor, introduce el primer numero: ");
        int primerNum = Integer.parseInt(s.nextLine());
        System.out.print("Introduce el segundo numero: ");
        int segundoNum = Integer.parseInt(s.nextLine());
        boolean existe = false;
        int pasos = 0;
        int posicion1= 0;
        int posicion2= 0;
        for (int x = 0; x<20;x++) {
            if (primerNum == numeros[x] && !existe){
                primerNum=numeros[x];
                posicion1= x;
                existe = true;
            }
        }
        existe = false;
        for (int x = 0; x<20;x++) {
            if (segundoNum == numeros[x] && !existe){
                segundoNum = numeros[x];
                posicion2 = x;
                existe = true;
            }
        }
        
        for (int x = posicion1;x <posicion2 ;x++){
            pasos++;
        }
        System.out.println("Para pasar del " + primerNum + " al " + segundoNum + " hay que dar " + pasos + " pasos.");
    }
    
}

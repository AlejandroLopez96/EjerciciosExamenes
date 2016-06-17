/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.util.Scanner;

/**
 *
 * @author Alex Lopez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int x=0;x<numeros.length;x++){
            
            numeros[x] = (int) (Math.random()*501);
            System.out.print(numeros[x] + " ");   
            
        }
        
        System.out.println();
        System.out.println("¿Qué quiere destacar? (1-maximo, 2-minimo): ");
        
        for (int x=0;x<numeros.length;x++){
            
            if (numeros[x] > max) {
                    max = numeros[x];       
            } 
            if (numeros[x] < min){
                    min = numeros[x];     
            }
            
        }
        
        int opcion;
        opcion = Integer.parseInt(s.nextLine());
        
        switch (opcion) {
            case 1:
                System.out.println("Maximo " + max);
            break;
            case 2:
                System.out.print("Minimo " + min);
        }
        
    }
    
}

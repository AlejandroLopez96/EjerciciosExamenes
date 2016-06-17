/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFunciones;

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
        System.out.print("Escribe un numero por favor: ");
        Scanner s = new Scanner(System.in);
        System.out.println(Ejercicio3.versionTacana(Long.parseLong(s.nextLine())));
    }
    public static long versionTacana(long numero){
        long tacano=0;
        long auxNum= numero;
           //Le da la vuelta
           long volteado = 0; 
         
        while (numero > 0) {
          volteado = (volteado * 10) + (numero % 10);
          numero /= 10;
          
        }
        
        while (volteado > 0) {
            
            if((int)(Math.random()*2) == 0){
              tacano = (tacano * 10) + (volteado % 10);
          }       
          
           
          volteado /= 10;
          
        }
        return tacano;
    }
}

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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Escribe un numero por favor: ");
        int numero = Integer.parseInt(s.nextLine());
        int tacano=0;
        int longitudNum = 0;
        int auxNum= numero;
           //Le da la vuelta
           int volteado = 0; 
         
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
        
        
        
        System.out.println();
        System.out.println(tacano);
    }
    
}

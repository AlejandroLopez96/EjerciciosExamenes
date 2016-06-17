/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen4;

import java.util.Scanner;

/**
 *
 * @author Alex Lopez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int [] num = new int [20];
        for (int x = 0; x < 20; x++) {
            num[x] = (int)(Math.random() * 401);
        }
        
        for (int x = 0; x < 20; x++) {
          System.out.print(num[x] + " ");
        }

        System.out.println();
        System.out.print("¿Qué números quiere resaltar? (1-los múltiplos de 5, 2-los múltiplos de 7): ");
        int opcion;
        opcion = Integer.parseInt(s.nextLine());
        if (opcion == 1){
            for (int x = 0; x < 20; x++) {
                if ((num[x] % 5) == 0){
                    System.out.print("[" +num[x] + "] ");
                } else {
                    System.out.print(num[x] + " ");
                }
            }
        }
        if (opcion == 2){
            for (int x = 0; x < 20; x++) {
                if ((num[x] % 7) == 0){
                    System.out.print("[" +num[x] + "] ");
                } else {
                    System.out.print(num[x] + " ");
                }
            }
        }
    } 
}

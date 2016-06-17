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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int altura;
        System.out.print("Por favor introduce la altura del logotipo: ");
        altura = Integer.parseInt(s.nextLine());
        int espacio = 0;
        for(int i = 0; i < altura; i++) {
            for (int j =0; j< espacio; j++) {
                System.out.print(" ");
            }
            espacio++;
            System.out.println("***"); 
        }
    }
}


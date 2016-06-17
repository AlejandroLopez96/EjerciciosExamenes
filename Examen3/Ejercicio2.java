/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen3;
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
        System.out.print("Vamos a pintar una L, escribe la altura de la L: ");
        int alturaIntroducida = Integer.parseInt(s.nextLine()); 
        int altura = 1;
        while (altura <= alturaIntroducida) {
            if (altura != alturaIntroducida) {
                System.out.println("*");
            } else {
                for (int x = 1; x <= ((alturaIntroducida/2) + 1); x++) {
                    System.out.print("*");
                }
            }
            altura++;
        }
    }
    
}

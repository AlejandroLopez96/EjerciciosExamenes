package Examen1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        System.out.println("Este programa pinta una U a partir de una longitud introducida.");
        System.out.print("Por favor introduce una altura: ");
        int alturaIntroducida = Integer.parseInt(s.nextLine());

        int altura = 1;

        while (altura <= alturaIntroducida) {
          if (altura  <= (alturaIntroducida - 1)) {
            System.out.print("*");
            for (int x = 1; x <= alturaIntroducida; x++) {
              System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            altura++;
          } else {
            System.out.print("  ");
            for (int x = 1; x <= (alturaIntroducida - 2); x++) {
              System.out.print("*");
            }
            System.out.print("  ");
            altura++;
          }
        }
    }
    
}

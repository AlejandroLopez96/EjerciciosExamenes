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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número (entero positivo): ");
        long numeroIntroducido = Long.parseLong(s.nextLine());

        int contador = 0;
        long numero = numeroIntroducido;
        long dividendo = 1;
        long suma = 0;

        while (numero > 0) {
            numero = numero /10;
            contador++;
        }

        for (int x = 1; x < contador; x++) {
            dividendo = dividendo * 10;
        }

        numero = 0;
        System.out.print("Los dígitos pares son:");

        while (contador > 0) {
            numero = numeroIntroducido / dividendo;
            if ((numero % 2) == 0) {
              System.out.print(" " + numero);
              suma = suma + numero;
            }
            numeroIntroducido = numeroIntroducido % dividendo;
            dividendo = dividendo / 10;
            contador--;
        }

        System.out.println();
        System.out.print("La suma de los dígitos pares es: " + suma);
  }
}  


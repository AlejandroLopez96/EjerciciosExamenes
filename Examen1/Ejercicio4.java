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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Este programa parte un número en dos trozos (pares e impares).");
        System.out.print("Por favor, introduzca el primer número: ");
        long numUno = Long.parseLong(s.nextLine());
        System.out.print("Por favor, introduzca el segundo número: ");
        long numDos = Long.parseLong(s.nextLine());
        long numIntroducido = Funciones.mezcla(numUno, numDos); //has entendido lo que te decia??; eso es lo de mezclanumeros2 y con eso hacemos la mezcla de los numeros y con lo de este ejercicio hacemos lo de los pares e impares.
               //pero el numero mezclado iria n numintoducido no? pero como pones ahí el mezclado? eso es lo que habria que investigar jajajaja 
        int contador = 0; //jajajajaj asi lo hace sin problema no?? si, se ve que así funciona bien jaja ole ole jajaj voy a probar otra vez
        long divisor = 1;
        long num = numIntroducido;
        //Calcula la longitud del número //eso sera porque es muy largo no? jajajajaj ni idea ahora ya si no? seria por eso. Si, a bien, será porque era muy largo jajaj
        do {
            num = num / 10;
            contador++;
        } while (num > 0);

        //Genera el divisor
        for (int x = 1; x < contador; x++) {
            divisor = divisor * 10;
        }
        //Busca el número y ve si es par
        int nuevoContador = contador;
        long nuevoDivisor = divisor;
        long nuevoNumIntroducido = numIntroducido;
        System.out.print("El número formado con los dígitos pares es: ");
        while (contador > 0) {
            long digitoBuscado = numIntroducido / divisor;
            if ((digitoBuscado % 2) == 0) {
              System.out.print(digitoBuscado);
            }
            contador--;
            numIntroducido = numIntroducido % divisor;
            divisor = divisor / 10;
        }
        //Busca el número y ve si es impar
        System.out.println();
        System.out.print("El número formado con los dígitos impares es: ");
        while (nuevoContador > 0) {
            long digitoBuscado = nuevoNumIntroducido / nuevoDivisor;
            if ((digitoBuscado % 2) != 0) {
              System.out.print(digitoBuscado);
            }
            nuevoContador--;
            nuevoNumIntroducido = nuevoNumIntroducido % nuevoDivisor;
            nuevoDivisor = nuevoDivisor / 10;
        }
  }
}
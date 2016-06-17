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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int[] mesa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ocupacion = {(int)(Math.random()*5), (int)(Math.random()*5), (int)(Math.random()*5), (int)(Math.random()*5), 
        (int)(Math.random()*5), (int)(Math.random()*5), (int)(Math.random()*5), (int)(Math.random()*5), (int)(Math.random()*5), 
        (int)(Math.random()*5), (int)(Math.random()*5)};
        int pers;
        do {
            System.out.print("Mesa nº   ");
            for (int i = 0; i < 10; i++) {
                System.out.print(mesa[i] + " "); 
            }
            System.out.println();
            System.out.print("Ocupación ");
            for (int i = 0; i < 10; i++) {
                System.out.print(ocupacion[i] + " "); 
            }
            System.out.println();
            boolean ocupada = false;
            boolean ocup = false;
            System.out.println("¿Cuántos son?(Si quieres salir del programa pulsa -1)");   
            pers = Integer.parseInt(s.nextLine());
            for (int i = 0; i < 10; i++){
                if (ocupacion[i] == 0 && !ocupada) {
                            ocupada = true;
                            ocup = true;
                            System.out.println("De acuerdo puede sentarse en la mesa " + mesa[i]);
                            ocupacion[i]+=pers;
                }
            }
            if ((pers <= 4) && (pers > 0)) { //
                // si mete un numero entre 1 y 4 se le busca sitio
                for(int i = 0; i < 10; i++){  
                    int ocupacionAux = (4 - ocupacion[i]);
                    if ((ocupacionAux == 4 && !ocupada)) { 
                        ocupada = true;
                        ocup = true;
                        System.out.println("De acuerdo puede sentarse en la mesa " + mesa[i]);
                        ocupacion[i]+=pers;
                    } else if (ocupacionAux >= pers && !ocupada) { 
                        ocupada = true; 
                        ocup = true;
                        System.out.println("Tendrá que compartir mesa. Por favor sientese en la mesa " + mesa[i]);
                        ocupacion[i]+=pers;
                    }
                }
                if (!ocup) {
                    System.out.println("No hay sitio, lo siento");
                }
            }
            if (pers  > 4) {
                System.out.println("Lo siento, no tenemos mesa para tantas personas.");
            }
        } while (pers > 0);
        System.out.print("Gracias. Hasta pronto.");
    }
}
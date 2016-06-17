/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen3;

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
        System.out.println("Este programa genera una melodía al azar.");
        int compas = 4;
        int notas = (int)((Math.random() * 25) + 4);
        String nomnota = "";
        int principio = 1;
        String primeraNota = "";
        
        while ((notas % 4) != 0) {      //genera el número de notas
            notas = (int)((Math.random() * 25) + 4);
        }
        System.out.println("Numero de notas que hay: " + notas);
        while (principio <= notas) { 
            for (int i = 1; i <= compas; i++) {
                int nota =  (int)(Math.random() * 7);
                switch (nota) {
                    case 0:
                        nomnota = "Do";
                    break;

                    case 1:
                        nomnota = "Re";
                    break;

                    case 2:
                        nomnota = "Mi";
                    break;

                    case 3:
                        nomnota = "Fa";
                    break;

                    case 4:
                        nomnota = "Sol";
                    break;

                    case 5:
                        nomnota = "La";
                    break;

                    case 6:
                        nomnota = "Si";
                    break;

                    default:
                    break;
                }

                if (principio == 1) {
                    primeraNota=nomnota;
                }
                if (principio == notas) {
                    nomnota=primeraNota;
                }
                System.out.print(nomnota + " ");
                
                principio++;
            } // for i
            
            if (principio == notas+1) {
                System.out.print("|| ");
            } else {
                System.out.print("| ");
            }
            
            
    } // while principio
    
}
}

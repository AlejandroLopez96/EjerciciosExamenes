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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double nota = Double.parseDouble(s.nextLine());
        System.out.print("¿Qué nota quieres sacar en  el trimestre? ");
        double notafinal = Double.parseDouble(s.nextLine());
        System.out.print("Para tener un " + notafinal + " en el trimestre necesitas " + ((notafinal - (nota*0.4)) / 0.6 ) + " en el segundo examen.");
    }
    
}

package Examen1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        double nota1;
        double nota2;
        double media = 0;
        String r;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Nota del primer control: ");
        
        nota1 = Double.parseDouble(s.nextLine());
        
        System.out.print("Nota del segundo control: ");
        
        nota2 = Double.parseDouble(s.nextLine());
        
        media = ((nota1 + nota2) / 2);
        
        if (media >= 5){
            System.out.print(media);
        }
        
        if (media < 5){
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
            r = s.nextLine();
            if (r.equals("apto")){
                System.out.println("Tu nota de programación es 5.");
            } else {
                System.out.print(media);
            }
        }
    }
    
}

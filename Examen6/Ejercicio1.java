/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen6;

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
        int [][] numeros = new int [4][6];
        int suma=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++) {
            max = 0;
            for(int x = 0; x < 6; x++) {
                numeros[i][x] = (int)(Math.random()*90)+10;
                System.out.printf("%5d", numeros[i][x]);
                if(max < numeros[i][x]){
                    max = numeros[i][x];
                }
                if(x == 5) {
                   System.out.printf(" |%3d", max); 
                }
  
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
       //suma columnas
       for(int i = 0; i < 6; i++){
           min=101;
            for(int x = 0; x < 4; x++) {
            if(min > numeros[x][i]){
                    min = numeros[x][i];
                }
            }
            System.out.printf("%5d", min); 
        }
        System.out.println(" |");
    }
}


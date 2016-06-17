/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen5;

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
        int [][] numeros = new int [5][8];
        for(int i = 0; i < 5; i++) {
            for(int x = 0; x < 8; x++) {
                numeros[i][x] = (int)(Math.random()*101) + 100;
                System.out.printf("%5d", numeros[i][x]);
            }
            System.out.println();
        }//aqui muestra el array
        System.out.println("-------------------------------------------");
        System.out.println("Introduzca las coordenadas donde quiere hacer explotar la bomba numérica.");
        System.out.print("Fila: ");
        int fila = Integer.parseInt(s.nextLine());
        System.out.print("Columna: ");
        int columna = Integer.parseInt(s.nextLine());
        int num=numeros[fila][columna];
        numeros[fila][columna]=num*2;
        if(((fila < 4) && (fila >= 0)) && ((columna < 7) && (columna >= 0))){ 
        num=numeros[fila+1][columna+1];
        numeros[fila+1][columna+1]=num*3; 
        }  
        if(((fila < 5) && (fila >= 0)) && ((columna < 7) && (columna >= 0))){ 
        num=numeros[fila][columna+1];  
        numeros[fila][columna+1]=num*3; 
        }
        if(((fila < 5) && (fila >= 1)) && ((columna < 8) && (columna >= 1))){
        num=numeros[fila-1][columna-1];
        numeros[fila-1][columna-1]=num*3;
        }
        if(((fila < 4) && (fila >= 0)) && ((columna < 8) && (columna >= 0))){
        num=numeros[fila+1][columna];
        numeros[fila+1][columna]=num*3;
        }
        if(((fila < 5) && (fila >= 1)) && ((columna < 7) && (columna >= 0))){
        num=numeros[fila-1][columna+1];
        numeros[fila-1][columna+1]=num*3;
        }
        if(((fila < 4) && (fila >= 0)) && ((columna < 8) && (columna >= 1))){
        num=numeros[fila+1][columna-1];
        numeros[fila+1][columna-1]=num*3;
        }
        if(((fila < 5) && (fila >= 1)) && ((columna < 8) && (columna >= 0))){
        num=numeros[fila-1][columna];
        numeros[fila-1][columna]=num*3;
        }
        if(((fila < 4) && (fila >= 0)) && ((columna < 8) && (columna >= 1))){
        num=numeros[fila][columna-1];
        numeros[fila][columna-1]=num*3;
        }
        if(((fila < 3) && (fila >= 0)) && ((columna < 6) && (columna >= 0))){
        num=numeros[fila+2][columna+2];
        numeros[fila+2][columna+2]=num*4;
        }
        if(((fila < 5) && (fila >= 0)) && ((columna < 6) && (columna >= 0))){ 
        num=numeros[fila][columna+2];
        numeros[fila][columna+2]=num*4;
        }
        if(((fila < 5) && (fila >= 2)) && ((columna < 8) && (columna >= 2))){
        num=numeros[fila-2][columna-2];
        numeros[fila-2][columna-2]=num*4;
        }
        if(((fila < 3) && (fila >= 0)) && ((columna < 8) && (columna >= 0))){
        num=numeros[fila+2][columna];
        numeros[fila+2][columna]=num*4;
        }
        if(((fila < 5) && (fila >= 2)) && ((columna < 6) && (columna >= 0))){
        num=numeros[fila-2][columna+2];
        numeros[fila-2][columna+2]=num*4;
        }
        if(((fila < 3) && (fila >= 0)) && ((columna < 8) && (columna >= 2))){
        num=numeros[fila+2][columna-2];
        numeros[fila+2][columna-2]=num*4;
        }
        if(((fila < 5) && (fila >= 2)) && ((columna < 8) && (columna >= 0))){
        num=numeros[fila-2][columna];
        numeros[fila-2][columna]=num*4;
        }
        if(((fila < 5) && (fila >= 0)) && ((columna < 8) && (columna >= 2))){
        num=numeros[fila][columna-2];
        numeros[fila][columna-2]=num*4;
        }
        if(((fila < 4) && (fila >= 0)) && ((columna < 8) && (columna >= 2))){
        num=numeros[fila+1][columna-2];
        numeros[fila+1][columna-2]=num*4;
        }
        if(((fila < 5) && (fila >= 1)) && ((columna < 8) && (columna >= 2))){
        num=numeros[fila-1][columna-2];
        numeros[fila-1][columna-2]=num*4;
        }
        if(((fila < 3) && (fila >= 0)) && ((columna < 8) && (columna >= 1))){
        num=numeros[fila+2][columna-1];
        numeros[fila+2][columna-1]=num*4;
        }
        if(((fila < 3) && (fila >= 0)) && ((columna < 7) && (columna >= 0))){
        num=numeros[fila+2][columna+1];
        numeros[fila+2][columna+1]=num*4;
        }
        if(((fila < 4) && (fila >= 0)) && ((columna < 6) && (columna >= 0))){
        num=numeros[fila+1][columna+2];
        numeros[fila+1][columna+2]=num*4;
        }
        if(((fila < 5) && (fila >= 1)) && ((columna < 6) && (columna >= 0))){
        num=numeros[fila-1][columna+2];
        numeros[fila-1][columna+2]=num*4;
        }
        if(((fila < 5) && (fila >= 2)) && ((columna < 7) && (columna >= 0))){
        num=numeros[fila-2][columna+1];
        numeros[fila-2][columna+1]=num*4;
        }
        if(((fila < 5) && (fila >= 2)) && ((columna < 8) && (columna >= 1))){
        num=numeros[fila-2][columna-1];
        numeros[fila-2][columna-1]=num*4;
        }
        //para ahorrarme codigo sería mejor utilizar if(Math.abs(fila1-fila2) && Math.abs(columna1-columna2)) 
        //el valor absuluto siempre da positivo y no sale del array
        System.out.println();
        for(int i = 0; i < 5; i++) {
                for(int x = 0; x < 8; x++) {
                    System.out.printf("%5d", numeros[i][x]);
                }
                System.out.println();
            }
        System.out.println("-------------------------------------------");
    }
    
} 

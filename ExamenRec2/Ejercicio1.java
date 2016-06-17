/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenRec2;

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
        int tabla=(int)(Math.random()*7)+4;
        int fila=tabla;
        int columna=tabla;
        int [][] numeros = new int [fila][columna];
        for(int i = 0; i < fila; i++){
            for(int j = 0; j < columna; j++){
                numeros[i][j] = (int)(Math.random()*101) + 100;
                System.out.printf("%5d", numeros[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("La diagonal principal es: ");
        for(int i = 0; i < fila; i++) {
            for(int j = 0; j < columna; j++) {
                if (j == i) {
                    System.out.print(numeros[i][j] + "|");
                }
            }
        }
        
        System.out.println();
        System.out.println();
        System.out.print("La diagonal contraria desde abajo izquierda es: ");
        for (int i=fila-1; i>=0; i--){
            for (int j=0; j<columna; j++){
                if ((fila-1)-i == j){ //
                    System.out.print(numeros[i][j] +"|");
		}
            }
	}				
        
        System.out.println();
        System.out.println();
        System.out.print("La diagonal contraria desde arriba derecha es: ");
        for (int i=0; i<fila; i++){
            for (int j=columna-1; j>=0; j--){
                if (i == (columna-1)-j){ //
                    System.out.print(numeros[i][j] +"|");
		}
            }
	}
     
        System.out.println();
        System.out.println();
        System.out.print("La primera fila es: ");
        int i=0;//valor de la fila osea la fila 0
        columna--; //restamos columna -1 para que no se salga del array
            for(int j = 0; j <= columna; j++){
                System.out.printf(numeros[i][j] +"|");
            }
        
        System.out.println();
        System.out.println();
        System.out.print("La primera columna es: ");
        i=0;//valor de la fila osea la fila 0
            for(int j = 0; j <= columna; j++){
                System.out.printf(numeros[j][i] +"|");
            }
        
        System.out.println();
        System.out.println();
        System.out.print("La última fila es: ");
        fila--;
        i=fila;
        columna--; //restamos columna -1 para que no se salga del array
            for(int j = 0; j <= columna+1; j++){
                System.out.printf(numeros[i][j] +"|");
            }
        
        System.out.println();
        System.out.println();
        System.out.print("La última columna es: ");
        i=fila;
            for(int j = 0; j <= columna+1; j++){
                System.out.printf(numeros[j][i] +"|");
            }
            
        System.out.println();
        System.out.println();
        if(tabla >= 5){
            System.out.print("La fila 5 es: ");
            i=5;//valor de la fila osea la fila 5
                for(int j = 0; j <= columna+1; j++){
                    System.out.printf(numeros[i][j] +"|");
                }
        }
    }
    
}

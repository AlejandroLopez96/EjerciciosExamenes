/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenRec1;

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
        String [] nombrePartido = {"Ciudadanos","Podemos","PP","PSOE","Izquierda Unida","UpyD"};
        int [] votacion = new int [6];
        for (int i = 0; i < 6;i++){
            System.out.println("Escribe el numero de votos del partido " + nombrePartido[i] + ": ");
            votacion[i] = Integer.parseInt(s.nextLine());
        }
        System.out.println();
        int suma = votacion[0] + votacion[1] + votacion [2] + votacion[3] + votacion[4] + votacion [5]; 
        int media = suma/6;
        System.out.println("La media de todas las votaciones es: " + media);
        System.out.print("Los partidos que han obtenido votos por encima de la media han sido: ");
        for (int i = 0; i < 6; i++) {
            if (votacion[i] > media){
                 System.out.print(nombrePartido[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Los partidos que han obtenido votos por debajo de la media han sido: ");
        for (int i = 0; i < 6; i++) {
            if (votacion[i] < media){
                 System.out.print(nombrePartido[i] + " ");
            }
        }
    }
    
}

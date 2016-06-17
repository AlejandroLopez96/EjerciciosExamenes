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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Coloca colores al principio.");
      String[] color = new String [8]; //Array de 8
      int id = 1; //cuenta los pide frutas
      int contadorColor = 0;
    
      //Pide las frutas y cuenta las que valen
      for(int x = 0; x < 8; x++) {
        System.out.print(id + ".Por favor, introduzca un color: ");
        Scanner s = new Scanner(System.in);
        color[x] = s.nextLine();
        id++;//Aumenta los id
        if (color[x].equals("verde")) {
          contadorColor++; //lo guarda y aumenta el contador de colores
        }
        if (color[x].equals("rojo")) {
          contadorColor++;
        }
        if (color[x].equals("azul")) {
          contadorColor++;
        }
        if (color[x].equals("amarillo")) {
          contadorColor++;
        }
        if (color[x].equals("naranja") ){
          contadorColor++;
        }
        if (color[x].equals("rosa")) {
          contadorColor++;
        }
        if (color[x].equals("negro")) {
          contadorColor++;
        }
        if (color[x].equals("blanco")) {
          contadorColor++;
        }
        if (color[x].equals("morado") ){
          contadorColor++;
        }
      }
      
    //Lo muestra normal
    System.out.println("\n\nArray original:");
    for (int x = 0; x < 8; x++) {
      System.out.printf(color[x] + "|"); //Datos metidos por teclado + |
    }
    
    
    //Lo ordena
    String[] arrayNuevo = new String[8];
    int indiceColorAux = 0 + contadorColor; //era por este indice, tiene que 0 mas los colores que haya, entonces las palabras empeizan despues. si hay 6 colores, el indice para las palabras es 6, 7, 8, antes estaba al reves ahh vale vale ya decia yo que algo ahi estaria mal pero tambien lo que me quede to pillado fue con elindiceColorAux porque hiciste eso en el final
    int indiceColor = 0;
    int i = 0;
    for(int x = 0; x < 8; x++) {
    int contadorColor2 = 0;
      if (color[x].equals("verde")) {
        arrayNuevo[contadorColor2] = color[x]; 
        indiceColor++;
      } else if (color[x].equals("rojo")) {
        arrayNuevo[indiceColor] = color[x];
        indiceColor++;
      } else if (color[x].equals("azul")) {
        arrayNuevo[indiceColor] = color[x];
        indiceColor++;
      } else if (color[x].equals("amarillo")) {
        arrayNuevo[indiceColor] = color[x];
        indiceColor++;
      } else if (color[x].equals("naranja")) {
        arrayNuevo[indiceColor] = color[x];
        indiceColor++;
      } else if (color[x].equals("rosa")) {
        arrayNuevo[indiceColor] = color[x];
        indiceColor++;
      } else if (color[x].equals("negro")) {
        arrayNuevo[indiceColor] = color[x];
        indiceColor++;
      } else if (color[x].equals("blanco")) {
        arrayNuevo[indiceColor] = color[x];
        indiceColor++;
      } else if (color[x].equals("morado")) {
        arrayNuevo[indiceColor] = color[x];
        indiceColor++;
      }else {
        arrayNuevo[indiceColorAux] = color[x];
        indiceColorAux++; 
      }
    }
    //ahí sería 6 si eso, es para meta palabras en las ultimas posiciones, seria 0 mas todos los colores que haya, etonces las posiciones de los colores quedanreservadas las primeras, lo demás se va air al ultimo por el calculo de arriba
    //Lo muestra
    System.out.println("\n\nArray final:");
    for (int x = 0; x < 8; x++) {
      System.out.printf(arrayNuevo[x] + "|");
    }
    
  }
}
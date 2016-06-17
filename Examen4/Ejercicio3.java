/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen4;

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
        
        
        System.out.println("Coloca frutas al final.");
        String[] fruta = new String [8]; //Array de 8
        int id = 1; //identificador
        int contadorFruta = 0;

        //Pide las frutas y cuenta las que valen
        for(int x = 0; x < 8; x++) {
          System.out.print(id + ".Por favor, introduzca una fruta: ");
          Scanner s = new Scanner(System.in);
          fruta[x] = s.nextLine();
          id++;//Aumenta los id
          if (fruta[x].equals("manzana")) {
            contadorFruta++; //lo guarda y aumenta el contador de colores
          }
          if (fruta[x].equals("mandarina")) {
            contadorFruta++;
          }
          if (fruta[x].equals("mango")) {
            contadorFruta++;
          }
          if (fruta[x].equals("chirimoya")) {
            contadorFruta++;
          }
          if (fruta[x].equals("nectarina") ){
            contadorFruta++;
          }
        }

      //Lo muestra normal
      System.out.println("\n\nArray original:");
      for (int x = 0; x < 8; x++) {
        System.out.printf(fruta[x] + "|"); //Datos metidos por teclado + |
      }


      //Lo ordena
      String[] arrayNuevo = new String[8];
      //int indiceFrutaAux = ; //era por este indice, tiene que 0 mas los colores que haya, entonces las palabras empeizan despues. si hay 6 colores, el indice para las palabras es 6, 7, 8, antes estaba al reves ahh vale vale ya decia yo que algo ahi estaria mal pero tambien lo que me quede to pillado fue con elindiceColorAux porque hiciste eso en el final
      int indiceFruta = 8 - contadorFruta;
      int i = 0;
      for(int x = 0; x < 8; x++) {
      int contadorColor2 = 0;
        if (fruta[x].equals("manzana")) {
          arrayNuevo[indiceFruta] = fruta[x]; 
          indiceFruta++;
        } else if (fruta[x].equals("mandarina")) {
          arrayNuevo[indiceFruta] = fruta[x];
          indiceFruta++;
        } else if (fruta[x].equals("mango")) {
          arrayNuevo[indiceFruta] = fruta[x];
          indiceFruta++;
        } else if (fruta[x].equals("chirimoya")) {
          arrayNuevo[indiceFruta] = fruta[x];
          indiceFruta++;
        } else if (fruta[x].equals("nectarina")) {
          arrayNuevo[indiceFruta] = fruta[x];
          indiceFruta++;
        }else {
          arrayNuevo[i] = fruta[x];
          i++; 
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

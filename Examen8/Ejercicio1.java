/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen8;

import java.util.HashMap;
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
        HashMap<String, String> color = new HashMap<>();
        Scanner s = new Scanner(System.in);
        
        color.put("azul", "blue");
        color.put("negro", "black");
        color.put("rojo", "red");
        color.put("blanco", "white");
        color.put("verde", "green");
        color.put("morado", "purple");
        color.put("amarillo", "yellow");
        color.put("naranja", "orange");
        color.put("rosa", "violet");
        
        HashMap<String, String> codigo = new HashMap<>();
        codigo.put("azul", "#0000FF");
        codigo.put("negro", "#000000");
        codigo.put("rojo", "#FF0000");
        codigo.put("blanco", "#FFFFFF");
        codigo.put("verde", "#008000");
        codigo.put("morado", "#800080");
        codigo.put("amarillo", "#FFFF00");
        codigo.put("naranja", "#FFA500");
        codigo.put("rosa", "#EE82EE");
        
        System.out.print("Por favor, introduzca un color: ");
        String planta = s.nextLine().toLowerCase();
        
        if (color.containsKey(planta)){
            System.out.print("El color " + planta +", en inglés es ");
            System.out.print(color.get(planta) + " ");
            System.out.print("y su código RGB es ");
            System.out.println(codigo.get(planta));
        }else {
            System.out.println("Lo siento, esa planta no existe");
        }
      }
    }

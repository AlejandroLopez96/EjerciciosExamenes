/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen7;

import java.util.HashMap;
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
        HashMap<String, String> nombre = new HashMap<>();
        Scanner s = new Scanner(System.in);
        
        nombre.put("ortiga", "urtica dioica");
        nombre.put("romero", "rosmarinus officinalis");
        nombre.put("aloe vera", "aloe barbadensis miller");
        nombre.put("ayahuasca", "banisteriopsis caapi");
        
        HashMap<String, String> descripcion = new HashMap<>();
        descripcion.put("ortiga","Es  diurética  y  depurativa.  Baja  los niveles de colesterol.");
        descripcion.put("romero","Tiene  efectos  estimulantes  y  tónicos, favorece  en  la  recuperación  de  las enfermedades respiratorias y del aparato digestivo.");
        descripcion.put("aloe vera","Regenera las células de la piel e incluso las de tejidos internos. Elimina hongos y virus. Protege el sistema inmunitario.");
        descripcion.put("ayahuasca","Se usa en el tratamiento de la depresión y la ansiedad así como en los problemas de personalidad y esquizofrenia.");
    
        System.out.print("Por favor, introduzca el nombre de una planta: ");
        String planta = s.nextLine().toLowerCase();
        
        if (nombre.containsKey(planta)){
            System.out.print("Nombre científico: ");
            System.out.println(nombre.get(planta));
            System.out.print("Propiedades: ");
            System.out.println(descripcion.get(planta));
        }else {
            System.out.println("Lo siento, esa planta no existe");
        }
      }
    }
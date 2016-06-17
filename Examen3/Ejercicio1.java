/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen3;
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
        double base;
        String iva;
        String cod;
        String general= "21%";
        String reducido= "10%";
        String superreducido= "4%";
        System.out.print("Introduzca la base imponible: ");
        base = Double.parseDouble(s.nextLine());
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        iva = s.nextLine();
        if (iva.equals("general")) {
            System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
            cod = s.nextLine();
            if (cod.equals("nopro")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + general + ") " + (base*0.21));
                System.out.println("Precio con IVA " + (base + (base*0.21)));
                System.out.println("Cod. Promocional (" + cod +") -" + (-0));
                System.out.println("TOTAL " + (base + (base*0.21)));
            }
            if (cod.equals("mitad")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + general + ") " + (base*0.21));
                System.out.println("Precio con IVA " + (base + (base*0.21)));
                System.out.println("Cod. Promocional (" + cod +") -" + ((base + (base*0.21))/2));
                System.out.println("TOTAL " + (base - ((base + (base*0.21))/2)));
            }
            if (cod.equals("meno5")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + general + ") " + (base*0.21));
                System.out.println("Precio con IVA " + (base + (base*0.21)));
                System.out.println("Cod. Promocional (" + cod +") -5");
                System.out.println("TOTAL " + (((base + (base*0.21)) - 5)));
            }
            if (cod.equals("5porc")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + general + ") " + (base*0.21));
                System.out.println("Precio con IVA " + (base + (base*0.21)));
                System.out.println("Cod. Promocional (" + cod +") -5%");
                System.out.println("TOTAL " + (base - ((base + (base*0.21)) * 0.05)));
            }
        }
        if (iva.equals("reducido")) {
            System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
            cod = s.nextLine();
            if (cod.equals("nopro")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + reducido + ") " + (base*0.10));
                System.out.println("Precio con IVA " + (base + (base*0.10)));
                System.out.println("Cod. Promocional (" + cod +") -" + (-0));
                System.out.println("TOTAL " + (base + (base*0.10)));
            }
            if (cod.equals("mitad")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + reducido + ") " + (base*0.10));
                System.out.println("Precio con IVA " + (base + (base*0.10)));
                System.out.println("Cod. Promocional (" + cod +") -" + ((base + (base*0.10))/2));
                System.out.println("TOTAL " + (base - ((base + (base*0.10))/2)));
            }
            if (cod.equals("meno5")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + reducido + ") " + (base*0.10));
                System.out.println("Precio con IVA " + (base + (base*0.10)));
                System.out.println("Cod. Promocional (" + cod +") -5");
                System.out.println("TOTAL " + (((base + (base*0.10)) - 5)));
            }
            if (cod.equals("5porc")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + reducido + ") " + (base*0.10));
                System.out.println("Precio con IVA " + (base + (base*0.10)));
                System.out.println("Cod. Promocional (" + cod +") -5%");
                System.out.println("TOTAL " + (base - ((base + (base*0.10)) * 0.05)));
            }
        }
        if (iva.equals("superreducido")) {
            System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
            cod = s.nextLine();
            if (cod.equals("nopro")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + superreducido + ") " + (base*0.04));
                System.out.println("Precio con IVA " + (base + (base*0.04)));
                System.out.println("Cod. Promocional (" + cod +") -" + (-0));
                System.out.println("TOTAL " + (base + (base*0.04)));
            }
            if (cod.equals("mitad")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + superreducido + ") " + (base*0.04));
                System.out.println("Precio con IVA " + (base + (base*0.04)));
                System.out.println("Cod. Promocional (" + cod +") -" + ((base + (base*0.04))/2));
                System.out.println("TOTAL " + (base - ((base + (base*0.04))/2)));
            }
            if (cod.equals("meno5")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + superreducido + ") " + (base*0.04));
                System.out.println("Precio con IVA " + (base + (base*0.04)));
                System.out.println("Cod. Promocional (" + cod +") -5");
                System.out.println("TOTAL " + (((base + (base*0.04)) - 5)));
            }
            if (cod.equals("5porc")) {
                System.out.println("Base imponible " + (base));
                System.out.println("IVA (" + superreducido + ") " + (base*0.04));
                System.out.println("Precio con IVA " + (base + (base*0.04)));
                System.out.println("Cod. Promocional (" + cod +") -5%");
                System.out.println("TOTAL " + (base - ((base + (base*0.04)) * 0.05)));
            }
        }
    }
    
}

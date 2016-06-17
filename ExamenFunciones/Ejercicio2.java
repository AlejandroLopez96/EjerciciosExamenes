/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFunciones;

/**
 *
 * @author Alex Lopez
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {8,7,2,1};
        System.out.print(convierteArrayEnNumero(n) + " ");
    }
    public static long convierteArrayEnNumero(int[] n){
        
        for(int x=0;x<n.length;x++){
            n[x] = (int)(Math.random()*10);
            System.out.print(n[x] + " ");
        }
        System.out.println();
    }
}


/*int num[]=rellenarArrayDesde(5);
        imprimirArray(num);
    }
 
    public static void imprimirArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
 
    public static int[] rellenarArrayDesde(int a){
        int num[]=new int [10];
        for(int i=0;i<num.length;i++){
            num[i]=a;
            a++;
        }
        return num;
    }*/
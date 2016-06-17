/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

/**
 *
 * @author Alex Lopez
 */
public class Funciones {
    
    public static long mezcla(long x, long y) {
        //Averigua la longitud de los números
        long numUno = x;
        long numDos = y;
        int contadorUno = 0;
        while(x > 0) {
            x = x / 10;
            contadorUno++;
        }
        int contadorDos = 0;
        while(y > 0) {
            y = y / 10;
            contadorDos++;
        }
        
        //Verifica cuál es el número de menor longitud
        int limite = 0;
        boolean esMenor = false;
        if(contadorUno >= contadorDos) {
            limite = contadorDos * 2;
            esMenor = true;
        } else {
            limite = contadorUno * 2;
        }
        
        
        //Crea los divisores de los números
        int divisorUno = 1;
        while(contadorUno > 1) {
            divisorUno = divisorUno * 10;
            contadorUno--;
        }
        int divisorDos = 1;
        while(contadorDos > 1) {
            divisorDos = divisorDos * 10;
            contadorDos--;
        }
        
        //Mezcla los números
        long nuevoNum = 0;
        for(int i = 0; i < limite; i++) {
            nuevoNum = nuevoNum * 10;
            if((i%2)==0) {
                long digito = numUno / divisorUno;
                numUno = numUno % divisorUno;
                divisorUno = divisorUno / 10;
                nuevoNum = nuevoNum + digito;
            } else {
                long digito = numDos / divisorDos;
                numDos = numDos % divisorDos;
                divisorDos = divisorDos / 10;
                nuevoNum = nuevoNum + digito;
            }  
        }
        
        if(esMenor) {
            while(divisorUno > 0) {
                nuevoNum = nuevoNum * 10;
                long digito = numUno / divisorUno;
                numUno = numUno % divisorUno;
                divisorUno = divisorUno / 10;
                nuevoNum = nuevoNum + digito;
            }
        } else {
            while(divisorDos > 0) {
               nuevoNum = nuevoNum * 10;
               long digito = numDos / divisorDos;
               numDos = numDos % divisorDos;
               divisorDos = divisorDos / 10;
               nuevoNum = nuevoNum + digito; //esta sería la variable que guarda el número mezclado, nuevoNum
            }
        } 
      return nuevoNum;  
    }//y si hacemos la modificacion utilizando la funcion esta hecha osea cogemos mezclanumeros2 y lo pegamos en el ejercicio4 y borramos lo de ahi
    //y lo hacemos a partir de ahi lo de pares e impares
}
//Este va de puta madre los mezcla perfe no? el primero de uno con el primero de otro y asi
//entonces solo tendria que hacer lo de coger los pares e impares de ese numero no?
//Lo que pasa que esta en funciones a ver como lo pasamos a normal no?
//Si, los mezclas y guardas el resultado en una variable int,vamos, el numero mezclado y de ahí sacas los apres y los impares como si fuese un unico numero
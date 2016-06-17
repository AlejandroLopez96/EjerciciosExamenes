package Examen1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        System.out.println("MAQUINA TRAGAPERRAS");
            int mano1 = (int)(Math.random()*5);
            switch(mano1) {
                case 0:
                System.out.print("corazon ");
                break;
                case 1:
                System.out.print("diamante ");
                break;
                case 2:
                System.out.print("herradura ");
                break;
                case 3:
                System.out.print("campana ");
                break;
                case 4:
                System.out.print("limon ");
                break;
                default:
            }
            int mano2 = (int)(Math.random()*5);
            switch(mano2) {
                case 0:
                System.out.print("corazon ");
                break;
                case 1:
                System.out.print("diamante ");
                break;
                case 2:
                System.out.print("herradura ");
                break;
                case 3:
                System.out.print("campana ");
                break;
                case 4:
                System.out.print("limon ");
                break;
                default:
            }
            int mano3 = (int)(Math.random()*5);
            switch(mano3) {
                case 0:
                System.out.println("corazon ");
                break;
                case 1:
                System.out.println("diamante ");
                break;
                case 2:
                System.out.println("herradura ");
                break;
                case 3:
                System.out.println("campana ");
                break;
                case 4:
                System.out.println("limon ");
                break;
                default:
            }
            
            if ((mano1 == mano2) && (mano1 == mano3)){
                System.out.println("Enhorabuena, ha ganado 10 monedas");
            }
            if ((mano1 != mano2) && (mano1 != mano3) && (mano2 != mano3)) {
                System.out.println("Lo siento, ha perdido");
            }
            if  (((mano1 == mano2) && ((mano1 != mano3) || (mano2 != mano3)))   || ((mano1 == mano3) && ((mano1 != mano2) || (mano2 != mano3))) || ((mano2 == mano3) && ((mano2 != mano1) || (mano3 != mano1)))) {
                System.out.println("Bien, ha recuperado su moneda");
            }
    } 
}

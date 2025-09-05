/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_9_captura;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EVA_1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
               
        double promedio;
        System.out.println("introduce tu nombre completo");
        //DATOS
        Scanner input = new Scanner(System.in);//CAPTURA TEXTO (NEXT LINE)
        nombre = input.nextLine();//CAPTURA DE TEXTO
        System.out.println("el nombre es: ");
        System.out.println(nombre);
    
    }

    private static String input() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

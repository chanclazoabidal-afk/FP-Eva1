/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_21_operaciones;

public class EVA_1_21_OPERACIONES {

    public static void main(String[] args) {
        // POTENCIA
        int valor = 2;
        int expo = 3;
        double resu = Math.pow(valor, expo);
        System.out.println("El resultado de " + valor + " elevado a " + expo + " es: " + resu);

        // RAÍZ CÚBICA
        double valor2 = 125;
        double resu2 = Math.cbrt(valor2);
        System.out.println("La raíz cúbica de " + valor2 + " es: " + resu2);
    }
} 

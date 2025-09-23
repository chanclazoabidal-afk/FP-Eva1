/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_24_juego_aguila_sol;
import java.util.Scanner;

public class EVA_1_24_JUEGO_AGUILA_SOL {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int usuario;

        System.out.println("AGUILA O SELLO? (1 = Águila, 0 = Sello)");
        usuario = captu.nextInt();

        
        double aleatorio = Math.random();
        System.out.println("Número generado: " + aleatorio);

        
        int AGUILA=0;
        int SELLO=0;

        if (aleatorio > 0.5) {
            System.out.println("SELLO");
            
        } else {
            System.out.println("ÁGUILA");
            
        }
        if ((usuario == 1 && AGUILA == 1) || (usuario == 1 && SELLO == 1)) {
            System.out.println("Adivinaste");
        } else {
            System.out.println("Fallaste :(");
        }
    }
} 

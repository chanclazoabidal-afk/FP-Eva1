/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_10_velocidadcaptura;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EVA_1_10_VELOCIDADCAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double distancia, tiempo, velocidad;  
        
      
// edad como entero
            // promedio con decimales

        Scanner input = new Scanner(System.in);
        System.out.println("cual es la distancia: ");
        distancia = input.nextDouble();
        System.out.println("cual es el tiempo: ");
        tiempo = input.nextDouble();
        velocidad = distancia/tiempo;
        System.out.print("La velocidad es: ");
        System.out.println(velocidad);}}
        
        
        
        
        
        
        
        

    


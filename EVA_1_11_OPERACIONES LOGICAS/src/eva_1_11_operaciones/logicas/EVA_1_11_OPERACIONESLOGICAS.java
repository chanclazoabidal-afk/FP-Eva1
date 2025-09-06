/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_11_operaciones.logicas;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class EVA_1_11_OPERACIONESLOGICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double Area, Radio;
    boolean resu;
    Scanner input = new Scanner(System.in);
    System.out.println("INGRESA AREA:");
    Area = input.nextDouble();
    Radio=Math.sqrt(Area/3.141686);
    System.out.println("RADIO ES IGUAL A :");
    System.out.println( Radio);
    //COMPARACIONES 
        // OPERACIONES LÓGICAS: COMPARACIONES
        // RESULTADOS: VERDADERO O FALSO

        // radio es mayor que cero?
        resu = Radio > 0;
        System.out.println("radio (5) > 0 ");
        System.out.println(resu);

        // radio menor que cero?
        resu = Radio < 0;
        System.out.println("radio (5) < 0 ");
        System.out.println(resu);

        // radio igual que cero?
        resu = Radio == 0;
        System.out.println("radio (5) == 0 ");
        System.out.println(resu);

        // radio diferente que cero?
        resu = Radio != 0;
        System.out.println("radio (5) != 0 ");
        System.out.println(resu);

    
            
    
    
// TODO code application logic here
    
    }
    
}

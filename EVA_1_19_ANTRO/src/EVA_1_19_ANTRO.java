import java.util.Scanner;

public class EVA_1_19_ANTRO {

    public static void main(String[] args) {
        // Constantes
        final int EDAD_MINIMA = 18;
        final String CREDENCIAL_VALIDA = "SI";

        Scanner input = new Scanner(System.in);
        String credencial;
        int edad;

        System.out.println("BIENVENIDO AL ANTRO"); 

        System.out.print("EDAD: ");
        edad = input.nextInt();
        input.nextLine(); // Limpiar buffer

        System.out.print("¿TIENES CREDENCIAL DE ELECTOR? (SI/NO): ");
        credencial = input.nextLine();

        if (edad >= EDAD_MINIMA && credencial.equals(CREDENCIAL_VALIDA)) {
            System.out.println("ACCESO CONCEDIDO. BIENVENIDO AL ANTRO ");
        } else {
            System.out.println(" NO CUMPLES LOS REQUISITOS.");
        }

     
    }
}

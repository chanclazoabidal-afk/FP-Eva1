package eva_1_18_restaurante; // Puedes quitar esta línea si no quieres usar package

import java.util.Scanner;

public class EVA_1_18_Restaurante {

    public static void main(String[] args) {
        final String USER = "ERICK";
        final String PASSWORD = "1234";

        Scanner input = new Scanner(System.in);
        String usuario, contra;

        System.out.println("BIENVENIDO AL SISTEMA DEL RESTAURANTE");

        System.out.print("USUARIO: ");
        usuario = input.nextLine();
 
        System.out.print("CONTRASEÑA: ");
        contra = input.nextLine();

        // Verificación simple
        if (usuario.equals(USER) )
        if (contra.equals(PASSWORD) ){
            System.out.println("ACCESO CONCEDIDO BIENVENIDO");
        } else {
            System.out.println("USUARIO O CONTRASEÑA INCORRECTOS ACCESO INVALIDO.");
        }

        
    }
}

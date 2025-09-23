package eva_1_20_califas;

import java.util.Scanner;

public class EVA_1_20_CALIFAS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int CALIFA;

        System.out.print("INGRESA LA CALIFICACIÓN: ");
        CALIFA = input.nextInt();

        if (CALIFA >= 90 && CALIFA <= 100) {
            System.out.println("A");
        } if (CALIFA >= 80 && CALIFA < 90) {
            System.out.println("B");
        } if (CALIFA >= 70 && CALIFA < 80) {
            System.out.println("C");
        } if (CALIFA >= 60 && CALIFA < 70) {
            System.out.println("D");
        } if (CALIFA >= 0 && CALIFA < 60) {
            System.out.println("F");
        } else {
            System.out.println("INVALIDO, ESCIRBALE BIEN");
        }

        input.close();
    }
}

    


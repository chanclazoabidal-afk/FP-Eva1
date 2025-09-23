/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_22_bisiesto;

import java.util.Scanner;

public class EVA_1_22_BISIESTO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int year, resi4, resi100, resi400;

        System.out.print("YEAR TO VERIFY: ");
        year = captu.nextInt();

        resi4 = year % 4;
        resi100 = year % 100;
        resi400 = year % 400;

        
        if (resi4 == 0) { 
  if (resi100 == 0) {
     if (resi400 == 0) { 
     System.out.println("THE YEAR " + year + " ES BISIESTO");
                } else {
           System.out.println("THE YEAR " + year + " NO ES BISIESTO");
                }
        } else {
                System.out.println("THE YEAR " + year + " ES BISIESTO");
            }
        } else { 
            System.out.println("THE YEAR " + year + " NO ES BISIESTO");
        }

      
    }}

 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopslab.java;

import java.util.Scanner;

/**
 *
 * @author Prince Dary
 */
public class LoopsLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("Good day Sir Jamie! To grade my work, please select among the following:");
        System.out.println("1. Multiplication Loop Generator");
        System.out.println("2. Sum of Natural Numebers");
        System.out.println("3. Factorial Calculator");
        System.out.println("4. Even and Odd Numbers");
        System.out.println("5. Reverse Digits of a Numeber");
        
        Scanner LAB4 = new Scanner (System.in);
        int MAINSWITCH = LAB4.nextInt();
        switch (MAINSWITCH) {
        
        case 1:
            System.out.println("Welcome to the Multiplication Loop Generator");
            System.out.println("Enter a number:");
            Scanner C1 = new Scanner (System.in);
            int P1 = C1.nextInt();
            
            for(int i = 1; i <= 10; i++) {
                int RESULT1 = P1 * i;
            System.out.println (P1 + " x " + i + " = " + RESULT1);      
} break;

        case 2: 
            System.out.println("Welcome to the Sum of Natural Numbers");
            System.out.println("Enter a number:");
            Scanner P2 = new Scanner (System.in);
            int N2 = P2.nextInt();
            
            int i2 = 1;
            int RESULT1 = 0;
            
            while (i2 <= N2) {
                RESULT1 = RESULT1 + i2;
                System.out.println("Sum = " + RESULT1);
                i2++;
                System.out.println();
} break;

        case 3:
            System.out.println("Welcome to the Factorial Calculator");
            System.out.println("Enter a number:");
            Scanner P3 = new Scanner (System.in);
            int N3 = P3.nextInt();
            
            long F = 1;
            int i3 = 1;
            do {
                F = F * i3;
                i3++;
            } while (i3 <= N3);
            
            System.out.println ("Factorial of " + N3 + " is = " + F);
            
  break;          
  
        case 4:
            System.out.println("Welcome to the Even and Odd Numbers");
            System.out.println("Enter a number:");
            Scanner P4 = new Scanner (System.in);
            int N4 = P4.nextInt();
            
            System.out.println("Even Numbers:");
            for (int i4 = 1; i4 <= N4; i4++) {
                if (i4 % 2 == 0) {
                    System.out.print(i4 + " ");
                }   
            }
            
            System.out.println(" ");
            System.out.println("Odd Numbers:");
            for (int i4 = 1; i4 <= N4; i4++) {
                if (i4 % 2 != 0) {
                    System.out.print(i4 + " ");
                }
            }
  break;

        case 5:
            System.out.println("Welcome to the Reverse Digits of a Number");
            System.out.println("Enter a number:");
            Scanner P5 = new Scanner (System.in);
            int NUMBERS = P5.nextInt();
            
            int REVERSED = 0;
            
            while (NUMBERS != 0) {
                int LD = NUMBERS % 10;
                REVERSED = REVERSED * 10 + LD;
                NUMBERS = NUMBERS / 10;
            }
            
            System.out.println("Reversed: " + REVERSED);
  break;       
        
        
        
        
}}}

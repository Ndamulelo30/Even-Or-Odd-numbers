/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

/**
 *
 * @author Sanele
 */
   import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your number :");
        int num = scanner.nextInt();
        if (num % 2 == 0)
        {
          System.out.println("Number is even :"+num);   
        }else
        {
         System.out.println("Number is odd :"+num);
        }
    }
}
    
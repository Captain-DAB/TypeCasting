/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introtojava;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IntroToJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println((int) 4.5);
        System.out.println((double) 1 / 2);
        
        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);
        
        float f = 12.5F;
        int i = (int) f;
        System.out.println("f is " + f);
        System.out.println("i is " + i);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the purchase Amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int) (tax * 100) / 100.0);
    }

}

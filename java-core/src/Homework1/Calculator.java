package Homework1;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter operand:");
        String operand = sc.nextLine();
        System.out.println("Operand = " + operand);

        System.out.println("Enter integer:");
        int i1 = sc.nextInt();
        System.out.println("First integer = " + i1);


        System.out.println("Enter integer:");
        int i2 = sc.nextInt();
        System.out.println("Second integer = " + i2);

        // System.out.println(((Object)operand).getClass().getName());

        switch (operand) {
            case "+":
                System.out.println("The result is " + (i1 + i2));
                break;
            case "-":
                System.out.println("The result is " + (i1 - i2));
                break;
            case "*":
                System.out.println("The result is " + (i1 * i2));
                break;
            case "/":
                System.out.println("The result is " + (i1 / i2));
                break;
        }
    }
}

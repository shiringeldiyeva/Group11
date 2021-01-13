package Marwan.methods;

import java.util.Scanner;

public class ExtraPractice {
    public static void main(String[] args) {
        // control flow
        // write a program the checks if number is less than 0 or greater than 0  or zero
        // if the number is zero print zero
        // if the number is greater then zero print(number) is greater than zero
        // if the number is less than zero print(number) is less than zero

        int number = 5;

        if (number == 0) {
            System.out.println("zero");
        }
        if (number > 0) {
            System.out.println(number + " is greater than zero");//1
        }
        if (number < 0) {
            System.out.println(number + " is less than zero");
        }
        if (number > 5 / 2) {
            System.out.println(number + " is greater than " + 5 / 2);//2
        }
        if (number == 5) {
            System.out.println("my number is " + number);//3
        }
        System.out.println("********************************");
/*
        Enter a number:
        10
        10 is even
        Enter a number:
        33
        33 is odd
        Enter a number:
        0
        0 is even
*/
        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number");
//        int num = input.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println(num + " is even");
//        } else if (num % 2 != 0) {
//            System.out.println(num + " is odd");
//        }

        /*
        for example:
        in = "burger"
        output: 10.0
        in = "chicken "
        output: 10.0
        in = "soda"
        output: 2.0
        */
        System.out.println("Enter a food or drink");
        String foodOrDrink = input.next();
        if (foodOrDrink.equalsIgnoreCase("burger")||foodOrDrink.equalsIgnoreCase("chicken")){
            System.out.println("price is $"+10.0);
        }else if (foodOrDrink.equalsIgnoreCase("soda")){
            System.out.println("price is $"+2.0);
        }else {
            System.out.println("Sorry i don't have it");
        }




    }
}

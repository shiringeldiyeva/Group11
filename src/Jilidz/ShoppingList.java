package Jilidz;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        while (count1<0){
            System.err.println("Please input a valid count");
            count1 = scan.nextInt();
        }
        price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();

        count2 = scan.nextInt();
        while (count2 < 0) {
            System.err.println("Please input a valid count");
            count2 = scan.nextInt();
        }
        price2 = scan.nextDouble();


        System.out.println("Enter Item3, count and its price:");

        item3 = scan.next();


        count3 = scan.nextInt();
        while (count3 < 0) {
            System.err.println("Please input a valid count");
            count3 = scan.nextInt();
        }
        price3 = scan.nextDouble();


        if (count1 >= 0 && count2 >= 0 && count3 >= 0) {
            report = "Item1 is " + item1 + ", count is " + count1 + ", price is " + price1 + "\nItem2 is " + item2 + ", count is " + count2 + ", price is " + price2 +
                    "\nItem3 is " + item3 + ", count is " + count3 + ", price is " + price3;
            totalPrice = (count1 * price1) + (count2 * price2) + (count3 * price3);
            System.out.println(report);
            System.out.println("totalPrice : " + totalPrice);
        }


    }
}
/*

Declare 4 String variables item1, item2, item3, report.
-Declare double variables price1, price2, price3, totalPrice
-Declare int variables count1, count2, count3
-Create a Scanner object named scan.
Execution flow using with example:
Use scanner to read all 3 values.
-Display prompt "Enter Item1, count1 and its price1:"
Tomatoes
2
52.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)
-Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
Explanation: (Item2 is "Cheese", count is 0, price is 3.5)
-Display prompt "Enter Item3, count and its price:"
Apples
5
6.3
Explanation: (Item3 is "Apples", count is 5, price is 6.3)
-calculate totalPrice for all items only if the item's count is more than 0!
 */
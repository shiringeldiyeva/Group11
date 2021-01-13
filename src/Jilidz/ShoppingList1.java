package Jilidz;

import java.util.Scanner;

public class ShoppingList1 {
    public static void main(String[] args) {
        String item1, item2, item3, report;
        int count1, count2, count3;
        double price1, price2, price3, totalPrice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        price1*=count1;

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
        price2*=count2;

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();
        price3*=count3;
        if (count1==0){
            report = "Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3;
            totalPrice = price2+price3;
        }else if (count2==0){
            report = "Item1: "+item1+" Price: "+price1+", Item3: "+item3+" Price: "+price3;
            totalPrice = price1+price3;
        }else {
            report = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2;
            totalPrice = price1+price2;
        }
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);


    }
}


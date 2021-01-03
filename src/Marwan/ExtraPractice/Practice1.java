package Marwan.ExtraPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(N+" * "+i+" = "+N*i);
        }












        /*
        System.out.println("================================");
        for (int i = 0; i < 1; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            String result = "               ";
            System.out.println(result.length());
            if (s1.length() > 0 && s1.length() <= 10 && x > 0 && x <= 999) {

                if (x < 10) {
                    for (int j = 0; j < s1.length(); j++) {
                        result = result.replaceFirst(" ", s1.charAt(j) + "");
                    }

         */
                    /*
                    int count  = 0 ;
                    for (int  k = 0; k<result.length() ; k++){
                        if (result.charAt(k)==' ')count++;
                    }
                    System.out.println(count);

                     */
        /*
                    char lastChar = result.charAt(result.length()-1);




                    System.out.println(result);
                }

            }


        }
        System.out.println("================================");

         */
        System.out.printf("");

        /*
        int i = scan.nextInt();
        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

         */


    }

    public static String printMe(int n) {
        String result = "";
        if (n >= 1 && n <= 100) {
            if (n % 2 != 0) result = "Weird";
            else if (n % 2 == 0 && (n >= 2 && n <= 5)) result = "Not Weird";
            else if (n % 2 == 0 && (n >= 6 && n <= 20)) result = "Weird";
            else if (n % 2 == 0 && n > 20) result = "Not Weird";
        }
        return result;
    }
}
/*
Task
Given an integer, n , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.
 */
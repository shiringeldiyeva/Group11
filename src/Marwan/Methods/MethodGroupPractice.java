package Marwan.Methods;

import javax.print.DocFlavor;

public class MethodGroupPractice {
    public static void main(String[] args) {
//        displayMessage();
        String str = "12345";
//        System.out.println(middleChars(str));
//        String middle = middleChars(str)+"456";
//        System.out.println(middle);

        minBetweenThreeDisplay(10, 20, 30);// display method
        int newResult = minBetweenThree(10, 20, 30);// return method

        int add5numbers =addNumbers(addNumbers(10,20,30),addNumbers(30,50));
        System.out.println(add5numbers);

        int average = averageNumber(10,20,30);
        int newNumber= averageNumber(averageNumber(10,20,30),averageNumber(10,40,60),90);
        int avMin = minBetweenThree(10,20,30)+averageNumber(10,20,30);
        System.out.println(averageTwo(10,10));


    }

    public static void displayMessage() {
        System.out.println("Good evening everyone");
    }

    public static String middleChars(String str) { // 111111
        String chars = "";

        if (str.length() % 2 == 0) {


            chars += str.charAt(str.length() / 2 - 1) + "" + str.charAt(str.length() / 2);
        } else chars += str.charAt(str.length() / 2);


        return chars;

    }

    public static void middleCharDisplay(String str) {
        String chars = "";

        if (str.length() % 2 == 0) {


            chars += str.charAt(str.length() / 2 - 1) + "" + str.charAt(str.length() / 2);
        } else chars += str.charAt(str.length() / 2);

        System.out.println(chars);

    }

    public static int minBetweenThree(int a, int b, int c) {
        int result = 0;
        if (a < b && a < c) result = a;
        else if (b < a && b < c) result = b;
        else result = c;


        return result;
    }

    public static void minBetweenThreeDisplay(int a, int b, int c) {
        int result = 0;
        if (a < b && a < c) result = a;
        else if (b < a && b < c) result = b;
        else result = c;

        System.out.println(result);
    }

    public static int addNumbers(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int addNumbers(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static int averageNumber (int a, int b, int c){
        int average = (a+b+c)/3;

        return average;
    }

    public static int averageTwo(int a, double b){
        int res =(int)( a+b)/2;

        return res  ;
    }


}

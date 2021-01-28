package Marwan.methods;

public class IntQuesReverseString {
    public static void main(String[] args) {
        /*Write a program that reverse a string*/

        String str = "My Marwan name is Marwan ";
        String str2 ="";

        if (str.contains("Aliya")){
            str2+="Aliya";
            for (int i = str2.length()-1; i>=0; i--) System.out.print(str2.charAt(i));

        }
        else{
            System.out.println("Hello world");
            System.out.println(str);
        }


//
//        str = str.substring(str.indexOf("A"));
//        System.out.println(str);
//
//        for (int i= str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }
    }
}

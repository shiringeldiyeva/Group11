package Marwan.UnitAssessment;

import java.util.ArrayList;

public class UnitAssesment {

    public static void main(String[] args) {

        String str = "123";

        int n1 = Integer.parseInt(str.charAt(0) + "");// ParseInt only works with string that have string of chars type numbers

        int n2 = Integer.parseInt(str.charAt(1) + "");

        int n3 = Integer.parseInt(str.charAt(2) + "");

        int c1 = Integer.valueOf(str.substring(0,1));
        Integer c2 = Integer.parseInt(str);

        System.out.println(Integer.parseInt(str));


        System.out.println(c1);
        System.out.println(n2);

        Integer n4 = n1;
        Integer n5 = n2;
        Integer n6 = n3;

        System.out.println(n4.equals(n5));


        ArrayList<Integer> list = new ArrayList<>();

        list.add((Integer.parseInt(str.substring(0,1))));
        //*****************************************************************
        int a1 = 0 , a2 = 0;

        Integer a3 = 0, a4 = 0;


        Character g = 's';


        char d = 'e';

        g = d;
        System.out.println(g);

        d = g;

        System.out.println(d);


        // specify the type of Boxing


        a1 = a3;// unboxing  If you assign upperCase(Integer, Character, Double, Float, Boolean, Byte, Short, Long) to Primitives (int, char, float, double, boolean,byte, short, long)

        a4 = a2;// autoboxing If you assign lowerCase(int, char, float, double, boolean, byte, short, long) to UpperCase {wrapperClass} (Integer, Character, Double, Float, Boolean, Byte, Short, Long)

        a1 = a2;// neither

        a3 = a4;// KickBoxing

        System.out.println("===========================");

        String strChar = "1a2b3d";

        if (Character.isDigit(strChar.charAt(0))) System.out.println(true);
        if (Character.isLetter(strChar.charAt(1))) System.out.println(true);














        // System.out.println(n1);


//   001  && 100
//
    }
}


/*
   old value = 100;
   value = 10

   new value = 100+10
   %=  100 / 110


 */
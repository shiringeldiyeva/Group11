package Shirin;

import java.util.ArrayList;
import java.util.Arrays;

public class SameLetterArraySort {
    public static void main(String[] args) {
        System.out.println(same("ABCD","DCBA"));

    }
    public static boolean same(String a,String b){
        char[]ch1=a.toCharArray();
        char[]ch2=b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1="",a2="";

        for(char each:ch1){
            a1+=each;
        }
        for(char each:ch2){
            a2+=each;
        }
        return a1.equals(a2);

    }
}

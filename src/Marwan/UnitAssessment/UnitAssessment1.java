package Marwan.UnitAssessment;

import java.util.ArrayList;
import java.util.Arrays;

public class UnitAssessment1 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(removeIndexes(arr, 1)));

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {

            list.add(each);
        }

        list.removeIf(p -> p % 2 == 0);

        System.out.println(list);

        // Data type promotion

        byte n = 7;

        short s = 20;

        n = (byte) s;

        s += 32767;
        // byte ==> short ==> int==> long ==> float ==> double


        System.out.println(Double.MAX_VALUE);


        System.out.println(s);


    }

    public static int[] removeIndexes(int[] arr, int numOfIndexes) {


        int[] newArr = new int[arr.length - numOfIndexes];
//
        for (int i = 0, j = numOfIndexes; i < newArr.length; i++, j++) {

            newArr[i] = arr[j];
        }
        return newArr;
    }
}

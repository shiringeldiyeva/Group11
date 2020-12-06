package Marwan.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {




        /*Find LargestGap between integers

        // int [] arr = {10,1,2,3,25,26,9,11}
        // create a function that when you pass an array it should return you the largestGap as an integer
        // note: you can use a sort method before starting the action

        int[] arr = {10, 1, 2, 3, 25, 26, 9, 11, 56};
        Arrays.sort(arr);

        // arr = [1, 2, 3, 9, 10, 11, 25, 26]
        int largestGap = arr[1] - arr[0];

        for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {

            if (arr[j] - arr[i] > largestGap) largestGap = arr[j] - arr[i];
        }
        System.out.println("Largest gap " + largestGap);

         */


        /* this Array Multiplier
        // arr = {5} , 3 ====== arr2 = {5,10,15}
        // arr = {4} , 5 =======arr2 = {4,8,12,16,20}


        int [] arr = {5};
        int multiplier = 10;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i =1; i<=multiplier;i++){//
            list.add(arr[0]*i);
        }//            5  * 1
        //             5  * 2
        //             5  * 3

        System.out.println(list);

         */

    }
}

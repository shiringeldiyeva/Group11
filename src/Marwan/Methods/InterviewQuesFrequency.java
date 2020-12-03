package Marwan.Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQuesFrequency {
    public static void main(String[] args) {

        String str = "AABBCCDEF";

        String newString = "";


//        ArrayList<Character> list = new ArrayList<>();

//        for (char each : str.toCharArray()){
//            list.add(each);
//        }
//        for (char each :list){
//           int count = Collections.frequency(list,each);
//            if (newString.contains(each+""))continue;
//            newString+=each+""+count;
//        }
//        System.out.println(newString);

        ArrayList<String> list = new ArrayList<>();

        //for (String each : str.split(""))list.add(each);

        list.addAll(Arrays.asList(str.split("")));
        for (String each : list) { //
            int freq = Collections.frequency(list, each);
            if (newString.contains(each)) continue;
        newString += each +freq;
        }
        System.out.println(newString);



    }
}

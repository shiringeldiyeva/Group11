package Shirin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindUnique2 {
    private static String result;

    public static String main(String[] args) {
        System.out.println("str");

        String str = "taaaaabcccffrrtyuop";
        String str2 = "";
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(str.split("")));

        for (String each : strArr) {
            if (Collections.frequency(strArr, each) == 1) str2 += each;
        }


        strArr.removeIf(p -> Collections.frequency(strArr, p) > 1);
        for (String each : strArr) str2 += each;
        System.out.println(str2);


        char[] charArr = str.toCharArray();
        Character[] wrapper = new Character[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            wrapper[i] = charArr[i];
        }

        for (Character each : wrapper) {
            int num = Collections.frequency(Arrays.asList(wrapper), each);
            if (num == 1) str2 += each;
        }


        for (String each : str.split("")) {
            int num = Collections.frequency(Arrays.asList(str.split("")), each);
            if (num == 1) str2 += each;
        }
        return result;
    }
}





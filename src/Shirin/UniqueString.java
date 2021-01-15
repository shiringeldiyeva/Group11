package Shirin;

public class UniqueString {

    public static void main(String[] args) {
        System.out.println(unique("HappyLady"));
    }
    public static String unique(String str) {
        String[] arr = str.split("");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i])) {
                    count++;
                }
            }
            if (count == 1) {
                result += arr[i];
            }

        }
        return result;
    }
}



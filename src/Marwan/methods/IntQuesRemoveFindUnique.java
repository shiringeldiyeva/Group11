package Marwan.methods;

public class IntQuesRemoveFindUnique {
    public static void main(String[] args) {
        String str = "AAAAABBCCDDEFG";
        String [] strArr = str.split("");
        String str2 = "";



        for (String each1: strArr){
            int count = 0;

            for (String each2 : strArr){

                if (each2.equals(each1))count++;
            }
//            if (count==2 && !str2.contains(each1))
//                str2+=each1;
            if (!str2.contains(each1)){ // this condition is used for adding the count with the chars, output should be= A5B2C2D2E1F1G1
                str2+=each1+count;
            }

        }
        System.out.println(str2);


    }
}

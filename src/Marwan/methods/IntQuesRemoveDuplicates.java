package Marwan.methods;

public class IntQuesRemoveDuplicates { // remove duplicates == find unique characters
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";

       String str2 = "";

       String [] arr = str.split("");



//       for (String each1: arr) if (!str2.contains(each1)) str2+=each1;
//        System.out.println(str2);



//
//       for (char each1 : str.toCharArray()) if (!str2.contains(each1+"")) str2+=each1;
//        System.out.println(str2);


       for (int j = 0; j<str.length(); j++){
           if (!str2.contains(str.charAt(j)+"")){
               str2+=str.charAt(j);
           }

       }
        System.out.println(str2);






    }
}

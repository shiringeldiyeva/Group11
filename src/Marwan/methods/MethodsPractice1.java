package Marwan.methods;

public class MethodsPractice1 {
    public static void main(String[] args) {

        String str = "yeiIIIAaols";
        System.out.println(middleChar(str));
        middleCharDisplay(str);
        System.out.println(vowelInString(str));
        vowelInStringDisplay(str);

        int num = 1111;
        System.out.println(sumOfDigits(num));


    }
    /*
    Write a program that return the middle character of a string
    */

    public static String middleChar(String str){
        String result = "";
        if (str.length()%2==0){
            result+= str.charAt(str.length()/2-1)+""+str.charAt(str.length()/2);
        }
        else result+=str.charAt(str.length()/2);

        return result;
    }

    /*
    Write a program that displays the middle character of a string, note: if string length is even, return middle two char, else the middle char
    */

    public static void middleCharDisplay(String str){
        String result = "";
        if (str.length()%2==0){
            result+= str.charAt(str.length()/2-1)+""+str.charAt(str.length()/2);
        }
        else result+=str.charAt(str.length()/2);
        System.out.println(result);
    }

    /*
    Write a Java method that return the counts all vowels in a string, vowels are {a,i,e,o,u}
    */

    public static int vowelInString(String str){
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='a')count++;
        }
        return count;

    }

    /*
    Write a Java method that return the displays all vowels in a string, vowels are {a,i,e,o,u}
    */

    public static void vowelInStringDisplay(String str){
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='a')count++;
        }
        System.out.println(count);

    }

    public static int sumOfDigits(int number){
        int sum = 0;
        for (int  i =number; number>0; number/=10){
            sum+=number%10;
        }


        return sum;
    }


}

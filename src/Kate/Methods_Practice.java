package Kate;

public class Methods_Practice {
    public static void main(String[] args) {
        DisplayMessage();
    }

    public static void DisplayMessage(){
        System.out.println("Hello everyone!");
        String str = "Alexandr";
        MiddleChars(str);
    }
    public static String MiddleChars(String str){
        String result = "";

        if (str.length()%2 == 0){
            result += ""+str.charAt(str.length()/2-1)+str.charAt(str.length()/2);
        }

        System.out.println(result);

        return result;
    }


}

package Shirin;

public class SameLetter {
    public static void main(String[] args) {
        System.out.println(same("ABCD","DCBA"));

    }
    public static boolean same(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(!str2.contains("" + str1.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

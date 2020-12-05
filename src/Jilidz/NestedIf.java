package Jilidz;

public class NestedIf {
    public static void main(String[] args) {
        for(int i = 0;i<80;i++){
            if(i%2==0){
               if(i>0&&i<=10){
                   System.out.println(i+"years old girl");

               }else if(i>10&&i<=20){
                   System.out.println(i+"years old teenage girl");

               }else if(i>20&&i<=40){
                   System.out.println(i+"years old woman");


               }else if (i>40&&i<=80){
                   System.out.println(i+"years old senior woman");

               }

            }
            else if(i%2!=0){

                if(i>0&&i<=10){
                    System.out.println(i+"years old boy");

                }else if(i>10&&i<=20){
                    System.out.println(i+"years old teenage boy");
                }else if(i>20&&i<=40){
                    System.out.println(i+"years old men");
                }else if(i>40&&i<=80){
                    System.out.println(i+"years old senior men");
                }


            }
        }


    }
}

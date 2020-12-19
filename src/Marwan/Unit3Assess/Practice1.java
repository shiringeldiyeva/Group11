package Marwan.Unit3Assess;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {

        /*

        Which of the followings are a valid declaration of the array?


         */

        int [] arr = new int[1];
        int  arr1 []= {1,2,3,4};

        arr = arr1;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i<arr1.length; i++){

            if (i==2){
                continue;
            }
            System.out.println(arr1[i]);
        }


        int[] newArr = {20,23,45,69,36,89,41};
        int i = 0;
        System.out.println("************************");
        do {
            System.out.println(newArr[i]);

            i++;
            System.out.println(i);
        }while (i<newArr.length-2);



        int j = 11;
        do {
                System.out.println(j);

        }while (j<0);

        LocalDate myDob = LocalDate.of(1920,3,14);
        LocalDate hisDob = LocalDate.of(1921,7,25);
        LocalTime thisTime = LocalTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println(myDob.getDayOfYear());





        // What does return statement used for?  return exit method, break: switch && loops, system.exit
        // what does break is used for?  it's used for exiting the loop and switch statement
        // What does continue statement used for? it's used for skipping the current iteration of the loop
        // overload methods' Return-Types MUST be same: false
        // overload methods' Parameters  MUST  be different; true
        // Can we overload the main method in java? yes, we can, but JVM only calls the original main method(String[] args).


        /*
        Q-1
        public static void main(String[] args) {
                                      dosum( 10, 20 );
                                      dosum( 10.0, 20.0 );
                                }



                    public static void dosum(double x, double y) {
                                 System.out.println("double sum is "+(x+y));
                          }

                    public static void dosum(float x, float y) {
                               System.out.println("float sum is "+(x+y));
                         }

                      public static void dosum(int x, int y) {
                                 System.out.println("int sum is "+(x+y));
                            }

What is the result?   int sum is 30, double sum is 30.0


Q-2

What's the result?

                         public static void main(String[] args) {

                                                 int x= 7;
                                        if(available(x)) {                // Line 1
                                               System.out.println("Java SE");
                                           }else {
                                               System.out.println("Java EE");
                                            }

                              }
                      public static boolean available(int x) {
                                 return x > 1 ? true : false;
                             }

                             ANSWER: Java SE



Q-3
public class Test {

                   public static void main(int[] args) {
                             System.out.println("int main");

                        }

                      public static void main(String[] args) {
                                  System.out.println("String main");

                        }

                       public static void main(double[] args) {
                                  System.out.println("double main");

                           }

                 public static void main(char[] args) {
                                System.out.println("char main");
                           }

            }

What's the result of executing the Test class?  Answer: String main
Q-4

Given :

        line 1             public static void main(String[] args) {
        line 2                          int num =5;
        line 3                   while( isAvailable(num) ) {
        line 4                                System.out.print(num);
             line 5
                                         }
                              }

       line 6               public static boolean isAvailable(int num) {
       line 7                      return (num--  >  0) ? true : false ;
                        }



Which modification enables the code to print 54321?

A. Replace line 4 with System, out. print (--num) ;

B.  At line 5 , insert  num --;

C. Replace line 4 with --x; and, at line 5, insert system, out. print (num);

D.  Replace line 7 With return (num > 0) ? false: true;

Q-5
public static void main(String[] args) {

int[] numbers = {1,2,3,4,5};
int max= findMax(numbers);

 line 1 {

        int max = 0;
        /* code goes here */

        /*


        return max;










         */




    }



    public int getInt(int n){
        return  n+1;
    }
    private double myDouble(double n1){
        return n1-1;
    }

    float myFloat( float n1, float n2){
        return n1 * n2;
    }
    protected int[] myIntArr(int[] arr){
        int[] newArr = new int[arr.length+1];

        return newArr;
    }

    public static int staticInt( int x, int y){
        return x/y;
    }

    public static boolean isPositive(int n){
        if (n>0)return true;
        else return false;
    }
    public static boolean isPositive(double n){
        if (n>0)return true;
        else return false;
    }
    public static boolean isPositive(String str){
        if (str.length()>0)return true;
        else return false;
    }

    public static void newMessage(){
        System.out.println("Hello everyOne");
    }

    private void newMethod(){
        int x = 1;
        int y = 2;
        System.out.println(x+y);
    }



}

class newStuf{
    public static void main(String[] args) {

        Practice1 pr = new Practice1();
        pr.getInt(5);


    }
}

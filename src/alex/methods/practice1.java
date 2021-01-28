package alex.methods;

public class practice1 {

   public static void main(String[] args) {

      int a= sum(1,2);
int b=sum1(2,3);
       System.out.println((b)+a);
    }

    public static void print(){
        System.out.println("Hello");
    }
     static int sum(int a, int b){

       int sum;
      sum=a+b;
        return  sum;
    }

      static int sum1(int a, int b){
       int c=sum(1,2);
               int sum;
       sum=a+b;

        return sum;
    }

}

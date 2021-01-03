package Marwan.methods;

import java.util.Arrays;

public class Constructor {

    int num ;
    String name;

     Constructor(int num, String name, boolean isConstructor){
         this(num, name);


         System.out.println("Hello i am a default");
         name = "my name";
         num = 4;

    }


    public Constructor(int num, String name){
         this(name);

         this.num = num;

        System.out.println("Hey i am the second one!");

    }

    Constructor(String name){
        System.out.println("Hey i am the third one!");

         this.name = name;
    }


    public String toString() {
        return "Constructor{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
class obj{
    public static void main(String[] args) {

        Constructor c1 = new Constructor(5,"Name", false);
        System.out.println(c1);



















//        int [] arr = {1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));
//
//        Integer n = new Integer(5);
//        System.out.println(n);
//        Constructor c1 = new Constructor();
//
//        c1.num = 4;
//        c1.name = "my name";
//
//        System.out.println(c1);
//        Constructor c2 = new Constructor("Marwan");
//        c2.num = 16;
//        System.out.println(c2);
//
//        Constructor c3 = new Constructor();

    }
}
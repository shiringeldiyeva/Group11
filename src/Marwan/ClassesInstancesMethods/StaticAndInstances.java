package Marwan.ClassesInstancesMethods;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class StaticAndInstances {
    public String name;
    public String employeeID;
    public String jobTitle;
    public double salary;


    public static String schoolName;
    public static boolean isHuman;

//    public StaticAndInstances() {
//        System.out.println("I am here");
//    }

    public StaticAndInstances(String name) {
        //this();
        this.name = name;

    }

    public StaticAndInstances(String name, String employeeID) {
        this(name);
        this.employeeID = employeeID;

    }

    public StaticAndInstances(String name, String employeeID, String jobTitle) {
        this(name, employeeID);
        this.jobTitle = jobTitle;
    }

    public StaticAndInstances(String name, String employeeID, String jobTitle, double salary) {
        this(name, employeeID, jobTitle);
        this.salary = salary;

    }


    public void smokeTesting() {
        System.out.println(name + " is doing a smoke testing");
    }

    public void creatingTicket() {
        System.out.println(name + " is creating a ticket");
    }


    public String toString() {
        return
                "name = '" + name + '\'' +
                        ", employeeID = '" + employeeID + '\'' +
                        ", jobTitle = '" + jobTitle + '\'' +
                        ", salary = " + salary +
                        "School Name: " + schoolName +
                        "is a human? :" + isHuman
                ;
    }

    static {
        schoolName = "Cybertek, ";
        isHuman = true;
    }
}

class CyberObject {

    public static void main(String[] args) {

        StaticAndInstances tester1 = new StaticAndInstances("Marwan");
        StaticAndInstances tester2 = new StaticAndInstances("Elvira", "SDR4325");
        StaticAndInstances tester3 = new StaticAndInstances("Miray", "DR5543", "Software Engineer");
        StaticAndInstances tester4 = new StaticAndInstances("Shirin", "HR8768");
        StaticAndInstances tester5 = new StaticAndInstances("Inna", "HGF987", "Developer", 250000);


        StaticAndInstances tester6 = new StaticAndInstances("Aliya", "", "", 0);


//        System.out.println(tester1);
//        System.out.println(tester2);
//        System.out.println(tester3);
//        System.out.println(tester4);
//        System.out.println(tester5);
//        tester6.creatingTicket();
//        tester2.smokeTesting();

        String[] strArr = {"a", "b", "c", "d", "e", "f"};

        for (int i = 0 ; i < strArr.length /2 ; i++) {

            String temp  = strArr[strArr.length-1-i];  // 1- element[5-0] to be assigned to bucket {"a", "b", "c", "d", "e", "f"}   {{"f"}}
                                                       // 2- element[5-1] to be assigned to bucket {"f", "b", "c", "d", "e", "a"}   {{"e"}}
                                                      //3- element[5-2] to be assigned to bucket {"f", "e", "c", "d", "b", "a"}     {{"d"}}

            strArr[strArr.length-1-i] = strArr[i];// 1 - element[0] to be stored in element[5-0] {"a", "b", "c", "d", "e", "a"}
                                                  // 2 - element[1] to be stored in element[5-1] {"f", "b", "c", "d", "b", "a"}
                                                  // 3 - element[2] to be stored in element[5-2] {"f", "e", "c", "c", "b", "a"}

            strArr[i] = temp;                    // 1- bucket to be stored in element[0] {"f", "b", "c", "d", "e", "a"}
                                                 // 2 - bucket to be stored in element[1]{"f", "e", "c", "d", "b", "a"}
                                                 // 3- bucket to be stored in element[2] {"f", "e", "d", "c", "b", "a"}



//            String temp = strArr[i]; // just to store the value that i am afraid to loos
//
//            strArr[i] = strArr[strArr.length-1-i]; // grab the last element and store it in the first element
//
//
//            strArr[strArr.length-1-i] = temp; // store the temp value back in the last index

        }

        System.out.println(Arrays.toString(strArr));


        // ClassName  object = new Constructor;
    }
}




/*
create a class called Tester
					Attributes:
						name, employeeID, JobTitle, Salary
						isHuman, isCybertekStudent

					Actions:
						setInfo(), smokeTesting(),  creatingTicket(), toString()
 */
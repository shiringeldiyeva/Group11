package Marwan.Repl;

public class UAGStudent {
    public String name, studentID;
    public int grade;
    public static String principalName = "Ms. McKoy";
    public static  int nextID = 100;



    public UAGStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
        studentID = name.toUpperCase().charAt(0)+""+nextID;
        nextID++;
    }

    public static void newPrincipal(String parameter){
        principalName = parameter;
    }

    public static void resetID(){
        nextID = 100;
    }


    public String toString() {
        return name + " " + studentID;
    }
}

class UAGSobj {
    public static void main(String[] args) {
        UAGStudent s1 = new UAGStudent("Muhammed",11);
        UAGStudent s2 = new UAGStudent("Alan",11);
        UAGStudent s3 = new UAGStudent("Sophie",11);

        System.out.println(s3.studentID);
        System.out.println(s1.studentID);
        UAGStudent.newPrincipal("Mr. McKoy");

        UAGStudent.resetID();
        UAGStudent s4 = new UAGStudent("kevin",11);
        System.out.println(s4.studentID);

    }
}


/*
Create a UAGStudent class with the following:

1. Variables
name (String)
grade (int)
principalName (String, static, default value: "Ms. McKoy")
studentID (String)
nextID (int, static, default value: 100)

Note: studentID is composed of the student's first initial in uppercase followed by the nextID

2. Constructors
Main constructor takes in name and grade only.
When the main constructor is called, it generates a student's ID by combining the student's first initial in uppercase combined with the next ID.
 The nextID should then be increased by 1.

Example: name is "Alfonso Lewis", static variable nextID is 105 ==> studentID is A105

3. Class Methods

Write a static method called "newPrincipal" that returns nothing and takes in one String parameters that represents the new principal's name.

 Set the static variable principalName to the new principal's name.

Write a static method called "resetID" that takes no arguments and returns nothing.  This method resets the nextID to 100.

Write a method called "toString" that has no parameters and returns a String.
This method should return the student's name and the student's ID, separated by a space.

Below is the code being used to test your code:
UAGStudent s1 = new UAGStudent("Muhammed",11);
UAGStudent s2 = new UAGStudent("Alan",11);
UAGStudent s3 = new UAGStudent("Sophie",11);

assertEquals("Ms. McKoy", s1.principalName);
assertEquals("M100",s1.studentID);
assertEquals("A101",s2.studentID);
assertEquals("S102",s3.studentID);

UAGStudent.newPrincipal("Mr. McKoy");
assertEquals("Mr. McKoy",s1.principalName);

UAGStudent.resetID();
UAGStudent s4 = new UAGStudent("kevin",11);
assertEquals("K100",s4.studentID);
assertEquals("kevin K100",s4.toString());
 */
package Marwan.Repl;

public class Person {
    private String firstname, lastname,ssn;
    private  int birthmonth, birthday, birthyear;

    public Person(String firstname, String lastname, String ssn, int birthmonth, int birthday, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday(){

        return String.valueOf(birthmonth)+"/"+String.valueOf(birthday)+"/"+String.valueOf(birthyear);
    }
    public boolean verifySSN (String parameter){
        if (parameter.equals(ssn))return true;
        else return false;
    }

}

class PersonObj{
    public static void main(String[] args) {

        char n = 'h';
        System.out.println((char) n);
        Person p1 = new Person("Marwan","Subhi","321654789",4,13,1986);
        System.out.println(p1.getBirthday()+1);
        System.out.println(p1.verifySSN("321654781"));

    }

}
/*
Create the a Person class with the following:

Class Variables
String firstname
String lastname
int birthmonth
int birthday
int birthyear
String ssn
All variables above should be private.

Constructor
The main constructor should take in all values and assign them to their respective private class variables

Methods
Create a public getters and setters for firstname and lastname:
getFirstname
getLastname
setFirstname
setLastname

Create a public getter method called getBirthday, which will return a String composed of their birthday in month/day/year format.
  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

Create a public method called verifySSN that takes in a String parameter and returns a boolean.
 It will check the parameter against the person's SSN and return true or false based on whether they match.

Complete the questions on Classroom.
 */
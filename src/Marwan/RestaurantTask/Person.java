package Marwan.RestaurantTask;

public class Person {
    public String name;
    public  int age;
    public char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                " age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Create a class called Person with the following requirements:
Attributes: name, age, gender
Constructor
Behaviors:  eat(),  sleep()
 toString

Create a class called Employee with the following requirements:
Attributes: name, age, gender, hourlyRate, jobTitle, ID
Constructor
Behaviors: eat(), sleep(), work(), clacSalary()
toString

Create a class called Chef with the following requirements:
Attributes: name, age, gender, hourlyRate, jobTitle, ID
Constructor
Behaviors: eat(passing name in print statement), sleep(passing name in print statement), work(passing name in print statement), clacSalary(),
makeOrder(passing name and jobTitle in print statement),
cooking(passing name and jobTitle in print statement)
toString

Create a class called Server with the following requirements:
Attributes: name, age, gender, hourlyRate, jobTitle, ID
Constructor
Behaviors: eat(passing name in print statement), sleep(passing name in print statement), work(passing name in print statement), clacSalary(),
takeOrder(passing name and jobTitle in print statement),
cleanTable(passing name and jobTitle in print statement)
toString

Create a class called Restaurant with the following requirement:
Attributes: hasKitchen, hasCashier, owner, Arraylist of chefs, Arraylist of servers
Constructor
Methods:
hireServer overloaded to accept one server or array or servers
hireChef overloaded to accept one chef or array or chefs
terminateEmployee with String ID argument
terminateChef with String ID argument
terminateChef with String ID argument
toString  that return a string as:
Owner: Billy
Total of Employee: 10
servers: 6
chefs: 4

Create a class called LocalRestaurant and do the following actions:
create a chef object and a server object and hire them to the restaurant,
create an array of servers and chefs and hire them to the restaurant
display all the restaurant staff with their full details
display the restaurant staff with their names and job tiles
create a variable that can calculate the total restaurant budget based on the employee head count
terminate one server and one chef and an unknown employee based on the ID

 */
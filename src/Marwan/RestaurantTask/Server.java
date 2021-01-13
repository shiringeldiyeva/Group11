package Marwan.RestaurantTask;

public class Server extends Employee{
    public Server(String name, int age, char gender, String jobTitle, String ID, double hourlyRate){
        super(name, age, gender, jobTitle, ID, hourlyRate);
    }
    public void takeOrder(){
        System.out.println(name+"-"+jobTitle+" is taking order");
    }
    public void cleanTable(){
        System.out.println(name+"-"+jobTitle+" is cleaning table");
    }
}

/*
Create a class called Server with the following requirements:
Attributes: name, age, gender, hourlyRate, jobTitle, ID
Constructor
Behaviors: eat(passing name in print statement), sleep(passing name in print statement), work(passing name in print statement), clacSalary(),
takeOrder(passing name and jobTitle in print statement),
cleanTable(passing name and jobTitle in print statement)
toString
 */

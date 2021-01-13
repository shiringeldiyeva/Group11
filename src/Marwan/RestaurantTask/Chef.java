package Marwan.RestaurantTask;

public class Chef extends Employee{

    public Chef(String name, int age, char gender, String jobTitle, String ID, double hourlyRate){
        super(name, age, gender, jobTitle, ID, hourlyRate);
    }

    public void makeOder(){
        System.out.println(name+"-"+jobTitle+" is making order");
    }

    public void cooking(){
        System.out.println(name+"-"+jobTitle+" is cooking");
    }


}
/*
Create a class called Chef with the following requirements:
Attributes: name, age, gender, hourlyRate, jobTitle, ID
Constructor
Behaviors: eat(passing name in print statement), sleep(passing name in print statement), work(passing name in print statement), clacSalary(),
makeOrder(passing name and jobTitle in print statement),
cooking(passing name and jobTitle in print statement)
toString
 */
package Marwan.RestaurantTask;

public class Employee extends Person {

    public double hourlyRate;
    public String jobTitle, ID;

    public Employee(String name, int age, char gender, String jobTitle, String ID, double hourlyRate) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.hourlyRate = hourlyRate;
    }

    public void work(){
        System.out.println(name+" is working");
    }
    public double calcSalary(){

        return hourlyRate * 40 * 52;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hourlyRate =" + hourlyRate +
                ", salary = "+calcSalary()+
                '}';
    }
}

/*
Create a class called Employee with the following requirements:
Attributes: name, age, gender, hourlyRate, jobTitle, ID
Constructor
Behaviors: eat(), sleep(), work(), clacSalary()
toString
 */
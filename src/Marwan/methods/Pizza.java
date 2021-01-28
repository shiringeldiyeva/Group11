package Marwan.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    public String size;
    public int numOfCheese, numOfPepperoni, tips;

    public static String pizzaShop = "Dominos Pizza";

    public void setInfo(String size, int numOfCheese, int numOfPepperoni, int tips) {
        this.size = size;
        this.numOfCheese = numOfCheese;
        this.numOfPepperoni = numOfPepperoni;
        this.tips = tips;
    }

    public void customizeOrder(String size, int numOfCheese, int numOfPepperoni) {
        this.size = size;
        this.numOfCheese = numOfCheese;
        this.numOfPepperoni = numOfPepperoni;

    }

    public double calcCost() {
        double total = 0;
        if (size.equalsIgnoreCase("small")) {
            total += 10 + (1.5 * numOfPepperoni) + numOfCheese + tips;
        } else if (size.equalsIgnoreCase("Medium")) {
            total += 12 + (1.5 * numOfPepperoni) + numOfCheese + tips;
        } else if (size.equalsIgnoreCase("large")) {
            total += 14 + (1.5 * numOfPepperoni) + numOfCheese + tips;
        } else System.err.println("please choose a valid size");


        return total;
    }


    public String toString() {
        return "Pizza{" +
                pizzaShop+
                ", size ='" + size + '\'' +
                ", numOfCheese =" + numOfCheese +
                ", numOfPepperoni =" + numOfPepperoni +
                ", tips =" + tips +" total cost $"+calcCost()+
                '}';
    }


}


class PizzaShop{
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();
        Pizza pizza4 = new Pizza();
        Pizza pizza5 = new Pizza();
        Pizza pizza6 = new Pizza();

        pizza1.setInfo("large", 1, 4, 5);
        pizza2.setInfo("large", 1, 3, 2);
        pizza3.setInfo("small", 2, 2, 3);
        pizza4.setInfo("small", 1, 2, 2);
        pizza5.setInfo("Medium", 3, 2, 6);
        pizza6.setInfo("Medium", 3, 3, 5);

        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas.addAll(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5,pizza6));


        ArrayList<Pizza> mediumAndLarge = new ArrayList<>();

        mediumAndLarge.addAll(pizzas);
        // mediumAndLarge.removeIf(p-> p.size.equalsIgnoreCase("small"));
        //System.out.println(mediumAndLarge);

        ArrayList<Pizza> above24$ = new ArrayList<>();

        above24$.addAll(pizzas);

        above24$.removeIf(p->p.calcCost()<=24);
        System.out.println(above24$);

        // System.out.println(Pizza.pizzaShop);




        // System.out.println(pizza2);
    }
}
/*
Take home tasks:
    1. create a custom class for Pizza that should contain the following:
            variables:
                    size (either small, medium, large)
                    number of cheese topping
                    number of pepperoni topping
                    tips
            methods:
                    customizeOrder(): allows user to set the size and toppings of Pizza
                    calcCost(): returns the total cost  as double
                    toString(): get the full information nd total cost of Pizza
            Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping
 */
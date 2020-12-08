package Marwan.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {
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

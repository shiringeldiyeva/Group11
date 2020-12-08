package alex.pizzaTask;

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




package alex.customClass;



import java.util.ArrayList;
import java.util.Arrays;

public class PhoneObjects {
    public static void main(String[] args) {
       Phone ph1 = new Phone();
       Phone ph2 = new Phone();
        Phone ph3 = new Phone();
        Phone ph4 = new Phone();
        Phone ph5 = new Phone();
        Phone ph6 = new Phone();
        Phone ph7 = new Phone();
       Phone ph8 = new Phone();
        Phone ph9 = new Phone();
        Phone ph10 = new Phone();

        ph1.setInfo("Sony", "SE", "Black", 850.25, 3.99, 4.0, 14);
        ph2.setInfo("Apple", "6", "Gold", 955, 4.55, 4.7, 16);
        ph3.setInfo("Apple", "6S", "White", 975, 3.5, 5.1, 17);
        ph4.setInfo("Samsung", "S9", "Red", 751.50, 3.98, 4.2, 18);
        ph5.setInfo("Nokia", "6303", "Blue", 520, 5.2, 4.75, 12);
        ph6.setInfo("Apple", "7S+", "Gray", 1200, 4.5, 5, 18);
        ph7.setInfo("Apple", "7+", "White", 1320, 3.5, 4.41, 15);
        ph8.setInfo("Samsung", "3310", "Silver", 855.85, 3.64, 3.97, 11);
        ph9.setInfo("Samsung", "A50", "Navy", 1300, 3.89, 4.58, 19);
        ph10.setInfo("Apple", "11Pro", "Green", 1500.75, 4.5, 7, 20);


        double midPrice = 970;


        //Phone[] phones = {ph1, ph2, ph3, ph4, ph5, ph6, ph7, ph8, ph9, ph10};
        ArrayList<Phone> phones = new ArrayList<>(Arrays.asList());

        phones.addAll(Arrays.asList(ph1, ph2, ph3, ph4, ph5, ph6, ph7, ph8, ph9, ph10));

        ArrayList<Phone> above970 = new ArrayList<>(phones);
        above970.removeIf(p -> p.price < midPrice);
        ArrayList<Phone> below970 = new ArrayList<>(phones);
        below970.removeIf(p -> p.price > midPrice);

        System.out.println("Phone that are above the mid price are:");
        System.out.println(above970);
        System.out.println("************************");
        System.out.println("Phone that are below the mid price are:");
        System.out.println(below970);

        double max = phones.get(0).price;
        double min = phones.get(0).price;
        for (Phone each : phones) {
            max = Math.max(max, each.price); // if any element in this array is greater than the first element
            min = Math.min(min, each.price);
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);



        /*
        double max = phones.get(0).price;
        double min = phones.get(0).price;
        String cheap="";
        String expensive = "";
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).price > max) {
                max = phones.get(i).price;
                expensive = phones.get(i).brand+" "+phones.get(i).models;
            }

            if (phones.get(i).price < min) {
                min = phones.get(i).price;

                cheap = phones.get(i).brand+" "+phones.get(i).models;
            }

        }






        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("expensive = " + expensive);
        System.out.println("cheap = " + cheap);

         */



        ArrayList<Phone> applePhones = new ArrayList<>(phones);

        ArrayList<Phone> samsungPhones = new ArrayList<>(phones);

        ArrayList<Phone> restOfPhones = new ArrayList<>(phones);

        applePhones.removeIf(P-> !P.brand.equalsIgnoreCase("apple"));
        samsungPhones.removeIf(p->!p.brand.equalsIgnoreCase("samsung"));

        restOfPhones.removeIf(p->p.brand.equalsIgnoreCase("samsung")||p.brand.equalsIgnoreCase("apple"));


        System.out.println(samsungPhones);










        /*

        // find the most expensive phone
        double maxPrice = phones[0].price;
        double minPrice =  phones[0].price;
        String expensive = "";
        String cheap = "";



        for (Phone each : phones) {
            if (each.price > maxPrice){
                maxPrice = each.price;
                expensive = each.brand+" "+each.models;
            }
            else if (each.price < minPrice){
                minPrice = each.price;
                cheap =  each.brand+" "+each.models;
            }
        }

         */


    }
}

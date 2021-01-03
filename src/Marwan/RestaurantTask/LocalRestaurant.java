package Marwan.RestaurantTask;

public class LocalRestaurant {
    public static void main(String[] args) {

        Chef chef = new Chef("Brad",26,'M',"Junior chef","AA12W",40);
        Server server = new Server("Bryan",32,'M',"serverII","AAS2",25);
        Restaurant restaurant = new Restaurant("Elvira");
        restaurant.hireChef(chef);
        restaurant.hireServer(server);
        Server[] servers = {new Server("Yasin", 29, 'M', "Captain Server", "S001",35),
                new Server("Sabryne", 28, 'F',  "Server Assistant", "S002",30),
                new Server("Karim", 27, 'M',  "Server1", "S003",25),
                new Server("Aysel", 26, 'F',  "Server2", "S004",20),
                new Server("Kamal", 25, 'M',  "Server3", "S005",15)};

        Chef [] chefs = {new Chef("Mini", 25, 'F', "Executive Chef", "C001",35),
                new Chef("Valeria", 24, 'F', "Sous Chef", "C002",30),
                new Chef("Halim", 23, 'M', "Head Cook", "C003",25),
                new Chef("Habib", 22, 'M', "Line Cook1", "C004",20),
                new Chef("Bojan", 21, 'M', "Line Cook2", "C005",15)};

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        for (Server eachServer : restaurant.servers){
            System.out.println(eachServer);
        }
        for (Chef eachChef: restaurant.chefs){
            System.out.println(eachChef);
        }

        System.out.println("*****************************************************************************");
        System.out.println("****** Restaurant Staff ******");

        for (Server eachServer: restaurant.servers){
            System.out.println(eachServer.name+" "+eachServer.jobTitle);
        }
        for (Chef eachChef: restaurant.chefs){
            System.out.println(eachChef.name+" "+eachChef.jobTitle);
        }

        double restaurantBudget = 0;

        for (Server eachServer : restaurant.servers){
            restaurantBudget+= eachServer.calcSalary();
        }
        for (Chef eachChef: restaurant.chefs){
            restaurantBudget+=eachChef.calcSalary();
        }
        System.out.println("**********************");
        System.out.println("restaurantBudget = " + restaurantBudget);

        System.out.println("**********************************************************************************");

        for (Server eachServer : restaurant.servers){
            System.out.println("Server: " + eachServer.name+" weekly salary: "+(eachServer.calcSalary()/52));
        }
        for (Chef eachChef: restaurant.chefs){
            System.out.println("Chef: " + eachChef.name+" weekly salary: $"+(eachChef.calcSalary()/52));
        }
        restaurant.terminateEmployee("S003");
        System.out.println(restaurant);

    }
}


/*
Create a class called LocalRestaurant and do the following actions:
create a chef object and a server object and hire them to the restaurant,
create an array of servers and chefs and hire them to the restaurant
display all the restaurant staff with their full details
display the restaurant staff with their names and job tiles
create a variable that can calculate the total restaurant budget based on the employee head count
terminate one server and one chef and an unknown employee based on the ID
 */
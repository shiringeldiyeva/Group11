package Marwan.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {// Restaurant has a relation to the Staff

    public final static boolean hasKitchen, hasCashier;
    public String owner;
    public ArrayList<Chef> chefs;
    public ArrayList<Server> servers;

    static {
        hasKitchen = true;
        hasCashier = true;
    }

    public Restaurant(String owner) {
        this.owner = owner;
        chefs = new ArrayList<>();
        servers = new ArrayList<>();
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        //this.servers.addAll(Arrays.asList(servers));
        for (Server eachServer : servers) hireServer(eachServer);
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {

        // this.chefs.addAll(Arrays.asList(chefs));
        for (Chef eachChef : chefs) hireChef(eachChef);
    }


    public void terminateEmployee(String ID) {
        servers.removeIf(p -> p.ID.equals(ID));
        chefs.removeIf(p -> p.ID.equals(ID));
    }

    @Override

    public String toString(){

        return "Owner: "+owner+"\nTotal of Employee: "+(servers.size()+chefs.size())+"\nServers: "+servers.size()+"\nChefs: "+chefs.size();
    }



}
/*
Create a class called Restaurant with the following requirement:
Attributes: hasKitchen, hasCashier, owner, Arraylist of chefs, Arraylist of servers
Constructor
Methods:
hireServer overloaded to accept one server or array or servers
hireChef overloaded to accept one chef or array or chefs
terminateEmployee with String ID argument
terminateChef with String ID argument
terminateServer with String ID argument
toString  that return a string as:
Owner: Billy
Total of Employee: 10
servers: 6
chefs: 4
 */

package alex.customClass;

public class Phone {
    public String brand, models, color;
    public double price, weight, screen;
    public int talkTime;

    public void setInfo(String brand, String models, String color, double price, double weight, double screen, int talkTime) {
        this.brand = brand;
        this.models = models;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.screen = screen;
        this.talkTime = talkTime;
    }


    public String toString() {
        return "Phone{" +
                "brand ='" + brand + '\'' +
                ", models ='" + models + '\'' +
                ", color ='" + color + '\'' +
                ", price =" + price +
                ", weight =" + weight +
                ", screen =" + screen +
                ", talkTime =" + talkTime +" hrs"+
                '}'+"\n";

    }


    // call, send message , browse , faceTime , runApps


}

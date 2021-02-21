package Flower;

public class Tulip extends Flower {
   // private String colorTwo;

    public void infoTulip(){
        System.out.println("Info " + getPrice() + " " + getName() + " " + getColor());
    }


    public Tulip(int price, String color, String name) {
        super(price, color, name);
    }

}

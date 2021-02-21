package Flower;

public class Bouquet {
    public static void main(String[] args){
        Rose rose = new Rose(45, "Білий", "Роза", true);
        Rose roseRed = new Rose(35, "Червоний", "Роза",  false);
        Tulip tulip = new Tulip(55, "Синій", "Тюльпан");
        Tulip tulipYellow = new Tulip(25, "Жовтий", "Тюльпан");

        roseRed.infoRose();
        rose.infoRose();
        tulip.infoTulip();
        tulipYellow.infoTulip();

       Flower[] mas = {rose, roseRed, tulip, tulipYellow};

       int sum = 0;
       for(Flower flower : mas){
           sum += flower.getPrice();
       }

        System.out.println("Ціна букета: " + sum);




    }
}

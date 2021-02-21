package Flower;

public class Flower {
    private int price;
    private String color;
    private String name;

    public Flower(int price, String color, String name) {
        this.price = price;
        this.color = color;
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

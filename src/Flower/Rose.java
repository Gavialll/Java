package Flower;

public class Rose extends Flower {
    private boolean prickly;

    public void infoRose(){
        System.out.println("Info " + getPrice() + " " + getName() + " " + getColor() + " " + prickly);
    }

    public Rose(int price, String color, String name, boolean prickly) {
        super(price, color, name);
        this.prickly = prickly;
    }

    public void setPrickly(boolean prickly) {
        this.prickly = prickly;
    }

    public boolean isPrickly() {
        return prickly;
    }
}

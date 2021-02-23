package Сircle;

public class Сircle {
    private double radius;
    private double diameter;

    public void theLengthOfTheCircle(){
        double length =  2 * 3.14 * radius;

        System.out.println("Радіус кола: " + radius);
        System.out.println("Довжина кола: " + length);
    }

    public void carArea (){

        double square = 3.14 * diameter;

        System.out.println("Діаметр: " + diameter);
        System.out.println("Площа кола: " + square);
    }










    public Сircle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}

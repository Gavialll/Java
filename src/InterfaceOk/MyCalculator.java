package InterfaceOk;

public class MyCalculator implements Numerable {
    private double a;
    private double b;

    @Override
    public void devide() {
        double c = a / b;
        System.out.println("Ділення: " + c);
    }

    @Override
    public void minus() {
        double c = a - b;
        System.out.println("Віднімання: " + c);
    }

    @Override
    public void multiply() {
        double c = a * b;
        System.out.println("Множення: " + c);
    }

    @Override
    public void plus() {
        double c = a + b;
        System.out.println("Додавання: " + c);
    }

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}

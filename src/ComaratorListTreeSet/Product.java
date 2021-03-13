package ComaratorListTreeSet;

public class Product implements Comparable<Product>{
    private String name;
    private double weight;
    private double width;
    private double length;


    public Product(String name, double weight, double width, double length) {
        this.name = name;
        this.weight = weight;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public int compareTo(Product product) {

        int res = this.name.compareTo(product.name);
        return res;
    }
}

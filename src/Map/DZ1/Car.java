package Map.DZ1;

public class Car implements Comparable<Car> {
    private String model;
    private String brand;
    private String color;
    private Integer graduationYear;


    public Car(String brand, String model, String color, Integer graduationYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.graduationYear = graduationYear;
    }

    public Car() {
        this.model = "none";
        this.brand = "none";
        this.color = "none";
        this.graduationYear = 0000;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }


    @Override
    public int compareTo(Car o) {
        int res = this.model.compareTo(o.model) ;
        return res;
    }
}

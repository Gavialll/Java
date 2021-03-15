package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStringListCar {
    public static void main(String[] args) {

        Car mazda = new Car("mazda", "626", "red", 1991);
        Car volkswagen = new Car("volkswagen", "Passat b6", "black", 2009);
        Car vaz = new Car("vaz", "2109", "red", 1992);
        Car opel = new Car("opel", "vectra", "yellow", 2000);


        List<Car> list = new ArrayList<>();
        list.add(mazda);
        list.add(volkswagen);
        list.add(vaz);
        list.add(opel);

        Map<String, List> map = new HashMap<>();

    }
}

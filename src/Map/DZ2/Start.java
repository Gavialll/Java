package Map.DZ2;

import java.util.*;

public class Start {
    public static void main(String[] args) throws Exception {

        Map<String, List<Car>> mapCar = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                System.out.println("Меню");
                System.out.println("0 : add Registration    |");
                System.out.println("1 : delete Car          |");
                System.out.println("2 : delete Registration |");
                System.out.println("3 : add Car             |");
                System.out.println("4 : info All            |");
                System.out.println("------------------------");
                System.out.print("Введіть дію: ");

                int num = 0;
                if(scanner.hasNextInt()){
                    num = scanner.nextInt();
                }

                switch (num) {

                    case 0: {
                    System.out.println("Add Registration");
                    System.out.print("Enter Registration : ");
                    String registration = scanner.next();
                    List<Car> list = new ArrayList<>();
                    mapCar.put(registration, list);
                        break;
                    }
                    case 1: {
                        System.out.print("Registration: ");
                        String registration = scanner.next();
                        System.out.print("Car Remove: ");
                        String brand = scanner.next();
                        removeCar(mapCar, registration, brand);
                        break;
                    }
                    case 2: {
                        System.out.print("Remove Registration: ");
                        String str = scanner.next();
                        mapCar.remove(str);
                        break;
                    }
                    case 3: {
                        System.out.print("Registration: ");
                        String registr = scanner.next();
                            List<Car> lists = mapCar.get(registr);
                            System.out.println(lists.size());

                        if(true){
                            mapCar.put(registr, addCarList());
                        }
                        else {
                            List<Car> list = mapCar.get(registr);
                            mapCar.put(registr, addCarList(list));
                        }
                        break;
                    }
                    case 4: {
                        infoCar(mapCar);
                        break;
                    }
                }
            } catch (Exception e){
                System.out.println("Некоректний ввід");
            }
        }
    }
    public static boolean notEmpty(List<Car> a) {
        return !a.isEmpty();
    }
    public static void removeCar(Map<String, List<Car>> mapCar, String key, String brand) {

        for (Map.Entry<String, List<Car>> entry : mapCar.entrySet()) {
            System.out.println("Registration: " + entry.getKey());
            Iterator<Car> iterator = entry.getValue().iterator();
            while (iterator.hasNext()){
                if(mapCar.containsKey(key)) {
                    if(iterator.next().getBrand().equals(brand))
                        iterator.remove();
                }
            }
        }
    }
    public static void infoCar(Map<String, List<Car>> mapCar) {

        for (Map.Entry<String, List<Car>> entry : mapCar.entrySet()) {
            System.out.println("Registration: " + entry.getKey());
            Iterator<Car> iterator = entry.getValue().iterator();
            while (iterator.hasNext()){
                iterator.next().infoCar();
            }
        }
    }
    public static List addCarList() {
        Scanner scanner = new Scanner(System.in);
        List<Car> listCar = new ArrayList<>();
        
        System.out.println("Add Car");
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Graduation Year: ");
        Integer graduationYear = scanner.nextInt();
        Car car = new Car(brand, model, color, graduationYear);

        listCar.add(car);
        return listCar;

        //Car mazda = new Car("Mazda", "626", "Red", 1991);
        //Car volkswagen = new Car("Volkswagen", "Passat b6", "Black", 2009);
        //Car vaz = new Car("Vaz", "2109", "Red", 1992);
        //Car opel = new Car("Opel", "Vectra", "Yellow", 2000);
        //
        //listCar.add(mazda);
        //listCar.add(volkswagen);
        //listCar.add(vaz);
    }
    public static List<Car> addCarList(List<Car> listCar) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add Car New");
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Graduation Year: ");
        Integer graduationYear = scanner.nextInt();
        Car car = new Car(brand, model, color, graduationYear);

        listCar.add(car);
        return listCar;
    }
}

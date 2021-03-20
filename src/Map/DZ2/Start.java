package Map.DZ2;

import java.util.*;

public class Start {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Map<String, List<Car>> mapCar = new HashMap<>();

        while (true) {
            try {
                System.out.println("Menu");
                System.out.print("0 : add Registration |");
                System.out.print(" 1 : delete Car |");
                System.out.print(" 2 : delete Registration |");
                System.out.print(" 3 : add Car |");
                System.out.println(" 4 : info All |");
                System.out.println("-----------------------------------------------------------------");
                System.out.print("Enter An Action: ");

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
                        System.out.println("Car Remove");
                        System.out.print("Enter Registration Car: ");
                        String registration = scanner.next();
                        System.out.print("Enter Brand: ");
                        String brand = scanner.next();
                        removeCar(mapCar, registration, brand);
                        break;
                    }
                    case 2: {
                        System.out.println("Remove Registration");
                        System.out.print("Enter Registration: ");
                        String str = scanner.next();
                        mapCar.remove(str);
                        break;
                    }
                    case 3: {
                        System.out.println("Add Car");
                        System.out.print("Enter Registration: ");
                        String registr = scanner.next();
                        List<Car> listCar = mapCar.get(registr);
                        if(mapCar.containsKey(registr)){
                            listCar.add(addCar());
                        }
                        else {
                            mapCar.put(registr, addCarList());
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

    public static void removeCar(Map<String, List<Car>> mapCar, String key, String brand) {

    List list = mapCar.get(key);
    Iterator<Car> iterator = list.iterator();
        while (iterator.hasNext()){
                if(iterator.next().getBrand().equals(brand))
                    iterator.remove();
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
    }
    public static Car addCar() {
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

        return car;
    }
}

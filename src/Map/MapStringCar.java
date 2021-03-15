package Map;

import java.util.*;

public class MapStringCar {
/*
    Описати структуру коли людині може належати список акаунтів та зробити
    можливість
        - додати "реєстрацію" людину до списку;
        - додати "машину" акаунт до списку;
        - видалити акаунт для певної людини;
        - видалити людину;
        - показати всю мапу людей та їх акаунти.
    Вважаємо, що людина - унікальний ключ, за значення value беремо List<Account>
        Map<Person, Account>
    */
    public static void main(String[] args) {

        Map<String, Car> mreoMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        boolean tr = true;
        while (tr) {
            System.out.println("Add Car");
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            //System.out.print("Model: ");
            //String model = scanner.nextLine();
            //System.out.println("Color: ");
            //String color = scanner.nextLine();
            //System.out.print("Graduation Year: ");
            //Integer graduationYear = scanner.nextInt();

            Car car = new Car(brand, "model", "color", 1995);

            System.out.print("Registration: ");
            mreoMap.put(scanner.nextLine(), car);

            if(mreoMap.size() == 3){
                    tr = false;
            }
        }

        System.out.println();
        System.out.print("Remove Car: ");
        mreoMap.put(scanner.nextLine(), new Car());

        System.out.println();
        for (Map.Entry<String,Car> entry : mreoMap.entrySet()){
            System.out.println(entry.getValue().getBrand() + " | " + entry.getValue().getModel() + " | " + entry.getValue().getColor());
        }

        System.out.println();
        System.out.print("Remove Registration: ");
        mreoMap.remove(scanner.nextLine());

        for (Map.Entry<String,Car> entry : mreoMap.entrySet()){
            System.out.println(entry.getValue().getBrand() + " | " + entry.getValue().getModel() + " | " + entry.getValue().getColor());
        }

        System.out.println();
        System.out.print("Info Car: ");
        Car car = mreoMap.get(scanner.nextLine());
        System.out.println(car.getBrand() + " | " + car.getModel() + " | " + car.getColor());


        System.out.println();
        System.out.println("Print All Car");
        for (Map.Entry<String, Car> entry : mreoMap.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue().getModel());
        }


        

    //    System.out.println("Info");
    //        Car car = mreoMap.get("ВС5786КР");
    //        System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getColor());
    //
    //    System.out.println();
    //    System.out.println("Вивід всіх Map");
    //    List<Car> list = new ArrayList<>(mreoMap.values());
    //
    //    for (Car c : list){
    //        System.out.println(c.getBrand() + " | " + c.getModel() + " | " + c.getGraduationYear() + " | " + c.getColor() + " | " + c.getRegistration());
    //    }
    //
    //    deleteRegistration(car.getRegistration(), mreoMap);
    //
    //    list = new ArrayList<>(mreoMap.values());
    //    System.out.println();
    //    for (int i = 0; i < mreoMap.size(); i++) {
    //        Car c = mreoMap.get(list.get(i).getRegistration());
    //        System.out.println(c.getBrand());
    //    }
    //         //removeCar(vaz.getRegistration(), mreoMap);
    //         //removeCar(volkswagen.getRegistration(), mreoMap);
    //
    //    list = new ArrayList<>(mreoMap.values());
    //    System.out.println();
    //    for (int i = 0; i < mreoMap.size(); i++) {
    //        Car c = mreoMap.get(list.get(i).getRegistration());
    //        System.out.println(c.getBrand());
    //    }
    }
    public static void deleteRegistration(String registration ,Map<String, Car> mreoMap){
        mreoMap.remove(registration);
    }
    public static void removeCar(String registration, Map<String, Car> mreoMap){
      //  Car carNone = new Car();
      //  carNone.setRegistration(registration);
      //  mreoMap.put(carNone.getRegistration(), carNone);
    }
}

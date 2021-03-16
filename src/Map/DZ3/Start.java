package Map.DZ3;

import Map.DZ2.Car;

import java.util.*;

public class Start {
    public static void main(String[] args) {
       /* Створити структуру Зооклуб.
                Створити клас Person , який описати двома полями : ім’я , вік.
                Створити клас Animal , який описати двома полями : тип тваринки(кіт,пес), ім’я тваринки.
        Кожна людина може мати багато тваринок. Але одна тваринка належить лише одній людині.
                Map<Person, List<Animal>> map;
        Реалізувати консольне меню(НЕ обов’язково), таким чином щоб можна було:
                ● Додати людину до клубу
                ● Додати тваринку до людини
                ● Видалити(забрати) тваринку від людини
                ● Видалити людину з клубу
                ● Вивести на екран зооклуб
                ● Вийти з програми
        Використати для побудови меню Switch.*/

        Map<Person, List<Animal>> zooClubMap = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        List<Animal> listAnimal = new ArrayList<>
                (Arrays.asList(new Animal("Барсик", "Кіт"),
                               new Animal("Рекс","Пес"),
                               new Animal("Пуцик","Заєць"),
                               new Animal("Карат","Кінь")));
        while (true) {

                System.out.println("Меню");
                System.out.println("1 : Додати людину до клубу                  |");
                System.out.println("2 : Додати тваринку до людини               |");
                System.out.println("3 : Видалити(забрати) тваринку від людини   |");
                System.out.println("4 : Видалити людину з клубу                 |");
                System.out.println("5 : Вивести на екран зооклуб                |");
                System.out.println("6 : Вийти з програми                        |");
                System.out.println("------------------------");
                System.out.print("Введіть дію: ");

                int num = 0;
                if (scanner.hasNextInt()) {
                    num = scanner.nextInt();
                }

                switch (num) {

                    case 1: {
                        Person person = new Person("Ron", 21);
                        System.out.println("Імя людини: ");
                        zooClubMap.put(person , new ArrayList<>());


                        break;
                    }
                    case 2: {
                        //System.out.println("Name");
                        //String name = scanner.next();
                        //System.out.println("Age");
                        //Integer age = scanner.nextInt();

                        Animal animal = new Animal("topik", "Dog");

                        break;
                    }
                    case 3: {
                        System.out.println("info");
                        Animal animal = (Animal) zooClubMap.get(new Person("Ron", 21));
                        System.out.println(animal.getNameAnimal());
                        break;
                    }
                    case 4: {
                        break;
                    }
                    case 5: {
                        for (Map.Entry<Person, List<Animal>> entry : zooClubMap.entrySet()) {
                            Iterator<List<Animal>> iterator = zooClubMap.values().iterator();
                            while (iterator.hasNext()){
                                System.out.println(iterator.next().get(0).getNameAnimal());
                            }
                        }
                        break;
                    }
                }
        }
    }
}

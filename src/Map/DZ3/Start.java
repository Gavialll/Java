package Map.DZ3;

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
                ● Видалити тваринку від людини
                ● Видалити людину з клубу
                ● Вивести на екран зооклуб
                ● Вийти з програми
        Використати для побудови меню Switch.*/

        //Person person = new Person("Ron", 21);

        Map<Person, List<Animal>> zooClubMap = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        List<Animal> listAnimal = new ArrayList<>
                (Arrays.asList(new Animal("Мурік", "Кіт"),
                        new Animal("Рекс", "Пес"),
                        new Animal("Пушистік", "Заєць"),
                        new Animal("Карат", "Кінь")));

        List<Person> listPerson = new ArrayList<>
                (Arrays.asList(new Person("Тарас", 12),
                        new Person("Богдан", 23),
                        new Person("Павло", 34),
                        new Person("Роман", 14)));


        while (true) {

            System.out.println("Меню");
            System.out.print(" 1: Додати людину до клубу|");
            System.out.print(" 2: Додати тваринку до людини|");
            System.out.print(" 3: Видалити тваринку від людини|");
            System.out.print(" 4: Видалити людину з клубу|");
            System.out.print(" 5: Вивести на екран зооклуб|");
            System.out.println(" 6: Вийти з програми|");
            System.out.println("------------------------");
            System.out.print("Введіть дію: ");

            int num = 0;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            }

            switch (num) {

                case 1: {
                    Person person = person(listPerson);
                    zooClubMap.put(person, new ArrayList<>());
                    System.out.println(person.getName() + " " + person.getAge());
                    break;
                }
                case 2: {
                    Person person = person(listPerson);
                    List<Animal> list = zooClubMap.get(person);

                    System.out.print("name Animal: ");
                    String animal = scanner.next();

                    for (int i = 0; i < listAnimal.size(); i++) {
                        if (listAnimal.get(i).getNameAnimal().equals(animal)) {
                            list.add(listAnimal.get(i));
                            listAnimal.remove(i);
                        }
                    }
                    break;
                }
                case 3: {
                    Person person = person(listPerson);
                    List<Animal> list = zooClubMap.get(person);

                    Iterator<Animal> iterator = list.iterator();
                    if (iterator.hasNext()) {
                        System.out.print("Remove pet: ");
                        String animal = scanner.next();

                        for (int i = 0; i < list.size(); i++) {
                            if (iterator.next().getNameAnimal().equals(animal)) {
                                listAnimal.add(list.get(i));
                                iterator.remove();
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    Person person = person(listPerson);
                    List<Animal> list = zooClubMap.get(person);

                    listAnimal.addAll(list);
                    zooClubMap.remove(person);
                    break;
                }
                case 5: {

                    System.out.println("Власники з тваринками");
                    for (Map.Entry<Person, List<Animal>> entry : zooClubMap.entrySet()) {
                        System.out.println(entry.getKey().getName() + " доглядає за " + entry.getValue().toString());
                    }

                    System.out.println();
                    System.out.println("Люди в клубі");
                    for (Person personKey : zooClubMap.keySet()) {
                        System.out.println(personKey.getName() + " " + personKey.getAge());
                    }

                    System.out.println();
                    System.out.println("Тваринки в клубі");

                    for (Animal a : listAnimal) {
                        System.out.println(a.getNameAnimal() + " " + a.getTypeAnimal());
                    }
                }
                    break;
                }
            }
        }

    public static Person person(List<Person> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name person: ");
        String personName = scanner.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(personName)) {
               Person person  = list.get(i);

                return person;
            }
        }
        return null;
    }
}

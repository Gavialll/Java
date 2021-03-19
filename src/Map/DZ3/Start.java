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

        Person person = new Person("Ron", 21);

        Map<Person, List<Animal>> zooClubMap = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        List<Animal> listAnimal = new ArrayList<>
                (Arrays.asList(new Animal("Барсик", "Кіт"),
                               new Animal("Рекс","Пес"),
                               new Animal("Пуцик","Заєць"),
                               new Animal("Карат","Кінь")));


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
                    System.out.println("Імя людини: ");
                    zooClubMap.put(person, new ArrayList<>());
                    System.out.println(person.getName() + " " + person.getAge());
                    break;
                }
                case 2: {
                    List<Animal> list = zooClubMap.get(person);
                    System.out.println("add animal");
                    list.add(listAnimal.get(0));
                            zooClubMap.put(person, list);
                            listAnimal.remove(0);
                    break;
                }
                case 3: {
                    List <Animal> list = zooClubMap.get(person);
                    Iterator<Animal> iterator = list.iterator();
                    if(iterator.hasNext()) {
                        System.out.println("delete Animal");
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
                    List<Animal> listPerson = zooClubMap.get(person);
                    listAnimal.addAll(listPerson);
                    zooClubMap.remove(person);
                    break;
                }
                case 5: {
                    for (Map.Entry<Person, List<Animal>> entry : zooClubMap.entrySet()) {
                        for (Animal animal : entry.getValue()) {
                            System.out.println(animal.getNameAnimal());
                        }
                    }
                    System.out.println();
                    for (Animal a : listAnimal){
                            System.out.println(a.getNameAnimal());
                        }
                    break;
                }
            }
        }
    }
}

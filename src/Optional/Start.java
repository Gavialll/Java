package Optional;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class Start {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(null, 18));
        list.add(null);
        list.add(new Person("Matt", 19));
        list.add(new Person("Mark", 22));
        list.add(null);
        list.add(new Person(null, 33));
        // default name - Joe

        // Вивести імена персон з ліста. Якщо ім'я є нулл, то використати дефолтне значення 'Joe'
        // Зберегти не нулл об'єкти персон в новий ліст, для персон з іменем нулл використати дефолтне

        list.forEach(person -> {
            Optional<Person> optional = Optional.ofNullable(person);
            String str = optional.map(person1 -> person1.getName()).orElse("Joe");
            optional.ifPresent(person1 -> person1.setName(str));
                System.out.println(person);
        });

        List<Person> listNotNul = new ArrayList<>() {};

        list.forEach(person -> {
            Optional<Person> optional = Optional.ofNullable(person);
            optional.ifPresent(person1 -> listNotNul.add(person));
        });

        System.out.println();
        listNotNul.forEach(System.out::println);
    }
}

package Lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Start {

    //  Створити клас Person з полями вік, ім’я, timestamp. Зробити конструктор і
    //  включити в нього 2 поля вік та ім’я.
    //
    //  1) Написати лямбда-функцію , яка для кожного елемента(елементом є
    //  користувач) ліста перевіряє вік, і повнолітніх заносить в інший ліст.
    //
    //  1) Написати лямбда-функцію, яка для кожного елемента ліста(List<Person>)
    //  встановлює (setDate) поле поточна дата.
    //
    //  1) Написати лямбда-функцію яка перебирає кожен елемент списку
    //  (List<String>) і записує в інший ліст довжини слів з першого списку.

    public static void main(String[] args) {

        Person person0 = new Person("Tom" ,12);
        Person person1 = new Person("Jack" ,9);
        Person person2 = new Person("Ron" ,18);
        Person person3 = new Person("Mark" ,111);

        List<Person> people = new ArrayList<>();
        List<Person> people18 = new ArrayList<>();
        List<Integer> stringLength = new ArrayList<>();
        people.add(person0);
        people.add(person1);
        people.add(person2);
        people.add(person3);



        people.forEach((elem) -> {if(elem.getAge() >= 18) people18.add(elem);});

        people.forEach((elem) -> elem.setTimesTamp(LocalDate.now().toString()));

        System.out.println("Age > 18");
        people18.forEach((elem) -> System.out.print(elem.getName() + " "));

        System.out.println();
        System.out.println("toString ");
        people.forEach(elem -> {
            System.out.print("Age: " + elem.getAge().toString().length() + " ");
            System.out.print("Name: " + elem.getName().length() + " ");
            System.out.println("Data: " + elem.getTimesTamp().length());
        });

        people.forEach(elem -> {
            stringLength.add(elem.getAge().toString().length());
            stringLength.add(elem.getName().length());
            stringLength.add(elem.getTimesTamp().length());
        });

        stringLength.forEach(System.out::println);
    }
}

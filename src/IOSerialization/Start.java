package IOSerialization;

import Map.DZ3.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person = new Person("asd", 12);

        Employee ron = new Employee("Ron", 1111,person);
        Employee tom = new Employee("Tom", 2222,person);

        List<Employee> list = new ArrayList<>(Arrays.asList(ron, tom));


        Methods methods = new Methods();
        methods.serialize(list, "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");

        List<Employee> test = (List<Employee>) methods.deSerialize("/Users/andrijdutko/Desktop/GitJava/src/IOSerialization/Object");

        for (Employee e : test) {
            System.out.println(e.getName() + " " + e.getId() + " " + e.getSalary());
        }
    }
}

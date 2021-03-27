package IOSerialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee ron = new Employee("Ron", 1111,250);
        Employee tom = new Employee("Tom", 2222,2450);

        List<Employee> list = new ArrayList<>(Arrays.asList(ron, tom));

        Methods methods = new Methods();
        methods.serialize(list, "/Users/andrijdutko/Desktop/GitJava/src/IOSerialization/Object");

        List<Employee> test = (List<Employee>) methods.deSerialize("/Users/andrijdutko/Desktop/GitJava/src/IOSerialization/Object");

        for (Employee e : test) {
            System.out.println(e.getName() + " " + e.getId() + " " + e.getSalary());
        }

    }
}

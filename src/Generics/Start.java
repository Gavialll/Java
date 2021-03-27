package Generics;

import Map.DZ3.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        String str0 = "qwe";
        String str1 = "asd";
        String str2 = "zxc";
        Integer integer1 = 1;
        Integer integer2 = 2;
        Integer integer3 = 3;
        List<String> stringList = new ArrayList<>(Arrays.asList("qwe","asd","zxc"));

        //new map
        MyEntry<Integer, List<String>> myEntry = new MyEntry<>();

        //add item
        myEntry.add(integer1, stringList);
        myEntry.add(integer2, stringList);

        myEntry.printMap();
        System.out.println();

        //new map
        MyEntry<Integer, String> myEntry1 = new MyEntry<>();

        //add item
        myEntry1.add(integer1, str1);
        myEntry1.add(integer2, str2);
        myEntry1.add(integer3, str0);
        String str = myEntry1.get(integer1);


        List<String> list = myEntry.get(1);
        System.out.println(list.get(0));

        Person person = new Person(str, 66);
        System.out.println(person.getName() +" " + person.getAge());

        myEntry1.printMap();
        System.out.println();

        //delete an item by key
        myEntry1.removeElementKey(3);
        myEntry1.printMap();
        System.out.println();

        //delete an item by value
        myEntry1.removeElementValue("zxc");
        myEntry1.printMap();
        System.out.println();

        myEntry1.setKey();
        myEntry1.setValue();

    }
}

package Lambda.DZ2;

import java.util.*;

public class Start {

    //Створіть функціональний інтерфейс із методом, який приймає три
    //значення int та повертає значення int.

    //Створіть лямбда-функції (як змінні в основному методі), що реалізує
    //цей інтерфейс:

    //Перша лямбда повертає максимальне значення
    //Друга - середнє значення
    //Третя - суму всіх трьох значень

    //Викликати ці лямбди.
    public static void main(String[] args) {
        Interface sumNumber    = ((a, b, c) -> a + b + c);
        Interface average      = ((a, b, c) -> (a + b + c) / 3);
        Interface maximumValue = ((a, b, c) -> {
            List<Integer> list = new ArrayList<>(Arrays.asList(a,b,c));
            Collections.sort(list, Integer::compareTo);
            return list.get(2);});

        System.out.println("Сума чисел: " + sumNumber.number(3,4,5));
        System.out.println("Середнє значення: " + average.number(6,3,9));
        System.out.println("Max значення: " + maximumValue.number(10,9,5));
    }
}

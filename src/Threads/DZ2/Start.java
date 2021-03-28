package Threads.DZ2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        // Створити потік. Створити клас MyThread наслідувати його від класу Thread. Перевизначити метод
        // run(), так щоб можна було вивести введену з консолі кількість чисел Фібоначі. Тобто ми вводимо
        // з консолі скільки ми хочемо бачити чисел Фібоначі і ми їх виводимо з затримкою в 1 секунду.
        //
        // Створити потік. Створити клас RunnableThread імплементувати його від інтерфейсу Runnable. Метод
        // run() перевизначити таким чином, щоб числа Фібоначі виводились в зворотньому порядку. Тобто
        // Спершу ввели через Scanner скільки ми хочемо бачити чисел Фібоначі, потім з затримкою в 1
        // секунду вивести їх від останнього до першого значення.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть скільки чисел Фібоначи Ви хочете бачити?: ");
        Integer integer = scanner.nextInt();

        List<String> listFibo = new ArrayList<>();
        int[] x = {1,1};
        for (int i = 0; i < integer; i++) {
                if(i <= 1) {
                    listFibo.add(x[i] + ", ");
                }
            else {
                int c = x[0] + x[1];
                listFibo.add(c + ", ");
                int x1[] = {x[1],c};
                x = x1;
            }
        }
        System.out.print("Звичайний порядок: ");
        MyThread myThreadm = new MyThread(listFibo);
        myThreadm.start();

        myThreadm.join();

        System.out.println();
        System.out.print("Зворотній порядок: ");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                List<String> list = new ArrayList<>(listFibo);
                Collections.reverse(list);
                for (String s : list) {
                    System.out.print(s);

                    try {
                        Thread.sleep(1500);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}

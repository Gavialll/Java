package Threads.DZ1;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        //  Створити потік (унаслідуватись від Thread) DirectThread,
        //  реалізувати у ньому метод run(), який буде виводити масив(або ліст)
        //  елементів, які попередньо ввів користувач з перервою 1.5 секунди.
        //
        //  Створити потік (унаслідуватись від Runnable) SortedRunnable,
        //  реалізувати у ньому метод run(), який буде виводити масив(або ліст)
        //
        //  ПОСОРТОВАНИХ елементів, які попередньо ввів користувач з перервою
        //  1.5 секунди.
        //
        //  Рекомендація : для опрацювання інформації від користувача (масиву)
        //  рекомендую зробити інший клас Service, у якому буде функціонал для
        //  зчитування масиву з консолі. І він буде повертати масив(або ліст)

        Service service = new Service();
        List<Integer> listNumber = new ArrayList<>(service.number());


        ThreadFlow threadFlow = new ThreadFlow(listNumber);
        threadFlow.start();

        RunnableFlow runnableFlow = new RunnableFlow(listNumber);
        Thread threadRunnable = new Thread(runnableFlow);
        threadRunnable.start();
    }
}

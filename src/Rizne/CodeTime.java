package Rizne;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeTime {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Розклад на тиждень через Swich");
        System.out.println("2: Вивід перших 55 елементів послідовності 1 3 5 7 9");
        System.out.println("3: Вивід відємної послідовності 90 85 80 75 70");
        System.out.println("4: Створіть масив наповніть його рандомними даними, знайдіть найбільше та найменше значення масиву");
        System.out.println("5: Користувач вводить 10 чисел , в кінці програма рахує скільки додатних, від’ємних та нулів введено і виводить на екран ");
        System.out.println("6: Вивести суму всіх цілих чисел з проміжку, який введе користувач [a, b].");
        System.out.println("7: Запропонувати користувачу вводити числа доти, доки він не введе “0”.\n" +
                              "Після того, як користувач вводить “0” вивести на екран кількість чисел та суму чисел.");
        System.out.println("8: В банк поклали m - гривень під n-% відсотків річних. Яким буде вклад за K-років.\n" +
                              "Користувач вводить : m -суму грошей , n - процентна ставка та  k-кількість років.");
        System.out.println("9: Користувач задає елементи масиву певного розміру (розмір масиву вибирає\n" +
                              "програміст). Ваше завдання вивести масив, який ввів користувач, а потім вивести\n" +
                              "масив у зворотньому порядку.");
        System.out.println("10: Створити двовимірний масив, який буде мати 5 рядків і 7 стовпців і заповнити\n" +
                              "його рандомними(Math.random()) цифрами з проміжку [-2, 75]");
        System.out.println("11: Яке число наближене до 10, 11 чи 6");
        System.out.println("---------------------------");
        System.out.println("Введіть номер ДЗ");
        while(true) {
        int num = scanner.nextInt();
            switch(num) {
                case 1: {
                    /**Розклад на тиждень через Swich*/
                    twoHomeTaskBasik4();

                    println();
                    break;
                }

                case 2: {
                    /** Вивід перших 55 елементів послідовності 1 3 5 7 9*/
                    threeHometaskBasik4();

                    println();
                    break;
                }

                case 3: {
                    /** Вивід відємної послідовності 90 85 80 75 70*/
                    fourHometaskBasik4();

                    println();
                    break;
                }

                case 4: {
                    /** Створіть масив наповніть його рандомними даними, знайдіть найбільше та найменше значення масиву*/
                    sixHometaskBasik4();

                    println();
                    break;
                }

                //Code time
                case 5: {
                    /**Користувач вводить 10 чисел , в кінці програма рахує скільки додатних,
                     від’ємних та нулів введено і виводить на екран */
                    oneCodeTime();

                    println();
                    break;
                }

                case 6: {
                    /**Вивести суму всіх цілих чисел з проміжку, який введе користувач [a, b]. */
                    twoCodeTime();

                    println();
                    break;
                }

                case 7: {
                    /** Запропонувати користувачу вводити числа доти, доки він не введе “0”.
                     Після того, як користувач вводить “0” вивести на екран кількість чисел та
                     суму чисел.*/
                    threeCodeTime();

                    println();
                    break;
                }


                case 8: {
                    /**В банк поклали m - гривень під n-% відсотків річних. Яким буде вклад за K-років.
                     Користувач вводить : m -суму грошей , n - процентна ставка та  k-кількість років.*/
                    oneHomeTask();

                    println();
                    break;
                }

                case 9: {
                    /**Користувач задає елементи масиву певного розміру (розмір масиву вибирає
                     програміст). Ваше завдання вивести масив, який ввів користувач, а потім вивести
                     масив у зворотньому порядку.*/
                    twoHomeTask();

                    println();
                    break;
                }

                case 10: {
                    /** Створити двовимірний масив, який буде мати 5 рядків і 7 стовпців і заповнити
                     його рандомними(Math.random()) цифрами з проміжку [-2, 75] */
                    threeHometask();

                    println();
                    break;
                }

                case 11: {
                    /** Яке число наближене до 10, 11 чи 6*/
                    fiveHometaskBasik4();

                    println();
                    break;
                }
                default:{
                    System.out.println("Невірний номер, повторіть спробу");
                }
            }
        }
    }

    //HometaskOne
    public static void twoHomeTaskBasik4(){
        Scanner scan = new Scanner(System.in);
        //while (true){
            System.out.println("Введіть день тижня");
            String day = scan.next();
            switch (day) {
                case "Mon": {
                    System.out.println("Плавання");
                    break;
                }
                case "Tue": {
                    System.out.println("Гонки");
                    break;
                }
                case "Wed": {
                    System.out.println("Футбол");
                    break;
                }
                case "Thu": {
                    System.out.println("Велоспорт");
                    break;
                }
                case "Fri": {
                    System.out.println("Баскетбол");
                    break;
                }
                case "Sat": {
                    System.out.println("Мотогонки");
                    break;
                }
                case "Sun": {
                    System.out.println("Програмуванння");
                    break;
                }
                default: {
                    System.out.println("День введено некоректно");
                    break;
                }
            }
           // }
    }
    public static void threeHometaskBasik4(){

 int a = -1;
 int i = 0;
 //System.out.print(a +" ");
 //Вивід додатньої послідовності
 for (i = 0 ; i < 55; i++) {
 a += 2;
 System.out.print(a + " ");
 }
 System.out.println();
 System.out.println(i + ": - Циклів");
    }
    public static void fourHometaskBasik4(){
     int ii = 0;
     //Вивід відємної послідовнсті
     for (ii = 90; ii >= 0 ; ii-=5) {
     System.out.print(ii + " ");
     }}
    public static void fiveHometaskBasik4(){
        System.out.println("Непоняв як і ше не гуглив");
    }
    public static void sixHometaskBasik4(){
        int[] masiv = new int[10];
         int a = 0;
         int b = 10;
         for (int i = 0; i < masiv.length; i++) {
         //Рандом діапазон від a до b
         masiv[i] = a + (int) (Math.random() * b);
         System.out.print(masiv[i]);
         }
         System.out.println();
         //сортування масиву
         boolean sorted = false;
         int temp;
         int i = 0;
         while(!sorted) {
         sorted = true;
         for ( i = 0; i < masiv.length - 1; i++) {
         if (masiv[i] > masiv[i+1]) {
         temp = masiv[i];
         masiv[i] = masiv[i+1];
         masiv[i+1] = temp;
         sorted = false;
         }
         }
         }
         //вивід найбільшого та найменшого елементу масиву
         System.out.println(masiv[0]);
         System.out.println(masiv[9]);
    }

    //Rizne.CodeTime
    public static void oneCodeTime() {
        Scanner scan = new Scanner(System.in);
        int[] mas = new int[10];
        int max = 40;
        int min = -20;
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.print("Введіть число ");
            mas[i] = scan.nextInt();
            if (mas[i] == 0) {
                a++;
            } else if (mas[i] < 0) {
                b++;
            } else if (mas[i] > 0) {
                c++;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Кількіст нулів: " + a);
        System.out.println("Кількість додатніх чисел: " + c);
        System.out.println("Кількість відємних чисел: " + b);
    }
    public static void twoCodeTime(){
        Scanner scan = new Scanner(System.in);
        int[] mas = new int[20];
        int min = 0;
        int max = 20;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = min + (int) (Math.random() * max);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        System.out.println("Введіть діапазон Min");
        int j = scan.nextInt();
        System.out.println("Введіть діапазон Max");
        int b = scan.nextInt();
        int sum = 0;
        System.out.println("Ваш діапазон");
        for (int s = j; s <= b; s++) {
            System.out.print(mas[s] + " ");
            sum += mas[s];
        }
        System.out.println();
        System.out.println("Сума чисел: " + sum);

    }
    public static void threeCodeTime(){
        System.out.println("Введіть число");
        Scanner scan = new Scanner(System.in);
        List<Integer> ints = new ArrayList<>();
        int zero = 1;
        int j = 0;

        do {
            if (scan.hasNextInt()) {
                zero = scan.nextInt();
                System.out.println(zero + " ");
                ints.add(zero);
                System.out.println("Неправильне число");
            }
        }while (zero != 0);
        System.out.println("Кількість чисел: " + ints.size());

        int suma = 0;
        for (int i = 0; i < ints.size(); i++) {
            suma += ints.get(i);
        }
        System.out.println("Сума введених чисел: " + suma);


    }

    //HometaskTwo
    public static void oneHomeTask() {
        Scanner scan = new Scanner (System.in);

        System.out.println("Введіть суму вкладу");
        double m = scan.nextInt();
        System.out.println(m);

        System.out.println("Введіть відсотки");
        double n = scan.nextInt();
        System.out.println(n);

        System.out.println("Введіть кількість років");
        double k = scan.nextInt();
        System.out.println(k);

        System.out.println("--------------");

        double d = (n * k / 100) * m;

        System.out.println(d);


    }
    public static void twoHomeTask(){
        int[] mas = new int[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        //ввід даних користувачем в масив
        for (i = 0; i < mas.length; i++) {
            System.out.println("Введіть число: " + i);
            mas[i] = scanner.nextInt();
        }

        //Звичайний вивід масиву
        for (i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
        }

        //Вивід масиву в зворотньму прядку
        System.out.println();
        for (i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i]);
        }
    }
    public static void threeHometask(){
        System.out.println("Було загубилося чи незбререгло  error 404");
    }

    public static void println() {   System.out.println();
        System.out.println("--------------------");
        System.out.println();
    }
}

/** Робота з GitHub
 cd ..                    - Назад
 cd Name                  - Перехід в папку
 ls                       - Перегляд вімісту папки
 git status               - Провірка статусу рипозиторія
 git clone http://        - Получення копії репозиторія
 git add ТутНазваФайлу    - Підготовка файлу до загрузки на сервер
 git add -A               - Підготовка усіх файлів до загрузки на сервер
 git commit -m "Коментар" - Коментар
 git push                 - Вигрузка на сервер
 git pull                 - Получення оновлення з сервера
 git config --global user.name "My Name"            - Один раз для настройки проекту
 git config --global user.email myEmail@example.com - Один раз для настройки проекту
 git remote add origin https://github.com/Gavialll/Java.git - Підключення до GitHub
 git push -u origin master - Вигрузка на гілку"branch"  master
 git checkout -b НазваBaranch  - Створення нової гілки
 git pull origin master - використовувати на іншій гілці щоб стягнути всі данні на другу гілку
 git push origin НазваГілки - Push На потрібну гілку"branch"

 */




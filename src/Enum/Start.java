package Enum;

import java.util.Scanner;


public class Start {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                System.out.print("Введіть місяць: ");
                String nameMonths = scanner.next().toUpperCase();

                Months months = Months.valueOf(nameMonths);

                System.out.println("Меню");
                System.out.println("0 : Перевірити чи є такий місяць");
                System.out.println("1 : Вивести всі місяці з такою ж порою року.");
                System.out.println("2 : Вивести всі місяці які мають таку саму кількість днів.");
                System.out.println("3 : Вивести на екран всі місяці які мають меншу кількість днів.");
                System.out.println("4 : Вивести на екран всі місяці які мають більшу кількість днів.");
                System.out.println("5 : Вивести на екран наступну пору року");
                System.out.println("6 : Вивести на екран попередню пору року.");
                System.out.println("7 : Вивести на екран всі місяці які мають парну кількість днів.");
                System.out.println("8 : Вивести на екран всі місяці які мають непарну кількість днів.");
                System.out.println("9 : Вивести на екран чи введений з консолі місяць має парну кількість днів.");
                System.out.println("-------------------------------------------");
                System.out.print("Введіть номер завдання: ");

                int num = 0;
                if(scanner.hasNextInt()){
                    num = scanner.nextInt();
                }

                switch (num) {

                    case 0: {
                        months.audit();
                        break;
                    }

                    case 1: {
                        months.similarMonths();
                        break;
                    }
                    case 2: {
                        months.similarDays();
                        break;
                    }
                    case 3: {
                        months.maxDay();
                        break;
                    }
                    case 4: {
                        months.minDay();
                        break;
                    }
                    case 5: {
                        months.theNextSeason();
                        break;

                    }case 6: {
                        months.thePreviousSeason();
                        break;
                    }
                    case 7: {
                        months.evenDay();
                        break;
                    }
                    case 8: {
                        months.oddDay();
                        break;
                    }
                    case 9: {
                        months.thisMonthEvenDay();
                        break;
                    }
                }
            } catch (Exception e){
                System.out.println("Некоректний ввід");
            }
        }
    }
}
//Months.minDay(30); невикликається пісця циклу
//
//Вивід консолі
//Введіть номер завдання: sd
//Чому виводиться
//Введіть місяць:
//Некоректний ввід
//Введіть місяць:
//
//
//






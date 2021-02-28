package EnumNO;

import ExceptionOk.UnderAgeException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введіть місяць: ");
                String nameMonths = scanner.next().toUpperCase();

                Season nameSeason = Months.audit(nameMonths);
                int day = Months.numberOfDays(nameMonths);

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
                    case 1: {
                        Months.similarMonths(nameSeason);
                        break;
                    }
                    case 2: {
                        Months.similarDays(day);
                        break;
                    }
                    case 3: {
                        Months.maxDay(day);
                        break;
                    }
                    case 4: {
                        Months.minDay(day);
                        break;
                    }
                    case 5: {
                        Months.theNextSeason(nameSeason);
                        break;

                    }case 6: {
                        Months.thePreviousSeason(nameSeason);
                        break;
                    }
                    case 7: {
                        Months.evenDay();
                        break;
                    }
                    case 8: {
                        Months.oddDay();
                        break;
                    }
                    case 9: {
                        Months.thisMonthEvenDay(nameMonths);
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






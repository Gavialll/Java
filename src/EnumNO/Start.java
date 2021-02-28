package Enum;

import java.util.Locale;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть міцяць: ");
        String nameMonths = scanner.next().toUpperCase();

        Months.Provirka(nameMonths);
        boolean season;

        for (Months months : Months.values()) {
            boolean season = Season.SUMMER.equals()
        }

/*
        for (Months months : Months.values()) {
            if(months.getDay() == 30){
                System.out.println(months.name());
            }
        }
*/

        }
    }


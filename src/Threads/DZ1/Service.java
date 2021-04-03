package Threads.DZ1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    public List<Integer> number() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();
        int i = 0;
        while (i < 5) {
            System.out.print("Enter the number: ");
            listNumber.add(scanner.nextInt());

            i++;
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
            }
        }
        return listNumber;
    }
}

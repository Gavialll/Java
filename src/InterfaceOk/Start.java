package InterfaceNO;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
while(true) {
    System.out.print("Перше число: ");
    double a = scanner.nextDouble();
    System.out.print("Друге число: ");
    double b = scanner.nextDouble();

    MyCalculator myCalculator = new MyCalculator(a, b);
    myCalculator.Plus();
    myCalculator.Minus();
    myCalculator.Multiply();
    myCalculator.Devide();
    System.out.println("------------------------------");
}


    }
}




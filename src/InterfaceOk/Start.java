package InterfaceOk;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws IllegalAccessException,ArithmeticException,MyException {

        Scanner scanner = new Scanner(System.in);
while(true) {
    try {
        System.out.print("Перше число: ");
        double a = scanner.nextDouble();
        System.out.print("Друге число: ");
        double b = scanner.nextDouble();
        if (a > 0 && b > 0) {
            throw new IllegalAccessException();
        }
        else if ((a == 0 && b != 0) || (b == 0 && a != 0)) {
            throw new ArithmeticException();
        }
        else if (a < 0 || b < 0) {
            throw new MyException();
        }
        else if (a == 0 || b == 0) {
            throw new IllegalAccessException();
        }
        MyCalculator myCalculator = new MyCalculator(a, b);
        myCalculator.plus();
        myCalculator.minus();
        myCalculator.multiply();
        myCalculator.devide();
        System.out.println("----------------------");
    }catch (IllegalAccessException | MyException | ArithmeticException e){
        System.out.println(e);
    }
}

    }
}




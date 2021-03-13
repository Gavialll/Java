package ComaratorListTreeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        Commodity commodity = new Commodity(list , scanner);

            while (true) {
                try {
                System.out.println("Commands: ADD, DELETE, REPLACE, INFO,\n" +
                        "Commands Sort: WIDTH, WEIGHT, LENGTH, NAME");
                System.out.print("Введіть дію: ");

                Menu menu = Menu.valueOf(scanner.nextLine().toUpperCase());
                switch (menu) {
                    case ADD: {
                        commodity.addProduct();
                        break;
                    }
                    case DELETE: {
                        commodity.removeProduct();
                        break;
                    }
                    case REPLACE: {
                        commodity.changeProduct();
                        break;
                    }
                    case LENGTH: {
                        commodity.sortLength();
                        break;
                    }
                    case NAME: {
                        commodity.sortName();
                        break;
                    }
                    case WEIGHT: {
                        commodity.sortWeight();
                        break;
                    }
                    case WIDTH: {
                        commodity.sortWidth();
                        break;
                    }
                    case INFO: {
                        commodity.info();
                        break;
                    }
                }
                }catch (Exception e){
                    System.out.println("Некоректний ввід");
                }
            }
        }
    }


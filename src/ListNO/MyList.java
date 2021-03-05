package ListOk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyList {
    public static void main(String[] args) {

       menu();




    }

    public static List addList() {
        List<String> list = new ArrayList<>();
        int i = 1;
        while (!list.contains("break")) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a new item: ");
            System.out.print(i++ + " : ");
            list.add(scanner.next());

            System.out.println("You list");

            for (String word : list) {
                System.out.println(word);
            }
        }
        return list;
    }
    public static void viewList(List list){
        List<String> lists = list;
        for (String word : lists) {
            System.out.println(word);
        }
    }
    public static void menu(){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("<<<Menu>>>");
            System.out.println("1: Add list");
            System.out.println("2: Delete list element");
            System.out.println("3: View list");
            System.out.println("4: ");
            int number = scanner.nextInt();
            switch (number) {
                case 1: {
                    addList();
                }
                case 2: {
                    viewList(addList());
                }
                case 3: {

                }
                case 4: {

                }
            }
        }
    }
}



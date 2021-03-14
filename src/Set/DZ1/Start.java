package Set.DZ1;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        /*Створити об’єкт Покупка , який має два поля :
          ім’я покупки та кількість .
        Користувач має ввести список того, що він має купити в магазині.
          Після того як він закінчив вводити вивести йому список покупок
          ● в алфавітному порядку за ім’ям -> TreeSet - task_2
          ● в такому порядку як він вводив -> LinkedHashSet - task_3
          ● в порядку зменшення кількості -> TreeSet
          ● за хеш значенням об’єкта -> HashSet - task_4*/

        Scanner scanner = new Scanner(System.in);
        List<Purchase> list = new ArrayList<>();

        System.out.println("Наповнення списку");
        boolean tr = true;
        while (tr){
            System.out.print("Shopping: ");
            String shopping = scanner.next();

            System.out.print("Number: ");
            int number = scanner.nextInt();

            Purchase purchase = new Purchase(shopping, number);
            list.add(purchase);

            if (list.size() == 3){
                tr = false;
            }
        }
        System.out.println("List");
        for (Purchase purchas : list){
            System.out.println(purchas.getShopping() + " : " + purchas.getNumber() + "шт");
        }

        System.out.println();
        System.out.println("TreeSet");

        Set<Purchase> treeSet = new TreeSet();
        treeSet.addAll(list);

        for (Purchase p : treeSet){
            System.out.println(p.getShopping() + " : " + p.getNumber() + "шт");
        }

        System.out.println();
        System.out.println("TreeSet Reverse");

        NumberComparator numberComparator = new NumberComparator();
        Set<Purchase> treeReverse = new TreeSet(numberComparator);
        treeReverse.addAll(list);

        for (Purchase p : treeReverse){
            System.out.println(p.getShopping() + " : " + p.getNumber() + "шт");
        }

        System.out.println();
        System.out.println("LinkedHashSet");

        Set<Purchase> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(list);

        for (Purchase p : linkedHashSet){
            System.out.println(p.getShopping() + " : " + p.getNumber() + "шт");
        }

        System.out.println();
        System.out.println("HashSet");

        Set<Purchase> hashSet = new HashSet<>();
        hashSet.addAll(list);

        for (Purchase p : hashSet){
            System.out.println(p.getShopping() + " : " + p.getNumber() + "шт");
        }

    }
}

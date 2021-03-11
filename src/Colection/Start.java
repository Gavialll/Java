package Colection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Start {
    public static void main(String[] args) {


        Purchase purchase = new Purchase("A", 11);
        Purchase purchase1 = new Purchase("C", 22);
        Purchase purchase2 = new Purchase("B", 33);
        Purchase purchase3 = new Purchase("B", 44);
        Purchase purchase4 = new Purchase("D", 33);

        Set<Purchase> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(purchase);
        linkedHashSet.add(purchase1);
        linkedHashSet.add(purchase2);
        linkedHashSet.add(purchase3);
        linkedHashSet.add(purchase4);

        for (Purchase obj : linkedHashSet  )
        System.out.println(obj.getShopping() + " " + obj.getNumber());

        System.out.println();

        Set<Purchase> treeSet = new TreeSet<>(Purchase::compareTo);
        treeSet.add(purchase);
        treeSet.add(purchase1);
        treeSet.add(purchase2);
        treeSet.add(purchase3);
        treeSet.add(purchase4);

        for (Purchase obj : treeSet  )
            System.out.println(obj.getShopping() + " " + obj.getNumber());

    }
}

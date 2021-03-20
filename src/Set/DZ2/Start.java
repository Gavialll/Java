package Set.DZ2;

import java.util.*;

public class Start {
    public static void main(String[] args) {

        /*Створити клас (будь який), описати в ньому мінімум два поля, одне з яких
        String, інше числове (довільно яке). Створити в мейн методі Set.
        Наповнити його об’єктами даного класу.
            ● Вивести спершу невідсортований список, потім відсортований на
                консоль(використати Comparable для сортування за цими полями);
            ● Спробувати зробити завдання з HashSet, LinkedHashSet та TreeSet . */


        Comp comp = new Comp("HP", 128);
        Comp comp1 = new Comp("MAC", 512);
        Comp comp2 = new Comp("LENOVO", 1024);
        Comp comp3 = new Comp("SAMSUNG", 256);
        Comp comp4 = new Comp("SONY", 256);

        List<Comp> list = new ArrayList();
        list.add(comp4);
        list.add(comp);
        list.add(comp1);
        list.add(comp2);
        list.add(comp3);

        System.out.println("Print: LinkedHashSet");
        Set<Comp> set = new LinkedHashSet();
        set.addAll(list);

        for (Comp c : set) {
            System.out.println(c.getModel() + " " + c.getMemory());
        }

        System.out.println();

        System.out.println("Print: TreeSet");
        Set<Comp> set1 = new TreeSet();
        set1.addAll(list);

        for (Comp c : set1) {
            System.out.println(c.getModel() + " " + c.getMemory());
        }

        System.out.println();

        System.out.println("Print: HashSet");
        Set<Comp> set2 = new HashSet<>();
        set2.addAll(list);

        for (Comp c : set2) {
            System.out.println(c.getModel() + " " + c.getMemory());
        }
    }
}

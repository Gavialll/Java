package ComaratorListTreeSet;

import java.util.*;

public class Commodity {
    private List<Product> list;
    private Scanner scanner;

    public void addProduct(){
        boolean tr = true;

        //while (tr) {
            //System.out.print("Name: ");
            //String name = scanner.nextLine();
            //System.out.print("Weight: ");
            //double weight = scanner.nextDouble();
            //System.out.print("Width: ");
            //double width = scanner.nextDouble();
            //System.out.print("Length: ");
            //double length = scanner.nextDouble();

            Product product = new Product( "table", 25, 1, 2);
            Product product1 = new Product("chair", 12, 5, 4);
            Product product2 = new Product("bed", 95, 4, 5);
            Product product3 = new Product("sofa", 110, 3, 9);

            list.add(product);
            list.add(product1);
            list.add(product2);
            list.add(product3);

            //System.out.print("Додавати ще один: ");
            //String str = scanner.nextLine();
            //if (str.equals("yes")) {
            //    tr = true;
            //} else {
            //    tr = false;
            //}
            //}
    }
    public void removeProduct() {

        System.out.print("Видалити елемент: ");
        String str = scanner.nextLine();

        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()){

            if(iterator.next().getName().equals(str)){
                iterator.remove();
            }
        }

        //for (int i = 0; i < list.size(); i++) {
        //
        //    Product product = list.get(i);
        //
        //    if (product.getName().equals(str)){
        //        list.remove(product);
        //    }
        //}

    }
    public void changeProduct(){

        System.out.print("Товар для зміни: ");
        String str = scanner.nextLine();

        for (int i = 0; i < list.size(); i++) {

            Product product = list.get(i);

            if(product.getName().equals(str)){
                System.out.println("Commands: WIDTH, WEIGHT, LENGTH, NAME");
            System.out.print("Який пункт змінюємо: ");
            Menu menu = Menu.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Нове значення: ");
            switch (menu) {
                case WIDTH: {
                    product.setWidth(scanner.nextDouble());
                    break;
                }
                case LENGTH: {
                    product.setLength(scanner.nextDouble());
                    break;
                }
                case WEIGHT: {
                    product.setWeight(scanner.nextDouble());
                    break;
                }
                case NAME: {
                    product.setName(scanner.nextLine());
                    break;
                    }
                }
            }
        }
    }
    public void sortName(){

        Collections.sort(list);

        sout();
    }
    public void sortLength(){
        Comparator comparatorLength = new Comparator<Product>() {
            @Override
            public int compare(Product product, Product product1) {
                int res;
                if(product.getLength() == product1.getLength()){
                    res = 0;
                }
                if(product.getLength() > product1.getLength()){
                    res = 1;
                }
                else {
                    res = -1;
                }
                return res;
            }
        };
        Set<Product> treeSet = new TreeSet<>(comparatorLength);
        treeSet.addAll(list);

        System.out.println("Name | Length | Width | Weight");
        for (Product product : treeSet) {

            System.out.println(product.getName() + " | " +
                    product.getLength() + " | " +
                    product.getWidth() + " | " +
                    product.getWeight());
        }
    }
    public void sortWidth() {

        Comparator comparatorWidth = new Comparator<Product>() {
            @Override
            public int compare(Product product, Product product1) {
                int res;
                if(product.getWidth() == product1.getWidth()){
                    res = 0;
                }
                if(product.getWidth() > product1.getWidth()){
                    res = 1;
                }
                else {
                    res = -1;
                }
                return res;
            }
        };
        Collections.sort(list, comparatorWidth);

        sout();
    }
    public void sortWeight(){

        Comparator comparatorWeight = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getWeight() == o2.getWeight()){
                    return 0;
                }
                if(o1.getWeight() > o2.getWeight()) {
                    return 1;
                }else {
                    return -1;
                }
            }
        };
        Collections.sort(list, comparatorWeight);

        sout();
    }
    public void info(){

            try {
                System.out.print("Введіть назву товару: ");
                String str = scanner.nextLine();
                for (int i = 0; i <= list.size(); i++) {
                    Product product = (Product) list.get(i);
                    if (product.getName().equals(str)) {
                        System.out.println("Info");
                        System.out.println("Name  : " + product.getName() +
                                "\nWeight: " + product.getWeight() +
                                "\nWidth : " + product.getWidth() +
                                "\nLength: " + product.getLength());
                        break;
                    }
                }
            }catch (Exception e){
        System.out.println("Товар незнайдено");
    }
}
    public void sout(){
    System.out.println("Name | Length | Width | Weight");
    for (int i = 0; i < list.size(); i++) {
        Product product = (Product) list.get(i);
        System.out.println(product.getName() + " | " +
                product.getLength() + " | " +
                product.getWidth() + " | " +
                product.getWeight());
    }
}
    public Commodity(List list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
}

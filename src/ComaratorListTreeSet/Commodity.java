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

                // for (Product product : list){
                //     if(product.getName().equals(str)){
 //непрацює     //        list.remove(product);
                //     }
                // }
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
        LengthComparator lengthComparator = new LengthComparator();
        Set<Product> treeSet = new TreeSet<>(lengthComparator);
        treeSet.addAll(list);

        System.out.println("Name | Length | Width | Weight");
        for (Product product : treeSet) {

            System.out.println(product.getName() + " | " +
                    product.getLength() + " | " +
                    product.getWidth() + " | " +
                    product.getWeight());
        }
    }
    public void sortWidth(){
        WidthComparator widthComparator = new WidthComparator();
        Collections.sort(list, widthComparator);

        sout();
    }
    public void sortWeight(){
        WeightComparator weightComparator = new WeightComparator();
        Collections.sort(list, weightComparator);

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

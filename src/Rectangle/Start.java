package Rectangle;

public class Start {
    public static void main (String[] args) {

        //Hometask1
        //Конструктор з обовязковими параметрами
        RectanglePerimeter rectangle = new RectanglePerimeter(5,5);
        rectangle.Perimeter();

        //Присвоєння власних параметрів
        rectangle.setHeight(5);
        rectangle.setWidth(6);
        rectangle.Perimeter();

        //конструктор з параметрами за замовчуваннм
        RectangleSquare pl = new RectangleSquare();
        pl.Square();

        //Присвоєння власних параметрів
        pl.setHeight(5);
        pl.setWidth(6);
        pl.Square();
    }
}

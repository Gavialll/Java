package RectangleOk;

public class RectanglePerimeter {
    private int height;
    private int width;

    public void Perimeter (){
        int perimeter = height + width + height + width;
        System.out.println("Периметр прямокутника = " + perimeter);
    }
    public void Square(){
        int pl = height * width;
        System.out.println("Площа прямокутника = " + pl);
    }

    public RectanglePerimeter(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

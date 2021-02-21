package Rectangle;

public class RectangleSquare {
    private int height;
    private int width;

    public void Square(){
        int pl = height * width;
        System.out.println("Площа прямокутника = " + pl);
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

    public RectangleSquare() {
        this.height = 6;
        this.width = 7;
    }
}

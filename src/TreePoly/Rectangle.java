package TreePoly;

/**
 * Created by ronald on 05/10/16.
 */
public class Rectangle extends Shape {

    private int x, y, w, h;

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing rectangle (" + x + ", " + y + ", " + w + ", " + h + ")");
    }
}

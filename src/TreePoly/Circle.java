package TreePoly;

/**
 * Created by ronald on 05/10/16.
 */
public class Circle extends Shape {

    private int x, y, r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("Drawing circle (" + x + ", " + y + ", " + r + ")");
    }
}

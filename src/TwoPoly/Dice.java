package TwoPoly;

/**
 * Created by ronald on 05/10/16.
 */
public class Dice { // Static polymorphism = overloading

    public int Roll(int x, int y) {
        return x + y;
    }

    public int Roll(int x, int y, int z) {
        return x + y + z;
    }

    public int Roll(double x, double y) {
        return (int) (x + y);
    }

    public int Roll(int x, double y) {
        return x + (int) y;
    }

}

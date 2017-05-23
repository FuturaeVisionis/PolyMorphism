package FourPoly;

/**
 * Created by ronald on 05/10/16.
 */
public class Application {
    public static void main(String[] args) {
        Fruit fruit = new Banana();
        fruit.show();
        ((Banana) fruit).makeBananaTree(); // down casting

    }
}

package OnePoly;

import java.util.ArrayList;

/**
 * Created by ronald on 05/10/16.
 */
public class Run {
    public static void main(String[] args) {

        ArrayList<Human> group = new ArrayList<>();
        group.add(new Male());
        group.add(new Female());
        group.add((new Baby()));

        for (Human person : group)
            person.goPee();
    }
}

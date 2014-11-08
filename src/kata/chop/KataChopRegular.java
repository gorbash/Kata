package kata.chop;

import java.util.List;

/**
 * Created by GorbasH on 2014-11-08.
 */
public class KataChopRegular implements KataChop {

    private KataChopRegular() {
    }

    @Override
    public int chop(Integer value, List<Integer> integers) {
        if (integers.isEmpty())
            return NOT_FOUND;

        int index = 0;

        while (integers.size() > 1) {
            int middle = integers.size() / 2;
            if (integers.get(middle) > value) {
                integers = integers.subList(0, middle);
            } else {
                integers = integers.subList(middle, integers.size());
                index += middle;
            }
        }

        if (integers.get(0).equals(value))
            return index;
        else
            return NOT_FOUND;
    }

    public static KataChop create() {
        return new KataChopRegular();
    }
}

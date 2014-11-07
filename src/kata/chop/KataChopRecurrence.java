package kata.chop;

import java.util.List;

/**
 * Created by GorbasH on 2014-11-07.
 */
public class KataChopRecurrence implements KataChop {

    private KataChopRecurrence() {

    }

    @Override
    public int chop(Integer value, List<Integer> ints) {
        if (ints.get(0).equals(value)) {
            return 0;
        }
        return -1;
    }

    public static KataChop create() {
        return new KataChopRecurrence();
    }
}

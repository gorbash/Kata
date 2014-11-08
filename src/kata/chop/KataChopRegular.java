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
        return 0;
    }

    public static KataChop create() {
        return new KataChopRegular();
    }
}

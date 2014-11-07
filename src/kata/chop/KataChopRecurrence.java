package kata.chop;

import java.util.List;

/**
 * Created by GorbasH on 2014-11-07.
 */
public class KataChopRecurrence implements KataChop {

    public static final int NOT_FOUND = -1;

    private KataChopRecurrence() {
    }

    @Override
    public int chop(Integer value, List<Integer> ints) {
        return chopHelper(0, value, ints);
    }

    private int chopHelper(final Integer startIndex, final Integer value, final List<Integer> ints) {
        if (ints.size() != 0) {
            if (ints.get(0).equals(value)) {
                return startIndex;
            } else {
                int middleIndex = ints.size() / 2;
                if (ints.get(middleIndex) > value) {
                    List<Integer> firstHalf = ints.subList(0, middleIndex);
                    return chopHelper(startIndex, value, firstHalf);
                } else {
                    List<Integer> secondHalf = ints.subList(middleIndex, ints.size());
                    return chopHelper(startIndex + middleIndex, value, secondHalf);
                }
            }
        } else {
            return NOT_FOUND;
        }
    }

    public static KataChop create() {
        return new KataChopRecurrence();
    }
}

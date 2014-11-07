package kata.chop;

import java.util.List;

/**
 * Created by GorbasH on 2014-11-07.
 * Implementation of binary search with recurrence
 */
public class KataChopRecurrence implements KataChop {

    private static final int NOT_FOUND = -1;

    private KataChopRecurrence() {
    }

    @Override
    public int chop(final Integer value, final List<Integer> integers) {
        return chopHelper(0, value, integers);
    }

    private int chopHelper(final Integer startIndex, final Integer value, final List<Integer> integers) {
        if (integers.size() != 0) {
            if (integers.get(0).equals(value)) {
                return startIndex;
            } else {
                int middleIndex = integers.size() / 2;
                if (integers.get(middleIndex) > value) {
                    List<Integer> firstHalf = integers.subList(0, middleIndex);
                    return chopHelper(startIndex, value, firstHalf);
                } else {
                    List<Integer> secondHalf = integers.subList(middleIndex, integers.size());
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

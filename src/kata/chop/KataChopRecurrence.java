package kata.chop;

import java.util.List;

/**
 * Created by GorbasH on 2014-11-07.
 * Implementation of binary search with recurrence
 */
public class KataChopRecurrence implements KataChop {

    private KataChopRecurrence() {
    }

    @Override
    public int chop(final Integer value, final List<Integer> integers) {
        return chopHelper(0, value, integers);
    }

    private int chopHelper(final Integer startIndex, final Integer value, final List<Integer> integers) {
        if (!integers.isEmpty()) {
            if (integers.size() == 1 && integers.get(0).equals(value)) {
                return startIndex;
            } else {
                int middleIndex = integers.size() / 2;
                if (integers.get(middleIndex) > value) {
                    return chopHelper(startIndex, value, integers.subList(0, middleIndex));
                } else {
                    return chopHelper(startIndex + middleIndex, value, integers.subList(middleIndex, integers.size()));
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

package kata.chop;

import java.util.List;

/**
 * Created by GorbasH on 2014-11-09.
 * Instead of creating new list each time, work on the same array with
 * moving indexes.
 */
public class KataChopIterativeWithMovingIndex implements KataChop {

    private KataChopIterativeWithMovingIndex() {}

    public static KataChop create() {
        return new KataChopIterativeWithMovingIndex();
    }

    @Override
    public int chop(Integer value, List<Integer> integers) {
        if (integers.isEmpty())
            return NOT_FOUND;

        int startIndex = 0;
        int endIndex = integers.size() - 1;

        while ( Math.abs(endIndex - startIndex) > 1 ) {
            int middleIndex = (endIndex - startIndex) / 2 + startIndex;
            if (integers.get(middleIndex) > value) {
               endIndex = middleIndex;
            } else {
                startIndex = middleIndex;
            }
        }

        if (integers.get(startIndex).equals(value))
            return startIndex;
        else if (integers.get(endIndex).equals(value))
            return endIndex;
        else
            return NOT_FOUND;
    }
}

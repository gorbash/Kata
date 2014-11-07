package kata.chop;

import org.junit.Test;

import java.util.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by GorbasH on 2014-11-07.
 * Test suite for binary search implementation
 */

public class TestKata {

    private final KataChop chop = KataChopRecurrence.create();

    @Test
    public void chopRecurrencyEmptyList() {
        assertEquals(-1, chop.chop(1, Collections.EMPTY_LIST));
    }

    @Test
    public void chopRecurrenceSameNumbers() {
        assertEquals(3, chop.chop(1, Arrays.asList(1, 1, 1, 1, 2, 3)));
    }


    @Test
    public void chopRecurrenceNotFound() {
        assertEquals(-1, chop.chop(0, Arrays.asList(1, 2, 3)));
    }

    @Test
    public void chopRecurrenceOneElement() {
        assertEquals(0, chop.chop(1, Arrays.asList(1)));
    }

    @Test
    public void chopRecurrenceTwoElement() {
        List<Integer> testList = Arrays.asList(1, 5);
        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(5, testList));
    }

    @Test
    public void chopRecurrenceThreeElement() {
        List<Integer> testList = Arrays.asList(1, 5, 7);
        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(5, testList));
        assertEquals(2, chop.chop(7, testList));
    }

    @Test
    public void chopRecurrenceFourElement() {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4);
        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(2, testList));
        assertEquals(2, chop.chop(3, testList));
        assertEquals(3, chop.chop(4, testList));
    }

    @Test
    public void chopRecurrenceFiveElement() {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 12);
        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(2, testList));
        assertEquals(2, chop.chop(3, testList));
        assertEquals(4, chop.chop(12, testList));
    }


    @Test
    public void chopRecurrence1000000Element() {
        Set<Integer> prepSet = new TreeSet<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            prepSet.add(rand.nextInt());
        }

        List<Integer> testList = new ArrayList<Integer>(prepSet);

        for (int i = 0; i < 1000; i++) {
            int randValue = testList.get((int) (Math.random() * testList.size()));
            int expectedIndex = testList.indexOf(randValue);

            assertEquals(expectedIndex, chop.chop(randValue, testList));
        }
    }
}


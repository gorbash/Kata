package kata.chop;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by GorbasH on 2014-11-07.
 * Test suite for binary search implementation
 */

public abstract class TestKata {


    abstract KataChop getKataChop();

    private KataChop chop;

    @Before
    public void setup() {
        chop = getKataChop();
    }

    @Test
    public void chopEmptyList() {
        assertEquals(KataChop.NOT_FOUND, chop.chop(1, Collections.EMPTY_LIST));
    }

    @Test
    public void chopSameNumbers() {
        assertEquals(3, chop.chop(1, Arrays.asList(1, 1, 1, 1, 2, 3)));
    }


    @Test
    public void chopNotFound() {
        assertEquals(KataChop.NOT_FOUND, chop.chop(0, Arrays.asList(1, 2, 3)));
    }

    @Test
    public void chopOneElement() {
        assertEquals(0, chop.chop(1, Arrays.asList(1)));
    }

    @Test
    public void chopTwoElement() {
        List<Integer> testList = Arrays.asList(1, 5);
        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(5, testList));
    }

    @Test
    public void chopThreeElement() {
        List<Integer> testList = Arrays.asList(1, 5, 7);
        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(5, testList));
        assertEquals(2, chop.chop(7, testList));
    }

    @Test
    public void chopFourElement() {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4);
        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(2, testList));
        assertEquals(2, chop.chop(3, testList));
        assertEquals(3, chop.chop(4, testList));
    }

    @Test
    public void chopFiveElement() {
        List<Integer> testList = Arrays.asList(1, 2, 3, 4, 12);
        assertEquals(0, chop.chop(1, testList));
        assertEquals(1, chop.chop(2, testList));
        assertEquals(2, chop.chop(3, testList));
        assertEquals(4, chop.chop(12, testList));
    }


    @Test
    public void chop1000000Element() {
        Set<Integer> prepSet = new TreeSet<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            prepSet.add(rand.nextInt(Integer.MAX_VALUE));
        }

        List<Integer> testList = new ArrayList<Integer>(prepSet);

        for (int i = 0; i < 1000; i++) {
            int randValue = testList.get((int) (Math.random() * testList.size()));
            int expectedIndex = testList.indexOf(randValue);

            assertEquals(expectedIndex, chop.chop(randValue, testList));
        }
    }
}


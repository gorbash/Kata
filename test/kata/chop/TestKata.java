package kata.chop;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

/**
 * Created by GorbasH on 2014-11-07.
 */

public class TestKata {

    private final KataChop chop = KataChopRecurrence.create();

    @Test
    public void chopRecurrenceNotFound() {
        assertEquals(-1, chop.chop(0, Arrays.asList(1, 2, 3)));
    }

    @Test
    public void chopRecurrenceOneElement() {
        assertEquals(0, chop.chop(1, Arrays.asList(1)));
    }

    @Test
    public void chopRecurrenceFourElement() {
        assertEquals(2, chop.chop(3, Arrays.asList(1, 2, 3, 4)));
    }
}

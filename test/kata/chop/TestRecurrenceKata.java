package kata.chop;

/**
 * Created by GorbasH on 2014-11-08.
 */
public class TestRecurrenceKata extends TestKata {

    @Override
    KataChop getKataChop() {
        return KataChopRecurrence.create();
    }
}

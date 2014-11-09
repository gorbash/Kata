package kata.chop;

/**
 * Created by GorbasH on 2014-11-09.
 */
public class TestKataChopIterativeWithMovingIndexes extends TestKataChop {

    @Override
    KataChop getKataChop() {
        return KataChopIterativeWithMovingIndex.create();
    }
}

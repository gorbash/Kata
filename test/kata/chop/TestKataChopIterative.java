package kata.chop;

/**
 * Created by GorbasH on 2014-11-08.
 */
public class TestKataChopIterative extends TestKataChop {
    @Override
    KataChop getKataChop() {
        return KataChopIterative.create();
    }
}

package kata.chop;

/**
 * Created by GorbasH on 2014-11-08.
 */
public class TestRegularKata extends TestKata {
    @Override
    KataChop getKataChop() {
        return KataChopRegular.create();
    }
}

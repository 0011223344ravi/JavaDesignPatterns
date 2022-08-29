package HowToBreakSingltonAndHowToPreventIt;

public class MyClone {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

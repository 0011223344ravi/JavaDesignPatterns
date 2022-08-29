package HowToBreakSingltonAndHowToPreventIt;

public class EagerSinglton extends MyClone {
    private  static EagerSinglton instance = new EagerSinglton();

   private  EagerSinglton(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static EagerSinglton getInstance(){

           return instance;
    }
}

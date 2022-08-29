package SingltonDesignPattern;

public class LazySinglton {
    private static LazySinglton instance ;

    private LazySinglton(){

    }

    public static LazySinglton getInstance(){

        if(instance ==null)
            return instance = new LazySinglton();
        else return instance;
    }

    //we can make getInstance as synchronized and then this will allow only single thread at a time.
    //this will remove the race condition .
}

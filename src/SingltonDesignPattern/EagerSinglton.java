package SingltonDesignPattern;

public class EagerSinglton {
    private  static EagerSinglton instance = new EagerSinglton();

   private  EagerSinglton(){}

    public static EagerSinglton getInstance(){

           return instance;
    }
}

package SingltonClass;

public class SingltonExample {
    public static void main(String[] args) {
  //Abc abc = new Abc(); not allowed as Abc() is private;
    Abc abc = Abc.getInstance();
    Abc abc1 = Abc.getInstance();
        System.out.println(abc.hashCode());
        System.out.println(abc1.hashCode());

    }




}

class Abc {
  private static Abc instance =new Abc();


    private Abc() {

    }


    public static Abc getInstance(){
        return instance;
    }
}

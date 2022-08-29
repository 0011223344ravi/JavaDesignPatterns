package HowToBreakSingltonAndHowToPreventIt;

public class TestClassEager {

    public static void main(String[] args) throws CloneNotSupportedException {
        // LazySinglton lazySinglton = new LazySinglton();//its not possible , because we made default constructor as private
      //  System.out.println("hi");
        EagerSinglton eagerSinglton = EagerSinglton.getInstance();

        EagerSinglton eagerSinglton1 = EagerSinglton.getInstance();
        EagerSinglton eagerSinglton2= (EagerSinglton) eagerSinglton1.clone();

        System.out.println(eagerSinglton1.hashCode());
        System.out.println(eagerSinglton.hashCode());
        System.out.println(eagerSinglton2.hashCode());
    }
}

package SingltonDesignPattern;

public class TestClassEager {

    public static void main(String[] args) {
        // LazySinglton lazySinglton = new LazySinglton();//its not possible , because we made default constructor as private
        EagerSinglton eagerSinglton = EagerSinglton.getInstance();

        EagerSinglton eagerSinglton1 = EagerSinglton.getInstance();
        System.out.println(eagerSinglton1.hashCode());
        System.out.println(eagerSinglton.hashCode());
    }
}

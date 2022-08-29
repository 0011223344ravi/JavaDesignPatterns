package SingltonDesignPattern;

public class TestClassLazy {

    public static void main(String[] args) {
        // LazySinglton lazySinglton = new LazySinglton();//its not possible , because we made default constructor as private
         LazySinglton lazySinglton = LazySinglton.getInstance();

         LazySinglton lazySinglton1 = LazySinglton.getInstance();
        System.out.println(lazySinglton1.hashCode());
        System.out.println(lazySinglton.hashCode());



    }
}

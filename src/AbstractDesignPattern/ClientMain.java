package AbstractDesignPattern;

public class ClientMain {

    public static void main(String[] args) {
      AbstractFactory abs = new AbstractFactory();
      abs.getProfession("Doctor").print();

    }
}

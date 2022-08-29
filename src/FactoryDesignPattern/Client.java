package FactoryDesignPattern;

public class Client {

    public static void main(String[] args) {
     ProfessionFactory pf = new ProfessionFactory();
    Profession pf1 = pf.getProfession("Doctor");
    pf1.print();

    }
}

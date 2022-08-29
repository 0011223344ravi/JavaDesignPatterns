package FactoryDesignPattern;

public class ProfessionFactory {

    public Profession getProfession(String typeOfProfession){
        if(typeOfProfession==null){
            return  null;
        }
        if(typeOfProfession.equals("Doctor")){
            return new Doctor();
        }
        else   if(typeOfProfession.equals("Engineer")){
            return new Engineer();
        }

        else   if(typeOfProfession.equals("Teacher")){
            return new Teacher();
        }
        else return null;
    }
}

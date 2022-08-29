package AbstractDesignPattern;

import FactoryDesignPattern.Doctor;
import FactoryDesignPattern.Engineer;
import FactoryDesignPattern.Profession;
import FactoryDesignPattern.Teacher;

public class AbstractFactory implements AbstactFactoryInterface{

    @Override
    public Profession getProfession(String typeOfProfession) {

        if(typeOfProfession == null){
            return  null;
        }


        else if(typeOfProfession.equals("Teacher")){
             return new Teacher();
        }

        else if(typeOfProfession.equals("Engineer")){
            return new Engineer();
        }
        else if(typeOfProfession.equals("Doctor")){
            return new Doctor();
        }
        return null;

    }
}

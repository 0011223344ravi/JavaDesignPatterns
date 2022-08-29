package AbstractDesignPattern;

import FactoryDesignPattern.Doctor;
import FactoryDesignPattern.Engineer;
import FactoryDesignPattern.Profession;
import FactoryDesignPattern.Teacher;

public class TraineeAbstractFactory implements AbstactFactoryInterface{

    public Profession getProfession(String typeOfProfession) {

        if(typeOfProfession == null){
            return  null;
        }


        else if(typeOfProfession.equals("TraineeDoctor")){
            return new Teacher();
        }

        else if(typeOfProfession.equals("TraineeEngg")){
            return new Engineer();
        }
        else if(typeOfProfession.equals("TraineeTeacher")){
            return new Doctor();
        }
        return null;

    }

}

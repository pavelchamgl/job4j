package inheritance;

import inheritance.Diagnose;

public class Doctor extends Profession {
    String work;

    public String getWork(){
        return work;
    }
    public Diagnose heal(Pacient pacient){
        return pacient.getDiagnose();
    }
}
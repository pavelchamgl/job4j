package inheritance;

public class Pacient {
    private String name;
    private String surname;
    private int age;
    Diagnose diagnose;

    public Diagnose getDiagnose(){
        return diagnose;
    }
}
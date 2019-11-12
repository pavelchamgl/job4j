package inheritance.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        //понижение типа до родительского Student
        Student student = freshman;
        //понижение типа до родительского Object
        Object obj = freshman;
    }
}

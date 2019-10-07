package inheritance;

public class Engineer extends Profession{
    String work;

    public String getWork(){
        return work;
    }
    public Progect progect(Customer customer){
        return customer.getProgect();
    }
}
package inheritance.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Начинаем движение.");
    }

    @Override
    public void passenegers(int i) {
        System.out.println("Рассажиров в салоне - " +i);
    }

    @Override
    public double fill(double gas) {
        double price = 1.00;
        return gas*price;
    }
}
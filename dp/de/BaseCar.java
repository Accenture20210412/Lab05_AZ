package dp.de;

public class BaseCar implements Car{
    private double price=20000;
    private String name = "car";

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getFeatures() {
        return name;
    }
}

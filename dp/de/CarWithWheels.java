package dp.de;

public class CarWithWheels implements Car{
    private Car baseCar;
    private double price=4000;
    private String name = "wheels";

    public CarWithWheels(Car car){
        baseCar = car;
    }

    @Override
    public double getPrice() {
        return baseCar.getPrice() + price;
    }

    @Override
    public String getFeatures() {
        return baseCar.getFeatures() + " " + name;
    }
}

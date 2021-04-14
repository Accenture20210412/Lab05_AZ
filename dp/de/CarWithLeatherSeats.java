package dp.de;

public class CarWithLeatherSeats implements Car{
    private Car baseCar;
    private double price=8000;
    private String name = "leather seats";

    public CarWithLeatherSeats(Car car){
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

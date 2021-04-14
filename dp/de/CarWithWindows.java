package dp.de;

public class CarWithWindows implements Car{
    private Car baseCar;
    private double price=3000;
    private String name = "windows";

    public CarWithWindows(Car car){
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

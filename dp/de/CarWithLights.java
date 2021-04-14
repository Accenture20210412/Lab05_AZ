package dp.de;

public class CarWithLights implements Car{
    private Car baseCar;
    private double price=3000;
    private String name = "lights";

    public CarWithLights(Car car){
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

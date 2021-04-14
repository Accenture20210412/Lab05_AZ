package dp.de;

public class Runner {

    public static void main(String[] args) {
        Car c1 = new BaseCar();
        Car c2 = new CarWithWheels(c1);

        System.out.println(c2.getFeatures());
        System.out.println(c2.getPrice());

        Car c3 = new CarWithWindows(c2);

        System.out.println(c3.getFeatures());
        System.out.println(c3.getPrice());

    }
}

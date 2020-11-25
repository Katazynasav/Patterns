package Singleton;

public class CarProducer {

    private static CarProducer carProducerInstance;
    private int numberOfCarsProduced;

    private CarProducer(){

    }
    public static CarProducer getCarProducerInstance() {
        if (carProducerInstance == null) {
            carProducerInstance = new CarProducer();
        }
        return carProducerInstance;
        }

    public void printNumberOfCarsProduced() {
        System.out.println("We produced : " + numberOfCarsProduced);
    }

    public Car produceCar() {
       numberOfCarsProduced ++;
        return new Car();
    }
}


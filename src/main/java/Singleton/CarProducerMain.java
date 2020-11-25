package Singleton;

import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.List;

public class CarProducerMain {
    public static void main(String[] args) {
        CarProducer carProducer = CarProducer.getCarProducerInstance();
        carProducer.printNumberOfCarsProduced();

        Car audi = carProducer.produceCar();
        carProducer.printNumberOfCarsProduced();
        CarProducer otherCarProducer = CarProducer.getCarProducerInstance();

        Car audi100 = carProducer.produceCar();
        carProducer.printNumberOfCarsProduced();

        List<Car> cars = new ArrayList<Car>();
        cars.add(audi);
        cars.add(audi100);
    }
}

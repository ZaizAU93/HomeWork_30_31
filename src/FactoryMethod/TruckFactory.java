package FactoryMethod;

public class TruckFactory extends CarsFactory{

    @Override
    public Cars creatCar() {
        return new Truck();
    }
}

package FactoryMethod;

public class PickupFactory extends CarsFactory{
    @Override
    public Cars creatCar() {
        return new Pickup();
    }
}

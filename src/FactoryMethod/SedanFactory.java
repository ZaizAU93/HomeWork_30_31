package FactoryMethod;

public class SedanFactory extends CarsFactory{
    @Override
    public Cars creatCar() {
        return new Sedan();
    }
}

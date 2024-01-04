package FactoryMethod;

public class Truck implements Cars{
    @Override
    public void description() {
        System.out.println("Грузовик");
    }
}

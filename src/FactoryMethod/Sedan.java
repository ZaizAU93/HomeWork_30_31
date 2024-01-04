package FactoryMethod;

public class Sedan implements Cars{
    @Override
    public void description() {
        System.out.println("Седан");
    }
}

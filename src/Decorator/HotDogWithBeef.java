package Decorator;

public class HotDogWithBeef implements HotDog {
    @Override
    public String description() {
        return "��� ��� � �������� ��������";
    }

    @Override
    public int price() {
        return 3;
    }
}

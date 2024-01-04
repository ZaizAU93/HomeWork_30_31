package Decorator;

public class hotDogWithPorkSausage extends SausageReplacement{

    public hotDogWithPorkSausage(HotDogWithBeef hotDogWithBeef) {
        this.hotDogWithBeef = hotDogWithBeef;
    }

    @Override
    public String description() {
        return "������ ������� �� �������";
    }


    @Override
    public int price() {
        return 1 + hotDogWithBeef.price();
    }
}

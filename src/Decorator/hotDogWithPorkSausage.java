package Decorator;

public class hotDogWithPorkSausage extends SausageReplacement{

    public hotDogWithPorkSausage(HotDogWithBeef hotDogWithBeef) {
        this.hotDogWithBeef = hotDogWithBeef;
    }

    @Override
    public String description() {
        return "замена сосиски на свинную";
    }


    @Override
    public int price() {
        return 1 + hotDogWithBeef.price();
    }
}

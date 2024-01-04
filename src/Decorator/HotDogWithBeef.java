package Decorator;

public class HotDogWithBeef implements HotDog {
    @Override
    public String description() {
        return "хот дог с говяжьей сосиской";
    }

    @Override
    public int price() {
        return 3;
    }
}

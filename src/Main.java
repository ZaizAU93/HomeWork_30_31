import AbstractFactory.AbstractFactory;
import AbstractFactory.Client;
import AbstractFactory.ConcreteFactory1;
import AbstractFactory.ConcreteFactory2;
import Adapter.EnglishDictionary;
import Adapter.RussianDictionary;
import Adapter.RussianToEnglishAdapter;
import Builder.Airplane;
import Builder.AirplaneBuilder;
import Decorator.HotDogWithBeef;
import Decorator.hotDogWithPorkSausage;
import Facade.Dish;
import FactoryMethod.*;
import Singleton.Action;
import Singleton.Logging;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Singelton");
        Logging.INSTANCELog.getINSTNCE();

        System.out.println("Введите сстроки для проверки логов");

        for (int i = 0; i < 5; i++) {
            String logs = sc.nextLine();
            Logging.INSTANCELog.log(logs);
        }

        Action action = new Action();
        action.action();

        System.out.println("Вывод всех логов");
        for (String iter: Logging.logList){
            System.out.println(iter);
        }

        System.out.println("AbstractFactory");
        AbstractFactory factory1 = new ConcreteFactory1();
        Client client1 = new Client(factory1);
        client1.executeOperations();

        AbstractFactory factory2 = new ConcreteFactory2();
        Client client2 = new Client(factory2);
        client2.executeOperations();

        System.out.println("FactoryMethod");

        CarsFactory sedanFactory = new SedanFactory();
        Cars sedan = sedanFactory.creatCar();
        sedan.description();

        CarsFactory pickupFactory = new PickupFactory();
        Cars pickup = pickupFactory.creatCar();
        pickup.description();

        CarsFactory truckFactory = new TruckFactory();
        Cars truck = truckFactory.creatCar();
        truck.description();

// Создание объекта самолета с помощью строителя
        Airplane airplane = new AirplaneBuilder()
                .setModel("Boeing 747")
                .setEngine("Jet Engine")
                .setSeatingCapacity(200)
                .build();

        Airplane airplane1 = new Airplane("ty-124","get",4000);

        // Вывод информации о самолете
        System.out.println(airplane);
        System.out.println(airplane1);

        Airplane airplane2 = new AirplaneBuilder()
                .setModel("lkjhgf")
                .build();
        System.out.println(airplane2);

        System.out.println("Adapter");

        RussianDictionary russianDictionary = new RussianDictionary();
        EnglishDictionary englishDictionary = new EnglishDictionary();
        RussianToEnglishAdapter russianToEnglishAdapter = new RussianToEnglishAdapter(russianDictionary,englishDictionary);
        System.out.println(russianToEnglishAdapter.translation("Привет"));

        System.out.println("Facade");
        Dish dish = new Dish();
        dish.cookDish();

        System.out.println("Decorator");
        HotDogWithBeef hotDogWithBeef = new HotDogWithBeef();
        System.out.println(hotDogWithBeef.description());
        System.out.println("цена "+ hotDogWithBeef.price());
        hotDogWithPorkSausage hotDogWithPorkSausage = new hotDogWithPorkSausage(hotDogWithBeef);
        System.out.println(hotDogWithPorkSausage.description());
        System.out.println("цена " + hotDogWithPorkSausage.price());
    }
}
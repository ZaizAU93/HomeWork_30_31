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

    }
}
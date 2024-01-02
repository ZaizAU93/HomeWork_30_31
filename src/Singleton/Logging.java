package Singleton;

import java.util.ArrayList;

public class Logging {
    public static Logging INSTANCELog = new Logging();
    public static ArrayList<String> logList = new ArrayList<>();
    public static String log;
    private Logging() {
        System.out.println("Обьект логер создан");
    }

    public static Logging getINSTNCE() {
        if (INSTANCELog == null) {
            INSTANCELog = new Logging();
            return INSTANCELog;
        }
        return INSTANCELog;
    }


    public void log(String log) {
        logList.add(log);
    }
}
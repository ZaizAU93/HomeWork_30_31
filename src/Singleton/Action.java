package Singleton;

public class Action {


    public void action(){
        System.out.println("Выполнение действия");
        String[] mas = new String[10];
        for (String iter: mas){
            iter = String.valueOf(Math.random()-1);
            Logging.getINSTNCE().log(iter);
        }
    }

}

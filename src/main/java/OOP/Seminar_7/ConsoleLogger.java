package OOP.Seminar_7;

public class ConsoleLogger implements Loggable {

    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }

}

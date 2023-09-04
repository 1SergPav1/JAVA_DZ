package OOP.Seminar_7;

public class LogCalculableFactory implements ICalculableFactory {

    private Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}

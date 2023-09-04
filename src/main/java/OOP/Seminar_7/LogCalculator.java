package OOP.Seminar_7;

public class LogCalculator implements Calculable {

    private final Calculable decorated;
    private final Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }


    @Override
    public Calculator sum(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора " + firstArg + " Начало вызова метода sum с параметром " + arg));
        Calculator result = decorated.sum(arg);
        logger.log("Вызов метода sum произошел");
        return result;
    }

    @Override
    public Calculator sub(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора " + firstArg + " Начало вызова метода sub с параметром " + arg + "\n"));
        Calculator result = decorated.sum(arg);
        logger.log("Вызов метода sub произошел");
        return result;
    }

    @Override
    public Calculator multi(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора " + firstArg + " Начало вызова метода multi с параметром " + arg));
        Calculator result = decorated.multi(arg);
        logger.log("Вызов метода multi произошел");
        return result;
    }

    @Override
    public Calculator divide(ComplexNumber arg) {
        ComplexNumber firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора " + firstArg + " Начало вызова метода divide с параметром " + arg));
        Calculator result = decorated.multi(arg);
        logger.log("Вызов метода divide произошел");
        return result;
    }


    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = decorated.getResult();
        logger.log(String.format("Получение результата " + result));
        return result;
    }
}

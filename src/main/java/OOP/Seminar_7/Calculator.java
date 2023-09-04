package OOP.Seminar_7;

public final class Calculator implements Calculable {

    private ComplexNumber primaryArg;

    public Calculator(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculator sum(ComplexNumber arg) {
        primaryArg = new ComplexNumber((primaryArg.getRealPart() + arg.getRealPart()), (primaryArg.getImagPart() + arg.getImagPart()));
        return this;
    }

    @Override
    public Calculator sub(ComplexNumber arg) {
        primaryArg = new ComplexNumber((primaryArg.getRealPart() - arg.getRealPart()), (primaryArg.getImagPart() - arg.getImagPart()));
        return this;
    }

    @Override
    public Calculator multi(ComplexNumber arg) {
        double real = primaryArg.getRealPart() * arg.getRealPart() - primaryArg.getImagPart() * arg.getImagPart();
        double imag = primaryArg.getImagPart() * arg.getImagPart() + primaryArg.getImagPart() * arg.getRealPart();
        primaryArg = new ComplexNumber(real, imag);
        return this;
    }

    @Override
    public Calculator divide(ComplexNumber arg) {
        double denominator = arg.getRealPart() * arg.getRealPart() + arg.getImagPart() + arg.getImagPart();
        double real = (primaryArg.getRealPart() * arg.getRealPart() + primaryArg.getImagPart() * arg.getImagPart())/denominator;
        double imag = (primaryArg.getImagPart() * arg.getRealPart() - primaryArg.getRealPart() * arg.getImagPart())/denominator;
        primaryArg = new ComplexNumber(real, imag);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}

package OOP.Seminar_7;

public class ComplexNumber {

    private double realPart;
    private double imagPart;

    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImagPart() {
        return imagPart;
    }

    @Override
    public String toString() {
        if (imagPart < 0) {
            return "ComplexNumber{" +
                    "realPart=" + realPart + "+" +
                    ", imagPart=" + imagPart + "i" +
                    '}';
        }
        else {
            return realPart + "+" + imagPart + "i";
        }
    }
}

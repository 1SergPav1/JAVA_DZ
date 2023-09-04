package OOP.Seminar_7;

public interface Calculable {

        Calculator sum(ComplexNumber arg);
        Calculator sub(ComplexNumber arg);
        Calculator multi(ComplexNumber arg);
        Calculator divide(ComplexNumber arg);


        ComplexNumber getResult();

}

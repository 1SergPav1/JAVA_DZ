package DZ_JAVA.DZ_6;

import java.util.HashSet;

public class DZ_6 {

    static HashSet<Cat> catSet = new HashSet<>();

    static Cat cat1 = new Cat("Tom", 5);
    static Cat cat2 = new Cat("Леопольд", 10);
    static Cat cat3 = new Cat("Tom", 5);



    public static void main(String[] args) {

        catSet.add(cat1);
        catSet.add(cat2);
        System.out.println(catSet);

        System.out.printf("Сравнение двух объектов класса Cat: %b\n", cat1.equals(cat3));
        System.out.printf("Вычисление хэш-кода: %d, %d, %d\n", cat1.hashCode(), cat2.hashCode(), cat3.hashCode());

        catSet.add(cat3);
        System.out.println(catSet);

    }
}

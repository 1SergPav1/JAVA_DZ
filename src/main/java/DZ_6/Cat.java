package DZ_6;

import java.util.Objects;

public class Cat {


    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        if (age == 0) {
            throw new RuntimeException("Возраст не может быть меньше нуля.");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new  RuntimeException("Возраст не может быть меньше нуля.");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s / возраст: %d", name, age);
    }
}

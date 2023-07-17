package DZ_JAVA.DZ_1;

import java.util.Scanner;

public class DZ_1 {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("0 - Завершение работы приложения");
//            int no = Integer.parseInt(scanner.nextLine());
            String no = scanner.next();
            switch (no) {
                case "2":
                    task2();
                    break;
                case "1":
                    task1();
                    break;
                case "3":
                    task3();
                    break;
                case "0":
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
                    break;
            }
        }
    }

    static void task1() {
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int resultTriangle = triangle(n);
        int resultFactorial = factorial(n);
        System.out.printf("n-ное треугольное число = %d   факториал = %d", resultTriangle, resultFactorial);
    }

    static int triangle(int n) {
        int summa = 0;
        for (int i = 1; i <= n; i++) {
            summa += i;
        }
        return summa;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


    static void task2() {
        for (int i = 1; i <= 1000; i++) {
            if (isSimple(i)) {
                System.out.printf("%d, ", i);
            }
        }
    }

    public static boolean isSimple(Integer number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void task3() {
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию: ");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int operation = scanner.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: неверная операция");
                return;
        }

        System.out.printf("Результат: %s\n", result);
    }
}

package DZ_JAVA.DZ_4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DZ_4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("0 - Завершение работы приложения");
            String no = scanner.next();
            switch (no) {
                case "1" -> task1();
                case "2" -> task2();
                case "3" -> task3();
                case "0" -> {
                    System.out.println("Завершение работы приложения.");
                    f = false;
                }
                default -> System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
            }
        }

    }

    static void task1() {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        System.out.println("Исходный список: " + myLinkedList);
        LinkedList<Integer> resultList = reverseList(myLinkedList);
        System.out.println("Перевернутый список: " + resultList);
    }

    static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        stack.addAll(list);
        while (!stack.isEmpty()) {
            newLinkedList.add(stack.pop());
        }
        return newLinkedList;
    }

    static void task2() {


        class MyQueue<T> {
            private final LinkedList<T> elements;

            public MyQueue() {
                elements = new LinkedList<>();
            }

            //Добавляет элемент в конец очереди
            public void enqueue(T element) {
                elements.addLast(element);
            }

            //Возвращает первый элемент из очереди и удаляет его
            public T dequeue() {
                T element = elements.getFirst();
                elements.removeFirst();
                return element;
            }

            //Возвращает первый элемент из очереди не удаляя его
            public T first() {
                return elements.getFirst();
            }

            @Override
            public String toString() {
                StringBuilder string = new StringBuilder();
                for (T element : elements) {
                    string.append(element.toString()).append(" ");
                }
                return string.toString();
            }
        }

        MyQueue<Integer> myqueue = new MyQueue<>();
        myqueue.enqueue(1);
        myqueue.enqueue(2);
        myqueue.enqueue(3);
        System.out.println("Добавили в очередь 3 элемента. Очередь: " + myqueue);
        Integer firstEl = myqueue.dequeue();
        System.out.printf("Первый элемент очереди (удаление): %d \nОчередь: " + myqueue, firstEl);
        Integer newFirstEl = myqueue.first();
        System.out.printf("\nПервый элемент очереди (без удаления): %d \nОчередь: " + myqueue, newFirstEl);

    }

    static void task3() {

        StringBuilder string = new StringBuilder();
        LinkedList<String> log = new LinkedList<>();

        boolean f = true;
        while (f) {
            System.out.println("Выберите операцию: ");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Удаление последней операции из лога");
            System.out.println("0. Выход из калькулятора");

            int operation = scanner.nextInt();
            switch (operation) {
                case 1 -> {
                    System.out.print("Введите первое число: ");
                    double num1 = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    double num2 = scanner.nextDouble();
                    double result1 = add(num1, num2);
                    string.setLength(0);
                    string.append(num1).append("+").append(num2).append("=").append(result1);
                    log.add(string.toString());
                    System.out.println(log);
                }
                case 2 -> {
                    System.out.print("Введите первое число: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    double num4 = scanner.nextDouble();
                    double result2 = subtraction(num3, num4);
                    string.setLength(0);
                    string.append(num3).append("-").append(num4).append("=").append(result2);
                    log.add(string.toString());
                    System.out.println(log);
                }
                case 3 -> {
                    if (!log.isEmpty()) {
                        log.removeLast();
                        System.out.println(log);
                    }
                    else {
                        System.out.println("Лог пуст!");
                    }
                }
                case 0 -> f = false;
                default -> {
                    System.out.println("Ошибка: неверная операция");
                    return;
                }
            }
        }

    }

    static double add(double num1, double num2) {
        return num1 + num2;
    }

    static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
}


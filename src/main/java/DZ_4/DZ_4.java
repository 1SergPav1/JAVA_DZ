package DZ_4;

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
            System.out.println("0 - Завершение работы приложения");
            String no = scanner.next();
            switch (no) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
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
            private LinkedList<T> elements = new LinkedList<>();

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



    }

}


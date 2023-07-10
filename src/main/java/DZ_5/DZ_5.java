package DZ_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DZ_5 {

    public static void main(String[] args) {

        Phonebook myPhonebook = new Phonebook();
        myPhonebook.add("Иванов", "123456789");
        myPhonebook.add("Иванов", "987654321");
        myPhonebook.add("Петров", "123123123");
        myPhonebook.add("Васильев", "6784566465");

        boolean f = true;
        while (f) {
            System.out.println("1 - Показать телефонный справочник");
            System.out.println("2 - Добавить контакт");
            System.out.println("3 - Найти контакт");
            System.out.println("0 - Завершение работы приложения");
            String no = scanner.next();
            switch (no) {
                case "1" -> {
                    System.out.print("\n");
                    System.out.println(myPhonebook);
                }
                case "2" -> {
                    System.out.println("Введите имя: ");
                    String newName = scanner.next();
                    System.out.println("Введите номер: ");
                    String newNumber = scanner.next();
                    myPhonebook.add(newName, newNumber);
                }
                case "3" -> {
                    System.out.println("Введите имя: ");
                    String nameToFind = scanner.next();
                    System.out.print("\n");
                    System.out.println(myPhonebook.get(nameToFind) + "\n");
                }
                case "0" -> {
                    System.out.println("Завершение работы приложения.");
                    f = false;
                }
                default -> System.out.println("Некорректный ввод,\nповторите попытку ввода.");
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);

    static class Phonebook {

        static HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();

        //вывод справочника на экран
        @Override
        public String toString() {
            StringBuilder string = new StringBuilder();
            for (Map.Entry<String, ArrayList<String>> entry: phoneMap.entrySet()) {
                string.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
            }
            return string.toString();
        }

        //добавление контакта
        public void add(String name, String number) {
            if (phoneMap.containsKey(name)) {
                phoneMap.get(name).add(number);
            }
            else {
                ArrayList<String> lst = new ArrayList<>();
                lst.add(number);
                phoneMap.put(name, lst);
            }
        }

        //поиск контакта по фамилии
        public ArrayList<String> get(String name) {
            return phoneMap.get(name);
        }
    }

}

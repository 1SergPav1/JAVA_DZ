package DZ_JAVA.DZ_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject; // для парсинга json нагуглил такую библиотеку, как одну из самых простых в использовании

import java.util.Scanner;

public class DZ_2 {

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
            String prarmsOfFilter = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

            JSONObject filter = new JSONObject();

            StringBuilder were = new StringBuilder(prarmsOfFilter);

            for (String key : filter.keySet()) {
                String value = filter.getString(key);
                if (!value.equals("null")) {
                    if (were.length() > 0) {
                        were.append("AND");
                    }
                    were.append(key).append(" = ").append(value);
                }
            }
            System.out.println(were);
        }

        static void task2() {
            int[] numsArray = {6,2,8,9,43,5,7,5,4,67,3,8,6,54,1,6};
            File logFile = new File("log.txt");
            try (FileWriter fileWriter = new FileWriter(logFile, true)) {
                String massage = "Исходный числовой масси:";
                System.out.println(massage);
                fileWriter.write(massage);
                for (int num : numsArray) {
                    fileWriter.write(num + " ");
                    System.out.print(num + " ");
                }
                fileWriter.write("\n");

                for (int i = 0; i < numsArray.length - 1; i++) {
                    for (int j = 0; j < numsArray.length - 1; j++) {
                        if (numsArray[j] > numsArray[j + 1]) {
                            int temp = numsArray[j];
                            numsArray[j] = numsArray[j + 1];
                            numsArray[j + 1] = temp;
                        }
                    }
                    for (int num: numsArray) {
                        fileWriter.write(num + " ");
                    }
                    fileWriter.write("\n");
                }
                massage = "Отсортированный числовой массив: ";
                System.out.println("\n" + massage);
                fileWriter.write(massage);
                for (int num: numsArray) {
                    System.out.print(num + " ");
                    fileWriter.write(num + " ");
                }
                fileWriter.write("\n");
                System.out.println("\nПроцесс сортировки записан в файл log.txt");
            } catch (IOException ex) {}
        }
}


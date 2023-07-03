package DZ_3;

import java.util.ArrayList;
import java.util.Random;

public class DZ_3 {

    public static void main(String[] args) {
       ArrayList<Integer> myArray = create();
       System.out.println("Начальный список:\n" + myArray);
       deleteEvenNumbers(myArray);
       System.out.println("После удаления четных чисел:\n" + myArray);
       int min = findMin(myArray);
       System.out.printf("Минимальное значение в списке: %d", min);
       int max = findMax(myArray);
       System.out.printf("\nМаксимальное значение в списке: %d", max);
       double average = calcAverage(myArray);
       System.out.printf("\nСреднее значение списка: %s", average);
    }

    static ArrayList<Integer> create() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(10, 20);
        for (int i = 0; i < size; i++){
            arrayList.add(random.nextInt(0, 100));
        }
        return arrayList;
    }

    static void deleteEvenNumbers(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
    }

    static int findMin(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    static int findMax(ArrayList<Integer> array) {
        int max = array.get(0);
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static double calcAverage(ArrayList<Integer> array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.size();
        return average;
    }

}

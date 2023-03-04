import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        //Arrays.fill(arr, random.nextInt(100_000) + 100_000); fill by one value
        return arr;
    }

    //перегрузка мощщщщщная
    public static int[] generateRandomArray(int start, int end, int count) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(end) + start;
        }
        //Arrays.fill(arr, random.nextInt(100_000) + 100_000); fill by one value
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int[] arrInt = generateRandomArray();

        //int total = Arrays.stream(arrInt).sum();

        int total = 0;
        for (int j : arrInt) {
            total += j;
        }
        System.out.println("Сумма трат за месяц составила " + total +" рублей");
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int[] arrInt = generateRandomArray();

        /*OptionalInt minValue = Arrays.stream(arrInt).min();
        OptionalInt maxValue = Arrays.stream(arrInt).max();
        System.out.println("Min " + minValue.getAsInt() + ", max " + maxValue.getAsInt());*/

        int minValue = arrInt[0];
        int maxValue = arrInt[0];

        if (arrInt.length > 1) {
            for (int i = 1; i < arrInt.length; i++) {
                if (minValue > arrInt[i]) {
                    minValue = arrInt[i];
                }
                if (maxValue < arrInt[i]) {
                    maxValue = arrInt[i];
                }
            }
        }

        System.out.println("Min " + minValue+ ", max " + maxValue);
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int[] arrInt = generateRandomArray();

        /*double average = Arrays.stream(arrInt).average().getAsDouble();
        System.out.println("Средняя сумма трат за месяц составила " + average);*/

        int total = 0;
        double average;

        for (int j : arrInt) {
            total += j;
        }
        average = (double) total / (double) arrInt.length;
        System.out.println("Средняя сумма трат за месяц составила " + average);
    }

    public static void task4 () {
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println("\n***");
    }

    public static void task5 () {
        System.out.println("Миссия \"Пузырьковый беспредел\"");

        int[] arrInt = generateRandomArray(20,20,20);

        System.out.println(Arrays.toString(arrInt));

        int temp = 0;
        for (int i = arrInt.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrInt[j] > arrInt[j + 1]) {
                    temp = arrInt[j];
                    arrInt[j] = arrInt[j + 1];
                    arrInt[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arrInt));
    }
}
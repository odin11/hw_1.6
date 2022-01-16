package ru.skypro;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // write your code here
        //task1
        int[] arr1 = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < 30; i++) {
            summ = summ + arr1[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");

        System.out.println("Ниже сам массив:");
        //task2
        int min = arr1[0];
        int max = 0;
        int current;
        for (int i = 0; i < 30; i++) {
            current = arr1[i];
            System.out.print(current + " ");
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }
        System.out.println("\n" + "Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");

        //task3
        float average = summ / 30f;
        System.out.println("Средняя сумма трат за месяц составила "+ average + " рублей.");

        //task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

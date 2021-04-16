package geekbrains_lesson3;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        invertArray();
        System.out.println("замена");
        System.out.println("Задание 2");
        fillArray();
        System.out.println("Задание 3");
        changeArray();
        System.out.println("");
        System.out.println("Задание 4");
        fillDiagonal();
        System.out.println("Задание 5");
        flashback(4,6);

    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        for (int i = 0; i < arr.length; i++)
            System.out.print(i + "-" + arr[i] + " ");
        {
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (counter == 4) {
                    counter = 1;
                }
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static int[] flashback(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println(Arrays.toString(arr));
        }
        return arr;

        }

    }







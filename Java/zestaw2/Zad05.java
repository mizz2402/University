import java.util.Random;
import java.util.Scanner;

public class Zad05 {

    public static void main(String[] args) {
        //PodpunktA();
        //PodpunktB();
        //PodpunktC();
        PodpunktD(
                new int[][] {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        );
    }

    static void PodpunktA() {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = (i + 1) * (j + 1);

        System.out.println(array[0][0]);    // 1x1
        System.out.println(array[5][5]);    // 6/6
        System.out.println(array[9][9]);    // 10x10
    }

    static void PodpunktB() {
        byte[][] array = new byte[10][5];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = (byte) rand.nextInt(21);

        int maxIndex = 0;
        int maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            System.out.print(i + ":");
            for (int x : array[i]) {
                sum += x;
                System.out.print(" " + x);
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
            System.out.println(" suma: " + sum);
        }
        System.out.println("Największa suma jest w wierszu " + maxIndex);
    }

    static void PodpunktC() {
        double[][] array = new double[10][10];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = -0.5 + (0.5 - (-0.5)) * rand.nextDouble();

        for (int i = 0; i < array.length; i++) {
            for (double x : array[i])
                System.out.print(x + " ");
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Wyzeruj pola ujemne");
        System.out.println("2. Wyzeruj pola dodatnie");
        System.out.print("Wybrana opcja: ");
        int option = scanner.nextInt();

        if (option == 1)
            for (int i = 0; i < array.length; i++)
                for (int j = 0; j < array[i].length; j++)
                    if (array[i][j] < 0)
                        array[i][j] = 0;
        if (option == 2)
            for (int i = 0; i < array.length; i++)
                for (int j = 0; j < array[i].length; j++)
                    if (array[i][j] > 0)
                        array[i][j] = 0;

        for (int i = 0; i < array.length; i++) {
            for (double x : array[i])
                System.out.print(x + " ");
            System.out.println();
        }
    }

    static void PodpunktD(int[][] array) {
        int sum = 0;
        for (int[] arr : array)
            for (int x : arr)
                sum += x;

        int avg = sum / (int) Math.pow(array.length, 2);

        sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i][i];

        System.out.println("Średnia: " + avg);
        System.out.println("Suma elementów na przekątnej: " + sum);
    }

}

import java.util.Arrays;
import java.util.Random;

public class Zad04 {

    public static void main(String[] args) {
        int n = 100;

        double[] array = Array(n);

        double sum = 0;
        double min = 5.0;
        double max = -5.0;

        Arrays.sort(array);
        for(double x : array) {
            //średnia
            sum += x;

            //min
            if (x < min)
                min = x;

            //max
            if (x > max)
                max = x;
        }

        //mediana
        double mediana;
        if (array.length % 2 == 0)
            mediana = (array[array.length / 2] + array[array.length / 2 + 1]) / 2;
        else
            mediana = array[array.length / 2 + 1];

        double sum2 = 0;
        int sum2counter = 0;
        for (int i = 2; i < array.length; i += 2) {
            sum2 += array[i];
            sum2counter++;
        }

        System.out.println("Średnia: " + sum / array.length);
        System.out.println("Mediana: " + mediana);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Średnia 2: " + sum2 / sum2counter);
    }

    static double[] Array(int length) {
        double[] array = new double[length];

        Random rand = new Random();
        for(int i = 0; i < array.length; i++) {
            double x = -5.0 + (5.0 - (-5.0)) * rand.nextDouble();
            array[i] = x;
        }

        return array;
    }
}

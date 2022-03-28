import java.util.Random;

public class Zad02 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(10);

        int suma = 0;
        for (int x : array)
            suma += x;

        System.out.println(suma);
    }

}

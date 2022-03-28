import java.util.Random;

public class Zad01 {

    public static void main(String[] args) {
        String[] strings = Random();

        for (String s : strings) {
            System.out.println(s);
        }

    }

    static String[] Random() {
        Random rand = new Random();

        String[] array = new String[rand.nextInt(30) + 1];
        array[0] = "Długość tablicy: " + array.length;
        for (int i = 1; i < array.length; i++) {
            int length = rand.nextInt(10);
            array[i] = "";
            for (int j = 0; j < length; j++)
                array[i] += "x";
        }

        return array;
    }

}

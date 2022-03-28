public class Zad06 {

    public static void main(String[] args) {
        int[][] array1 = new int[4][];
        array1[0] = new int[] {1, 2, 3};
        array1[1] = new int[] {-1, -2, -3};
        array1[2] = new int[] {-10, 20, -30};
        array1[3] = new int[] {100, 5, -3};

        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < array1[i].length; j++)
                    if (array1[i][j] > max)
                        max = array1[i][j];
                array2[i] = max;
            } else {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < array1[i].length; j++)
                    if (array1[i][j] < min)
                        min = array1[i][j];
                array2[i] = min;
            }
        }

        for (int x : array2)
            System.out.println(x);
    }

}

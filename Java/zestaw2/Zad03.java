public class Zad03 {

    public static void main(String[] args) {
        long[] fibb = new long[100];
        fibb[0] = 1;
        fibb[1] = 1;

        for (int i = 2; i < fibb.length; i++) {
            fibb[i] = fibb[i-1] + fibb[i-2];
        }

        for(long x : fibb)
            System.out.println(x);
    }

}

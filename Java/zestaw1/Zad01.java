import java.util.*;

public class Zad01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String  string = "";

        System.out.print("Podaj n: ");
        n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ": ");
            String _string = scanner.nextLine();
            if (_string.length() > string.length())
                string = _string;
        }

        System.out.println("Najdłuższy łańcuch: \"" + string + "\" ma " + string.length() + " znaków");

        System.out.print("Podaj znak: ");
        char _char = scanner.next().charAt(0);

        int counter = 0;
        for (char c: string.toCharArray())
            if (c == _char)
                counter++;

        System.out.println("Liczba wystąpień szukanego znaku:" + counter);
    }

}

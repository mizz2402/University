import java.util.Scanner;

public class Zad03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj łańcuch: ");
        String input = scanner.nextLine();
        System.out.print("Podaj znak: ");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.print("Podaj nowy znak: ");
        char newChar = scanner.nextLine().charAt(0);

        System.out.println();
        String newString = replaceA(input, oldChar, newChar);
        System.out.println("Łańcuch po zmianie znaków: " + newString);
        System.out.println("Łańcuch po usunięciu podwójnych/potrójnych znaków: " + replaceB(input));
    }

    static String replaceA(String input, char oldChar, char newChar) {
        String output = "";

        for (char c: input.toCharArray()) {
            if (c == oldChar)
                output += newChar;
            else
                output += c;
        }

        return output;
    }

    static String replaceB(String input) {
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c > 96 && c < 100) {
                if (i + 2 < input.length() && input.charAt(i + 1) == c && input.charAt(i + 2) == c)
                    i += 2;
                else if (i + 1 < input.length() && input.charAt(i + 1) == c)
                    i += 1;
            }
            output += c;
        }

        return output;
    }
}

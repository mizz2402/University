import java.util.Scanner;

public class Zad05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj łańcuch: ");
        String string = scanner.nextLine();
        System.out.print("Podaj przesunięcie: ");
        byte shift = scanner.nextByte();
        System.out.println(caesar(string, shift));
    }

    static String caesar(String input, byte shift) {
        String output = "";

        for (char c: input.toCharArray()) {
            if (c >= 65 && c <= 90)
                c += (c + shift > 90) ? shift - 26 : shift;
            if (c >= 97 && c <= 122)
                c += (c + shift > 122) ? shift - 26 : shift;
            output += c;
        }

        return output;
    }

}

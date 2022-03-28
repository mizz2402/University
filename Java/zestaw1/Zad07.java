public class Zad07 {
    public static void main(String[] args) {
        String[] input = {"abc", "def", "ghi", "jkl"};
        char separator = ' ';
        System.out.println(Join(separator, input));
    }

    static String Join(char separator, String[] input) {
        String output = input[0];

        for (int i = 1; i < input.length; i++) {
            output += separator + input[i];
        }

        return output;
    }
}

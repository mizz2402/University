import java.util.*;

public class Zad06 {
    public static void main(String[] args) {
        String input = "abc,def,ghi jkl";
        char[] separators = { ',', '.', ' ' };
        String[] output = Split(input, separators);

        for (String str: output) {
            System.out.println(str);
        }
    }

    static String[] Split(String string, char[] separators) {
        List<String> stringsList = new ArrayList<String>();
        int length = 0;     // array length

        int begIndex = 0;   // begining index of next substring
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < separators.length; j++) {
                if (string.charAt(i) == separators[j]) {
                    stringsList.add(string.substring(begIndex, i));
                    begIndex = i + 1;
                }
            }
        }
        stringsList.add(string.substring(begIndex));

        String[] strings = new String[stringsList.size()];
        strings = stringsList.toArray(strings);
        return strings;
    }
}

public class Zad08 {

    public static void main(String[] args) {
        String input = "Kamil Ślimak";
        System.out.println("isPalindrome: " + isPalindrome(input));
    }

    static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        String str = "";

        // leave letters only
        for (char c: input.toCharArray())
            if (Character.isLetter(c))
                str += c;

        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
            else
                break;

        return true;
    }

}

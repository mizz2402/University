public class Zad02 {

    public static void main(String[] args) {
        String str = "abc";
        MyString string = new MyString(str);

        // compareTo()
        System.out.println("compareTo()");
        System.out.println(str.compareTo("abcde"));
        System.out.println(string.compareTo("abcde"));
        System.out.println();

        // endsWith()
        System.out.println("endsWith()");
        System.out.println(str.endsWith("bc"));
        System.out.println(string.endsWith("bc"));
        System.out.println();

        // indexOf()
        System.out.println("indexOf()");
        System.out.println(str.indexOf("bc"));
        System.out.println(string.indexOf("bc"));
        System.out.println();

        // replace()
        System.out.println("replace()");
        System.out.println(str.replace('a', 'A'));
        System.out.println(string.replace('a', 'A'));
        System.out.println();

        // substring()
        System.out.println("substring()");
        System.out.println(str.substring(2));
        System.out.println(string.substring(2));
    }

}

class MyString {
    String str;

    public MyString(String str) {
        this.str = str;
    }

    int compareTo(String _str) {
        int value = 0;

        int length = 0;
        if (str.length() < _str.length())
            length = str.length();
        else
            length = _str.length();

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != _str.charAt(i)) {
                value = str.charAt(i) - _str.charAt(i);
                break;
            }
        }

        value += str.length() - _str.length();

        return value;
    }

    boolean endsWith (String _str) {
        // length difference
        int ld = str.length() - _str.length();

        if (ld < 0)
            return false;

        for (int i = 0; i < _str.length(); i++)
            if (str.charAt(ld + i) != _str.charAt(i))
                return false;

        return true;
    }

    int indexOf(String _str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < _str.length(); j++) {
                if (i + j >= str.length() || str.charAt(i + j) != _str.charAt(j))
                    break;
                else if (j == _str.length() - 1)
                    return i;
            }
        }

        return -1;
    }

    String replace(char oldChar, char newChar) {
        String newString = "";

        for (char c: str.toCharArray()) {
            if (c == oldChar)
                newString += newChar;
            else
                newString += c;
        }

        return newString;
    }

    String substring (int beginindex) {
        String newString = "";

        for (int i = beginindex; i < str.length(); i++)
            newString += str.charAt(i);

        return newString;
    }
}
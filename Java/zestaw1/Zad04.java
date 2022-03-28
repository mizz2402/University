public class Zad04 {

    public static void main(String[] args) {
        MyString str = new MyString("ABCDEFGHIJKLMNOPRQRSTUVWYZ zxc!");
        System.out.println(str.toLowerCase());
        str.str = "abcdefghijklmnoprqrstuvwyz ZXC!";
        System.out.println(str.toUpperCase());
    }



}

class MyString {
    String str;

    public MyString(String str) {
        this.str = str;
    }

    String toLowerCase() {
        String output = "";

        for (char c: str.toCharArray()) {
            if (c >= 65 && c <= 90)
                c += 32;
            output += c;
        }

        return output;
    }

    String toUpperCase() {
        String output = "";

        for (char c: str.toCharArray()) {
            if (c >= 97 && c <= 122)
                c -= 32;
            output += c;
        }

        return output;
    }
}

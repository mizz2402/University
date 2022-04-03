package Zad01;

public class Main {

    public static void main(String[] args) {
        Punkt3D p1 = new Punkt3D(2f, 4f, 5f);

        p1.setX(3f);
        System.out.println(p1.getX());

        System.out.println(p1.euclideanDistance());
    }

}

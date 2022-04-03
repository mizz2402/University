package Zad01;

public class Punkt3D {

    private double x, y, z;

    public Punkt3D() {
        x = 0f;
        y = 0f;
        z = 0f;
    }

    public Punkt3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // getters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // setters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double euclideanDistance() {
        double result = 0;

        result = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
        result = Math.sqrt(result);

        return result;
    }
}

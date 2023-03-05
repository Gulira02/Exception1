public class Cylinder {
    private final double PI=3.14;
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public Cylinder(){}

    public double getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double squareCylinder(){
        return 2*PI * radius*( height + radius);
    }
    public double volumeCylinder(){
        return (PI*radius*radius*height);
    }
}

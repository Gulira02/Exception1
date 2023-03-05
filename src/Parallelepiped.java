public class Parallelepiped {

    private double height;
    private double  width;
    private double length;

    public Parallelepiped(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }


    public Parallelepiped(){}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public int squareParallelepiped(){
        return (int) (2*((height * length) + (length * width) + (height * width)));
    }
    public double volumeParallelepiped(){
        return (length*width*height);
    }
}

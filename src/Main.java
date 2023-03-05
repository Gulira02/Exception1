import java.io.FileWriter;
import java.io.IOException;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        Parallelepiped parallelepiped = new Parallelepiped();
        System.out.println("height: ");
        parallelepiped.setHeight(scanner.nextDouble());
        System.out.println("width: ");
        parallelepiped.setWidth(scanner.nextDouble());
        System.out.println("length: ");
        parallelepiped.setLength(scanner.nextDouble());



            try {

                if (parallelepiped.squareParallelepiped() < 0 && parallelepiped.volumeParallelepiped()<0) {
                    throw  new MyException();
            }
                else{
                    System.out.println("square: "+parallelepiped.squareParallelepiped());
                    System.out.println("volume: "+parallelepiped.volumeParallelepiped());
                }
            }
            catch (MyException e) {
                System.err.println(e+" Negative number");
            }


        try {
            System.out.println("height: ");
            parallelepiped.setHeight(scanner.nextDouble());
            System.out.println("width: ");
            parallelepiped.setWidth(scanner.nextDouble());
            System.out.println("length: ");
            parallelepiped.setLength(scanner.nextDouble());


                System.out.println(parallelepiped.squareParallelepiped());
                System.out.println("volume: "+parallelepiped.volumeParallelepiped());

        }
        catch (InputMismatchException e) {
            e.printStackTrace();
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        Cylinder cylinder=new Cylinder();

        try {

            if (cylinder.squareCylinder() < 0 && cylinder.volumeCylinder()<0) {
                throw  new MyException();
            }
            else{
                System.out.println("square: "+cylinder.squareCylinder());
                System.out.println("volume: "+cylinder.volumeCylinder());
            }
        }
        catch (MyException e) {
            System.err.println(e+" Negative number");
        }

        try {
            System.out.println("radius: ");
            cylinder.setRadius(scanner.nextInt());
            System.out.println("height: ");
            cylinder.setHeight(scanner.nextInt());

            System.out.println("square: "+cylinder.squareCylinder());
            System.out.println("volume: "+cylinder.volumeCylinder());

        }
        catch (InputMismatchException e) {
            e.printStackTrace();
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }


    }
    }

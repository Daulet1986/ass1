package aitu.java;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class AssignmentOne {
    public static void main(String[] args) throws FileNotFoundException{

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Scanner sc1 = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);

        int x1, y1;
        int x2, y2;
        Shape shape1 = new Shape();

        System.out.println("X,Y coordinates:");
        while(sc1.hasNextLine()) {
            String line = sc1.nextLine();
            String[] numbers = line.split(", ");
            x1 = Integer.parseInt(numbers[0]);
            y1 = Integer.parseInt(numbers[1]);
            Point point1 = new Point(x1,y1);
            shape1.addPoint(point1);
            System.out.println("x:" + x1 + ", y:" + y1);
        }
        System.out.println("Perimeter of 1st shape: " + shape1.calculatePerimeter());
        System.out.println("Longest side of 1st shape: " + shape1.LongSide());
        System.out.println("Average side length of 1st shape: " + shape1.AvLength());
        System.out.println("\n");

        System.out.println("X,Y coordinates:");
        Shape shape2 = new Shape();
        while(sc2.hasNextLine()) {
            String line = sc2.nextLine();
            String[] numbers = line.split(", ");
            x2 = Integer.parseInt(numbers[0]);
            y2 = Integer.parseInt(numbers[1]);
            Point point2 = new Point(x2,y2);
            shape2.addPoint(point2);
            System.out.println("x:" + x2 + ", y:" + y2);
        }
        System.out.println("Perimeter of 2nd shape: " + shape2.calculatePerimeter());
        System.out.println("Longest side of 2st shape: " + shape2.LongSide());
        System.out.println("Average side length of 2st shape: " + shape2.AvLength());
    }
}

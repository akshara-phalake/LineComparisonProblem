package com.example.linecomparison;
import javax.sound.sampled.Line;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates of line L1");
        Point p1 = new Point();
        System.out.println("Enter the value of x1 : ");
        p1.x = in.nextInt();
        System.out.println("Enter the value of y1 : ");
        p1.y = in.nextInt();
        Point p2 = new Point();
        System.out.println("Enter the value of x2 : ");
        p2.x = in.nextInt();
        System.out.println("Enter the value of y2 : ");
        p2.y = in.nextInt();
        LineLength l1 = new LineLength();
        l1.p1 = p1;
        l1.p2 = p2;

        System.out.println("Enter coordinates of line L2");
        Point p3 = new Point();
        System.out.println("Enter the value of x3 : ");
        p3.x = in.nextInt();
        System.out.println("Enter the value of y3 : ");
        p3.y = in.nextInt();
        Point p4 = new Point();
        System.out.println("Enter the value of x4 : ");
        p4.x = in.nextInt();
        System.out.println("Enter the value of y4 : ");
        p4.y = in.nextInt();
        LineLength l2 = new LineLength();
        l2.p1 = p3;
        l2.p2 = p4;
        //Calculate length of lines
        l1.length = (Double) l1.getLength();
        l2.length = (Double) l2.getLength();
        //Print length of lines
        System.out.println("Line 1 = " + l1.length);
        System.out.println("Line 2 = " + l2.length);
        //CompareTo
        int check = l1.length.compareTo(l2.length);
        if (check == 0) {
            System.out.println("Both lines L1 and L2 are equal.");
        }
        else if (check > 0) {
            System.out.println("Line L1 is greater than Line L2.");
        }
        else {
            System.out.println("Line L1 is less than Line L2.");
        }
    }
}

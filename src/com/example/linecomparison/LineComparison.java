package com.example.linecomparison;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x1 : ");
        int x1 = in.nextInt();
        System.out.println("Enter the value of y1 : ");
        int y1 = in.nextInt();
        System.out.println("Enter the value of x2 : ");
        int x2 = in.nextInt();
        System.out.println("Enter the value of y2 : ");
        int y2 = in.nextInt();

        double dist = Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));

        System.out.println("Length of the line is : "+dist);
    }
}

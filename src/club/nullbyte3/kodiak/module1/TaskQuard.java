package club.nullbyte3.kodiak.module1;

import java.util.Scanner;

public class TaskQuard {

    public static void main(String[] args) {
        System.out.println("Enter the coefficients value for A:");
        double a = Double.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Enter the value for B:");
        double b = Double.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Enter the value for C:");
        double c = Double.valueOf(new Scanner(System.in).nextLine());
        // if a < 0 it's invalid, no roots, we don't have to compute, but I am lazy, -Wissam.
        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("No real roots");
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("The root is " + x);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are " + x1 + " and " + x2);
        }
    }

}

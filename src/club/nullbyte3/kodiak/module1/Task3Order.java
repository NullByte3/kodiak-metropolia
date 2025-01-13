package club.nullbyte3.kodiak.module1;

import java.util.Scanner;

public class Task3Order {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third) / 3.0);
        // basically, the length is 3, so we can just divide by 3.0, why 3.0? Because it'll make it a double and be more accurate,
        // afaik in Java, Double is unlimited, it can be 8 GB, if you have 8 GB of ram.
        // Integer is only 32 bits, and it won't be like float.
        // float is 32 bits as well.

    }
}

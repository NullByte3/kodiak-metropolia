package club.nullbyte3.kodiak.module1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskNoDuplicates {

    public static void main(String[] args) {
        // This is pretty stupid as we can use a Set or a for-loop, but I'm going to use a Set as it's pretty easy and I already know how to use a for-loop.
        // Been doing Java since forever -Wissam.
        Set<Integer> nums = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            System.out.printf("Enter a number %s: ", (i + 1));
            nums.add(new Scanner(System.in).nextInt());
        }
        System.out.println("The array without duplicates: ");
        String s = nums.toString();
        System.out.println(s.substring(1, s.length() - 1));
    }
}

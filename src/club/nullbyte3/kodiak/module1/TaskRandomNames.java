package club.nullbyte3.kodiak.module1;

import java.util.Scanner;

public class TaskRandomNames {
    public static void main(String[] args) {
        String[] names = {"Wissam", "John", "Jane", "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};

        System.out.print("How many names would you like: ");
        int totalNames = new Scanner(System.in).nextInt();
        for (int i = 0; i < totalNames; i++) {
            String randomName = names[(int) (Math.random() * names.length)] + " " + lastNames[(int) (Math.random() * lastNames.length)];
            System.out.println(randomName);
        }
    }
}

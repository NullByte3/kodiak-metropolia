package club.nullbyte3.kodiak.module1;

import java.util.Scanner;

public class TaskBinaries {

    public static void main(String[] args) {
        int total = 0;
        System.out.println("Enter the binary numbers:");
        String bits = new Scanner(System.in).nextLine();
        for (int i = 0; i < bits.length(); i++) {
            char c = bits.charAt(i);
            if (c == '1') {
                total += Math.pow(2, bits.length() - i - 1);
            }
        }
        System.out.println("The decimal value is " + total);
    }

}

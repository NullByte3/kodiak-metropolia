package club.nullbyte3.kodiak.module1;

import java.util.Scanner;

public class TaskLH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIdx = 0, endIdx = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIdx = i;
                    endIdx = j;
                }
            }
        }

        System.out.println("Maximum sum in sub-array: " + maxSum);
        System.out.print("Integers: " + (startIdx + 1) + "-" + (endIdx + 1));
    }
}

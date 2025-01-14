package club.nullbyte3.kodiak.module1;

public class TaskPrime {

    public static void main(String[] args) {
        System.out.println("Enter a start number:");
        int start = Integer.valueOf(new java.util.Scanner(System.in).nextLine());
        System.out.println("Enter a end number:");
        int end = Integer.valueOf(new java.util.Scanner(System.in).nextLine());
        while (start <= end) {
            if (isPrime(start)) {
                System.out.println(start);
            }
            start++;
        }
        System.out.println("Done");
    }

    // thanks to https://www.geeksforgeeks.org/java-prime-number-program/
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}

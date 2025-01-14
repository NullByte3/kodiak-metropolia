package club.nullbyte3.kodiak.module1;

import java.util.Scanner;

public class TaskHypotenuse {

    public static void main(String[] args) {
        System.out.println("Give the length of the leg:");
        double legA = Double.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Give the length of the other leg:");
        double legB = Double.valueOf(new Scanner(System.in).nextLine());
        double hypotenuse = Math.sqrt(legA * legA + legB * legB);
        System.out.println("The hypotenuse is " + hypotenuse);
    }

}

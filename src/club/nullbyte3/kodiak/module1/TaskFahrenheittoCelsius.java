package club.nullbyte3.kodiak.module1;

import java.util.Scanner;

public class TaskFahrenheittoCelsius {

    public static void main(String[] args) {
        System.out.println("Give a temperature in Fahrenheit:");
        double fahrenheit = Double.valueOf(new Scanner(System.in).nextLine());
        // Shitty scanner.nextDouble() is broken, 103.4 isn't a Double?
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + " Fahrenheit is " + String.format("%.1f", celsius) + " Celsius.");
    }

}

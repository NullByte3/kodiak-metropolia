package club.nullbyte3.kodiak.m34;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "data.csv";
        int sequenceLength = 60;

        long[] fibonacci = new long[sequenceLength];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < sequenceLength; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < sequenceLength; i++) {
                writer.write(Long.toString(fibonacci[i]));
                if (i < sequenceLength - 1) {
                    writer.write(",");
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

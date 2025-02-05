package club.nullbyte3.kodiak.m34;

import java.io.*;
import java.net.URL;

public class Task1 {
    public static void main(String[] args) {
        String urlString = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        String delimiter = ";";
        String targetDate = "01.01.2023";
        int ulkoTaloColumnIndex = 1;
        double totalTemperature = 0;
        int validRowCount = 0;

        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] columns = line.split(delimiter);
                String date = columns[0].split(" ")[0];

                if (targetDate.equals(date)) {
                    try {
                        double temperature = Double.parseDouble(columns[ulkoTaloColumnIndex].replace(',', '.'));
                        totalTemperature += temperature;
                        validRowCount++;
                    } catch (NumberFormatException e) {
                        System.err.println("Skipping invalid temperature value: " + columns[ulkoTaloColumnIndex]);
                    }
                }
            }

            reader.close();

            if (validRowCount > 0) {
                double averageTemperature = totalTemperature / validRowCount;
                System.out.printf("Average temperature for %s: %.2f °C%n", targetDate, averageTemperature);
            } else {
                System.out.println("No valid temperature data found for the specified date.");
            }
        } catch (IOException e) {
            System.err.println("Error while reading the file from the network: " + e.getMessage());
        }
    }
}
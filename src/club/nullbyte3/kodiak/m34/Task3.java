package club.nullbyte3.kodiak.m34;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        String fileName = "enrollments.ser";
        Student student = new Student(1, "Wissam", 18);
        Course course = new Course("cs4j", "java stuff", "Matti");
        Enrollment enrollment = new Enrollment(student, course, "2023-10-01");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(enrollment);
            oos.close();
            System.out.println("Saved to " + fileName);
        } catch (IOException e) {
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            Enrollment deserializedEnrollment = (Enrollment) ois.readObject();
            ois.close();
            System.out.println("Done serializing: " + deserializedEnrollment);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
package club.nullbyte3.kodiak.m34;

import java.io.Serializable;

public class Course implements Serializable {
    private final String courseCode;
    private final String courseName;
    private final String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String toString() {
        return "Course{courseCode='" + courseCode + "', courseName='" + courseName + "', instructor='" + instructor + "'}";
    }
}

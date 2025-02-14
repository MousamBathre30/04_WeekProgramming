package dataStreams;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentDetailsTest {

    @Test
    void testStudentDataStorage() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("student_data", ".bin");

        // Create student list
        List<Student> students = Arrays.asList(
                new Student(101, "Alice", 3.8),
                new Student(102, "Bob", 3.6),
                new Student(103, "Charlie", 3.9)
        );

        // Write student details to the file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(tempFile))) {
            for (Student student : students) {
                dos.writeInt(student.rollNumber);
                dos.writeUTF(student.name);
                dos.writeDouble(student.GPA);
            }
        }

        // Read student details from the file and verify
        try (DataInputStream dis = new DataInputStream(new FileInputStream(tempFile))) {
            for (Student expectedStudent : students) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double GPA = dis.readDouble();

                assertEquals(expectedStudent.rollNumber, rollNumber);
                assertEquals(expectedStudent.name, name);
                assertEquals(expectedStudent.GPA, GPA);
            }
        }
    }
}

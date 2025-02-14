package dataStreams;

import java.io.*;
import java.util.*;

class Student {
    int rollNumber;
    String name;
    double GPA;

    // Constructor
    public Student(int rollNumber, String name, double GPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.GPA = GPA;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // File where student details will be stored
        String filename = "src/main/java/java_100_words.txt";

        // List of students to store
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", 3.8));
        students.add(new Student(102, "Bob", 3.6));
        students.add(new Student(103, "Charlie", 3.9));

        // Write student details to the binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (Student student : students) {
                dos.writeInt(student.rollNumber);    // Write roll number
                dos.writeUTF(student.name);          // Write name
                dos.writeDouble(student.GPA);        // Write GPA
            }
            System.out.println("Student details have been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read student details from the binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();        // Read roll number
                String name = dis.readUTF();           // Read name
                double GPA = dis.readDouble();         // Read GPA

                // Display student details
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("GPA: " + GPA);
                System.out.println("---------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

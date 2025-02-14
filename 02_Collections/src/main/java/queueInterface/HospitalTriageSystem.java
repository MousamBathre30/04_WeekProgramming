package queueInterface;

import java.util.PriorityQueue;
import java.util.Queue;


import java.util.PriorityQueue;

public class HospitalTriageSystem {

    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();

        // Adding patients to the priority queue
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        // Retrieving patients in the order of severity (higher severity first)
        while (!pq.isEmpty()) {
            Patient patient = pq.poll();
            System.out.println("Treating patient: " + patient.name);
        }
    }

    // Patient class representing a patient with name and severity
    static class Patient implements Comparable<Patient> {
        String name;
        int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public int compareTo(Patient other) {
            // Compare patients based on severity (higher severity first)
            return Integer.compare(other.severity, this.severity);
        }
    }
}


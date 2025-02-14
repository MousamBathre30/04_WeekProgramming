package queueInterface;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.PriorityQueue;

class HospitalTriageSystemTest {

    @Test
    void testPatientPriorityOrder() {
        PriorityQueue<HospitalTriageSystem.Patient> pq = new PriorityQueue<>();

        // Adding patients to the priority queue
        pq.add(new HospitalTriageSystem.Patient("John", 3));
        pq.add(new HospitalTriageSystem.Patient("Alice", 5));
        pq.add(new HospitalTriageSystem.Patient("Bob", 2));

        // Expected order: Alice (5), John (3), Bob (2)
        assertEquals("Alice", pq.poll().name);
        assertEquals("John", pq.poll().name);
        assertEquals("Bob", pq.poll().name);
    }

    @Test
    void testEmptyQueue() {
        PriorityQueue<HospitalTriageSystem.Patient> pq = new PriorityQueue<>();
        assertNull(pq.poll()); // Should return null since the queue is empty
    }
}

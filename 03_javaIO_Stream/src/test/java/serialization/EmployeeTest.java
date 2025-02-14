package serialization;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SerializationTest {

    @Test
    void testSerializationAndDeserialization() {
        Employee employee = new Employee("Alice", "A1", "Maths", 1200);
        String fileName = "test_employee.ser";

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employee);
        } catch (IOException e) {
            fail("Serialization failed: " + e.getMessage());
        }

        // Deserialization
        Employee deserializedEmployee = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            deserializedEmployee = (Employee) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            fail("Deserialization failed: " + e.getMessage());
        }

        // Assertions to check if the object is correctly deserialized
        assertNotNull(deserializedEmployee);
        assertEquals(employee.name, deserializedEmployee.name);
        assertEquals(employee.id, deserializedEmployee.id);
        assertEquals(employee.department, deserializedEmployee.department);
        assertEquals(employee.salary, deserializedEmployee.salary);
    }
}

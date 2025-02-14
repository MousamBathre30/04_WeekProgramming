package mapInterface;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeGrouperTest {

    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> expectedOutput = new HashMap<>();
        expectedOutput.put("HR", Arrays.asList(new Employee("Alice", "HR"), new Employee("Carol", "HR")));
        expectedOutput.put("IT", Collections.singletonList(new Employee("Bob", "IT")));

        assertEquals(expectedOutput, EmployeeGrouper.groupByDepartment(employees));
    }

    @Test
    void testGroupByDepartmentEmptyList() {
        List<Employee> employees = new ArrayList<>();
        Map<String, List<Employee>> expectedOutput = new HashMap<>();

        assertEquals(expectedOutput, EmployeeGrouper.groupByDepartment(employees));
    }

    @Test
    void testGroupByDepartmentUniqueDepartments() {
        List<Employee> employees = Arrays.asList(
                new Employee("Mike", "Finance"),
                new Employee("John", "Marketing"),
                new Employee("Sarah", "Engineering")
        );

        Map<String, List<Employee>> expectedOutput = new HashMap<>();
        expectedOutput.put("Finance", Collections.singletonList(new Employee("Mike", "Finance")));
        expectedOutput.put("Marketing", Collections.singletonList(new Employee("John", "Marketing")));
        expectedOutput.put("Engineering", Collections.singletonList(new Employee("Sarah", "Engineering")));

        assertEquals(expectedOutput, EmployeeGrouper.groupByDepartment(employees));
    }

    @Test
    void testGroupByDepartmentSameDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Anna", "HR"),
                new Employee("Emma", "HR"),
                new Employee("Jack", "HR")
        );

        Map<String, List<Employee>> expectedOutput = new HashMap<>();
        expectedOutput.put("HR", Arrays.asList(
                new Employee("Anna", "HR"),
                new Employee("Emma", "HR"),
                new Employee("Jack", "HR")
        ));

        assertEquals(expectedOutput, EmployeeGrouper.groupByDepartment(employees));
    }
}

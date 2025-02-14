package serialization;


import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Add serialVersionUID for compatibility
    String name;
    String id;
    String department;
    double salary;

    public Employee(String name, String id , String department , double salary) {
        this.name = name;
        this.id = id ;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', id=" + id + "', department=" + department + "',salary="+salary+" ";};
    }


public class ObjectStream {
    public static void main(String[] args) {
        Employee  employee = new Employee("Alice" ,"A1","Maths",1200);
        Employee employee1 = new  Employee("Bob" ,"A2","Maths",1200);
        Employee employee2 = new  Employee("David" ,"A3","Maths",1200);
        Employee employee3 = new  Employee("Rees" ,"A4","Maths",1200);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(employee);
            oos.writeObject(employee1);
            oos.writeObject(employee2);
            oos.writeObject(employee3);
            System.out.println("Objects serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization (Reading all objects)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            while (true) { // Loop until EOFException occurs
                try {
                    Employee deserializedEmployee = (Employee) ois.readObject();
                    System.out.println("Deserialized Object: " + deserializedEmployee);
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

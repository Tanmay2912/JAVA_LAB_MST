package Multithread.com;

import java.util.*;

class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}

class EmployeeMap {
    private HashMap<Integer, String> employees = new HashMap<>();

    public void addEmployee(int id, String name) {
        employees.put(id, name);
        System.out.println("Employee added: ID=" + id + ", Name=" + name);
    }

    public String getEmployee(int id) throws EmployeeNotFoundException {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException("Employee ID not found!");
        }
        return employees.get(id);
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the map.");
        } else {
            System.out.println("Employee Map: " + employees);
        }
    }
}

public class LabMST2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeMap map = new EmployeeMap();
        int choice;

        do {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Retrieve Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    map.addEmployee(id, name);
                    break;

                case 2:
                    System.out.print("Enter Employee ID to retrieve: ");
                    int searchId = sc.nextInt();
                    try {
                        String empName = map.getEmployee(searchId);
                        System.out.println("Employee Name: " + empName);
                    } catch (EmployeeNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    map.displayEmployees();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

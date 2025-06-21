//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        manager.addEmployee(new Employee(1, "Alice", "Engineer", 70000));
        manager.addEmployee(new Employee(2, "Bob", "Manager", 90000));
        manager.addEmployee(new Employee(3, "Charlie", "Analyst", 60000));

        System.out.println("All Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for Employee ID 2:");
        System.out.println(manager.searchEmployee(2));

        System.out.println("\nDeleting Employee ID 2:");
        manager.deleteEmployee(2);

        System.out.println("\nAll Employees After Deletion:");
        manager.traverseEmployees();
    }
}


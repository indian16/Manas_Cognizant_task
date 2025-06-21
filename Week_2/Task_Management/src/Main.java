//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Taskmanager manager=new Taskmanager();
        manager.addtask(new Task(1, "Design UI", "Pending"));
        manager.addtask(new Task(2, "Develop Backend", "In Progress"));
        manager.addtask(new Task(3, "Write Tests", "Pending"));

        System.out.println("All Tasks:");
        manager.traversetask();

        System.out.println("Search for task id 3");
        System.out.println(manager.search(3));

        System.out.println("\nDeleting Task ID 3:");
        manager.deletetask(3);

        System.out.println("\nAll Tasks After Deletion:");
        manager.traversetask();
    }
}
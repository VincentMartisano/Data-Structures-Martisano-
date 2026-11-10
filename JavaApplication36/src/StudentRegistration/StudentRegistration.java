 package StudentRegistration;
import java.util.*;
public class StudentRegistration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> studentIDs = new HashSet<>();
        HashMap<Integer, String> students = new HashMap<>();
        TreeMap<Integer, String> sortedStudents = new TreeMap<>();

        System.out.println("=== STUDENT REGISTRATION ===");

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Student ID " + i + ": ");
            int id = sc.nextInt();
            sc.nextLine();

            if (studentIDs.contains(id)) {
                System.out.println("Duplicate ID! Registration rejected.");
            } else {

                studentIDs.add(id);

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                students.put(id, name);

                System.out.println("Student registered successfully!");
            }

            System.out.println();
        }

        // Display unique students
        System.out.println("\n=== REGISTERED STUDENTS ===");

        for (int id : students.keySet()) {
            System.out.println("ID: " + id +
                    " | Name: " + students.get(id));
        }

        // Display total unique students
        System.out.println("\nTotal Unique Students: "
                + studentIDs.size());

        // Sort IDs using TreeMap
        sortedStudents.putAll(students);

        System.out.println("\n=== STUDENTS IN ASCENDING ORDER ===");

        for (int id : sortedStudents.keySet()) {
            System.out.println("ID: " + id +
                    " | Name: " + sortedStudents.get(id));
        }

        sc.close();
    }
}

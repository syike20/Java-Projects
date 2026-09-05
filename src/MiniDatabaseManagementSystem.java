import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private final String name;
    private final int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}

public class MiniDatabaseManagementSystem {

    // --- FILE I/O METHODS ---

    public static void loadDatabase(ArrayList<Student> database) {
        try {
            File file = new File("students.txt");

            if (file.exists()) {
                Scanner fileReader = new Scanner(file);

                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    String[] parts = line.split(",");

                    int loadedId = Integer.parseInt(parts[0]);
                    String loadedName = parts[1];

                    database.add(new Student(loadedName, loadedId));
                }

                fileReader.close();
                System.out.println(">>> Previous database loaded successfully.");
            } else {
                System.out.println(">>> No existing database found. Starting fresh.");
            }
        } catch (Exception e) {
            System.out.println(">>> Error reading the database file.");
        }
    }

    public static void saveDatabase(ArrayList<Student> database) {
        try {
            FileWriter writer = new FileWriter("students.txt");

            for (Student data : database) {
                // We save it as "id,name" so it's easy to split later
                writer.write(data.getId() + "," + data.getName() + "\n");
            }

            writer.close();
            System.out.println(">>> Database successfully saved to disk.");

        } catch (Exception e) {
            System.out.println(">>> Critical Error: Could not save to database.");
        }
    }

    // --- MAIN PROGRAM ---

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> database = new ArrayList<>();

        // 1. Load existing data before the menu even starts
        loadDatabase(database);

        int choice;
        String name;
        int id;

        do {
            System.out.println("\n-----------------");
            System.out.println("     M E N U    ");
            System.out.println("-----------------");
            System.out.println("1. Add New Student (Press 1)");
            System.out.println("2. View All Students (Press 2)");
            System.out.println("3. Exit (Press 3)");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter your name: ");
                scanner.nextLine(); // Clear the newline trap
                name = scanner.nextLine();

                System.out.print("Enter your ID: ");
                try {
                    id = scanner.nextInt();
                    Student student = new Student(name, id);
                    database.add(student);
                    System.out.println("Student added!");
                } catch (Exception e) {
                    System.out.println("Invalid ID format! Student not added.");
                    scanner.nextLine(); // Clear the broken input
                }

            } else if (choice == 2) {
                System.out.println("\n--- Student Records ---");
                if (database.size() == 0) {
                    System.out.println("Database is empty.");
                } else {
                    for (Student data : database) {
                        System.out.println("ID: " + data.getId() + " | Name: " + data.getName());
                    }
                }
            } else if (choice == 3) {
                System.out.println("Shutting down database...");
                // 2. Save all data right before the program terminates
                saveDatabase(database);
            } else {
                System.out.println("Enter a Valid Choice !");
            }
        } while (choice != 3);

        scanner.close(); // Good practice to close the main scanner!
    }
}
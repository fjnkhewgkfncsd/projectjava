public class Main {
    public static void main(String[] args) {
        // Creating Lecturer objects and adding them to the list
        Lecturer lecturer1 = new Lecturer(1, "John Doe", "Male", "john.doe@example.com", "123 Street, City", "1234567890", "Computer Science", 50000.0);
        Lecturer lecturer2 = new Lecturer(2, "Jane Smith", "Female", "jane.smith@example.com", "456 Avenue, City", "0987654321", "Mathematics", 52000.0);

        Lecturer.addLecturer(lecturer1);
        Lecturer.addLecturer(lecturer2);

        // Displaying all lecturers
        System.out.println("List of all lecturers:");
        Lecturer.displayAllLecturers();

        // Removing a lecturer by ID
        Lecturer.removeLecturerById(1);
        System.out.println("\nAfter removing lecturer with ID 1:");
        Lecturer.displayAllLecturers();

        // Displaying total number of lecturers
        System.out.println("\nTotal Lecturers: " + Lecturer.getTotalLecturers());
    }
}

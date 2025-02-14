import java.util.ArrayList;

public class Lecturer {
    private static int totalLecturers = 0;  // Static variable to track total number of lecturers
    private int id;
    private String name;
    private String gender;
    private String email;
    private String address;
    private String phone_num;
    private String specialization;
    private double salary;

    private static ArrayList<Lecturer> lecturerList = new ArrayList<>();

    public Lecturer(int id, String name, String gender, String email, String address, String phone_num, String specialization, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phone_num = phone_num;
        this.specialization = specialization;
        this.salary = salary;
        totalLecturers++;  
    }

    // Static method to get the total number of lecturers
    public static int getTotalLecturers() {
        return totalLecturers;
    }

    // Getters for instance variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phone_num;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    // Method to add a lecturer to the ArrayList
    public static void addLecturer(Lecturer lecturer) {
        lecturerList.add(lecturer);
    }

    // Method to remove a lecturer from the ArrayList by ID
    public static void removeLecturerById(int id) {
        lecturerList.removeIf(lecturer -> lecturer.getId() == id);
    }

    // Method to get a lecturer by ID
    public static Lecturer getLecturerById(int id) {
        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getId() == id) {
                return lecturer;
            }
        }
        return null; 
    }

    // Method to display all lecturers with all attributes
    public static void displayAllLecturers() {
        for (Lecturer lecturer : lecturerList) {
            System.out.println(
                "ID: " + lecturer.getId() + ", " + 
                "Name: " + lecturer.getName() + ", " +
                "Gender: " + lecturer.getGender() + ", " +
                "Email: " + lecturer.getEmail() + ", " +
                "Address: " + lecturer.getAddress() + ", " +
                "Phone Number: " + lecturer.getPhoneNum() + ", " +
                "Specialization: " + lecturer.getSpecialization() + ", " +
                "Salary: " + lecturer.getSalary()
            );
        }
    }

    // Method to get the list of all lecturers
    public static ArrayList<Lecturer> getLecturerList() {
        return lecturerList;
    }
}
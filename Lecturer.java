import java.util.ArrayList;

public class Lecturer implements manage {
    private static int totalLecturers = 0;  
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
        lecturerList.add(this);  // Automatically add lecturer to list
    }

    public static int getTotalLecturers() {
        return totalLecturers;
    }

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

    public static void addLecturer(Lecturer lecturer) {
        lecturerList.add(lecturer);
    }

    public static void removeLecturerById(int id) {
        boolean removed = lecturerList.removeIf(lecturer -> lecturer.getId() == id);
        if (removed) totalLecturers--;  
    }

    public static Lecturer getLecturerById(int id) {
        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getId() == id) {
                return lecturer;
            }
        }
        return null; 
    }

    public static void displayAllLecturers() {
        for (Lecturer lecturer : lecturerList) {
            System.out.println(lecturer);
        }
    }

    public static ArrayList<Lecturer> getLecturerList() {
        return lecturerList;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Gender: " + gender +
               ", Email: " + email +
               ", Address: " + address +
               ", Phone Number: " + phone_num +
               ", Specialization: " + specialization +
               ", Salary: " + salary;
    }
    @Override
        public boolean login(String username,String password){
            return true;
        }
        public boolean signup(String name,String password,String phonenumber,char sex,String dob,String email){
            return true;
        }
        public void checkAttendent(String username,String password){
            return;
        }

}


import java.util.ArrayList;

public class Staff {
    private int staffId;
    String firstName;
    String lastName;
    String position;
    String gender;
    String dateOfBirth;  
    String phoneNumber;
    String email;
    private String password;
    String hireDate;
    String EndDate;
    private double salary;

    static int totalStaffCount = 0;
    static ArrayList<Staff> staffList = new ArrayList<>();

    public Staff(String firstName, String lastName, String dateOfBirth, String gender, 
                 String position, String phoneNumber, String email, String password, 
                 String hireDate, String EndDate, double salary) {
        this.staffId = ++totalStaffCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.hireDate = hireDate;
        this.EndDate = EndDate;
        this.salary = salary;
        staffList.add(this);
    }

    public Staff(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getStaffId() { 
        return staffId;
    }

    public static ArrayList<Staff> getStaffList() {
        return staffList;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
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

    public Staff(String firstName, String lastName, String dateOfBirth, String gender, 
                 String position, String phoneNumber, String email, String password, String hireDate, String EndDate, double salary) {
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
    }
    public Staff(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public int getStaffId() { 
        return staffId;
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
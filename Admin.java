import java.util.List;
public class Admin implements manage{
    private String username;
    private String email;
    private int phoneNumber;
    private String password;
    private List<Attendance> attendance;
    // For register
    public Admin(String username, String email, int phoneNumber, String password) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    //For Login
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
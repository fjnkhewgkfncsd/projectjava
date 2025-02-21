<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> origin/main
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
    public boolean login(String email, String password) {
        if(this.email.equals(email) && this.password.equals(password)){
            return true;
        }
        return false;
    }
    public boolean signup(String name,String password,String phonenumber,char sex,String dob,String email){
        return true;
    }
    public void submitAttendent(String username,String password){
        return;
    }
    public void checkAttendent(String username,String password){
        return;
    }
}

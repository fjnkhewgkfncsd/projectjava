<<<<<<< Updated upstream
public interface manage{
    boolean login(String username,String password);
    boolean signup(String name,String password,String phonenumber,char sex,String dob,String email);
    void checkAttendent(String username,String password);
<<<<<<< HEAD
=======
    void submitAttendent(String username,String password);
>>>>>>> origin/main
}
=======
public interface manage {
    boolean login(String username, String password);
    boolean signup(String name, String password, String phoneNumber, char sex, String dob, String email);
}
>>>>>>> Stashed changes

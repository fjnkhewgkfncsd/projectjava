public class Test {
    public static void main(String[] args){
        Staff staff1 = new Staff("John Doe", "Doe", "1990-01-01", "Male", "Software Engineer", "1234567890", "johndoe@example.com", "password123", "2022-01-01", "2025-12-31", 50000);
        System.out.println(staff1);
        Staff staff2 = new Staff("Jane Smith", "Smith", "1985-12-31", "Female", "Data Scientist", "9876543210", "janesmith@example.com", "qwertyui", "2021-06-01", "2024-11-30", 60000);
        System.out.println(staff2);

    }
}

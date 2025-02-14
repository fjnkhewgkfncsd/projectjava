import java.util.ArrayList;

public class Course {
    private static int totalCourses = 0;  // Static variable to keep track of total courses
    private String courseCode;
    private String courseName;
    private int creditHours;
    private Lecturer lecturer;
    private String schedule;
    private String classroom;

    // Static ArrayList to store Course objects
    private static ArrayList<Course> courseList = new ArrayList<>();

    // Constructor with all attributes
    public Course(String courseCode, String courseName, int creditHours, Lecturer lecturer, String schedule, String classroom) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.lecturer = lecturer;
        this.schedule = schedule;
        this.classroom = classroom;
        totalCourses++;  // Increment total courses every time a new course is created
    }

    // Static method to get total courses
    public static int getTotalCourses() {
        return totalCourses;
    }

    // Getters for instance variables
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getClassroom() {
        return classroom;
    }

    // Method to add a course to the ArrayList
    public static void addCourse(Course course) {
        courseList.add(course);
    }

    // Method to remove a course by course code
    public static void removeCourseByCode(String courseCode) {
        courseList.removeIf(course -> course.getCourseCode().equals(courseCode));
    }

    // Method to get a course by course code
    public static Course getCourseByCode(String courseCode) {
        for (Course course : courseList) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;  
    }

    // Method to display all courses with all attributes
    public static void displayAllCourses() {
        for (Course course : courseList) {
            System.out.println(
                "Course Code: " + course.getCourseCode() + ", " +
                "Course Name: " + course.getCourseName() + ", " +
                "Credit Hours: " + course.getCreditHours() + ", " +
                "Lecturer: " + course.getLecturer().getName() + ", " +
                "Schedule: " + course.getSchedule() + ", " +
                "Classroom: " + course.getClassroom()
            );
        }
    }

    // Method to get the list of all courses
    public static ArrayList<Course> getCourseList() {
        return courseList;
    }
}
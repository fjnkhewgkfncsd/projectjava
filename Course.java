import java.util.ArrayList;

public class Course {
    private static int totalCourses = 0;
    private String courseCode;
    private String courseName;
    private int creditHours;
    private Lecturer lecturer;
    private String schedule;
    private String classroom;

    private static ArrayList<Course> courseList = new ArrayList<>();

    public Course(String courseCode, String courseName, int creditHours, Lecturer lecturer, String schedule, String classroom) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.lecturer = lecturer;
        this.schedule = schedule;
        this.classroom = classroom;
        totalCourses++;
        courseList.add(this);  // Automatically add to the course list
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

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

    public static void removeCourseByCode(String courseCode) {
        boolean removed = courseList.removeIf(course -> course.getCourseCode().equals(courseCode));
        if (removed) totalCourses--;  // Decrement total courses if a course is removed
    }

    public static Course getCourseByCode(String courseCode) {
        for (Course course : courseList) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public static void displayAllCourses() {
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    public static ArrayList<Course> getCourseList() {
        return courseList;
    }
<<<<<<< Updated upstream
<<<<<<< HEAD

    @Override
    public String toString() {
        return "Course Code: " + courseCode +
               ", Course Name: " + courseName +
               ", Credit Hours: " + creditHours +
               ", Lecturer: " + (lecturer != null ? lecturer.getName() : "N/A") +
               ", Schedule: " + schedule +
               ", Classroom: " + classroom;
    }
=======
>>>>>>> origin/main
=======
>>>>>>> Stashed changes
}

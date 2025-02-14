public class StaffAttendance {
    private int staffId;
    String date;
    boolean isPresent;

    public StaffAttendance(Staff staff, String date, boolean isPresent) {
        this.staffId = staff.getStaffId();
        this.date = date;
        this.isPresent = isPresent;
    }
}

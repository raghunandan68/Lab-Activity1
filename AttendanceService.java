import java.util.*;

public class AttendanceService {
    private List<Student> studentList = new ArrayList<>();
    private List<String> attendanceLog = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public boolean markAttendance(String biometricId) {
        for (Student student : studentList) {
            if (student.biometricId.equals(biometricId)) {
                attendanceLog.add(student.id);
                return true;
            }
        }
        return false;
    }

    public boolean isPresent(String studentId) {
        return attendanceLog.contains(studentId);
    }
}

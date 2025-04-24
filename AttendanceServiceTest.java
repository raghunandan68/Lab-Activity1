import org.junit.Test;
import static org.junit.Assert.*;

public class AttendanceServiceTest {

    @Test
    public void testMarkAttendanceSuccess() {
        AttendanceService service = new AttendanceService();
        Student student = new Student("S001", "John", "BIO123");

        service.addStudent(student);

        boolean result = service.markAttendance("BIO123");

        assertTrue(result);
        assertTrue(service.isPresent("S001"));
    }

    @Test
    public void testMarkAttendanceFailure() {
        AttendanceService service = new AttendanceService();
        Student student = new Student("S001", "John", "BIO123");

        service.addStudent(student);

        boolean result = service.markAttendance("BIO999");

        assertFalse(result);
        assertFalse(service.isPresent("S001"));
    }
}

import static.org.junit.Assert.*;
import org.junit.Test;

public class JUnitExample{
    @Test
    public void test_Junit(){
        System.out.println("Check string");
        String s="check the string";
        assertEquals("check string",s);
    }
}

import static.org.junit.Assert.*;
import org.junit.Test;

class MsgUnit{
    private String msg;
    public MsgUnit(String msg){
        this.msg=msg;
    }
    public String printMessage(){
        System.out.println(msg);
        return msg;
    }
}

public class TestUnit{
    String msg="hello world";
    MsgUnit msgutil=new MsgUnit(msg);
    @Test
    public void testPrintMessage(){
        assertEquals(msg,msgutil.printMessage());
    }
}

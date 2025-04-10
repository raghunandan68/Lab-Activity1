import static.org.junit.Assert.*;
import org.junit.Test;

class Calculate{
    public int sum(int var1,int var2){
        System.out.println("Adding values : "+var1+" + "+var2);
        return var1+var2;
    }
}

public class CalculateTest{
    Calculate cal=new Calculate();
    int sum=cal.sum(10,5);
    int testsum=15;
    @Test
    public void testSum(){
        System.out.println("@Test sum() : "+sum+" = "+testsum);
        assertEquals(sum,testsum);
    }
}

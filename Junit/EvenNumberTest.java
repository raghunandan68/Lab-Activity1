import static.org.junit.Assert.*;
import org.junit.Test;

class EvenNumber{
    public boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}

public class EvenNumberTest{
    @Test
    public void testIsEven(){
        int sample=2;
        EvenNumber flag=new EvenNumber();
        assertTrue(flag.isEven(sample));
    }
    @Test
    public void testIsEvenFalse(){
        int sample=3;
        EvenNumber flag=new EvenNumber();
        assertTrue(flag.isEven(sample));
    }
}

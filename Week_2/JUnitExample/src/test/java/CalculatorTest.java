import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator=new Calculator();
        int result=calculator.add(3,4);
        Assertions.assertEquals(7, result);
    }
}

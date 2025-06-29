import org.example.Calculator;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    private Calculator calculator;


    @Before
    public void  setup(){
        System.out.println("Setting up Calculator instance");
        calculator=new Calculator();
    }

    @After
    public void tearDown(){
        System.out.println("Cleaning up calculator instance");
        calculator=null;
    }

    @Test
    public void testadd(){
        int a=3;
        int b=7;
        assertEquals(10,calculator.add(a,b));
    }

    @Test
    public void testmultiply(){
        int y=4,k=3;
        assertEquals(12,calculator.multiply(y,k));
    }

}

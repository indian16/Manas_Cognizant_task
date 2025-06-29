import org.junit.Test;
import static org.junit.Assert.*;
public class ExampleTest {

    Example ex=new Example();

    @Test
    public void testaddition(){
        assertEquals(5,ex.add(2,3));
    }

    @Test
    public void iseven(){
        assertTrue(ex.check(4));
        assertFalse(ex.check(5));
    }
    @Test
    public void arrayequality(){
        int[] expected={1,2,3};
        assertArrayEquals(expected,ex.arraytest());
    }


    @Test

    public void testgreetings(){
        assertEquals("Hello",ex.greeting());
    }

    @Test

    public void testobjects(){
        String s1=new String("Hello");
        String s2=new String("Hello");
        assertNotSame(s1,s2);
    }
}

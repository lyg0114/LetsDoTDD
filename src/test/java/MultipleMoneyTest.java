import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MultipleMoneyTest {



    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
       // Dollar product = five.times(2);

        assertEquals(new Dollar(10),five.times(2));

        //product = five.times(3);
        assertEquals(new Dollar(15),five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertTrue(new Dollar(5).equals(new Dollar(5)));


    }




}

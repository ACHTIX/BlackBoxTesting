import org.example.ElectricityBill;
import org.example.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestLeapYear {

    @Test
    public void testConstructor(){
        LeapYear leapYear = new LeapYear(1900);

        assertEquals(1900 , leapYear.getYear());
    }

    @Test
    public void testDivide2Case(){
        LeapYear divide2 = new LeapYear(2002);
        divide2.calculateLeapYear();

        assertFalse(divide2.isLeap());
    }

    @Test
    public void testDivide3Case(){
        LeapYear divide3 = new LeapYear(1593);
        divide3.calculateLeapYear();

        assertFalse(divide3.isLeap());
    }

    @Test
    public void testDivide4Case(){
        LeapYear divide4 = new LeapYear(1956);
        divide4.calculateLeapYear();

        assertTrue(divide4.isLeap());
    }

    @Test
    public void testDivide5Case(){
        LeapYear divide5 = new LeapYear(1050);
        divide5.calculateLeapYear();

        assertFalse(divide5.isLeap());
    }

    @Test
    public void testDivide7Case(){
        LeapYear divide7 = new LeapYear(1715);
        divide7.calculateLeapYear();

        assertFalse(divide7.isLeap());
    }

    @Test
    public void testDivide100Case(){
        LeapYear divide100 = new LeapYear(1800);
        divide100.calculateLeapYear();

        assertFalse(divide100.isLeap());
    }

    @Test
    public void testLeapYear01Case(){
        LeapYear leapYear1 = new LeapYear(1988);
        leapYear1.calculateLeapYear();

        assertTrue(leapYear1.isLeap());
    }

    @Test
    public void testLeapYear02Case(){
        LeapYear leapYear2 = new LeapYear(1992);
        leapYear2.calculateLeapYear();

        assertTrue(leapYear2.isLeap());
    }

    @Test
    public void testLeapYear03Case(){
        LeapYear leapYear3 = new LeapYear(2000);
        leapYear3.calculateLeapYear();

        assertTrue(leapYear3.isLeap());
    }
}

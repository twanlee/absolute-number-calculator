import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsNumberTest {
    @Test
     void testAbs0(){
        int number = 0;
        int expected = 0;
        int result = AbsNumber.findAbs(number);
        assertEquals(expected, result);
    }

    @Test
    void testAbs2(){
        int number = -1;
        int expected = 1;
        int result = AbsNumber.findAbs(number);
        assertEquals(expected, result);
    }
}
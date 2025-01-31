package Junit_mathutils;
import Junit_mathutils.MathUtils;
import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {
    
    MathUtils mathUtils = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(0, mathUtils.add(-1, 1));
        assertEquals(-5, mathUtils.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2));
        assertEquals(-3, mathUtils.subtract(-1, 2));
        assertEquals(5, mathUtils.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(-2, mathUtils.multiply(-1, 2));
        assertEquals(0, mathUtils.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0.001);
        assertEquals(-2.5, mathUtils.divide(-5, 2), 0.001);
        assertEquals(-1.0, mathUtils.divide(5, 0), 0.001); // Testing division by zero
    }
}

package Junit_mathutils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3), "Addition of 2 and 3 should be 5");
        assertEquals(0, mathUtils.add(-1, 1), "Addition of -1 and 1 should be 0");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2), "Subtraction of 3 and 2 should be 1");
        assertEquals(-3, mathUtils.subtract(-1, 2), "Subtraction of -1 and 2 should be -3");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3), "Multiplication of 2 and 3 should be 6");
        assertEquals(-2, mathUtils.multiply(-1, 2), "Multiplication of -1 and 2 should be -2");
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(6, 3), 0.001, "Division of 6 by 3 should be 2");
        assertEquals(-0.5, mathUtils.divide(-1, 2), 0.001, "Division of -1 by 2 should be -0.5");
        assertEquals(-1.0, mathUtils.divide(1, 0), 0.001, "Division by 0 should return -1.0");
    }
}

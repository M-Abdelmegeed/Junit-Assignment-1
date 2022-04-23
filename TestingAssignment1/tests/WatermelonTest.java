import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void main() {
        Watermelon watermelon = new Watermelon();
        assertTrue(watermelon.isEven(12));
    }
    @Test
    public void even() {
        Watermelon watermelon = new Watermelon();
        assertTrue(watermelon.isEven(30));
    }
    @Test
    public void odd() {
        Watermelon watermelon = new Watermelon();
        assertFalse(watermelon.isEven(9));
    }
    @Test
    public void two() {
        Watermelon watermelon = new Watermelon();
        assertFalse(watermelon.isEven(2));
    }
    @Test(expected = IllegalArgumentException.class)
    public void negativeOdd() {
        Watermelon watermelon = new Watermelon();
        watermelon.isEven(-5);
    }
    @Test(expected = IllegalArgumentException.class)
    public void negativeEven() {
        Watermelon watermelon = new Watermelon();
        watermelon.isEven(-10);
    }
}
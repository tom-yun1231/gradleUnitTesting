package il.ac.kinneret.mjmay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradlingTest {

    @Before
    public void setUp() {
    }

    @Test
    public void add() {
        assertEquals(7, Gradling.add(3,4));
    }

    @Test
    public void addFail() {
        assertEquals(8, Gradling.add(3,4));
    }
}
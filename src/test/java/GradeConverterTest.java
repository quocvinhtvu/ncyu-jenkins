import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeConverterTest {
    private GradeConverter converter;

    @Before
    public void setUp() {
        converter = new GradeConverter();
    }

    // ✅ Test đúng
    @Test
    public void testCorrectA() {
        assertEquals("A", converter.convert(95));  // đúng
    }

    @Test
    public void testCorrectE() {
        assertEquals("E", converter.convert(50));  // đúng
    }

    // ❌ Test sai
    @Test
    public void testWrongB() {
        assertEquals("A", converter.convert(85));  // sai, vì 85 là "B"
    }

    @Test
    public void testWrongInvalid() {
        assertEquals("E", converter.convert(-10));  // sai, -10 là "Invalid"
    }
    @Test
    public void testConvertnew()
    {
        String expeced = "Invalid";
        String actual = converter.convert(-10);
        assertEquals(expeced, actual);
    }
    @Test
public void testScoreAtUpperBoundary() {
    GradeConverter converter = new GradeConverter();
    assertEquals("A", converter.convert(100)); // Ranh giới trên của A
}

@Test
public void testScoreAtLowerBoundaryA() {
    GradeConverter converter = new GradeConverter();
    assertEquals("A", converter.convert(90)); // Ranh giới dưới của A
}

@Test
public void testScoreAtUpperBoundaryE() {
    GradeConverter converter = new GradeConverter();
    assertEquals("E", converter.convert(59)); // Ranh giới trên của E
}

@Test
public void testScoreAtLowerBoundaryInvalid() {
    GradeConverter converter = new GradeConverter();
    assertEquals("Invalid", converter.convert(-1)); // Dưới 0 là Invalid
}

@Test
public void testScoreAboveMax() {
    GradeConverter converter = new GradeConverter();
    assertEquals("Invalid", converter.convert(101)); // Trên 100 là Invalid
}

}
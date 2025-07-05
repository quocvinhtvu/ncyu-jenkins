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
}

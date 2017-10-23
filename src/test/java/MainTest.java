import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void before() {

    }

    @Test
    public void TestLCZero() {
        assertTrue(Main.LazyCaterer(0) == 1);
    }

    @Test
    public void TestLCNegative() {
        assertTrue(Main.LazyCaterer(-1) == 1);
    }

    @Test
    public void TestLCValid() {
        assertTrue(Main.LazyCaterer(2) == 4);
    }

    @Test
    public void TestTriZero() {
        assertTrue(Main.TriangleNumber(0) == 0);
    }

    @Test
    public void TestTriOne() {
        assertTrue(Main.TriangleNumber(3) == 6);
    }

    @Test
    public void TestTriNegative() {
        assertTrue(Main.TriangleNumber(-1) == 0);
    }

}

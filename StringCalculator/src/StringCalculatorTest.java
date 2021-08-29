import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class StringCalculatorTest {
    StringCalculator calc;

    @Before
    public void init() {
        calc = new StringCalculator();
    }

    @Test
    public void isEmpty() {
        Assert.assertEquals(0,calc.Add(""));
    }

    @Test
    public void isSingle() {
        Assert.assertEquals(1,calc.Add("1"));
    }

    @Test
    public void sumofTwo() {
        Assert.assertEquals(3,calc.Add("1,2"));
    }

    @Test
    public void sumofMultiple() {
        Assert.assertEquals(15,calc.Add("1,2,3,4,5"));
    }

    @Test
    public void sumofMultipleNewline() {
        Assert.assertEquals(21,calc.Add("1,2\n3\n4,5,6"));
    }
}

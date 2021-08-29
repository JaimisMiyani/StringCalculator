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
    public void isEmptyCheck() {
        Assert.assertEquals(0,calc.Add(""));
    }

    @Test
    public void isSingleValue() {
        Assert.assertEquals(1,calc.Add("1"));
    }

    @Test
    public void sumofTwoValue() {
        Assert.assertEquals(3,calc.Add("1,2"));
    }

    @Test
    public void sumofMultipleValue() {
        Assert.assertEquals(15,calc.Add("1,2,3,4,5"));
    }
}

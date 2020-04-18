import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestOnly1And4 {
    private int[] inArray;
    private boolean result;

    public TestOnly1And4(boolean result, int[] inArray) {
        this.inArray = inArray;
        this.result = result;
    }

    @Parameterized.Parameters
    public static List<Object[]> data () {
        Object[][] variables = new Object[][] {
                {true, new int [] {1, 1, 1, 4, 4, 1, 4, 4}},
                {false, new int [] {1, 1, 1, 1, 1, 1}},
                {false, new int [] {4, 4, 4, 4}},
                {false, new int [] {1, 4, 4, 1, 1, 4, 3}}
        };
        return Arrays.asList(variables);
    }

    @Test
    public void test1And4() {
        Assert.assertEquals(result, Methods.only1and4(inArray));
    }
}

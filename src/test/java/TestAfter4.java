import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestAfter4 {
    private int[] inArray;
    private int[] expected;

    public TestAfter4(int[] inArray, int[] expected) {
        this.inArray = inArray;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection <Object[]> data () {
        int[] ex1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] ex2 = {10, 12, 14, 4, 25, 32, 42, 11, 57};
        int[] ex3 = {4, 11, 2, 5, 115, 32};
        int[] ex4 = {1, 11, 4, 4, 10, 32};
        int[] res1 = {1, 7};
        int[] res2 = {25, 32, 42, 11, 57};
        int[] res3 = {11, 2, 5, 115, 32};
        int[] res4 = {10, 32};
        return Arrays.asList (new Object[][]
                {
                {ex1,res1},
                {ex2,res2},
                {ex3,res3},
                {ex4,res4}
                });

    }

    @Test
    public void after4Test () {
        Assert.assertArrayEquals(expected, Methods.after4(inArray));
    }
}

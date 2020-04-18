import org.junit.Test;

public class TestAfter4IncorrectInput {

    @Test(expected = RuntimeException.class)
    public void after4IncorrectInputTest1 () {
        Methods.after4(new int [] {1,4,44,4,5,4});
    }

    @Test (expected = RuntimeException.class)
    public void after4IncorrectInputTest2 () {
        Methods.after4(new int [] {1,1,44,7,5,5});
    }
}

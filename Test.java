import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void testMethod1() {
        Main main = new Main();
        int[] arrayExpected = {3, 2, 5, 0};
        int[] result = {4, 32, 52, 4, 4, 5, 4, 3, 2, 5, 0};
        Assert.assertArrayEquals(arrayExpected, main.getAfterFour(result));
    }

    @org.junit.Test
    public void testMethod2() {
        Main main = new Main();
        int[] arrayExpected = {3, 2, 5, 0};
        int[] result = {1, 22, 2, 4, 4, 5, 4, 3, 2, 5, 1};
        Assert.assertArrayEquals(arrayExpected, main.getAfterFour(result));
    }
    @org.junit.Test
    public void testMethod3() {
        Main main = new Main();
        int[] arrayExpected = {0, 0, 0, 0};
        int[] result = {1, 2, 2, 04, 4, 5, 4, 0, 0, 0, 0};
        Assert.assertArrayEquals(arrayExpected, main.getAfterFour(result));
    }
    @org.junit.Test
    public void testMethod4() {
        Main main = new Main();
        int[] arrayExpected = {3, 2, 5, 0};
        int[] result = {1, 2, 2, 44, 54, 5, 74, 3, 2, 5, 0};
        Assert.assertEquals(new RuntimeException("There isn't four"), main.getAfterFour(result));
    }

    @org.junit.Test
    public void testCheck1() {
        int[] array = {1, 2, 2, 44, 54, 5, 74, 3, 2, 5, 0};
        Main main = new Main();
        Assert.assertEquals(true, main.checkOneAndFour(array));
    }
    @org.junit.Test
    public void testCheck2() {
        int[] array = {0, 2, 2, 44, 54, 5, 74, 3, 2, 5, 4};
        Main main = new Main();
        Assert.assertEquals(true, main.checkOneAndFour(array));
    }
    @org.junit.Test
    public void testCheck3() {
        int[] array = {11, 2, 2, 44, 54, 5, 74, 3, 2, 5, 0};
        Main main = new Main();
        Assert.assertEquals(false, main.checkOneAndFour(array));
    }
}

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minOperationsTest1(){
        int[] nums = {4,2,5,3};
        int expected = 0;
        int actual = new Solution().minOperations(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minOperationsTest2(){
        int[] nums = {1,2,3,5,6};
        int expected = 0;
        int actual = new Solution().minOperations(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minOperationsTest3(){
        int[] nums = {1,10,100,1000};
        int expected = 0;
        int actual = new Solution().minOperations(nums);

        Assert.assertEquals(expected, actual);
    }
}

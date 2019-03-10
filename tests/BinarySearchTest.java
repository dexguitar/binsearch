import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void shouldReturnMinus4For45() {
        int[] nums = {1, 2, 13, 44, 55, 66, 77};
        assertEquals(-4, BinarySearch.binSearch(nums, 0, 7, 45));
    }

    @Test
    public void shouldReturn2For13() {
        int[] nums = {1, 2, 13, 44, 55, 66, 77};
        assertEquals(2, BinarySearch.binSearch(nums, 0, 7, 13));
    }

    @Test
    public void shouldReturnMinus1For0() {
        int[] nums = {1, 2, 13, 44, 55, 66, 77};
        assertEquals(-1, BinarySearch.binSearch(nums, 0, 7, 0));
    }

    @Test
    public void shouldReturnMinus1For222() {
        int[] nums = {1, 2, 13, 44, 55, 66, 77};
        assertEquals(-1, BinarySearch.binSearch(nums, 0, 7, 222));
    }
}
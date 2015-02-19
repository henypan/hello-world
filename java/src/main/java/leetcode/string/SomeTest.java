package leetcode.string;

import java.util.Arrays;

import org.junit.Test;

// Scratch file for testing some non-sense. It will be updated periodically.
public class SomeTest
{
    @SuppressWarnings("nls")
    @Test
    public void testSome()
    {
        int arr1[] = { 0, 1, 2, 3, 4, 5 };
        int arr2[] = { 0, 10, 20, 30, 40, 50 };
      
        // copies an array from the specified source array
        System.arraycopy(arr1, 2, arr2, 0, 1);
        System.out.print("array2 = ");
        System.out.print(Arrays.toString(arr2));
    }
    
    @Test
    public void testReader4()
    {
        Reader4 r4 = new Reader4();
        char[] buf = {'a', 'c', 'b', 'c', 'd', '3', 'e', 'p', '3', '1', 'g', 'c'};
        r4.read(buf, 9);
    }
}

package leetcode.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class TestMath
{
    /**
     * Tests leetcode {@link ReverseDigit}.
     */
    @Test
    public void testReverseDigit()
    {
        ReverseDigit rd = new ReverseDigit();
        
        // test positive value
        assertEquals(4321, rd.reverse(1234));
        
        // test positive value
        assertEquals(-12345, rd.reverse(-54321));
        
        // test overflow value
        assertEquals(0, rd.reverse(1000000003));
    }
    
    /**
     * Tests leetcode {@link PlusOne}.
     */
    @Test
    public void testPlusOne()
    {
        PlusOne po = new PlusOne();
        
        // regular case 1 
        int[] digits1 = {1, 3, 5, 6, 9};
        int[] expectedDigits1 = {1, 3, 5, 7, 0};
        assertEquals(Arrays.toString(expectedDigits1), Arrays.toString(po.plusOne(digits1)));
        
        // regular case 2
        int[] digits2 = {1, 3, 4, 4, 2};
        int[] expectedDigits2 = {1, 3, 4, 4, 3};
        assertEquals(Arrays.toString(expectedDigits2), Arrays.toString(po.plusOne(digits2)));
        
        // extreme case 
        int[] digits3 = {9, 9, 9, 9, 9, 9};
        int[] expectedDigits3 = {1, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(expectedDigits3), Arrays.toString(po.plusOne(digits3)));
    }
    
    /**
     * Tests leetcode {@link IsPalindromeNumber}.
     */
    @Test
    public void testIsPalindromeNumber()
    {
        IsPalindromeNumber ip = new IsPalindromeNumber();
        assertTrue(ip.isPalindrome(12321));
        assertFalse(ip.isPalindrome(4555654));
    }
}

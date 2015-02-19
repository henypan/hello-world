package leetcode.math;

public class PlusOne
{
    public int[] plusOne(int[] digits)
    {
        if (digits == null && digits.length == 0)
            return digits;
        int carry = 1;
        for (int i = digits.length - 1; i>=0; i--)
        {
            int digit = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
            digits[i] = digit;

            // the carry can only be 1 or 0, if it is 0, return the result. 
            if (carry == 0)
                return digits;
        }

        int [] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
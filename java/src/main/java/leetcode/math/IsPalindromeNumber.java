package leetcode.math;

public class IsPalindromeNumber
{
    public boolean isPalindrome(int num)
    {
        if (num < 0)
            return false;
        int div = 1;
        while (num / div >= 10)
        {
            div *= 10;
        }
        
        while (num > 0)
        {
            // get the right and left digits
            int r = num % 10;
            int l = num / div;
            if (r != l)
                return false;
            
            // chop the right and left digits
            num = num % div;
            num = num / 10;
            
            // update the div (by two digits)
            div /= 100;
        }
        return true;
    }
}

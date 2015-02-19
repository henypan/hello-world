package leetcode.math;

public class ReverseDigit
{
    public int reverse(int d)
    {
        int ret = 0; 
        while (d != 0)
        {
            if (Math.abs(ret) > Integer.MAX_VALUE/10)
                return 0;
            ret = ret*10 + d%10;
            d /= 10;
        }
        return ret;
    }
}
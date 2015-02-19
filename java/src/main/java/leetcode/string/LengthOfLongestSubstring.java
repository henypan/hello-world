package leetcode.string;

import java.util.Arrays;

import org.junit.Test;

public class LengthOfLongestSubstring
{
  //Longest substring without repeating characters
    public int lengthOfLongestSubstring(String s)
    {
        boolean[] exist = new boolean[256];
        int i = 0, maxLen = 0;

        for (int j = 0; j < s.length(); j++)
        {
            while (exist[s.charAt(j)])
            {
                exist[s.charAt(i)] = false;
                i++;
            }
            exist[s.charAt(j)] = true;
            maxLen = Math.max(j - i + 1, maxLen);
        }

        return maxLen;
    }
    
    // Optimized solution, instead of using a table to tell if a character exists or not, we
    // could also use a mapping of the characters to its index. Then we can skip the characters
    // immediately when we found a repeated characters.
    public int lengthOfLongestSubstring2(String s)
    {
        int[] charMap = new int[256];
        Arrays.fill(charMap, -1);
        int i = 0, maxLen = 0;

        for (int j = 0; j < s.length(); j++)
        {
            if (charMap[s.charAt(j)] >= i)
            {
                i = charMap[s.charAt(j)] + 1;
            }
            charMap[s.charAt(j)] = j;
            maxLen = Math.max(j - i + 1, maxLen);
        }

        return maxLen;
    }
}

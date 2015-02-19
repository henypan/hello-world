package leetcode.string;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class ReverseWords
{
    public String reverseWords(String s)
    {
        StringBuilder reversed = new StringBuilder();
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (' ' == s.charAt(i))
            {
                j = i;
            }
            else if (i == 0 || ' ' == s.charAt(i - 1))
            {
                if (reversed.length() != 0)
                {
                    reversed.append(' ');
                }
                //The substring begins at the specified beginIndex(i) and extends to the character at index endIndex(j) - 1.
                reversed.append(s.substring(i, j));
            }
        }
        return reversed.toString();
    }
    
    @Test
    public void testReverseWords()
    {
        ReverseWords rw = new ReverseWords();
        String keyin = "Pan loves Shuo Shuo";  //$NON-NLS-1$
        System.out.println(rw.reverseWords(keyin));
    }
}

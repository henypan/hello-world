package leetcode.string;

//One edit distance between two String s and t.
@SuppressWarnings("javadoc")
public class OneEditDistance
{
    public boolean isOneEditDistance(String s, String t)
    {
        int m = s.length(), n = t.length();

        // simplify the question by considering only the case when n < m
        if (m > n)
            return isOneEditDistance(t, s);
        if (n - m > 1)
            return false;

        int i = 0, shift = m - n;
        while (i < m && s.charAt(i) == t.charAt(i))
            i++;
        // if S matches all characters in T, then check if there is an extra character in T
        if (i == m)
            return shift > 0;
        // if there is a non-matching character in S and T, skipped the extra character and continue
        // comparison.
        if (shift == 0)
            i++;
        // continue the comparison
        while (i < m && s.charAt(i) == t.charAt(i + shift))
            i++;
        return i == m; // or i == n;
    }
}

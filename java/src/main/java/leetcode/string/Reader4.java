package leetcode.string;

@SuppressWarnings({"javadoc", "nls"})
public class Reader4
{
    public int read4(char[] buf)
    {
        if (buf == null)
        {
            throw new UnsupportedOperationException("Cannot perform read on null char array!");
        }
        if (buf.length > 4)
            return 4;
        return buf.length;
    }
    
    public int read(char[] buf, int n)
    {
        char[] buffer = new char[4];
        int readBytes = 0;
        boolean eof = false;
        while (!eof && readBytes < n)
        {
            int size = read4(buffer);
            if (size < 4) 
                eof = true;
            int bytes = Math.min(n - readBytes, size);
            System.arraycopy(buffer, 0, buf, readBytes, bytes);
            readBytes += bytes;
        }
        
        return readBytes;
    }
}

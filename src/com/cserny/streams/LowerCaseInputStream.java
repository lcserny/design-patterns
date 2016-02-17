package com.cserny.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by user on 17.02.2016.
 */
public class LowerCaseInputStream extends FilterInputStream
{
    public LowerCaseInputStream(InputStream inputStream)
    {
        super(inputStream);
    }

    @Override
    public int read() throws IOException
    {
        int character = super.read();
        return (character == -1 ? character : Character.toLowerCase((char) character));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException
    {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }

        return result;
    }
}

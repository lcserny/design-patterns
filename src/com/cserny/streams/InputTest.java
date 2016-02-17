package com.cserny.streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by user on 17.02.2016.
 */
public class InputTest
{
    public static void main(String[] args) throws IOException
    {
        int character;
        try {
            InputStream inputStream = new LowerCaseInputStream(
                new BufferedInputStream(
                    new FileInputStream("test.txt")
                )
            );
            while ((character = inputStream.read()) >= 0) {
                System.out.print((char) character);
            }

            inputStream.close();
        } catch (IOException ex) { ex.printStackTrace(); }
    }
}

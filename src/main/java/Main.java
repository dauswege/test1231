import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class Main
{

    public static void main(String args[]) throws IOException
    {

//        InputStream is= ClassLoader.getSystemResourceAsStream("morse.txt");
//
//        BufferedInputStream stream = new BufferedInputStream(is);

        Reader morseReader = new MorseReader(new BufferedReader(new FileReader("c:\\temp\\morse.txt")));

        System.out.println(morseReader.read());

    }
}

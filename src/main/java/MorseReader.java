import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class MorseReader extends BufferedReader
{

    public MorseReader(Reader in)
    {
        super(in);
    }

    @Override
    public int read() throws IOException
    {
        int singleCharacter = super.read();



        return singleCharacter;
    }
}

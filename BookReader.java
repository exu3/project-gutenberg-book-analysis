import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.List;
//import java.util.ArrayList;

public class BookReader
{
    public static void read(String site)
    {
        try
        {
            URL url = new URL(site);

            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
                    
            while ((line = in.readLine()) != null)
            {
                // check for the 3 asterisks marking the start and end of the book.
                // only read the stuff between the asterisks
                String [] words = line.split(" ");
                // iterate over each word
                // check f the word has a punctuation mark at the beginning, use the substring method to remove it
                // check if the word has a punctuation mark at the end, use the substring method to remove it
                for(String word: words)
                {
                    System.out.println(word);
                }
            }
            in.close();

        }
        catch (MalformedURLException e)
        {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("I/O Error: " + e.getMessage());
        }

    }

}
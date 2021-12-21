import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.sound.midi.SysexMessage;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import java.util.ArrayList;

public class BookReader
{
    public static Book read(String site)
    {
        try
        {
            URL url = new URL(site);
            // read text returned by server
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            boolean inBook = false;
            int numLines = 0;
            int numWords = 0;
            String longestWord = "";
            Book book = new Book();
            ArrayList allWords = new ArrayList();

            
            while ((line = in.readLine()) != null)
            {
		        String result = line.replaceAll("\\p{Punct}", " ");
                String[] totalWords = result.split(" ");
                for(int i = 0; i<totalWords.length; i++)
                {
                if (totalWords[i].trim() != "")
                 allWords.add(totalWords[i]);   
                }

                // check for the 3 asterisks marking the start and end of the book.
                // only read the stuff between the asterisks
                if (line.contains("Title:"))
                {
                    // prints the Title
                    System.out.println(line);
                    book.setTitle(line);
                }
                if (line.contains("Author:"))
                {
                    // prints Author
                    System.out.println(line);
                }
                if (line.contains("Language:"))
                {
                    System.out.println(line);
                }

                if (line.contains("*** START OF")) {
                    inBook = true;
                    continue;
                } 
                else if (line.contains("*** END OF")) {
                    inBook = false;
                }
                if (inBook) {
                    String [] words = line.split(" ");
                    numLines++;
                }
            }

            in.close();
            
            System.out.println("📝 Total lines: " + numLines);
            book.setNumLines(numLines);
            book.setTotalText(allWords);
            return book;
        }
        catch (MalformedURLException e)
        {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("I/O Error: " + e.getMessage());
        }

        // important\
        return null;
        
        }
    
}

                // iterate over each word
                // check f the word has a punctuation mark at the beginning, use the substring method to remove it
                // check if the word has a punctuation mark at the end, use the substring method to remove it

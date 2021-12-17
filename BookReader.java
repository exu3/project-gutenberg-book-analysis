import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
// import java.util.List;
// import java.util.ArrayList;

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

            // regex to find punctuation and other symbols
            // Pattern punctuation = Pattern.compile("\'|\"|.|?|;|:|!|)|(|,/", Pattern.CASE_INSENSITIVE);
            // Matcher matcher = punctuation.matcher("");
            // boolean matchFound = matcher.find();
            
            while ((line = in.readLine()) != null)
            {
                // check for the 3 asterisks marking the start and end of the book.
                // only read the stuff between the asterisks
                if (line.contains("Title:"))
                {
                    // prints the Title
                    System.out.println(line);
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
                    for(String word: words)
                    {
                        // temporary line so the code runs
                        boolean matchFound = true;
                        // matcher = punctuation.matcher(word);
                        // matchFound = matcher.find();
                        
                        if (matchFound) {
                            for (int letterIndex = 0; letterIndex < word.length(); letterIndex++) {
                                // if (word.substring(0) == "punctuation") {
                                //      word = word.substring(1, word.length()-1);
                                // }
                                // if (word.substring(word.length()-1) == "punctuation") {
                                //     word = word.substring(0,word.length()-2);
                                // }

                                // if (word.substring(letterIndex).matches(punctuation)) {
                                    
                                // }
                            }
                            // System.out.println("✨ regex works");
                        }  
                        // System.out.println(word);
                        numWords++;
                    }
                    
               
                // String word = "";
                // String word2 = "";
                // for (int a = 0; a < numWords; a++)
                // {
                //     word = words[a];
                //     for (int b = 1; b < numWords; b++)
                //     {
                //         word2 = words[b];
                //         if (word2.length() > word.length())
                //         {
                //             longestWord = words[b];
                //         }
                //         longestWord = words[a];
                //     }
                // }
                
                // System.out.println("Longest word: " + longestWord);
                }
            }

            Book bookA = new Book();
            Book bookB = new Book();
            in.close();
            
            System.out.println("📝 Total lines: " + numLines);
            return bookA;
        }
        catch (MalformedURLException e)
        {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("I/O Error: " + e.getMessage());
        }

        // important
        return null;
        
        }
    
}

                // iterate over each word
                // check f the word has a punctuation mark at the beginning, use the substring method to remove it
                // check if the word has a punctuation mark at the end, use the substring method to remove it

import java.util.*;
public class Analysis {
    
    public static void compareNumLines(Book bookA, Book bookB) {
        if (bookA.getNumLines() > bookB.getNumLines())
        {
            System.out.println("bookA has more lines");
        } 
        else if (bookA.getNumLines() < bookB.getNumLines()) {
    
            System.out.println("bookB has more lines."); 
        }
        else
        {
            System.out.println("books have same number of lines");
        }
       
    }
    public static void getMostWord(Book book) {
        ArrayList <String> allWords = book.getTotalText();
        HashMap<String, Integer> map = new HashMap<>();
        for(int j = 0; j<allWords.size(); j++)
        {
            String word = allWords.get(j);
            
            boolean found = false;
            found = map.containsKey(word);
            if(found)
            {
                map.put(word, map.get(word) + 1);
            }
            if(!found)
            {
                map.put(word, 1);
            }
        }
        int max = Collections.max(map.values());
        for (String key : map.keySet()) {
            
            if(map.get(key) == max)
            {
                System.out.println("word that appears the most: " + key);
                System.out.println(key + " appears: " + max + " times");
            }
        }
        
    }
        
    
    }
        





        

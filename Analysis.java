import java.util.*;
public class Analysis {
    
    /*public static void compareNumLines(Book book1, Book book7, Book book8, Book book10) {
        int line = 0;
        int[] mostLines = {book1.getNumLines(), book7.getNumLines(), 
                            book8.getNumLines(), book10.getNumLines()};
        int[] mostLines2 = new int[4];
        for (int a = 0; a < mostLines.length; a++)
        {
            if (mostLines[a] > mostLines[a+1])
            {
                line = mostLines[a+1];
            }
        }
        System.out.println("Book with most lines" + line);
    }*/

    public static void compareNumLines(Book book1, Book book7, Book book8, Book book10){
       int[] mostLines = {book1.getNumLines(), book7.getNumLines(), 
                            book8.getNumLines(), book10.getNumLines()};
        for (int outer = 0; outer < mostLines.length - 1; outer++){
            for (int inner = 0; inner < mostLines.length-outer-1; inner++){
                if (mostLines[inner]>(mostLines[inner + 1])){
                    int temp = mostLines[inner];
                    mostLines[inner] = mostLines[inner + 1];
                    mostLines[inner + 1] = temp;
                }
            }
        }
        System.out.print(mostLines[0] + ", ");
        System.out.print(mostLines[1] + ", ");
        System.out.print(mostLines[2] + ", ");
        System.out.println(mostLines[3]);
    }

        /*if (book2.getNumLines() > book4.getNumLines()) {
            System.out.println("book2 has more lines");
        } 
        else if (book2.getNumLines() < book4.getNumLines()) {
    
            System.out.println("book4 has more lines."); 
        }
        else
        {
            System.out.println("books have same number of lines");
        }*/
    

    /*public static void getMostWords2(Book book) {
        int wordMostPrevious = 0;
        int wordMostCounter = 0; 
        String wordMost = "";
        for(int a = 0; a < words.length; a++)
        {
          for(int b = a + 1; b < words.length - 1; b++)
          {
            if(words[a].equals(words[b]))
            {
              wordMostCounter++;
            }
          }
          if(wordMostCounter > wordMostPrevious)
          {
            wordMostPrevious = wordMostCounter;
            wordMostCounter = 0;
            wordMost = words[a];
          }
          wordMostCounter = 0;
        }
        System.out.println("Word that appears the most: " + wordMost);
    }*/

    public static void getMostWord(Book book) {
        ArrayList <String> allWords = book.getTotalText();
        HashMap<String, Integer> map = new HashMap<>();
        
        // for storing values in hashmap
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
        // finding the max
        for (String key : map.keySet()) {
            if(map.get(key) == max) {
                System.out.println("💯 word that appears the most: " + key);
                System.out.println(key + " appears: " + max + " times");
            } else {
                //nothing
            }}
        }
        // int max2 = Collections.max(map.values());
        //     if (max2 == 0 || en.getValue().compareTo(key.getValue()) > 0 
        //         && en.getValue().compareTo(map.getValue() < 0)) {
        //         max2 = en;
        //     System.out.println(key + " appears: " + max2 + " times");
        // }
        // }
        

    }
        




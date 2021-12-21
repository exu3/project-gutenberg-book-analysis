import java.util.ArrayList;
public class Book {
    // constructor

    private ArrayList <Word> words;
    private String title;
    private String author;
    private String language;
    private String longestWord;
    private int numLines;
    private int numWords;
    private String text;
    // private ArrayList <String> allWords;

    // default constructor
    public Book() {
        title = author = language = text = "";
        numWords = numLines = 0;
        // words  = new Arraylist <Word> ();    
    }
    

    public Book(String title, String author, String language, int numLines) {
        this.title = "";
        this.author = "";
        this.language = "";
        numWords = 0;
        this.numLines = 0;
        words = new ArrayList <Word> ();
    }

    // public methods , getters and setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public void setNumLines(int numLines) {
        this.numLines = numLines;
    }

    public int getNumLines() {
        return numLines;
    }

    // public void setNumWords
    public int getNumWords() {
        return numWords;
    }

    public String getLongestWord() {
        return longestWord;
    }
    public ArrayList getTotalText() {
        return words;
    }
    public void setTotalText(ArrayList words) {
        this.words = words;
    }
}
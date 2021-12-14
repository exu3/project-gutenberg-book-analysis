import java.util.ArrayList; 
public class Book {
    // constructor

    private ArrayList <Word> words;
    private String title;
    private String author;
    private String language;
    private int numWords;
    private int numLines;
    

    public Book(String title, String author, String language) {
        this.title = "";
        this.author = "";
        this.language = "";
        numWords = 0;
        this.numLines = 0;
        words = new ArrayList <Word> ();
    }
}
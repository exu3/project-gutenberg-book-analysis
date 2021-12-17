public class Analysis {
    
    public static void compareNumLines(Book bookA, Book bookB) {
        if (bookA.getNumLines() > bookB.getNumLines())
        {
            System.out.println("bookA has more lines");
        } 
        else if (bookA.getNumLines() < bookB.getNumLines())
        {
            System.out.println("bookB has more lines."); 
        }
        else
        {
            System.out.println("books have same number of lines");
        }
    }
}
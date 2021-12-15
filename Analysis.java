public class Analysis {
    
    public static void compareNumLines(Book bookA, Book bookB) {
        if (bookA.getNumLines() > bookB.getNumLines())
        {
            System.out.println("Book1 has more lines");
        }  
        else
        {
            System.out.println("Book2 has more lines.");
        } 
    }
}
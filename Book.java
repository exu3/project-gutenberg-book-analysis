public class Book {
    public static void books() {
        int wordCounter = 0;
        int i = 0;
        while (words[i] != null) {
            wordCounter++;
        }
        System.out.println("The word count is " + wordCounter);
    }
}
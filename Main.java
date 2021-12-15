class Main {
  public static void main(String[] args) {
    Book bookA = BookReader.read("https://www.gutenberg.org/cache/epub/12135/pg12135.txt");
    Book bookB = BookReader.read("https://www.guteberg.org/cache/epub/66942/pg66942.txt");

    Analysis.compareNumLines(bookA, bookB);
  } //fix bookA (it be causing problems)

}
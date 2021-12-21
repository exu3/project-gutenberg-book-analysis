class Main {
  public static void main(String[] args) {
    Book bookA = BookReader.read("https://www.gutenberg.org/cache/epub/12135/pg12135.txt");
    Book bookB = BookReader.read("https://www.gutenberg.org/cache/epub/66942/pg66942.txt");

    // final project requirements

    // Book book1 = BookReader.read("https://www.gutenberg.org/cache/epub/46/pg46.txt");
    // Book book2 = BookReader.read("https://www.gutenberg.org/files/84/84-0.txt");
    // Book book3 = BookReader.read("https://www.gutenberg.org/files/98/98-0.txt");
    // Book book4 = BookReader.read("https://www.gutenberg.org/files/345/345-0.txt");
    // Book book5 = BookReader.read("https://www.gutenberg.org/files/1467/1467-0.txt");
    // Book book6 = BookReader.read("https://www.gutenberg.org/cache/epub/514/pg514.txt");
    // Book book7 = BookReader.read("https://www.gutenberg.org/cache/epub/1404/pg1404.txt");
    // Book book8 = BookReader.read("https://www.gutenberg.org/files/2852/2852-0.txt");
    // Book book9 = BookReader.read("https://www.gutenberg.org/files/35/35-0.txt");
    // Book book10 = BookReader.read("https://www.gutenberg.org/cache/epub/1210/pg1210.txt");

    // end final project requirements
    Analysis.compareNumLines(bookA, bookB);

    Analysis.getMostWord(bookA);
    Analysis.getMostWord(bookB);
  }

}
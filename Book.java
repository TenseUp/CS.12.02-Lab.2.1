public class Book extends ReadingItem {

    private String title;

    public Book(String name, int wordCount, String title, String author) {
        super(name, wordCount, title, author);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
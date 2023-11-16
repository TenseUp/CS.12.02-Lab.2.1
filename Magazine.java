public class Magazine extends ReadingItem {

    private String coverStory;

    public Magazine(String name, int wordCount, String coverStory, String author) {
        super(name, wordCount, coverStory, author);
        this.coverStory = coverStory;
    }

    public String getCoverStory() {
        return coverStory;
    }
}
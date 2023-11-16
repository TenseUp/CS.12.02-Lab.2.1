public class ReadingItem extends CISItem {

    private int wordCount;

    public ReadingItem(String name, int wordCount, String location, String title) {
        super(name, location, wordCount, title);
        this.wordCount = wordCount;
    }

    public int getWordCount() {
        return wordCount;
    }
}
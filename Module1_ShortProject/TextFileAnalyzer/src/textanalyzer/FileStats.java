package textanalyzer;

public class FileStats {
    private final int wordCount;
    private final int lineCount;

    public FileStats(int wordCount, int lineCount) {
        this.wordCount = wordCount;
        this.lineCount = lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    @Override
    public String toString() {
        return "FileStats{" +
                "wordCount=" + wordCount +
                ", lineCount=" + lineCount +
                '}';
    }
}

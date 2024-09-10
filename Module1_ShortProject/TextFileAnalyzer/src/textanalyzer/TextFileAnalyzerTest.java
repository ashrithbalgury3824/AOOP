package textanalyzer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class TextFileAnalyzerTest {

    private final TextFileAnalyzer analyzer = new TextFileAnalyzer();

    @Test
    public void testSmallFileAnalysis() throws IOException {
        FileStats stats = analyzer.analyzeFile("src/test/resources/smallfile.txt");
        assertEquals(5, stats.getWordCount());
        assertEquals(2, stats.getLineCount());
    }

    @Test
    public void testLargeFileAnalysis() throws IOException {
        FileStats stats = analyzer.analyzeFile("src/test/resources/largefile.txt");
        assertEquals(1000, stats.getWordCount());  // Example
        assertEquals(100, stats.getLineCount());   // Example
    }

    @Test
    public void testInvalidFile() {
        Exception exception = assertThrows(IOException.class, () -> {
            analyzer.analyzeFile("invalidpath.txt");
        });
        assertTrue(exception.getMessage().contains("Error reading file"));
    }
}

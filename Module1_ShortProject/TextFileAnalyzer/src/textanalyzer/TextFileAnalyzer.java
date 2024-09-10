package textanalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileAnalyzer {

    public FileStats analyzeFile(String filePath) throws IOException {
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += countWords(line);
            }
        } catch (IOException e) {
            throw new IOException("Error reading file: " + e.getMessage());
        }

        return new FileStats(wordCount, lineCount);
    }

    private int countWords(String line) {
        if (line == null || line.isEmpty()) {
            return 0;
        }
        String[] words = line.trim().split("\\s+");
        return words.length;
    }
}

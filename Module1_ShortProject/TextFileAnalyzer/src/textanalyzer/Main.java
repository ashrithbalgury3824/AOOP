
package textanalyzer;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path of the text file to analyze:");
        String filePath = scanner.nextLine();

        TextFileAnalyzer analyzer = new TextFileAnalyzer();

        try {
            FileStats stats = analyzer.analyzeFile(filePath);
            System.out.println("File Analysis Complete:");
            System.out.println("Word Count: " + stats.getWordCount());
            System.out.println("Line Count: " + stats.getLineCount());
        } catch (IOException e) {
            System.out.println("Error analyzing the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

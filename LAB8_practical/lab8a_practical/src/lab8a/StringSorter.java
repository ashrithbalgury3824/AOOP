import java.util.Arrays;

public class StringSorter {
    public static void main(String[] args) {
        String[] items = {"dog", "cat", "apple", "zebra", "elephant"};

        Arrays.sort(items, (a, b) -> b.compareToIgnoreCase(a));

        for (String item : items) {
            System.out.println(item);
        }
    }
}

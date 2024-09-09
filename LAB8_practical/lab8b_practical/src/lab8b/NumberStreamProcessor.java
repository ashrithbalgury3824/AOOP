package lab8b;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStreamProcessor {
    public static void processNumbers(int[] numbers) {
        List<Integer> result = Arrays.stream(numbers)
            .filter(EvenNumberProcessor::isEven)
            .map(EvenNumberProcessor::doubleNumber)
            .boxed()
            .collect(Collectors.toList());

        printResult(result);
    }

    private static void printResult(List<Integer> numbers) {
        System.out.println("Result: ");
        numbers.forEach(number -> System.out.print(number + " "));
    }
}

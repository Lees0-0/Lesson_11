import java.util.Arrays;
import java.util.stream.Collectors;

public class RightNumbersOrder {
    public static String rightNumbersOrder(String[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String sortedNumbers = rightNumbersOrder(inputArray);
        System.out.println(sortedNumbers);
    }
}

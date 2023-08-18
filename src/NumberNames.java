import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberNames {
    public static String numberNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (i) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Anastasia", "Anna", "Dmytro", "Fedor", "Iryna", "Elisabeth");
        String formattedNames = numberNames(names);
        System.out.println(formattedNames);
    }
}


import java.util.List;
import java.util.stream.Collectors;

public class ReverseAlphabetName {
    public static List<String> sortList(List<String> inputList) {
        return inputList.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Anastasia", "Anna", "Dmytro", "Fedor", "Iryna", "Elisabeth");
        List<String> sortedList = sortList(names);
        System.out.println(sortedList);
    }
}

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.Arrays;

public class ZipIterator {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> i1 = first.iterator();
        Iterator<T> i2 = second.iterator();
        Stream<T> resultStream = Stream.empty();
        while (i1.hasNext() & i2.hasNext()) {
            resultStream = Stream.concat(resultStream, Stream.of(i1.next(), i2.next()));
        }
        return resultStream;
    }
    public static void main(String[] args) {
        Stream<Integer> first = Arrays.stream(new Integer[]{1, 3, 5});
        Stream<Integer> second = Arrays.stream(new Integer[]{2, 4, 6});
        Stream<Integer> result = ZipIterator.zip(first, second);
        result.forEach(System.out::println);
    }
}
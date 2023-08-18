import java.util.stream.Stream;

public class StreamOfInfiniteNumbers {
    public static Stream<Long> StreamOfInfiniteNumbers(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = 2^48;
        long seed = 0L;

        Stream<Long> streamOfInfiniteNumbers = StreamOfInfiniteNumbers(seed, a, c, m);
        streamOfInfiniteNumbers
                .limit(10)
                .forEach(System.out::println);
    }
}
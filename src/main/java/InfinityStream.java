import java.util.stream.Stream;

public class InfinityStream {

    Stream<Long> infinityStreamGenerator(long seed, long a, long c, long m) {

        if (isValidParameters(seed, a, c, m)) {
            return Stream.iterate(new long[]{seed}, (n) -> new long[]{(n[0] * a + c) % m, n[0]})
                    .map(n -> n[0]);
        } else {
            throw new RuntimeException("Parameter is not correct");
        }
    }

    private boolean isValidParameters (long seed, long a, long c, long m) {

        boolean validParameters = false;
        if (m >= 2
                && a >= 0 && a < m
                && c >= 0 && c < m
                && seed >= 0 && seed < m) {
            validParameters = true;
        }
        return validParameters;
    }
}
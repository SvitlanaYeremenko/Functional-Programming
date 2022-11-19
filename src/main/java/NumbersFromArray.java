import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersFromArray {

    String numbersEditor(String[] badNumbers) {

        return Stream.of(Arrays.asList(badNumbers[0].split(", ")), Arrays.asList(badNumbers[1].split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
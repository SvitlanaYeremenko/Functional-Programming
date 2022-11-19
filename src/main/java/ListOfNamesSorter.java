import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfNamesSorter {

    List<String> sortNamesByUpperCase(List<String> names) {

        return names.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
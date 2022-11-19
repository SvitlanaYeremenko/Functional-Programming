import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Svitlana", "Oleksii", "Sophia", "Anastasiia", "Vera", "Elena");

        // Exercise 1
        ListOfNamesEditor listOfNamesEditor = new ListOfNamesEditor();
        System.out.println("Formatted list is: " + listOfNamesEditor.namesByOddIndexes(namesList));

        // Exercise 2
        ListOfNamesSorter listOfNamesSorter = new ListOfNamesSorter();
        System.out.println("Sorted list of names in upper case is: " + listOfNamesSorter.sortNamesByUpperCase(namesList));

        // Exercise 3
        NumbersFromArray numbersFromArray = new NumbersFromArray();
        System.out.println("Numbers from array: " + numbersFromArray.numbersEditor(new String[] {"1, 2, 0", "4, 5"}));

        // Exercise 4
        InfinityStream infinityStream = new InfinityStream();
        infinityStream.infinityStreamGenerator(1L, 25214903917L, 11L, (long) Math.pow(2, 48))
                .limit(10)
                .forEach(System.out::println);

        // Exercise 5
        System.out.println(StreamsZipper.zip(Stream.of("milk", "eggs", "meet"), Stream.of("1", "2", "3"))
                .collect(Collectors.toList()));
    }
}
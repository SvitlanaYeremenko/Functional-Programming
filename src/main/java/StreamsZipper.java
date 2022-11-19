import java.util.*;
import java.util.stream.Stream;

public class StreamsZipper {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        List<T> list = new ArrayList<>();

        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            list.add(iteratorFirst.next());
            list.add(iteratorSecond.next());
        }
        return list.stream();
    }
}
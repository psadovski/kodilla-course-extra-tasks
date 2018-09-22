import java.util.Optional;
import java.util.stream.Stream;

public class SilniaWithStream {
    public int silnia(int value) {
        if (value == 0 || value == 1) {
            return 1;
        } else {
            Optional<Integer> result = Stream.iterate(1, n -> n + 1)
                    .limit(value)
                    .reduce((x, y) -> (x * y));

            return result.get();
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zad3 {
    public static void main(String[] args) {

        List<List<String>> list = Arrays.asList(Arrays.asList("1, 2, 0"), Arrays.asList("4, 5"));
        System.out.println(list);
        String rezult =
                list.stream()
                .flatMap(Collection::stream)
                     .map(o -> o.split(", "))
                     .flatMap(arr -> Arrays.stream(arr).sorted())
                     .collect(Collectors.joining(", ", "\"", "\""));
       System.out.println(rezult);
    }
}

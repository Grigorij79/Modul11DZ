import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad1and2 {

    public static void main(String[] args){
        List <String> names = Arrays.asList("Ivan", "Andrey", "Mykola", "Jon", "Peter", "Zumer");

        String rezult = names.stream()
                .filter((o) -> (names.indexOf(o))%2 == 0 )
                .map((o) -> (names.indexOf(o)+1) + "." + o )
                .collect(Collectors.joining(", ", "","."));
        System.out.println(rezult);

        List <String> rezult2 = names.stream()
                .sorted(((o1, o2) -> o2.compareTo(o1) ))
                .map(String::toUpperCase)  // .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(rezult2);
    }
}

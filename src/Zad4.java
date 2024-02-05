import java.util.stream.Stream;

public class Zad4 {
   static   Stream<Long> metod (long a, long c, long m, int n){
    Stream<Long> str =  Stream.iterate(a, x -> (a * x + c) % m )
            .limit(n)
            .map(o -> Math.abs(o));

    return str;
}

    public static void main(String[] args) {

        Stream<Long> rezult =   metod(25214903917L,11L,281474976710656L, 21);
        Stream<Long> rezultVikipediaControl =   metod(7,7,10, 10);
        rezult.forEach(System.out::println);
        rezultVikipediaControl.forEach(System.out::print);

    }

}

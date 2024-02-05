import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

 class Zad5 {
         public static  <T> Stream <T> zip(Stream<T> first, Stream<T> second){
             List<T> rezultList = new ArrayList<>();
      Iterator<T> iterA = first.iterator();
      Iterator <T> iterB = second.iterator();
            while (iterA.hasNext() && iterB.hasNext()){
                rezultList.add(iterA.next());
                rezultList.add(iterB.next());
            }
            return rezultList.stream();
     }
    public static void main(String[] args) {

        Stream<String> first = Stream.of("1","2","3","4","5");
        Stream <String> second = Stream.of("a","s","d", "f","s","d", "f","s","d", "f");
        zip(first,second).forEach(System.out::print);

    }
}

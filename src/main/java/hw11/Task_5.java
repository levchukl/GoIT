package hw11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(Task_5.zip(Arrays.stream(new String [] {"A", "B", "C", "D"}),
                Arrays.stream(new String[] {"F", "G", "M"}))
                .collect(Collectors.joining(", ")));

    }
    public static <T>Stream<T> zip (Stream<T> first, Stream<T> second){
        Iterator<T> one = first.iterator();
        Iterator<T> two = second.iterator();
        Stream<T> resultStream = Stream.empty();
        while (one.hasNext() & two.hasNext()){
            resultStream = Stream.concat(resultStream, Stream.of(one.next(), two.next()));
        }
        return resultStream;
    }

}

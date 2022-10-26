package hw11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[] args) {
        String [] array = new String[]{"1, 2, 0", "4, 5"};
        List<String> arrayList = Arrays.asList(array);
        String result = arrayList.stream()
                .flatMap((element) -> Arrays.stream(element.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}

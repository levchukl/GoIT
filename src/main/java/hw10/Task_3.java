package hw10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        String path = String.valueOf(new File("src/main/resources/hw10_task3.txt"));
        Map<String, Integer> resultMap = new HashMap<>();
        List<Map.Entry<String, Integer>> list = new LinkedList<>();

        try (Scanner scanner = new Scanner(new FileInputStream(path))) {
            while (scanner.hasNext()) {
                String s = scanner.next();
                if (resultMap.containsKey(s)) {
                    resultMap.put(s, resultMap.get(s) + 1);
                } else {
                    resultMap.put(s, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

        list.addAll(resultMap.entrySet());
        Collections.sort(list, ((o1, o2) -> o2.getValue() - o1.getValue()));


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + "\s" + list.get(i).getValue());
        }
    }
}

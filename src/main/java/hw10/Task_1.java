package hw10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/hw10_task1.txt");
        System.out.println(file.getPath());
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String str = scanner.nextLine().trim();
            if (str.length() == 12 || str.length() == 14){
                if (str.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}"))
                    System.out.println(str);
                else if (str.matches("[(][0-9]{3}[)]\\s{1}[0-9]{3}-[0-9]{4}"))
                    System.out.println(str);
            }
        }

    }
}

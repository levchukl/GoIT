package hw10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        File input = new File("src/main/resources/hw10_task2.txt");
        File out = new File("src/main/resources/user.json");
        try {
            Scanner scanner = new Scanner(input);
            String str = scanner.nextLine().trim();
            while (scanner.hasNext()){
                str = scanner.nextLine().trim();
                int num = str.indexOf(" ");
                users.add(new User(str.substring(0, num), Integer.parseInt(str.substring(num+1))));
            }
            scanner.close();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String strJson = gson.toJson(users);
            JsonArray array = JsonParser.parseString(strJson).getAsJsonArray();
            FileWriter fileWriter = new FileWriter(out);
            fileWriter.write(strJson);
            fileWriter.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    static class User{
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
    }
}

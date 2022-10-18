package hw9;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> list = new MyHashMap<>();

        list.put(0, "0");
        list.put(25, "25");

        System.out.println(list.get(0));
        list.put(5, "35");

        list.remove(0);

        System.out.println(list.get(0));
    }
}

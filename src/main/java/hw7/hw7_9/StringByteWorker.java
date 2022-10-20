package hw7.hw7_9;

/*Рядки передаються по мережі Інтернет у вигляді байтового потоку (так само, як і будь-які інші дані).
Тому якщо ми хочемо щось шукати в тексті, який отримали з мережі Інтернет,
 то нам потрібно спочатку отриманий масив байт перевести в рядок*/

public class StringByteWorker {
    public String process(byte[] bytes){
        return new String(bytes).toLowerCase();
    }
}

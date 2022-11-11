package hw13;

import java.io.IOException;
import java.util.List;

import static hw13.HttpUtil.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpUtil httpUtil = new HttpUtil();

        List<User> userList =  getAllUser();
        Geo userGeo = new Geo(-37.3159, 81.1496);
        Address userAddress = new Address("Kulas Light", "Apt. 556", "Gwenborough","92998-3874", userGeo);
        Company userCompany = new Company("Romaguera-Crona","Multi-layered client-server neural-net","harness real-time e-markets");
        User user = new User("Test", "TEST","test@test.com", userAddress, "1-770-736-8031 x56442","hildegard.org",userCompany);

        createUser(user);
        user.setEmail("vysnia@email.com");

       updateUser(userList.get(4));

        deleteUser(userList.get(4));

        User testUser = getUserByID(5);
        System.out.println(testUser.getId());

        System.out.println(getUserByName("Bauch"));
        List<Post> postList = getAllPostUser(1);

        createFileWithLastPostComments(8);

        System.out.println("User: " + testUser.getName());
        getAllOpenTodo(testUser.getId());

    }
}

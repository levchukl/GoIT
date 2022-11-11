package hw13;

import com.google.gson.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class HttpUtil {
    public static boolean createUser(User user) throws IOException {
        Gson gson = new Gson();
        String jsonUser = gson.toJson(user);
        String response = sendPOST("https://jsonplaceholder.typicode.com/users", jsonUser);
        if(!response.isEmpty()) {
            JsonArray array = JsonParser.parseString("[" + response + "]").getAsJsonArray();
            Map message = gson.fromJson(array.get(0), HashMap.class);
            Integer id = Double.valueOf((message.get("id").toString())).intValue();
            user.setId(id);
            return true;
        }
        System.out.println("User " + user.getId() + "is not ctreate!");
        return false;
    }

    public static boolean updateUser(User user) throws IOException {
        Gson gson = new Gson();
        String jsonUser = gson.toJson(user);
        String response = sendPUT("https://jsonplaceholder.typicode.com/users/" + user.getId(), jsonUser);
        if(!response.isEmpty()) {
            JsonArray array = JsonParser.parseString("[" + response + "]").getAsJsonArray();
            Map message = gson.fromJson(array.get(0), HashMap.class);
            Integer id = Double.valueOf((message.get("id").toString())).intValue();
            if (id == user.getId()) return true;
        }
        System.out.println("User " + user.getId() + " not found");
        return false;
    }

    public static boolean deleteUser(User user) throws IOException {
        return sendDELETE("https://jsonplaceholder.typicode.com/users/" + user.getId());
    }

    public static List getAllUser() throws IOException {
        String response = sendGET("https://jsonplaceholder.typicode.com/users");
        Gson gson = new Gson();
        JsonArray array = JsonParser.parseString(response).getAsJsonArray();
        List<User> userList = new ArrayList<>();
        for (JsonElement element: array) {
            userList.add(gson.fromJson(element, User.class));
        }
        return userList;

    }

    public static User getUserByID(long id) throws IOException {
        User user;
        Gson gson = new Gson();
        String response = sendGET("https://jsonplaceholder.typicode.com/users/" + id);
        if(!response.isEmpty()) {
            user = gson.fromJson(response, User.class);
            return user;
        }
        return null;
    }

    public static User getUserByName(String name) throws IOException {
        User user;
        Gson gson = new Gson();
        String response = sendGET("https://jsonplaceholder.typicode.com/users?username=" + name);
        if(!response.isEmpty()) {
            JsonArray array = JsonParser.parseString(response).getAsJsonArray();
            user = gson.fromJson(array.get(0), User.class);
            return user;
        }
        return null;
    }

    public static boolean createFileWithLastPostComments(long userID) throws IOException {
        List <Post> listPost = getAllPostUser(userID);
        if (listPost.size() > 0) {
            Long maxPostID = listPost.stream().mapToLong(Post::getId).boxed().max(Comparator.naturalOrder()).get();
            List<Comment> commentList = getAllCommentsByPostID(maxPostID);
            if(commentList.size() > 0) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String jsonForFile = gson.toJson(commentList);
                File outFile = new File("src/main/resources/hw13/user-" + userID + "-post-" + maxPostID + "-comments.json");
                FileWriter fileWriter = new FileWriter(outFile);
                fileWriter.write(jsonForFile);
                fileWriter.close();
                return true;
            }
        }
        return false;
    }

    public static List getAllPostUser(long id) throws IOException {
        String response = sendGET("https://jsonplaceholder.typicode.com/users/" + id +"/posts");
        if(response.length() > 2) {
            Gson gson = new Gson();
            JsonArray array = JsonParser.parseString(response).getAsJsonArray();
            List<Post> postList = new ArrayList<>();
            for (JsonElement element : array) {
                postList.add(gson.fromJson(element, Post.class));
            }
            return postList;
        } else {
            System.out.println("There aren't posts!");
            return null;
        }
    }

    public static List getAllCommentsByPostID(long postID) throws IOException {
        String response = sendGET("https://jsonplaceholder.typicode.com/posts/" + postID +"/comments");
        if(response.length() > 2) {
            Gson gson = new Gson();
            JsonArray array = JsonParser.parseString(response).getAsJsonArray();
            List<Comment> commentList = new ArrayList<>();
            for (JsonElement element : array) {
                commentList.add(gson.fromJson(element, Comment.class));
            }
            return commentList;
        } else {
            System.out.println("There aren't comments!");
            return null;
        }
    }

    public static boolean getAllCommentsByPostIDtoFile(long postID, long userID) throws IOException {
        File outFile = new File("src/main/resources/hw10_task2/user-" +userID + "-post-" + postID + "-comments.json");
        List<Post> postList = getAllPostUser(userID);
        Long maxPostID = postList.stream().mapToLong(Post::getId).boxed().max(Comparator.naturalOrder()).get();
        String response = sendGET("https://jsonplaceholder.typicode.com/posts/" + maxPostID +"/comments");
        if(response.length() > 2){
            FileWriter fileWriter = new FileWriter(outFile);
            fileWriter.write(response);
            fileWriter.close();
            return true;
        }
        return false;
    }

    public static void getAllOpenTodo(long userID) throws IOException {
        List<Todo> userTODOs = getAllUserTodo(userID);
        System.out.println("User " + userID);
        userTODOs.stream().filter(Todo::isCompleted).forEach(p -> System.out.println(p.getTitle()));
    }

    public static List getAllUserTodo(long userID) throws IOException {
        String response = sendGET("https://jsonplaceholder.typicode.com/users/" + userID + "/todos");
        Gson gson = new Gson();
        JsonArray array = JsonParser.parseString(response).getAsJsonArray();
        List<Todo> todoList = new ArrayList<>();
        for (JsonElement element: array) {
            todoList.add(gson.fromJson(element, Todo.class));

        }
        return todoList;
    }

    private static String sendGET(String strUrl) throws IOException {
        URL url = new URL(strUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        System.out.println("GET response code: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            return "";
        }
    }

    private static String sendPOST(String strUrl, String body) throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/users");
        //URL url = new URL(strUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
        os.write(body.getBytes());
        //os.write(Files.readAllBytes(new File( "hw/hw_13/user.json").toPath()));
        os.flush();
        os.close();

        int responseCode = connection.getResponseCode();
        System.out.println("POST response code: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_CREATED) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            for (int ch; (ch = in.read()) != -1; ) {
                response.append((char) ch);
            }
            in.close();
            return response.toString();
        } else {
            return "";
        }
    }

    private static String sendPUT(String strUrl, String body) throws IOException {
        URL url = new URL(strUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
        os.write(body.getBytes());
        os.flush();
        os.close();
        int responseCode = connection.getResponseCode();
        System.out.println("PUT response code: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            for (int ch; (ch = in.read()) != -1; ) {
                response.append((char) ch);
            }
            in.close();
            return response.toString();
        } else {
            return "";
        }
    }

    private static boolean sendDELETE(String strUrl) throws IOException {
        URL url = new URL(strUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        int responseCode = connection.getResponseCode();
        System.out.println("DELETE response code: " + responseCode);
        if (responseCode >= 200 && responseCode <= 300) return true;
        else return false;
    }
}

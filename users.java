import org.json.JSONArray;
import org.json.JSONObject;

public class UserProfiles {

    public static void main(String[] args) {
        JSONArray profiles = new JSONArray();

        JSONObject user1 = new JSONObject();
        user1.put("name", "Alice");
        user1.put("age", 25);
        user1.put("email", "alice@example.com");

        JSONObject user2 = new JSONObject();
        user2.put("name", "Bob");
        user2.put("age", 30);
        user2.put("email", "bob@example.com");

        profiles.put(user1);
        profiles.put(user2);

        System.out.println("JSON Profiles:");
        System.out.println(profiles.toString(4)); // Pretty print with indentation
    }
}

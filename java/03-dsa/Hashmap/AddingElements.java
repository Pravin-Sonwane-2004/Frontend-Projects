import java.util.*;

class User {
    int id;

    User(int id) {
        this.id = id;
    }
}

public class AddingElements {
    public static void main(String[] args) {

        HashMap<User, String> map = new HashMap<>();

        map.put(new User(1), "Pravin");

        System.out.println(map.get(new User(1)));
    }
}
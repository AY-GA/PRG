package j26_41;

import java.util.List;

public class MyUser {
    private final int id;
    private final String name;
    private final List<String> role;

    public MyUser(int id, String name, List<String> role) {
        this.id = id;
        this.name = name;
        this.role = List.copyOf(role);
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<String> getRole() {
        return role;
    }
}

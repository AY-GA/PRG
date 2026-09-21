package j26_39;

public class TestSingleton {
    static void main() {
        SingletonUser s1 = SingletonUser.getInstance();
        SingletonUser s2 = SingletonUser.getInstance();

        s1.name = "Jan";
        s2.age = 31;

        printName();
    }

    static void printName() {
        var u = SingletonUser.getInstance();
        IO.println("=== " + u.name + " ===");
    }
}

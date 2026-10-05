package j26_39;

public class SingletonUser {
    private static SingletonUser singletonInstance;
    String name;
    int age;

    private SingletonUser() {
    }

    public static SingletonUser getInstance() {
        if (singletonInstance == null) singletonInstance = new SingletonUser();
        return singletonInstance;
    }

    @Override
    public String toString() {
        return "SingletonUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

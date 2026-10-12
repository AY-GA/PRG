package j26_41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    static Logger instance = null;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private int count = 0;

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void debug(String message) {
        var timestamp = LocalDateTime.now().format(formatter);
        System.out.printf("[%s] [%03d]: %s\n", timestamp, ++count, message);
    }
}

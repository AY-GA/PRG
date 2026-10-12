package j26_41;

public class ProgramMyArray {
    static void main() {
        var logger = Logger.getInstance();
        logger.debug("Hello World");
        logger.debug("Hello Worldddd");

        var logger2 = Logger.getInstance();
        System.out.println(logger == logger2);
    }
}

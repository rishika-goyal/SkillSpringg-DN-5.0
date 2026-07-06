public class Logger {

    // single instance of Logger
    private static Logger instance;

    // private constructor so object cannot be created from outside
    private Logger() {
        System.out.println("Logger instance created");
    }

    // public method to provide single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // sample logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
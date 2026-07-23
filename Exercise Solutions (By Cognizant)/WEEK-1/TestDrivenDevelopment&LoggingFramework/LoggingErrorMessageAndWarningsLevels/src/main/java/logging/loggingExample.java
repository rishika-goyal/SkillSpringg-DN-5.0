// package Exercise Solutions (By Cognizant).WEEK-1.TestDrivenDevelopment&LoggingFramework.LoggingErrorMessageAndWarningsLevels.src.main.java.logging;

// public class loggingExample {
//   private static final Logger logger =
//             LoggerFactory.getLogger(LoggingExample.class);

//     public static void main(String[] args) {

//         logger.error("This is an error message");

//         logger.warn("This is a warning message");
//     }
// }


package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.error("This is an error message");

        logger.warn("This is a warning message");
    }
}
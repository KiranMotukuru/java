import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingExample {
	public static void main(String[] args) {
		// Create a logger for your class or component
		Logger logger = Logger.getLogger("LoggingExample");

		// Create a console handler to output log messages to the console
		ConsoleHandler consoleHandler = new ConsoleHandler();

		// Set the desired logging level (e.g., INFO) for the logger and handler
		logger.setLevel(Level.INFO);
		consoleHandler.setLevel(Level.INFO);

		// Create a formatter to specify the log message format
		SimpleFormatter formatter = new SimpleFormatter();
		consoleHandler.setFormatter(formatter);

		// Add the console handler to the logger
		logger.addHandler(consoleHandler);

		// Log some messages at different levels
		logger.severe("fuck off.");
		logger.warning("This is a warning message.");
		logger.info("This is an informational message.");
		logger.fine("This is a fine-grained message.");

		// The following message won't be logged because the level is set to INFO
		logger.finer("This message won't be logged.");

		// You can also use parameterized messages
		String name = "John";
		int age = 30;
		System.out.println(age);
		logger.info("User {} is {} years old.");
	}
}

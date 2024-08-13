package lab4b;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Setup chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create commands
        Command infoCommand = new LogCommand(infoHandler, LogLevel.INFO, "System startup successful.");
        Command debugCommand1 = new LogCommand(debugHandler, LogLevel.DEBUG, "Loading user configuration...");
        Command debugCommand2 = new LogCommand(debugHandler, LogLevel.DEBUG, "Loading user configuration...");
        Command errorCommand = new LogCommand(errorHandler, LogLevel.ERROR, "Unable to connect to the database.");

        // Create logger and add commands
        Logger logger = new Logger();
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand1);
        logger.addCommand(debugCommand2);
        logger.addCommand(errorCommand);

        // Execute commands
        logger.executeCommands();
    }
}

package lab4b;

public class ErrorHandler extends LogHandler {
    @Override
    public void handleLog(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            System.out.println("[ERROR] " + message);
        } else if (nextHandler != null) {
            nextHandler.handleLog(level, message);
        }
    }
}

package lab4b;

public class InfoHandler extends LogHandler {
    @Override
    public void handleLog(LogLevel level, String message) {
        if (level == LogLevel.INFO) {
            System.out.println("[INFO] " + message);
        } else if (nextHandler != null) {
            nextHandler.handleLog(level, message);
        }
    }
}

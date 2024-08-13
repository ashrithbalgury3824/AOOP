package lab4b;

public class DebugHandler extends LogHandler {
    @Override
    public void handleLog(LogLevel level, String message) {
        if (level == LogLevel.DEBUG) {
            System.out.println("[DEBUG] " + message);
        } else if (nextHandler != null) {
            nextHandler.handleLog(level, message);
        }
    }
}
